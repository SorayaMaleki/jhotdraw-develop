package org.jhotdraw.samples.svg;

import javax.swing.*;
import java.awt.*;

public class SVGCreateFromFileToolProduct {
    private FileDialog fileDialog;
    private JFileChooser fileChooser;
    private boolean useFileDialog;

    public boolean getUseFileDialog() {
        return useFileDialog;
    }

    public FileDialog getFileDialog() {
        if (fileDialog == null) {
            fileDialog = new FileDialog(new Frame());
        }
        return fileDialog;
    }

    public void setUseFileDialog(boolean newValue) {
        useFileDialog = newValue;
        if (useFileDialog) {
            fileChooser = null;
        } else {
            fileDialog = null;
        }
    }

    public JFileChooser getFileChooser() {
        if (fileChooser == null) {
            fileChooser = new JFileChooser();
        }
        return fileChooser;
    }
}