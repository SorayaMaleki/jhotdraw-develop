/*
 * This file was automatically generated by EvoSuite
 * Sat May 29 13:13:17 GMT 2021
 */

package org.jhotdraw.draw.layouter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jhotdraw.draw.AttributeKeys;
import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.GraphicalCompositeFigure;
import org.jhotdraw.draw.figure.CompositeFigure;
import org.jhotdraw.draw.figure.DiamondFigure;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.figure.LabeledLineConnectionFigure;
import org.jhotdraw.draw.figure.LineConnectionFigure;
import org.jhotdraw.draw.figure.ListFigure;
import org.jhotdraw.draw.figure.TriangleFigure;
import org.jhotdraw.draw.handle.BezierControlPointHandle;
import org.jhotdraw.draw.handle.RoundRectangleRadiusHandle;
import org.jhotdraw.draw.layouter.LocatorLayouter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocatorLayouter_ESTest extends LocatorLayouter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocatorLayouter locatorLayouter0 = new LocatorLayouter();
      DefaultDrawing defaultDrawing0 = new DefaultDrawing();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      GraphicalCompositeFigure graphicalCompositeFigure0 = new GraphicalCompositeFigure(defaultDrawing0);
      AttributeKeys.Orientation attributeKeys_Orientation0 = AttributeKeys.Orientation.NORTH;
      TriangleFigure triangleFigure0 = new TriangleFigure(12.0, 12.0, 2677.01, 2677.01, attributeKeys_Orientation0);
      graphicalCompositeFigure0.add((Figure) triangleFigure0);
      Rectangle2D.Double rectangle2D_Double0 = locatorLayouter0.layout(graphicalCompositeFigure0, point2D_Double0, point2D_Double0);
      assertEquals(2677.01, rectangle2D_Double0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocatorLayouter locatorLayouter0 = new LocatorLayouter();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      GraphicalCompositeFigure graphicalCompositeFigure0 = new GraphicalCompositeFigure();
      TriangleFigure triangleFigure0 = new TriangleFigure(3434.276, 12.0, 12.0, 12.0);
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance(3434.276);
      triangleFigure0.transform(affineTransform0);
      graphicalCompositeFigure0.add((Figure) triangleFigure0);
      Rectangle2D.Double rectangle2D_Double0 = locatorLayouter0.layout(graphicalCompositeFigure0, point2D_Double0, point2D_Double0);
      assertEquals((-2987.053440175076), rectangle2D_Double0.x, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocatorLayouter locatorLayouter0 = new LocatorLayouter();
      DefaultDrawing defaultDrawing0 = new DefaultDrawing();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      GraphicalCompositeFigure graphicalCompositeFigure0 = new GraphicalCompositeFigure(defaultDrawing0);
      AttributeKeys.Orientation attributeKeys_Orientation0 = AttributeKeys.Orientation.NORTH;
      TriangleFigure triangleFigure0 = new TriangleFigure(12.0, 12.0, 2677.01, 2677.01, attributeKeys_Orientation0);
      graphicalCompositeFigure0.add((Figure) triangleFigure0);
      Rectangle2D.Double rectangle2D_Double0 = locatorLayouter0.calculateLayout(graphicalCompositeFigure0, point2D_Double0, point2D_Double0);
      assertEquals(2677.01, rectangle2D_Double0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocatorLayouter locatorLayouter0 = new LocatorLayouter();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      GraphicalCompositeFigure graphicalCompositeFigure0 = new GraphicalCompositeFigure();
      TriangleFigure triangleFigure0 = new TriangleFigure(3434.276, 12.0, 12.0, 12.0);
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance(3434.276);
      triangleFigure0.transform(affineTransform0);
      graphicalCompositeFigure0.add((Figure) triangleFigure0);
      Rectangle2D.Double rectangle2D_Double0 = locatorLayouter0.calculateLayout(graphicalCompositeFigure0, point2D_Double0, point2D_Double0);
      assertEquals(4.529339066119519, rectangle2D_Double0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocatorLayouter locatorLayouter0 = new LocatorLayouter();
      LineConnectionFigure lineConnectionFigure0 = new LineConnectionFigure();
      Point2D.Double point2D_Double0 = lineConnectionFigure0.getPointOnPath(1.0F, 1.0F);
      // Undeclared exception!
      try { 
        locatorLayouter0.layout((CompositeFigure) null, point2D_Double0, point2D_Double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.layouter.LocatorLayouter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocatorLayouter locatorLayouter0 = new LocatorLayouter();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      GraphicalCompositeFigure graphicalCompositeFigure0 = new GraphicalCompositeFigure();
      DiamondFigure diamondFigure0 = new DiamondFigure(0.0, 0.0, 0.0, 0.0);
      graphicalCompositeFigure0.basicAdd((Figure) diamondFigure0);
      RoundRectangleRadiusHandle roundRectangleRadiusHandle0 = new RoundRectangleRadiusHandle(graphicalCompositeFigure0);
      // Undeclared exception!
      try { 
        locatorLayouter0.layout(graphicalCompositeFigure0, point2D_Double0, point2D_Double0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jhotdraw.draw.GraphicalCompositeFigure cannot be cast to org.jhotdraw.draw.figure.RoundRectangleFigure
         //
         verifyException("org.jhotdraw.draw.handle.RoundRectangleRadiusHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocatorLayouter locatorLayouter0 = new LocatorLayouter();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      ListFigure listFigure0 = new ListFigure();
      TriangleFigure triangleFigure0 = new TriangleFigure(0.0, 12.0, 12.0, 12.0);
      LineConnectionFigure lineConnectionFigure0 = new LineConnectionFigure();
      BezierControlPointHandle bezierControlPointHandle0 = new BezierControlPointHandle(lineConnectionFigure0, 0, 4567);
      triangleFigure0.addFigureListener(bezierControlPointHandle0);
      listFigure0.add((Figure) triangleFigure0);
      // Undeclared exception!
      try { 
        locatorLayouter0.layout(listFigure0, point2D_Double0, point2D_Double0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4567
         //
         verifyException("org.jhotdraw.geom.BezierPath$Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocatorLayouter locatorLayouter0 = new LocatorLayouter();
      LabeledLineConnectionFigure labeledLineConnectionFigure0 = new LabeledLineConnectionFigure();
      Point2D.Double point2D_Double0 = labeledLineConnectionFigure0.getEndPoint();
      // Undeclared exception!
      try { 
        locatorLayouter0.calculateLayout((CompositeFigure) null, point2D_Double0, point2D_Double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.draw.layouter.LocatorLayouter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocatorLayouter locatorLayouter0 = new LocatorLayouter();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      GraphicalCompositeFigure graphicalCompositeFigure0 = new GraphicalCompositeFigure();
      DiamondFigure diamondFigure0 = new DiamondFigure(0.0, 0.0, 0.0, 0.0);
      graphicalCompositeFigure0.basicAdd((Figure) diamondFigure0);
      TriangleFigure triangleFigure0 = new TriangleFigure(0.0, 0.0, 0.0, 0.0);
      graphicalCompositeFigure0.add((Figure) triangleFigure0);
      locatorLayouter0.layout(graphicalCompositeFigure0, point2D_Double0, point2D_Double0);
      Rectangle2D.Double rectangle2D_Double0 = locatorLayouter0.layout(graphicalCompositeFigure0, point2D_Double0, point2D_Double0);
      assertEquals(0.1, rectangle2D_Double0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocatorLayouter locatorLayouter0 = new LocatorLayouter();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      GraphicalCompositeFigure graphicalCompositeFigure0 = new GraphicalCompositeFigure();
      DiamondFigure diamondFigure0 = new DiamondFigure(0.0, 0.0, 0.0, 0.0);
      graphicalCompositeFigure0.basicAdd((Figure) diamondFigure0);
      TriangleFigure triangleFigure0 = new TriangleFigure(0.0, 0.0, 0.0, 0.0);
      graphicalCompositeFigure0.add((Figure) triangleFigure0);
      locatorLayouter0.layout(graphicalCompositeFigure0, point2D_Double0, point2D_Double0);
      Rectangle2D.Double rectangle2D_Double0 = locatorLayouter0.calculateLayout(graphicalCompositeFigure0, point2D_Double0, point2D_Double0);
      assertEquals(0.1, rectangle2D_Double0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocatorLayouter locatorLayouter0 = new LocatorLayouter();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      GraphicalCompositeFigure graphicalCompositeFigure0 = new GraphicalCompositeFigure();
      DiamondFigure diamondFigure0 = new DiamondFigure(0.0, 0.0, 0.0, 0.0);
      graphicalCompositeFigure0.basicAdd((Figure) diamondFigure0);
      Rectangle2D.Double rectangle2D_Double0 = locatorLayouter0.calculateLayout(graphicalCompositeFigure0, point2D_Double0, point2D_Double0);
      assertEquals(0.0, rectangle2D_Double0.getMinY(), 0.01);
  }
}
