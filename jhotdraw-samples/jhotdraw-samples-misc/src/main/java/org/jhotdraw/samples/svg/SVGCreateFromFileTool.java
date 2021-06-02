/*
 * @(#)ImageTool.java
 *
 * Copyright (c) 1996-2010 The authors and contributors of JHotDraw.
 * You may not use, copy or modify this file, except in compliance with the
 * accompanying license terms.
 */
package org.jhotdraw.samples.svg;

import org.jhotdraw.draw.*;
import org.jhotdraw.draw.figure.CompositeFigure;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.figure.ImageHolderFigure;
import org.jhotdraw.draw.io.InputFormat;
import org.jhotdraw.draw.tool.CreationTool;
import org.jhotdraw.samples.svg.io.SVGInputFormat;
import org.jhotdraw.samples.svg.io.SVGZInputFormat;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A tool to create new figures from an input file. If the file holds a bitmap
 * image, this tool creates a SVGImageFigure. If the file holds a SVG or a SVGZ
 * image, ths tool creates a SVGGroupFigure.
 * <p>
 * Immediately, after the
 * ImageTool has been activated, it opens a JFileChooser, letting the user
 * specify a file. The the user then performs the following mouse gesture: <ol>
 * <li>Press the mouse button and drag the mouse over the DrawingView. This
 * defines the bounds of the created Figure.</li> </ol>
 *
 * @author Werner Randelshofer
 * @version $Id$
 */
public class SVGCreateFromFileTool extends CreationTool {
    private SVGCreateFromFileToolProduct sVGCreateFromFileToolProduct = new SVGCreateFromFileToolProduct();

    private static final long serialVersionUID = 1L;
    protected CompositeFigure groupPrototype;
    protected ImageHolderFigure imagePrototype;

    /**
     * Creates a new instance.
     */
    public SVGCreateFromFileTool(ImageHolderFigure imagePrototype, CompositeFigure groupPrototype) {
        super(imagePrototype);
        this.groupPrototype = groupPrototype;
        this.imagePrototype = imagePrototype;
    }

    /**
     * Creates a new instance.
     */
    public SVGCreateFromFileTool(ImageHolderFigure imagePrototype, CompositeFigure groupPrototype, Map<AttributeKey<?>, Object> attributes) {
        super(imagePrototype, attributes);
        this.groupPrototype = groupPrototype;
        this.imagePrototype = imagePrototype;
    }

    public void setUseFileDialog(boolean newValue) {
        sVGCreateFromFileToolProduct.setUseFileDialog(newValue);
    }

    public boolean isUseFileDialog() {
        return sVGCreateFromFileToolProduct.getUseFileDialog();
    }

    @Override
    public void activate(DrawingEditor editor) {
        super.activate(editor);
        final DrawingView v = getView();
        if (v == null) {
            return;
        }
        final File file;
        if (sVGCreateFromFileToolProduct.getUseFileDialog()) {
            sVGCreateFromFileToolProduct.getFileDialog().setVisible(true);
            if (sVGCreateFromFileToolProduct.getFileDialog().getFile() != null) {
                file = new File(sVGCreateFromFileToolProduct.getFileDialog().getDirectory(), sVGCreateFromFileToolProduct.getFileDialog().getFile());
            } else {
                file = null;
            }
        } else {
            if (sVGCreateFromFileToolProduct.getFileChooser().showOpenDialog(v.getComponent()) == JFileChooser.APPROVE_OPTION) {
                file = sVGCreateFromFileToolProduct.getFileChooser().getSelectedFile();
            } else {
                file = null;
            }
        }
        if (file != null) {
            if (file.getName().toLowerCase().endsWith(".svg")
                    || file.getName().toLowerCase().endsWith(".svgz")) {
                prototype = groupPrototype.clone();
                new SwingWorker<Drawing, Drawing>() {
                    @Override
                    protected Drawing doInBackground() throws Exception {
                        Drawing drawing = new DefaultDrawing();
                        InputFormat in = (file.getName().toLowerCase().endsWith(".svg")) ? new SVGInputFormat() : new SVGZInputFormat();
                        in.read(file.toURI(), drawing);
                        return drawing;
                    }

                    @Override
                    protected void done() {
                        try {
                            Drawing drawing = get();
                            CompositeFigure parent;
                            if (createdFigure == null) {
                                parent = (CompositeFigure) prototype;
                                for (Figure f : drawing.getChildren()) {
                                    parent.basicAdd(f);
                                }
                            } else {
                                parent = (CompositeFigure) createdFigure;
                                parent.willChange();
                                for (Figure f : drawing.getChildren()) {
                                    parent.add(f);
                                }
                                parent.changed();
                            }
                        } catch (InterruptedException | ExecutionException ex) {
                            Logger.getLogger(SVGCreateFromFileTool.class.getName()).log(Level.SEVERE, null, ex);
                            failed(ex);
                        }
                    }

                    protected void failed(Throwable t) {
                        JOptionPane.showMessageDialog(v.getComponent(),
                                t.getMessage(),
                                null,
                                JOptionPane.ERROR_MESSAGE);
                        getDrawing().remove(createdFigure);
                        fireToolDone();
                    }
                }.execute();
            } else {
                prototype = imagePrototype;
                final ImageHolderFigure loaderFigure = ((ImageHolderFigure) prototype.clone());
                new SwingWorker() {
                    @Override
                    protected Object doInBackground() throws Exception {
                        loaderFigure.loadImage(file);
                        return null;
                    }

                    @Override
                    protected void done() {
                        try {
                            get();
                            try {
                                if (createdFigure == null) {
                                    ((ImageHolderFigure) prototype).setImage(loaderFigure.getImageData(), loaderFigure.getBufferedImage());
                                } else {
                                    ((ImageHolderFigure) createdFigure).setImage(loaderFigure.getImageData(), loaderFigure.getBufferedImage());
                                }
                            } catch (IOException ex) {
                                JOptionPane.showMessageDialog(v.getComponent(),
                                        ex.getMessage(),
                                        null,
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (InterruptedException | ExecutionException ex) {
                            Logger.getLogger(SVGCreateFromFileTool.class.getName()).log(Level.SEVERE, null, ex);
                            failed(ex);
                        }

                    }

                    protected void failed(Throwable t) {
                        JOptionPane.showMessageDialog(v.getComponent(),
                                t.getMessage(),
                                null,
                                JOptionPane.ERROR_MESSAGE);
                        getDrawing().remove(createdFigure);
                        fireToolDone();
                    }
                }.execute();
            }
        } else {
            //getDrawing().remove(createdFigure);
            if (isToolDoneAfterCreation()) {
                fireToolDone();
            }
        }
    }

    @Override
    protected Figure createFigure() {
        if (prototype instanceof CompositeFigure) {
            // we must not apply default attributs to the composite figure,
            // because this would change the look of the figures that we
            // read from the SVG file.
            return prototype.clone();
        } else {
            return super.createFigure();
        }
    }

}
