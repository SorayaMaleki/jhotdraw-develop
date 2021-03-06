/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 01 05:56:48 GMT 2021
 */

package org.jhotdraw.draw.figure;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.QuadTreeDrawing;
import org.jhotdraw.draw.figure.AbstractAttributedDecoratedFigure;
import org.jhotdraw.draw.figure.DiamondFigure;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.figure.ImageFigure;
import org.jhotdraw.draw.figure.LabelFigure;
import org.jhotdraw.draw.figure.LabeledLineConnectionFigure;
import org.jhotdraw.draw.figure.TextAreaFigure;
import org.jhotdraw.draw.figure.TextFigure;
import org.jhotdraw.draw.io.ImageOutputFormat;
import org.jhotdraw.draw.locator.RelativeDecoratorLocator;
import org.jhotdraw.xml.DOMInput;
import org.jhotdraw.xml.DOMOutput;
import org.jhotdraw.xml.JavaPrimitivesDOMFactory;
import org.jhotdraw.xml.JavaxDOMOutput;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractAttributedDecoratedFigure_ESTest extends AbstractAttributedDecoratedFigure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure();
      labelFigure0.updateDecoratorBounds();
      assertEquals(12.0F, labelFigure0.getFontSize(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TextAreaFigure textAreaFigure0 = new TextAreaFigure("");
      Rectangle2D.Double rectangle2D_Double0 = textAreaFigure0.getFigureDrawingArea();
      assertEquals(2.5, rectangle2D_Double0.getMaxX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TextFigure textFigure0 = new TextFigure((String) null);
      Rectangle2D.Double rectangle2D_Double0 = textFigure0.getFigureDrawingArea();
      assertEquals(14.583984375, rectangle2D_Double0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure();
      Rectangle2D.Double rectangle2D_Double0 = labelFigure0.getDrawingArea();
      assertEquals(35.8046875, rectangle2D_Double0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextAreaFigure textAreaFigure0 = new TextAreaFigure();
      Rectangle2D.Double rectangle2D_Double0 = textAreaFigure0.getDrawingArea();
      assertEquals((-2.5), rectangle2D_Double0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure(1375.5304516586023, (-1195.25371), (-1195.25371), 152.09586454468263);
      Rectangle2D.Double rectangle2D_Double0 = imageFigure0.getDrawingArea();
      assertEquals((-1194.25371), rectangle2D_Double0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure();
      RelativeDecoratorLocator relativeDecoratorLocator0 = new RelativeDecoratorLocator();
      Point2D.Double point2D_Double0 = relativeDecoratorLocator0.locate((Figure) labelFigure0);
      boolean boolean0 = labelFigure0.contains(point2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure();
      DiamondFigure diamondFigure0 = new DiamondFigure((-2.0), (-2.0), (-3910.58), (-499.5));
      Point2D.Double point2D_Double0 = diamondFigure0.getEndPoint();
      boolean boolean0 = labelFigure0.contains(point2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure("");
      AbstractAttributedDecoratedFigure abstractAttributedDecoratedFigure0 = labelFigure0.clone();
      assertNotSame(abstractAttributedDecoratedFigure0, labelFigure0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure();
      JavaPrimitivesDOMFactory javaPrimitivesDOMFactory0 = new JavaPrimitivesDOMFactory();
      JavaxDOMOutput javaxDOMOutput0 = new JavaxDOMOutput(javaPrimitivesDOMFactory0);
      // Undeclared exception!
      try { 
        labelFigure0.write(javaxDOMOutput0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.sun.org.apache.xerces.internal.dom.DocumentImpl cannot be cast to org.w3c.dom.Element
         //
         verifyException("org.jhotdraw.xml.JavaxDOMOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextFigure textFigure0 = new TextFigure();
      LabeledLineConnectionFigure labeledLineConnectionFigure0 = new LabeledLineConnectionFigure();
      textFigure0.createHandles(0);
      // Undeclared exception!
      try { 
        textFigure0.setDecorator(labeledLineConnectionFigure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.handle.LocatorHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextAreaFigure textAreaFigure0 = new TextAreaFigure();
      // Undeclared exception!
      try { 
        textAreaFigure0.readDecorator((DOMInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.AbstractAttributedDecoratedFigure", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextAreaFigure textAreaFigure0 = new TextAreaFigure();
      // Undeclared exception!
      try { 
        textAreaFigure0.drawFigure((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.AbstractAttributedFigure", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextFigure textFigure0 = new TextFigure();
      // Undeclared exception!
      try { 
        textFigure0.contains((Point2D.Double) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.geom.RectangularShape", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure("");
      labelFigure0.writeDecorator((DOMOutput) null);
      assertEquals(4, labelFigure0.getTextColumns());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TextFigure textFigure0 = new TextFigure();
      TextAreaFigure textAreaFigure0 = new TextAreaFigure("]jR?ET");
      textFigure0.setDecorator(textAreaFigure0);
      Point2D.Double point2D_Double0 = new Point2D.Double();
      ImageFigure imageFigure0 = new ImageFigure(1.0, 0.0, 0.0, 0.0);
      Rectangle2D.Double rectangle2D_Double0 = imageFigure0.getDrawingArea();
      textFigure0.setBounds(rectangle2D_Double0);
      boolean boolean0 = textFigure0.contains(point2D_Double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextFigure textFigure0 = new TextFigure();
      TextAreaFigure textAreaFigure0 = new TextAreaFigure("]jR?ET");
      textFigure0.setDecorator(textAreaFigure0);
      Point2D.Double point2D_Double0 = new Point2D.Double();
      boolean boolean0 = textFigure0.contains(point2D_Double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure((String) null);
      labelFigure0.setDecorator((Figure) null);
      assertTrue(labelFigure0.isConnectable());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure((-961.493156952), 0.0, (-5143.232524287201), (-961.493156952));
      Figure figure0 = imageFigure0.getDecorator();
      assertNull(figure0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure((String) null);
      // Undeclared exception!
      try { 
        labelFigure0.drawDecorator((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.AbstractAttributedDecoratedFigure", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure();
      ImageOutputFormat imageOutputFormat0 = new ImageOutputFormat();
      QuadTreeDrawing quadTreeDrawing0 = new QuadTreeDrawing();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      List<Figure> list0 = quadTreeDrawing0.findFigures(rectangle2D_Double0);
      BufferedImage bufferedImage0 = imageOutputFormat0.toImage((Drawing) quadTreeDrawing0, list0, 606.1110558603274, true);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      labelFigure0.draw(graphics2D0);
      assertEquals(8, labelFigure0.getTabSize());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure(12.0F, (-3.14), 12.0F, (-3.14));
      // Undeclared exception!
      try { 
        imageFigure0.write((DOMOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.figure.AbstractAttributedFigure", e);
      }
  }
}
