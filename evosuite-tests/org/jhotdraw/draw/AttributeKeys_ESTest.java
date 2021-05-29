/*
 * This file was automatically generated by EvoSuite
 * Sat May 29 16:15:34 GMT 2021
 */

package org.jhotdraw.draw;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jhotdraw.draw.AttributeKeys;
import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.GraphicalCompositeFigure;
import org.jhotdraw.draw.QuadTreeDrawing;
import org.jhotdraw.draw.figure.DiamondFigure;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.figure.GroupFigure;
import org.jhotdraw.draw.figure.ImageFigure;
import org.jhotdraw.draw.figure.LabelFigure;
import org.jhotdraw.draw.figure.LabeledLineConnectionFigure;
import org.jhotdraw.draw.figure.RectangleFigure;
import org.jhotdraw.draw.figure.RoundRectangleFigure;
import org.jhotdraw.draw.io.ImageOutputFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AttributeKeys_ESTest extends AttributeKeys_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImageOutputFormat imageOutputFormat0 = new ImageOutputFormat("org.jhotdraw.draw.Labels", "org.jhotdraw.draw.Labels", "org.jhotdraw.draw.Labels", 0);
      DefaultDrawing defaultDrawing0 = new DefaultDrawing();
      QuadTreeDrawing quadTreeDrawing0 = new QuadTreeDrawing();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(1457.0, 0, 0.0, 480.2);
      List<Figure> list0 = quadTreeDrawing0.findFiguresWithin(rectangle2D_Double0);
      BufferedImage bufferedImage0 = imageOutputFormat0.toImage((Drawing) defaultDrawing0, list0, 480.2, true);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      double double0 = AttributeKeys.getScaleFactorFromGraphics(graphics2D0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance(2723.605716287218, 2723.605716287218, 6.0, (-1784.3826399094));
      affineTransform0.quadrantRotate(214, 12.0, (-1459.9091262225859));
      double double0 = AttributeKeys.getScaleFactor(affineTransform0);
      assertEquals((-1.4142135623730951), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        AttributeKeys.getStrokeTotalWidth((Figure) null, 1532.879922392);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        AttributeKeys.getStrokeTotalMiterLimit((Figure) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        AttributeKeys.getStroke((Figure) null, 4420.22);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        AttributeKeys.getPerpendicularFillGrowth((Figure) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GroupFigure groupFigure0 = new GroupFigure();
      // Undeclared exception!
      try { 
        AttributeKeys.getPerpendicularDrawGrowth(groupFigure0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        AttributeKeys.getHitStroke((Figure) null, 12.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        AttributeKeys.getGlobalValueFactor((Figure) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        AttributeKeys.getFontStyle((Figure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        AttributeKeys.getFont((Figure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure();
      GraphicalCompositeFigure graphicalCompositeFigure0 = new GraphicalCompositeFigure(imageFigure0);
      double double0 = AttributeKeys.getPerpendicularHitGrowth(graphicalCompositeFigure0, 3.0);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultDrawing defaultDrawing0 = new DefaultDrawing();
      double double0 = AttributeKeys.getPerpendicularDrawGrowth(defaultDrawing0, (-62.012));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure();
      int int0 = AttributeKeys.getFontStyle(labelFigure0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure();
      double double0 = AttributeKeys.getStrokeTotalMiterLimit(labelFigure0, 800.0);
      assertEquals(3.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImageFigure imageFigure0 = new ImageFigure();
      GraphicalCompositeFigure graphicalCompositeFigure0 = new GraphicalCompositeFigure(imageFigure0);
      double double0 = AttributeKeys.getStrokeTotalWidth(graphicalCompositeFigure0, 3.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RoundRectangleFigure roundRectangleFigure0 = new RoundRectangleFigure();
      double double0 = AttributeKeys.getGlobalValueFactor(roundRectangleFigure0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LabeledLineConnectionFigure labeledLineConnectionFigure0 = new LabeledLineConnectionFigure();
      double double0 = AttributeKeys.getGlobalValueFactor(labeledLineConnectionFigure0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GroupFigure groupFigure0 = new GroupFigure();
      // Undeclared exception!
      try { 
        AttributeKeys.getPerpendicularHitGrowth(groupFigure0, (-815.8319417));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RectangleFigure rectangleFigure0 = new RectangleFigure();
      double double0 = AttributeKeys.getPerpendicularFillGrowth(rectangleFigure0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LabeledLineConnectionFigure labeledLineConnectionFigure0 = new LabeledLineConnectionFigure();
      Font font0 = AttributeKeys.getFont(labeledLineConnectionFigure0);
      assertNotNull(font0);
      assertEquals(0, font0.getStyle());
      assertEquals(12, font0.getSize());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LabelFigure labelFigure0 = new LabelFigure("0");
      BasicStroke basicStroke0 = (BasicStroke)AttributeKeys.getStroke(labelFigure0, 0.001);
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
      assertEquals(3.0F, basicStroke0.getMiterLimit(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AffineTransform affineTransform0 = AffineTransform.getQuadrantRotateInstance((int) (byte) (-125), 10.031236138101217, 1542.8913617294272);
      double double0 = AttributeKeys.getScaleFactor(affineTransform0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double double0 = AttributeKeys.getScaleFactor((AffineTransform) null);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DiamondFigure diamondFigure0 = new DiamondFigure();
      BasicStroke basicStroke0 = (BasicStroke)AttributeKeys.getHitStroke(diamondFigure0, 3.0);
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
      assertEquals(3.0F, basicStroke0.getMiterLimit(), 0.01F);
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        AttributeKeys.getScaleFactorFromGraphics((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.AttributeKeys", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AttributeKeys attributeKeys0 = new AttributeKeys();
  }
}