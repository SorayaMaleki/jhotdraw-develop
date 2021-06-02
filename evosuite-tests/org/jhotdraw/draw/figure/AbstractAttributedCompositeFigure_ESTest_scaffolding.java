/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jun 01 05:59:32 GMT 2021
 */

package org.jhotdraw.draw.figure;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractAttributedCompositeFigure_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jhotdraw.draw.figure.AbstractAttributedCompositeFigure"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractAttributedCompositeFigure_ESTest_scaffolding.class.getClassLoader() ,
      "org.jhotdraw.draw.figure.AbstractAttributedFigure",
      "org.jhotdraw.draw.DefaultDrawingView$EventHandler",
      "org.jhotdraw.geom.QuadTree",
      "org.jhotdraw.draw.DefaultDrawing",
      "org.jhotdraw.draw.tool.Tool",
      "org.jhotdraw.geom.GrowStroke",
      "org.jhotdraw.draw.figure.TextFigure",
      "org.jhotdraw.draw.figure.RectangleFigure",
      "org.jhotdraw.draw.AttributeKey",
      "org.jhotdraw.draw.io.ImageInputFormat",
      "org.jhotdraw.draw.io.DOMStorableInputOutputFormat",
      "org.jhotdraw.draw.figure.LineFigure",
      "org.jhotdraw.draw.figure.DiamondFigure",
      "org.jhotdraw.draw.layouter.LocatorLayouter",
      "org.jhotdraw.draw.event.FigureAdapter",
      "org.jhotdraw.draw.io.OutputFormat",
      "org.jhotdraw.xml.DefaultDOMFactory",
      "org.jhotdraw.draw.figure.LabeledLineConnectionFigure$ChildHandler",
      "org.jhotdraw.draw.locator.BezierPointLocator",
      "org.jhotdraw.draw.figure.TriangleFigure",
      "org.jhotdraw.draw.figure.DecoratedFigure",
      "org.jhotdraw.draw.event.FigureListener",
      "org.jhotdraw.draw.layouter.Layouter",
      "org.jhotdraw.draw.QuadTreeDrawing",
      "org.jhotdraw.draw.DrawingEditorProxy",
      "org.jhotdraw.draw.connector.ChopRoundRectangleConnector",
      "org.jhotdraw.xml.JavaxDOMOutput",
      "org.jhotdraw.draw.figure.RoundRectangleFigure",
      "org.jhotdraw.draw.connector.ChopRectangleConnector",
      "org.jhotdraw.draw.event.ToolListener",
      "org.jhotdraw.draw.AbstractDrawing",
      "org.jhotdraw.draw.figure.ImageFigure",
      "org.jhotdraw.draw.io.InputFormat",
      "org.jhotdraw.draw.QuadTreeDrawing$QuadTreeEventHandler",
      "org.jhotdraw.draw.locator.RelativeLocator",
      "org.jhotdraw.draw.figure.TextHolderFigure",
      "org.jhotdraw.draw.connector.ChopEllipseConnector",
      "org.jhotdraw.draw.handle.CloseHandle",
      "org.jhotdraw.draw.connector.AbstractConnector",
      "org.jhotdraw.draw.figure.AbstractCompositeFigure$EventHandler",
      "org.jhotdraw.xml.JavaxDOMInput",
      "org.jhotdraw.draw.figure.Figure",
      "org.jhotdraw.draw.io.TextInputFormat",
      "org.jhotdraw.geom.Shapes",
      "org.jhotdraw.geom.Dimension2DDouble",
      "org.jhotdraw.draw.event.HandleEvent",
      "org.jhotdraw.draw.locator.RelativeDecoratorLocator",
      "org.jhotdraw.draw.figure.AbstractFigure",
      "org.jhotdraw.draw.AttributeKey$1",
      "org.jhotdraw.draw.GridConstrainer",
      "org.jhotdraw.draw.handle.BezierScaleHandle",
      "org.jhotdraw.geom.DoubleStroke",
      "org.jhotdraw.draw.DrawingView",
      "org.jhotdraw.draw.AttributeKeys$Orientation",
      "org.jhotdraw.draw.event.SelectionComponentDisplayer",
      "org.jhotdraw.draw.AttributeKeys$Underfill",
      "org.jhotdraw.draw.figure.AbstractAttributedCompositeFigure",
      "org.jhotdraw.draw.connector.ChopDiamondConnector",
      "org.jhotdraw.xml.DOMInput",
      "org.jhotdraw.draw.event.FigureSelectionListener",
      "org.jhotdraw.draw.locator.BezierLabelLocator",
      "org.jhotdraw.draw.AttributeKeys$StrokePlacement",
      "org.jhotdraw.draw.AttributeKeys$1",
      "org.jhotdraw.draw.locator.Locator",
      "org.jhotdraw.draw.GridConstrainer$1",
      "org.jhotdraw.draw.AbstractConstrainer",
      "org.jhotdraw.draw.layouter.AbstractLayouter",
      "org.jhotdraw.util.Methods",
      "org.jhotdraw.draw.GraphicalCompositeFigure$1",
      "org.jhotdraw.draw.event.FigureSelectionEvent",
      "org.jhotdraw.draw.handle.BezierOutlineHandle",
      "org.jhotdraw.draw.DrawingEditorProxy$Forwarder",
      "org.jhotdraw.xml.JavaPrimitivesDOMFactory",
      "org.jhotdraw.geom.BezierPath$Node",
      "org.jhotdraw.geom.BezierPathIterator",
      "org.jhotdraw.draw.figure.LineConnectionFigure$ConnectionHandler",
      "org.jhotdraw.draw.GraphicalCompositeFigure",
      "org.jhotdraw.draw.handle.RoundRectangleRadiusHandle",
      "org.jhotdraw.draw.connector.Connector",
      "org.jhotdraw.draw.event.CompositeFigureEvent",
      "org.jhotdraw.draw.event.HandleListener",
      "org.jhotdraw.draw.event.FigureEvent",
      "org.jhotdraw.draw.figure.TriangleFigure$1",
      "org.jhotdraw.draw.figure.BezierFigure",
      "org.jhotdraw.xml.DOMFactory",
      "org.jhotdraw.draw.figure.AbstractAttributedDecoratedFigure",
      "org.jhotdraw.draw.GraphicalCompositeFigure$PresentationFigureHandler",
      "org.jhotdraw.draw.io.SerializationInputOutputFormat",
      "org.jhotdraw.draw.DefaultDrawingView$1",
      "org.jhotdraw.util.LocaleUtil",
      "org.jhotdraw.draw.connector.StickyRectangleConnector",
      "org.jhotdraw.draw.DrawingEditor",
      "org.jhotdraw.draw.TranslationDirection",
      "org.jhotdraw.draw.Drawing",
      "org.jhotdraw.draw.connector.LocatorConnector",
      "org.jhotdraw.xml.DOMStorable",
      "org.jhotdraw.xml.DOMOutput",
      "org.jhotdraw.draw.RotationDirection",
      "org.jhotdraw.draw.layouter.VerticalLayouter",
      "org.jhotdraw.draw.figure.CompositeFigure",
      "org.jhotdraw.draw.figure.AbstractCompositeFigure",
      "org.jhotdraw.draw.handle.ConnectorHandle",
      "org.jhotdraw.draw.AttributeKeys$Alignment",
      "org.jhotdraw.draw.figure.LabeledLineConnectionFigure",
      "org.jhotdraw.geom.BezierPath",
      "org.jhotdraw.draw.locator.FontSizeLocator",
      "org.jhotdraw.draw.event.CompositeFigureListener",
      "org.jhotdraw.draw.locator.AbstractLocator",
      "org.jhotdraw.draw.Constrainer",
      "org.jhotdraw.geom.Geom",
      "org.jhotdraw.draw.liner.Liner",
      "org.jhotdraw.draw.figure.EllipseFigure",
      "org.jhotdraw.geom.Insets2D",
      "org.jhotdraw.geom.Insets2D$Double",
      "org.jhotdraw.draw.figure.TextAreaFigure",
      "org.jhotdraw.draw.connector.ChopTriangleConnector",
      "org.jhotdraw.beans.AbstractBean",
      "org.jhotdraw.draw.AttributeKeys$WindingRule",
      "org.jhotdraw.draw.handle.LocatorHandle",
      "org.jhotdraw.draw.DefaultDrawingViewTransferHandler",
      "org.jhotdraw.draw.figure.ListFigure",
      "org.jhotdraw.draw.AttributeKeys$StrokeType",
      "org.jhotdraw.draw.event.ToolEvent",
      "org.jhotdraw.draw.figure.ImageHolderFigure",
      "org.jhotdraw.draw.figure.LabelFigure",
      "org.jhotdraw.draw.handle.BezierControlPointHandle",
      "org.jhotdraw.draw.io.ImageOutputFormat",
      "org.jhotdraw.geom.QuadTree$QuadNode",
      "org.jhotdraw.util.ResourceBundleUtil",
      "org.jhotdraw.draw.figure.GroupFigure",
      "org.jhotdraw.draw.figure.ConnectionFigure",
      "org.jhotdraw.draw.connector.ChopBezierConnector",
      "org.jhotdraw.draw.handle.AbstractHandle",
      "org.jhotdraw.util.ReversedList",
      "org.jhotdraw.draw.figure.LineConnectionFigure",
      "org.jhotdraw.datatransfer.ImageTransferable",
      "org.jhotdraw.api.gui.EditableComponent",
      "org.jhotdraw.draw.layouter.HorizontalLayouter",
      "org.jhotdraw.draw.decoration.LineDecoration",
      "org.jhotdraw.draw.DefaultDrawingView",
      "org.jhotdraw.draw.handle.Handle",
      "org.jhotdraw.draw.AttributeKeys"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractAttributedCompositeFigure_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jhotdraw.beans.AbstractBean",
      "org.jhotdraw.draw.figure.AbstractFigure",
      "org.jhotdraw.draw.figure.AbstractCompositeFigure",
      "org.jhotdraw.draw.figure.AbstractAttributedCompositeFigure",
      "org.jhotdraw.draw.AttributeKey",
      "org.jhotdraw.geom.Insets2D",
      "org.jhotdraw.geom.Insets2D$Double",
      "org.jhotdraw.util.ResourceBundleUtil",
      "org.jhotdraw.util.LocaleUtil",
      "org.jhotdraw.draw.figure.CompositeFigure",
      "org.jhotdraw.draw.AttributeKeys$WindingRule",
      "org.jhotdraw.draw.AttributeKeys$Underfill",
      "org.jhotdraw.draw.AttributeKeys$StrokeType",
      "org.jhotdraw.draw.AttributeKeys$StrokePlacement",
      "org.jhotdraw.geom.Dimension2DDouble",
      "org.jhotdraw.draw.AttributeKeys$Alignment",
      "org.jhotdraw.draw.AttributeKeys$Orientation",
      "org.jhotdraw.draw.AttributeKeys",
      "org.jhotdraw.draw.AttributeKeys$1",
      "org.jhotdraw.draw.AbstractDrawing",
      "org.jhotdraw.draw.DefaultDrawing",
      "org.jhotdraw.draw.event.FigureAdapter",
      "org.jhotdraw.draw.figure.AbstractCompositeFigure$EventHandler",
      "org.jhotdraw.draw.locator.BezierLabelLocator",
      "org.jhotdraw.draw.QuadTreeDrawing",
      "org.jhotdraw.draw.QuadTreeDrawing$QuadTreeEventHandler",
      "org.jhotdraw.geom.QuadTree",
      "org.jhotdraw.geom.QuadTree$QuadNode",
      "org.jhotdraw.draw.figure.AbstractAttributedFigure",
      "org.jhotdraw.draw.figure.BezierFigure",
      "org.jhotdraw.draw.figure.LineFigure",
      "org.jhotdraw.draw.figure.LineConnectionFigure",
      "org.jhotdraw.draw.figure.LabeledLineConnectionFigure",
      "org.jhotdraw.geom.BezierPath",
      "org.jhotdraw.geom.BezierPath$Node",
      "org.jhotdraw.draw.figure.LineConnectionFigure$ConnectionHandler",
      "org.jhotdraw.draw.figure.LabeledLineConnectionFigure$ChildHandler",
      "org.jhotdraw.draw.figure.AbstractAttributedDecoratedFigure",
      "org.jhotdraw.draw.figure.TextFigure",
      "org.jhotdraw.draw.figure.LabelFigure",
      "org.jhotdraw.draw.figure.RectangleFigure",
      "org.jhotdraw.draw.figure.ImageFigure",
      "org.jhotdraw.draw.io.ImageInputFormat",
      "org.jhotdraw.draw.figure.DiamondFigure",
      "org.jhotdraw.util.ReversedList",
      "org.jhotdraw.draw.connector.AbstractConnector",
      "org.jhotdraw.draw.connector.ChopRectangleConnector",
      "org.jhotdraw.draw.connector.ChopDiamondConnector",
      "org.jhotdraw.geom.Geom",
      "org.jhotdraw.draw.handle.AbstractHandle",
      "org.jhotdraw.draw.handle.ConnectorHandle",
      "org.jhotdraw.draw.GraphicalCompositeFigure",
      "org.jhotdraw.draw.figure.ListFigure",
      "org.jhotdraw.draw.GraphicalCompositeFigure$PresentationFigureHandler",
      "org.jhotdraw.draw.layouter.AbstractLayouter",
      "org.jhotdraw.draw.layouter.VerticalLayouter",
      "org.jhotdraw.draw.locator.AbstractLocator",
      "org.jhotdraw.draw.locator.BezierPointLocator",
      "org.jhotdraw.geom.BezierPathIterator",
      "org.jhotdraw.draw.figure.RoundRectangleFigure",
      "org.jhotdraw.draw.AbstractConstrainer",
      "org.jhotdraw.draw.GridConstrainer",
      "org.jhotdraw.draw.figure.TriangleFigure",
      "org.jhotdraw.draw.AttributeKey$1",
      "org.jhotdraw.draw.connector.StickyRectangleConnector",
      "org.jhotdraw.xml.JavaPrimitivesDOMFactory",
      "org.jhotdraw.xml.DefaultDOMFactory",
      "org.jhotdraw.draw.figure.EllipseFigure",
      "org.jhotdraw.draw.locator.FontSizeLocator",
      "org.jhotdraw.draw.DefaultDrawingView",
      "org.jhotdraw.draw.DefaultDrawingView$1",
      "org.jhotdraw.draw.DefaultDrawingView$EventHandler",
      "org.jhotdraw.draw.DefaultDrawingViewTransferHandler",
      "org.jhotdraw.draw.figure.GroupFigure",
      "org.jhotdraw.util.Methods",
      "org.jhotdraw.draw.connector.ChopBezierConnector",
      "org.jhotdraw.xml.JavaxDOMInput",
      "org.jhotdraw.xml.JavaxDOMOutput",
      "org.jhotdraw.draw.io.ImageOutputFormat",
      "org.jhotdraw.draw.io.SerializationInputOutputFormat",
      "org.jhotdraw.draw.locator.RelativeLocator",
      "org.jhotdraw.draw.locator.RelativeDecoratorLocator",
      "org.jhotdraw.draw.GraphicalCompositeFigure$1",
      "org.jhotdraw.draw.connector.ChopRoundRectangleConnector",
      "org.jhotdraw.draw.connector.ChopTriangleConnector",
      "org.jhotdraw.draw.io.DOMStorableInputOutputFormat",
      "org.jhotdraw.draw.figure.TextAreaFigure",
      "org.jhotdraw.draw.figure.TriangleFigure$1",
      "org.jhotdraw.draw.connector.LocatorConnector",
      "org.jhotdraw.draw.RotationDirection",
      "org.jhotdraw.draw.GridConstrainer$1",
      "org.jhotdraw.draw.handle.BezierControlPointHandle",
      "org.jhotdraw.draw.handle.BezierOutlineHandle",
      "org.jhotdraw.draw.handle.RoundRectangleRadiusHandle",
      "org.jhotdraw.draw.connector.ChopEllipseConnector",
      "org.jhotdraw.draw.layouter.HorizontalLayouter",
      "org.jhotdraw.draw.event.FigureEvent",
      "org.jhotdraw.geom.Shapes",
      "org.jhotdraw.draw.handle.LocatorHandle",
      "org.jhotdraw.draw.handle.CloseHandle",
      "org.jhotdraw.geom.DoubleStroke",
      "org.jhotdraw.geom.GrowStroke",
      "org.jhotdraw.draw.layouter.LocatorLayouter",
      "org.jhotdraw.draw.DrawingEditorProxy",
      "org.jhotdraw.draw.DrawingEditorProxy$Forwarder",
      "org.jhotdraw.draw.event.SelectionComponentDisplayer",
      "org.jhotdraw.datatransfer.ImageTransferable",
      "org.jhotdraw.draw.io.TextInputFormat",
      "org.jhotdraw.draw.handle.BezierScaleHandle"
    );
  }
}
