/*
 * This file was automatically generated by EvoSuite
 * Sat May 29 15:10:19 GMT 2021
 */

package org.jhotdraw.draw.tool;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedHashSet;
import javax.swing.Action;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.TransferHandler;
import javax.swing.event.MenuDragMouseEvent;
import javax.swing.text.DefaultFormatterFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.DrawingEditorProxy;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.figure.DiamondFigure;
import org.jhotdraw.draw.figure.EllipseFigure;
import org.jhotdraw.draw.figure.GroupFigure;
import org.jhotdraw.draw.figure.LabelFigure;
import org.jhotdraw.draw.figure.LabeledLineConnectionFigure;
import org.jhotdraw.draw.figure.LineConnectionFigure;
import org.jhotdraw.draw.figure.TextAreaFigure;
import org.jhotdraw.draw.handle.ConnectionEndHandle;
import org.jhotdraw.draw.handle.ConnectionStartHandle;
import org.jhotdraw.draw.handle.Handle;
import org.jhotdraw.draw.handle.MoveHandle;
import org.jhotdraw.draw.handle.RotateHandle;
import org.jhotdraw.draw.liner.SlantedLiner;
import org.jhotdraw.draw.tool.DefaultHandleTracker;
import org.jhotdraw.geom.BezierPath;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultHandleTracker_ESTest extends DefaultHandleTracker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SlantedLiner slantedLiner0 = new SlantedLiner();
      BezierPath bezierPath0 = new BezierPath();
      Collection<Handle> collection0 = slantedLiner0.createHandles(bezierPath0);
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker((Handle) null, collection0);
      JOptionPane jOptionPane0 = new JOptionPane();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jOptionPane0, 0, 0, 0, 3, 0, 3, true, 2, 0, 0);
      defaultHandleTracker0.mouseClicked(mouseWheelEvent0);
      assertEquals(0, mouseWheelEvent0.getYOnScreen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker();
      defaultHandleTracker0.clearHoverHandles();
      assertFalse(defaultHandleTracker0.supportsHandleInteraction());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure(1899.42839914, 1899.42839914, 0.0, 1899.42839914);
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      DefaultDrawingView defaultDrawingView0 = new DefaultDrawingView();
      DefaultDrawingEditor defaultDrawingEditor0 = new DefaultDrawingEditor();
      defaultHandleTracker0.activate(defaultDrawingEditor0);
      MouseEvent mouseEvent0 = new MouseEvent(defaultDrawingView0, 2, (-670), 2, 3135, (-1721), 640, true, 2);
      // Undeclared exception!
      try { 
        defaultHandleTracker0.mouseReleased(mouseEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.tool.AbstractTool", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure(1899.42839914, 1899.42839914, 0.0, 1899.42839914);
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      DefaultDrawingView defaultDrawingView0 = new DefaultDrawingView();
      DefaultDrawingEditor defaultDrawingEditor0 = new DefaultDrawingEditor();
      defaultHandleTracker0.activate(defaultDrawingEditor0);
      MouseEvent mouseEvent0 = new MouseEvent(defaultDrawingView0, 2, (-670), 2, 3135, (-1721), 640, true, 2);
      defaultHandleTracker0.mousePressed(mouseEvent0);
      assertEquals(2, mouseEvent0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure(1899.42839914, 1899.42839914, 0.0, 1899.42839914);
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      DefaultDrawingView defaultDrawingView0 = new DefaultDrawingView();
      DefaultDrawingEditor defaultDrawingEditor0 = new DefaultDrawingEditor();
      defaultHandleTracker0.activate(defaultDrawingEditor0);
      MouseEvent mouseEvent0 = new MouseEvent(defaultDrawingView0, 2, (-670), 2, 3135, (-1721), 640, true, 2);
      defaultHandleTracker0.mouseExited(mouseEvent0);
      assertEquals(2, mouseEvent0.getButton());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker();
      JSeparator jSeparator0 = new JSeparator();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jSeparator0, 0, 0L, 249, 249, 0, 0, 2811, 2811, false, 0, 1542, 1542);
      // Undeclared exception!
      try { 
        defaultHandleTracker0.mouseDragged(mouseWheelEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.tool.AbstractTool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LineConnectionFigure lineConnectionFigure0 = new LineConnectionFigure();
      ConnectionEndHandle connectionEndHandle0 = new ConnectionEndHandle(lineConnectionFigure0);
      Collection<Handle> collection0 = lineConnectionFigure0.createHandles(0);
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(connectionEndHandle0, collection0);
      DefaultFormatterFactory defaultFormatterFactory0 = new DefaultFormatterFactory();
      GroupFigure groupFigure0 = new GroupFigure();
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField(defaultFormatterFactory0, groupFigure0);
      KeyEvent keyEvent0 = new KeyEvent(jFormattedTextField0, 0, (-995L), 127, 0, 'u');
      defaultHandleTracker0.keyTyped(keyEvent0);
      assertEquals('u', keyEvent0.getKeyChar());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker();
      LabelFigure labelFigure0 = new LabelFigure("org.jhotdraw.draw.tool.DefaultHandleTracker$1");
      // Undeclared exception!
      try { 
        defaultHandleTracker0.updateHoverHandles((DrawingView) null, labelFigure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.handle.BoundsOutlineHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker();
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem((String) null);
      MouseEvent mouseEvent0 = new MouseEvent(jCheckBoxMenuItem0, 13290186, 13290186, 1139, 13290186, 13290186, 0, true);
      // Undeclared exception!
      try { 
        defaultHandleTracker0.mouseMoved(mouseEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.tool.DefaultHandleTracker", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure(1899.42839914, 128.12902856, 0.0, 128.12902856);
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      // Undeclared exception!
      try { 
        defaultHandleTracker0.mouseClicked((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.tool.DefaultHandleTracker", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker();
      Object[] objectArray0 = new Object[1];
      JTree jTree0 = new JTree(objectArray0);
      KeyEvent keyEvent0 = new KeyEvent(jTree0, 0, 0, 758, 0, ';');
      // Undeclared exception!
      try { 
        defaultHandleTracker0.keyReleased(keyEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.tool.DefaultHandleTracker", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextAreaFigure textAreaFigure0 = new TextAreaFigure("G{G9]k__?_nlp%~|");
      RotateHandle rotateHandle0 = new RotateHandle(textAreaFigure0);
      DefaultHandleTracker defaultHandleTracker0 = null;
      try {
        defaultHandleTracker0 = new DefaultHandleTracker(rotateHandle0, (Collection<Handle>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker();
      GroupFigure groupFigure0 = new GroupFigure();
      defaultHandleTracker0.updateHoverHandles((DrawingView) null, groupFigure0);
      assertEquals(0, groupFigure0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure(1899.42839914, 128.12902856, 0.0, 128.12902856);
      diamondFigure0.setSelectable(false);
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      DefaultDrawingView defaultDrawingView0 = new DefaultDrawingView();
      defaultHandleTracker0.updateHoverHandles(defaultDrawingView0, diamondFigure0);
      defaultHandleTracker0.updateHoverHandles(defaultDrawingView0, ellipseFigure0);
      assertEquals(0, defaultDrawingView0.getHandleDetailLevel());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure(1899.42839914, 1899.42839914, 0.0, 1899.42839914);
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      DefaultDrawingView defaultDrawingView0 = new DefaultDrawingView();
      defaultHandleTracker0.updateHoverHandles(defaultDrawingView0, diamondFigure0);
      DefaultDrawingEditor defaultDrawingEditor0 = new DefaultDrawingEditor();
      defaultHandleTracker0.activate(defaultDrawingEditor0);
      assertFalse(defaultHandleTracker0.supportsHandleInteraction());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem((String) null, true);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jRadioButtonMenuItem0, 0, 0, (-636), 799, (-1721), (-1721), true, (-1), 1032, 799);
      defaultHandleTracker0.mouseClicked(mouseWheelEvent0);
      assertFalse(defaultHandleTracker0.isActive());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure(1899.42839914, 1899.42839914, 0.0, 1899.42839914);
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      DefaultDrawingView defaultDrawingView0 = new DefaultDrawingView();
      KeyEvent keyEvent0 = new KeyEvent(defaultDrawingView0, (-1759), 1L, 640, 1, 't');
      defaultHandleTracker0.keyReleased(keyEvent0);
      assertEquals(0, keyEvent0.getKeyLocation());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure(1899.42839914, 1899.42839914, 0.0, 1899.42839914);
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      DefaultDrawingView defaultDrawingView0 = new DefaultDrawingView();
      DefaultDrawingEditor defaultDrawingEditor0 = new DefaultDrawingEditor();
      defaultHandleTracker0.activate(defaultDrawingEditor0);
      KeyEvent keyEvent0 = new KeyEvent(defaultDrawingView0, (-1759), 1L, 640, 1, 't');
      defaultHandleTracker0.keyPressed(keyEvent0);
      assertEquals(1, keyEvent0.getKeyCode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure(1899.42839914, 1899.42839914, 0.0, 1899.42839914);
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      DefaultDrawingView defaultDrawingView0 = new DefaultDrawingView();
      KeyEvent keyEvent0 = new KeyEvent(defaultDrawingView0, (-1759), 1L, 640, 1, 't');
      // Undeclared exception!
      try { 
        defaultHandleTracker0.keyPressed(keyEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.tool.AbstractTool", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker();
      DefaultDrawingEditor defaultDrawingEditor0 = new DefaultDrawingEditor();
      // Undeclared exception!
      try { 
        defaultHandleTracker0.deactivate(defaultDrawingEditor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.tool.DefaultHandleTracker", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure(1899.42839914, 1899.42839914, 0.0, 1899.42839914);
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      DefaultDrawingView defaultDrawingView0 = new DefaultDrawingView();
      DefaultDrawingEditor defaultDrawingEditor0 = new DefaultDrawingEditor();
      defaultDrawingEditor0.add(defaultDrawingView0);
      // Undeclared exception!
      try { 
        defaultHandleTracker0.activate(defaultDrawingEditor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.handle.LocatorHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure();
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      DefaultDrawingView defaultDrawingView0 = new DefaultDrawingView();
      defaultHandleTracker0.updateHoverHandles(defaultDrawingView0, diamondFigure0);
      // Undeclared exception!
      try { 
        defaultHandleTracker0.draw((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.tool.AbstractTool", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure(1899.42839914, 1899.42839914, 0.0, 1899.42839914);
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      defaultHandleTracker0.draw((Graphics2D) null);
      assertFalse(defaultHandleTracker0.supportsHandleInteraction());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker();
      JEditorPane jEditorPane0 = new JEditorPane("!OIm", "!OIm");
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jEditorPane0, (-345), (-345), 2587, 2587, 2587, (-345), 65, 2, true, 65, 25, (-4816), 2587);
      defaultHandleTracker0.mouseEntered(mouseWheelEvent0);
      assertFalse(defaultHandleTracker0.isActive());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EllipseFigure ellipseFigure0 = new EllipseFigure();
      Handle handle0 = MoveHandle.south(ellipseFigure0);
      DiamondFigure diamondFigure0 = new DiamondFigure(1899.42839914, 1899.42839914, 0.0, 1899.42839914);
      Collection<Handle> collection0 = diamondFigure0.createHandles((-670));
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(handle0, collection0);
      DefaultDrawingView defaultDrawingView0 = new DefaultDrawingView();
      MouseEvent mouseEvent0 = new MouseEvent(defaultDrawingView0, 2, (-670), 2, 3135, (-1721), 640, true, 2);
      // Undeclared exception!
      try { 
        defaultHandleTracker0.mouseExited(mouseEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.tool.DefaultHandleTracker", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker();
      LinkedHashSet<Handle> linkedHashSet0 = new LinkedHashSet<Handle>(0);
      defaultHandleTracker0.setHandles((Handle) null, linkedHashSet0);
      assertFalse(defaultHandleTracker0.supportsHandleInteraction());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LabeledLineConnectionFigure labeledLineConnectionFigure0 = new LabeledLineConnectionFigure();
      ConnectionStartHandle connectionStartHandle0 = new ConnectionStartHandle(labeledLineConnectionFigure0);
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker(connectionStartHandle0);
      DrawingEditorProxy drawingEditorProxy0 = new DrawingEditorProxy();
      defaultHandleTracker0.deactivate(drawingEditorProxy0);
      assertFalse(defaultHandleTracker0.isActive());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker();
      JSpinner jSpinner0 = new JSpinner();
      KeyEvent keyEvent0 = new KeyEvent(jSpinner0, (-1702), (-1702), 0, (-1009), '6');
      // Undeclared exception!
      try { 
        defaultHandleTracker0.keyTyped(keyEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.tool.DefaultHandleTracker", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ArrayDeque<Handle> arrayDeque0 = new ArrayDeque<Handle>();
      DefaultHandleTracker defaultHandleTracker0 = new DefaultHandleTracker((Handle) null, arrayDeque0);
      JPopupMenu jPopupMenu0 = new JPopupMenu("org.jhotdraw.draw.tool.DefaultHandleTracker");
      Action action0 = TransferHandler.getCutAction();
      JMenuItem jMenuItem0 = jPopupMenu0.add(action0);
      MenuElement[] menuElementArray0 = new MenuElement[3];
      MenuSelectionManager menuSelectionManager0 = MenuSelectionManager.defaultManager();
      MenuDragMouseEvent menuDragMouseEvent0 = new MenuDragMouseEvent(jMenuItem0, (-3957), (-1245L), 0, (-1355), 0, 1781, false, menuElementArray0, menuSelectionManager0);
      // Undeclared exception!
      try { 
        defaultHandleTracker0.mousePressed(menuDragMouseEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.tool.AbstractTool", e);
      }
  }
}