/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jun 05 07:48:52 GMT 2021
 */

package org.jhotdraw.draw;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AttributeKeys_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jhotdraw.draw.AttributeKeys"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AttributeKeys_ESTest_scaffolding.class.getClassLoader() ,
      "org.jhotdraw.draw.figure.AbstractAttributedFigure",
      "org.jhotdraw.draw.handle.AbstractRotateHandle",
      "org.jhotdraw.draw.tool.DragTracker",
      "org.jhotdraw.draw.handle.TransformHandleKit$NorthEastHandle",
      "org.jhotdraw.draw.DefaultDrawing",
      "org.jhotdraw.draw.tool.Tool",
      "org.jhotdraw.draw.AttributeKey",
      "org.jhotdraw.draw.io.ImageInputFormat",
      "org.jhotdraw.draw.figure.LineFigure",
      "org.jhotdraw.draw.figure.DiamondFigure",
      "org.jhotdraw.draw.event.FigureAdapter",
      "org.jhotdraw.draw.io.OutputFormat",
      "org.jhotdraw.xml.DefaultDOMFactory",
      "org.jhotdraw.draw.locator.BezierPointLocator",
      "org.jhotdraw.draw.figure.DecoratedFigure",
      "org.jhotdraw.draw.handle.TransformHandleKit$SouthEastHandle",
      "org.jhotdraw.draw.action.MoveAction",
      "org.jhotdraw.draw.handle.TransformHandleKit",
      "org.jhotdraw.draw.event.FigureListener",
      "org.jhotdraw.draw.layouter.Layouter",
      "org.jhotdraw.draw.QuadTreeDrawing",
      "org.jhotdraw.draw.DrawingEditorProxy",
      "org.jhotdraw.xml.JavaxDOMOutput",
      "org.jhotdraw.draw.connector.ChopRectangleConnector",
      "org.jhotdraw.draw.event.ToolListener",
      "org.jhotdraw.draw.AbstractDrawing",
      "org.jhotdraw.draw.figure.ImageFigure",
      "org.jhotdraw.draw.Inside",
      "org.jhotdraw.draw.decoration.ArrowTip",
      "org.jhotdraw.draw.QuadTreeDrawing$QuadTreeEventHandler",
      "org.jhotdraw.draw.connector.ChopEllipseConnector",
      "org.jhotdraw.draw.handle.CloseHandle",
      "org.jhotdraw.draw.figure.AbstractCompositeFigure$EventHandler",
      "org.jhotdraw.draw.action.MoveAction$East",
      "org.jhotdraw.draw.figure.Figure",
      "org.jhotdraw.draw.action.MoveConstrainedAction$South",
      "org.jhotdraw.draw.tool.SelectAreaTracker",
      "org.jhotdraw.draw.action.MoveConstrainedAction$North",
      "org.jhotdraw.geom.Dimension2DDouble",
      "org.jhotdraw.draw.locator.RelativeDecoratorLocator",
      "org.jhotdraw.action.edit.AbstractSelectionAction",
      "org.jhotdraw.geom.DoubleStroke",
      "org.jhotdraw.draw.DrawingView",
      "org.jhotdraw.draw.decoration.CompositeLineDecoration",
      "org.jhotdraw.draw.figure.AbstractAttributedCompositeFigure",
      "org.jhotdraw.draw.handle.HandleAttributeKeys",
      "org.jhotdraw.draw.handle.TransformHandleKit$EastHandle",
      "org.jhotdraw.xml.DOMInput",
      "org.jhotdraw.draw.locator.Locator",
      "org.jhotdraw.draw.handle.TransformHandleKit$NorthWestHandle",
      "org.jhotdraw.draw.AbstractConstrainer",
      "org.jhotdraw.draw.layouter.AbstractLayouter",
      "org.jhotdraw.draw.GraphicalCompositeFigure$1",
      "org.jhotdraw.draw.event.FigureSelectionEvent",
      "org.jhotdraw.action.edit.CopyAction",
      "org.jhotdraw.draw.GraphicalCompositeFigure",
      "org.jhotdraw.draw.handle.RoundRectangleRadiusHandle",
      "org.jhotdraw.draw.connector.Connector",
      "org.jhotdraw.draw.event.HandleListener",
      "org.jhotdraw.draw.figure.TriangleFigure$1",
      "org.jhotdraw.xml.DOMFactory",
      "org.jhotdraw.action.edit.DeleteAction",
      "org.jhotdraw.draw.action.IncreaseHandleDetailLevelAction",
      "org.jhotdraw.draw.Placement",
      "org.jhotdraw.draw.io.SerializationInputOutputFormat",
      "org.jhotdraw.draw.DefaultDrawingView$1",
      "org.jhotdraw.draw.DrawingEditor",
      "org.jhotdraw.xml.DOMOutput",
      "org.jhotdraw.draw.RotationDirection",
      "org.jhotdraw.draw.layouter.VerticalLayouter",
      "org.jhotdraw.draw.figure.AbstractCompositeFigure",
      "org.jhotdraw.draw.liner.SlantedLiner",
      "org.jhotdraw.api.app.Disposable",
      "org.jhotdraw.draw.action.AbstractSelectedAction",
      "org.jhotdraw.geom.BezierPath",
      "org.jhotdraw.draw.figure.LabeledLineConnectionFigure",
      "org.jhotdraw.draw.locator.FontSizeLocator",
      "org.jhotdraw.draw.tool.CreationTool",
      "org.jhotdraw.geom.Geom",
      "org.jhotdraw.draw.liner.Liner",
      "org.jhotdraw.geom.Insets2D",
      "org.jhotdraw.draw.figure.EllipseFigure",
      "org.jhotdraw.draw.liner.CurvedLiner",
      "org.jhotdraw.geom.Insets2D$Double",
      "org.jhotdraw.draw.connector.ChopTriangleConnector",
      "org.jhotdraw.draw.AttributeKeys$WindingRule",
      "org.jhotdraw.draw.handle.LocatorHandle",
      "org.jhotdraw.draw.tool.AbstractTool",
      "org.jhotdraw.draw.figure.ListFigure",
      "org.jhotdraw.draw.decoration.AbstractLineDecoration",
      "org.jhotdraw.draw.figure.ImageHolderFigure",
      "org.jhotdraw.draw.figure.LabelFigure",
      "org.jhotdraw.draw.io.ImageOutputFormat",
      "org.jhotdraw.util.ResourceBundleUtil",
      "org.jhotdraw.draw.action.AbstractSelectedAction$EventHandler",
      "org.jhotdraw.draw.figure.ConnectionFigure",
      "org.jhotdraw.draw.connector.ChopBezierConnector",
      "org.jhotdraw.draw.handle.AbstractHandle",
      "org.jhotdraw.util.ReversedList",
      "org.jhotdraw.api.gui.EditableComponent",
      "org.jhotdraw.draw.layouter.HorizontalLayouter",
      "org.jhotdraw.draw.DefaultDrawingView",
      "org.jhotdraw.draw.DefaultDrawingView$EventHandler",
      "org.jhotdraw.geom.QuadTree",
      "org.jhotdraw.draw.action.MoveConstrainedAction",
      "org.jhotdraw.draw.decoration.PerpendicularBar",
      "org.jhotdraw.geom.GrowStroke",
      "org.jhotdraw.draw.figure.TextFigure",
      "org.jhotdraw.draw.Center",
      "org.jhotdraw.draw.figure.RectangleFigure",
      "org.jhotdraw.draw.io.DOMStorableInputOutputFormat",
      "org.jhotdraw.draw.figure.LabeledLineConnectionFigure$ChildHandler",
      "org.jhotdraw.draw.DefaultDrawingEditor$ToolHandler",
      "org.jhotdraw.draw.figure.TriangleFigure",
      "org.jhotdraw.draw.tool.DelegationSelectionTool",
      "org.jhotdraw.draw.Outside",
      "org.jhotdraw.draw.action.MoveAction$South",
      "org.jhotdraw.action.edit.CutAction",
      "org.jhotdraw.draw.connector.ChopRoundRectangleConnector",
      "org.jhotdraw.draw.figure.RoundRectangleFigure",
      "org.jhotdraw.draw.handle.RotateHandle",
      "org.jhotdraw.draw.io.InputFormat",
      "org.jhotdraw.draw.tool.TextAreaCreationTool",
      "org.jhotdraw.draw.locator.RelativeLocator",
      "org.jhotdraw.draw.handle.TransformHandleKit$SouthHandle",
      "org.jhotdraw.draw.figure.TextHolderFigure",
      "org.jhotdraw.draw.connector.AbstractConnector",
      "org.jhotdraw.action.edit.SelectAllAction",
      "org.jhotdraw.xml.JavaxDOMInput",
      "org.jhotdraw.draw.DefaultDrawingEditor$1",
      "org.jhotdraw.draw.tool.SelectionTool$TrackerHandler",
      "org.jhotdraw.draw.io.TextInputFormat",
      "org.jhotdraw.geom.Shapes",
      "org.jhotdraw.draw.event.HandleEvent",
      "org.jhotdraw.draw.handle.MoveHandle",
      "org.jhotdraw.draw.figure.AbstractFigure",
      "org.jhotdraw.draw.GridConstrainer",
      "org.jhotdraw.draw.DefaultDrawingEditor",
      "org.jhotdraw.draw.handle.BezierScaleHandle",
      "org.jhotdraw.draw.AttributeKeys$Orientation",
      "org.jhotdraw.draw.AttributeKeys$Underfill",
      "org.jhotdraw.draw.connector.ChopDiamondConnector",
      "org.jhotdraw.draw.event.FigureSelectionListener",
      "org.jhotdraw.draw.locator.BezierLabelLocator",
      "org.jhotdraw.draw.AttributeKeys$StrokePlacement",
      "org.jhotdraw.draw.AttributeKeys$1",
      "org.jhotdraw.draw.GridConstrainer$1",
      "org.jhotdraw.draw.liner.ElbowLiner",
      "org.jhotdraw.util.Methods",
      "org.jhotdraw.draw.DrawingEditorProxy$Forwarder",
      "org.jhotdraw.geom.BezierPath$Node",
      "org.jhotdraw.xml.JavaPrimitivesDOMFactory",
      "org.jhotdraw.geom.BezierPathIterator",
      "org.jhotdraw.draw.figure.LineConnectionFigure$ConnectionHandler",
      "org.jhotdraw.beans.WeakPropertyChangeListener",
      "org.jhotdraw.draw.handle.TransformHandleKit$TransformHandle",
      "org.jhotdraw.draw.event.CompositeFigureEvent",
      "org.jhotdraw.draw.event.FigureEvent",
      "org.jhotdraw.draw.figure.BezierFigure",
      "org.jhotdraw.action.edit.PasteAction",
      "org.jhotdraw.draw.GraphicalCompositeFigure$PresentationFigureHandler",
      "org.jhotdraw.draw.figure.AbstractAttributedDecoratedFigure",
      "org.jhotdraw.draw.action.MoveConstrainedAction$West",
      "org.jhotdraw.util.LocaleUtil",
      "org.jhotdraw.draw.action.MoveAction$North",
      "org.jhotdraw.draw.handle.FontSizeHandle",
      "org.jhotdraw.draw.handle.NullHandle",
      "org.jhotdraw.draw.TranslationDirection",
      "org.jhotdraw.draw.tool.HandleTracker",
      "org.jhotdraw.draw.Drawing",
      "org.jhotdraw.xml.DOMStorable",
      "org.jhotdraw.draw.figure.CompositeFigure",
      "org.jhotdraw.draw.handle.TransformHandleKit$NorthHandle",
      "org.jhotdraw.draw.handle.ConnectorHandle",
      "org.jhotdraw.draw.AttributeKeys$Alignment",
      "org.jhotdraw.draw.event.CompositeFigureListener",
      "org.jhotdraw.draw.locator.AbstractLocator",
      "org.jhotdraw.draw.Constrainer",
      "org.jhotdraw.draw.decoration.GeneralPathTip",
      "org.jhotdraw.draw.event.ToolAdapter",
      "org.jhotdraw.draw.figure.TextAreaFigure",
      "org.jhotdraw.draw.tool.DefaultSelectAreaTracker",
      "org.jhotdraw.beans.AbstractBean",
      "org.jhotdraw.draw.DefaultDrawingViewTransferHandler",
      "org.jhotdraw.draw.AttributeKeys$StrokeType",
      "org.jhotdraw.draw.action.MoveConstrainedAction$East",
      "org.jhotdraw.draw.tool.SelectionTool",
      "org.jhotdraw.draw.event.ToolEvent",
      "org.jhotdraw.draw.handle.TransformHandleKit$WestHandle",
      "org.jhotdraw.draw.handle.BezierControlPointHandle",
      "org.jhotdraw.geom.QuadTree$QuadNode",
      "org.jhotdraw.draw.handle.TransformHandleKit$SouthWestHandle",
      "org.jhotdraw.draw.handle.BoundsOutlineHandle",
      "org.jhotdraw.draw.figure.GroupFigure",
      "org.jhotdraw.draw.figure.LineConnectionFigure",
      "org.jhotdraw.draw.decoration.LineDecoration",
      "org.jhotdraw.draw.action.MoveAction$West",
      "org.jhotdraw.draw.handle.Handle",
      "org.jhotdraw.draw.layouter.VerticalLayouter$1",
      "org.jhotdraw.draw.AttributeKeys",
      "org.jhotdraw.draw.event.DrawingComponentRepainter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AttributeKeys_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jhotdraw.util.ResourceBundleUtil",
      "org.jhotdraw.util.LocaleUtil",
      "org.jhotdraw.draw.AttributeKey",
      "org.jhotdraw.draw.AttributeKeys$WindingRule",
      "org.jhotdraw.draw.AttributeKeys$Underfill",
      "org.jhotdraw.draw.AttributeKeys$StrokeType",
      "org.jhotdraw.draw.AttributeKeys$StrokePlacement",
      "org.jhotdraw.geom.Dimension2DDouble",
      "org.jhotdraw.draw.AttributeKeys$Alignment",
      "org.jhotdraw.geom.Insets2D",
      "org.jhotdraw.geom.Insets2D$Double",
      "org.jhotdraw.draw.AttributeKeys$Orientation",
      "org.jhotdraw.draw.AttributeKeys",
      "org.jhotdraw.draw.AttributeKeys$1",
      "org.jhotdraw.beans.AbstractBean",
      "org.jhotdraw.draw.figure.AbstractFigure",
      "org.jhotdraw.draw.figure.AbstractCompositeFigure",
      "org.jhotdraw.draw.figure.AbstractAttributedCompositeFigure",
      "org.jhotdraw.draw.AbstractDrawing",
      "org.jhotdraw.draw.DefaultDrawing",
      "org.jhotdraw.draw.event.FigureAdapter",
      "org.jhotdraw.draw.figure.AbstractCompositeFigure$EventHandler",
      "org.jhotdraw.draw.locator.BezierLabelLocator",
      "org.jhotdraw.xml.JavaxDOMOutput",
      "org.jhotdraw.draw.figure.AbstractAttributedFigure",
      "org.jhotdraw.draw.figure.AbstractAttributedDecoratedFigure",
      "org.jhotdraw.draw.figure.TextAreaFigure",
      "org.jhotdraw.draw.figure.BezierFigure",
      "org.jhotdraw.draw.figure.LineFigure",
      "org.jhotdraw.draw.figure.LineConnectionFigure",
      "org.jhotdraw.draw.figure.LabeledLineConnectionFigure",
      "org.jhotdraw.geom.BezierPath",
      "org.jhotdraw.geom.BezierPath$Node",
      "org.jhotdraw.draw.figure.LineConnectionFigure$ConnectionHandler",
      "org.jhotdraw.draw.figure.LabeledLineConnectionFigure$ChildHandler",
      "org.jhotdraw.geom.Geom",
      "org.jhotdraw.geom.BezierPathIterator",
      "org.jhotdraw.draw.DefaultDrawingView",
      "org.jhotdraw.draw.AbstractConstrainer",
      "org.jhotdraw.draw.GridConstrainer",
      "org.jhotdraw.draw.DefaultDrawingView$1",
      "org.jhotdraw.draw.DefaultDrawingView$EventHandler",
      "org.jhotdraw.draw.DefaultDrawingViewTransferHandler",
      "org.jhotdraw.draw.figure.GroupFigure",
      "org.jhotdraw.draw.figure.TriangleFigure",
      "org.jhotdraw.draw.figure.TextFigure",
      "org.jhotdraw.draw.figure.LabelFigure",
      "org.jhotdraw.draw.QuadTreeDrawing",
      "org.jhotdraw.draw.QuadTreeDrawing$QuadTreeEventHandler",
      "org.jhotdraw.geom.QuadTree",
      "org.jhotdraw.geom.QuadTree$QuadNode",
      "org.jhotdraw.draw.locator.FontSizeLocator",
      "org.jhotdraw.util.ReversedList",
      "org.jhotdraw.draw.connector.AbstractConnector",
      "org.jhotdraw.draw.connector.ChopRectangleConnector",
      "org.jhotdraw.draw.connector.ChopBezierConnector",
      "org.jhotdraw.draw.figure.TriangleFigure$1",
      "org.jhotdraw.geom.DoubleStroke",
      "org.jhotdraw.geom.GrowStroke",
      "org.jhotdraw.xml.JavaxDOMInput",
      "org.jhotdraw.draw.figure.ImageFigure",
      "org.jhotdraw.draw.figure.DiamondFigure",
      "org.jhotdraw.draw.handle.AbstractHandle",
      "org.jhotdraw.draw.handle.LocatorHandle",
      "org.jhotdraw.draw.handle.CloseHandle",
      "org.jhotdraw.draw.locator.AbstractLocator",
      "org.jhotdraw.draw.locator.RelativeLocator",
      "org.jhotdraw.draw.locator.RelativeDecoratorLocator",
      "org.jhotdraw.draw.locator.BezierPointLocator",
      "org.jhotdraw.draw.figure.EllipseFigure",
      "org.jhotdraw.draw.figure.CompositeFigure",
      "org.jhotdraw.xml.JavaPrimitivesDOMFactory",
      "org.jhotdraw.xml.DefaultDOMFactory",
      "org.jhotdraw.draw.figure.RectangleFigure",
      "org.jhotdraw.util.Methods",
      "org.jhotdraw.draw.GraphicalCompositeFigure",
      "org.jhotdraw.draw.figure.ListFigure",
      "org.jhotdraw.draw.GraphicalCompositeFigure$PresentationFigureHandler",
      "org.jhotdraw.draw.layouter.AbstractLayouter",
      "org.jhotdraw.draw.layouter.VerticalLayouter",
      "org.jhotdraw.draw.figure.RoundRectangleFigure",
      "org.jhotdraw.draw.io.ImageOutputFormat",
      "org.jhotdraw.draw.tool.AbstractTool",
      "org.jhotdraw.draw.tool.SelectionTool",
      "org.jhotdraw.draw.tool.DelegationSelectionTool",
      "org.jhotdraw.draw.DrawingEditorProxy",
      "org.jhotdraw.draw.DrawingEditorProxy$Forwarder",
      "org.jhotdraw.draw.tool.DefaultSelectAreaTracker",
      "org.jhotdraw.draw.event.ToolAdapter",
      "org.jhotdraw.draw.tool.SelectionTool$TrackerHandler",
      "org.jhotdraw.draw.DefaultDrawingEditor",
      "org.jhotdraw.draw.DefaultDrawingEditor$1",
      "org.jhotdraw.draw.DefaultDrawingEditor$ToolHandler",
      "org.jhotdraw.action.edit.DeleteAction",
      "org.jhotdraw.action.edit.AbstractSelectionAction",
      "org.jhotdraw.action.edit.SelectAllAction",
      "org.jhotdraw.draw.action.AbstractSelectedAction",
      "org.jhotdraw.draw.action.IncreaseHandleDetailLevelAction",
      "org.jhotdraw.draw.action.AbstractSelectedAction$EventHandler",
      "org.jhotdraw.beans.WeakPropertyChangeListener",
      "org.jhotdraw.draw.action.MoveAction",
      "org.jhotdraw.draw.action.MoveAction$East",
      "org.jhotdraw.draw.action.MoveAction$West",
      "org.jhotdraw.draw.action.MoveAction$North",
      "org.jhotdraw.draw.action.MoveAction$South",
      "org.jhotdraw.draw.action.MoveConstrainedAction",
      "org.jhotdraw.draw.action.MoveConstrainedAction$East",
      "org.jhotdraw.draw.action.MoveConstrainedAction$West",
      "org.jhotdraw.draw.action.MoveConstrainedAction$North",
      "org.jhotdraw.draw.action.MoveConstrainedAction$South",
      "org.jhotdraw.action.edit.CutAction",
      "org.jhotdraw.action.edit.CopyAction",
      "org.jhotdraw.action.edit.PasteAction",
      "org.jhotdraw.draw.handle.BoundsOutlineHandle",
      "org.jhotdraw.draw.handle.HandleAttributeKeys",
      "org.jhotdraw.draw.handle.TransformHandleKit",
      "org.jhotdraw.draw.handle.TransformHandleKit$TransformHandle",
      "org.jhotdraw.draw.handle.TransformHandleKit$SouthEastHandle",
      "org.jhotdraw.draw.handle.TransformHandleKit$SouthWestHandle",
      "org.jhotdraw.draw.handle.TransformHandleKit$NorthEastHandle",
      "org.jhotdraw.draw.handle.TransformHandleKit$NorthWestHandle",
      "org.jhotdraw.draw.handle.TransformHandleKit$SouthHandle",
      "org.jhotdraw.draw.handle.TransformHandleKit$NorthHandle",
      "org.jhotdraw.draw.handle.TransformHandleKit$EastHandle",
      "org.jhotdraw.draw.handle.TransformHandleKit$WestHandle",
      "org.jhotdraw.draw.event.FigureEvent",
      "org.jhotdraw.draw.GraphicalCompositeFigure$1",
      "org.jhotdraw.draw.handle.FontSizeHandle",
      "org.jhotdraw.draw.io.ImageInputFormat",
      "org.jhotdraw.draw.handle.MoveHandle",
      "org.jhotdraw.draw.handle.NullHandle",
      "org.jhotdraw.draw.RotationDirection",
      "org.jhotdraw.draw.GridConstrainer$1",
      "org.jhotdraw.draw.handle.AbstractRotateHandle",
      "org.jhotdraw.draw.handle.RotateHandle",
      "org.jhotdraw.draw.handle.BezierScaleHandle",
      "org.jhotdraw.draw.decoration.AbstractLineDecoration",
      "org.jhotdraw.draw.decoration.ArrowTip",
      "org.jhotdraw.draw.layouter.VerticalLayouter$1",
      "org.jhotdraw.draw.connector.ChopRoundRectangleConnector",
      "org.jhotdraw.draw.handle.ConnectorHandle",
      "org.jhotdraw.draw.decoration.PerpendicularBar",
      "org.jhotdraw.draw.decoration.CompositeLineDecoration",
      "org.jhotdraw.draw.connector.ChopEllipseConnector",
      "org.jhotdraw.geom.Shapes",
      "org.jhotdraw.draw.event.FigureSelectionEvent",
      "org.jhotdraw.draw.liner.CurvedLiner",
      "org.jhotdraw.draw.decoration.GeneralPathTip",
      "org.jhotdraw.draw.io.TextInputFormat",
      "org.jhotdraw.draw.io.DOMStorableInputOutputFormat",
      "org.jhotdraw.draw.connector.ChopDiamondConnector",
      "org.jhotdraw.draw.handle.BezierControlPointHandle",
      "org.jhotdraw.draw.liner.ElbowLiner",
      "org.jhotdraw.draw.event.DrawingComponentRepainter",
      "org.jhotdraw.draw.connector.ChopTriangleConnector",
      "org.jhotdraw.draw.io.SerializationInputOutputFormat",
      "org.jhotdraw.draw.liner.SlantedLiner",
      "org.jhotdraw.draw.tool.CreationTool",
      "org.jhotdraw.draw.tool.TextAreaCreationTool",
      "org.jhotdraw.draw.layouter.HorizontalLayouter",
      "org.jhotdraw.draw.handle.RoundRectangleRadiusHandle"
    );
  }
}
