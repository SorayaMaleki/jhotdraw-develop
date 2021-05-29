/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat May 29 15:35:42 GMT 2021
 */

package org.jhotdraw.draw.tool;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractTool_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jhotdraw.draw.tool.AbstractTool"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractTool_ESTest_scaffolding.class.getClassLoader() ,
      "org.jhotdraw.draw.figure.AbstractAttributedFigure",
      "org.jhotdraw.draw.handle.AbstractRotateHandle",
      "org.jhotdraw.draw.tool.DragTracker",
      "org.jhotdraw.draw.tool.Tool",
      "org.jhotdraw.draw.DefaultDrawing",
      "org.jhotdraw.draw.AttributeKey",
      "org.jhotdraw.draw.io.ImageInputFormat",
      "org.jhotdraw.draw.figure.LineFigure",
      "org.jhotdraw.draw.figure.DiamondFigure",
      "org.jhotdraw.draw.io.OutputFormat",
      "org.jhotdraw.draw.event.FigureAdapter",
      "org.jhotdraw.xml.DefaultDOMFactory",
      "org.jhotdraw.draw.locator.BezierPointLocator",
      "org.jhotdraw.draw.figure.DecoratedFigure",
      "org.jhotdraw.draw.action.MoveAction",
      "org.jhotdraw.draw.event.FigureListener",
      "org.jhotdraw.draw.layouter.Layouter",
      "org.jhotdraw.draw.QuadTreeDrawing",
      "org.jhotdraw.draw.DrawingEditorProxy",
      "org.jhotdraw.xml.JavaxDOMOutput",
      "org.jhotdraw.draw.connector.ChopRectangleConnector",
      "org.jhotdraw.draw.event.ToolListener",
      "org.jhotdraw.draw.AbstractDrawing",
      "org.jhotdraw.draw.figure.ImageFigure",
      "org.jhotdraw.draw.QuadTreeDrawing$QuadTreeEventHandler",
      "org.jhotdraw.draw.handle.ResizeHandleKit$ResizeHandle",
      "org.jhotdraw.draw.connector.ChopEllipseConnector",
      "org.jhotdraw.draw.handle.CloseHandle",
      "org.jhotdraw.draw.figure.AbstractCompositeFigure$EventHandler",
      "org.jhotdraw.draw.action.MoveAction$East",
      "org.jhotdraw.draw.handle.OrientationHandle",
      "org.jhotdraw.draw.figure.Figure",
      "org.jhotdraw.draw.text.FloatingTextField",
      "org.jhotdraw.draw.action.MoveConstrainedAction$South",
      "org.jhotdraw.draw.tool.SelectAreaTracker",
      "org.jhotdraw.draw.action.MoveConstrainedAction$North",
      "org.jhotdraw.draw.handle.ResizeHandleKit$SouthWestHandle",
      "org.jhotdraw.geom.Dimension2DDouble",
      "org.jhotdraw.draw.locator.RelativeDecoratorLocator",
      "org.jhotdraw.draw.handle.BezierNodeHandle",
      "org.jhotdraw.action.edit.AbstractSelectionAction",
      "org.jhotdraw.geom.DoubleStroke",
      "org.jhotdraw.draw.DrawingView",
      "org.jhotdraw.draw.event.SelectionComponentDisplayer",
      "org.jhotdraw.draw.tool.TextEditingTool",
      "org.jhotdraw.draw.figure.AbstractAttributedCompositeFigure",
      "org.jhotdraw.draw.handle.HandleAttributeKeys",
      "org.jhotdraw.xml.DOMInput",
      "org.jhotdraw.draw.locator.Locator",
      "org.jhotdraw.draw.AbstractConstrainer",
      "org.jhotdraw.draw.layouter.AbstractLayouter",
      "org.jhotdraw.draw.handle.ResizeHandleKit$NorthEastHandle",
      "org.jhotdraw.draw.event.FigureSelectionEvent",
      "org.jhotdraw.draw.tool.ImageTool",
      "org.jhotdraw.draw.handle.AbstractConnectionHandle",
      "org.jhotdraw.draw.handle.ResizeHandleKit$NorthHandle",
      "org.jhotdraw.action.edit.CopyAction",
      "org.jhotdraw.draw.GraphicalCompositeFigure",
      "org.jhotdraw.draw.handle.RoundRectangleRadiusHandle",
      "org.jhotdraw.draw.connector.Connector",
      "org.jhotdraw.draw.tool.TextAreaEditingTool",
      "org.jhotdraw.draw.event.HandleListener",
      "org.jhotdraw.draw.figure.TriangleFigure$1",
      "org.jhotdraw.xml.DOMFactory",
      "org.jhotdraw.action.edit.DeleteAction",
      "org.jhotdraw.draw.action.IncreaseHandleDetailLevelAction",
      "org.jhotdraw.draw.handle.ResizeHandleKit$WestHandle",
      "org.jhotdraw.draw.DefaultDrawingView$1",
      "org.jhotdraw.draw.connector.StickyRectangleConnector",
      "org.jhotdraw.draw.DrawingEditor",
      "org.jhotdraw.draw.handle.DragHandle",
      "org.jhotdraw.xml.DOMOutput",
      "org.jhotdraw.draw.RotationDirection",
      "org.jhotdraw.draw.layouter.VerticalLayouter",
      "org.jhotdraw.draw.text.FloatingTextArea",
      "org.jhotdraw.draw.figure.AbstractCompositeFigure",
      "org.jhotdraw.draw.handle.ConnectionStartHandle",
      "org.jhotdraw.draw.liner.SlantedLiner",
      "org.jhotdraw.api.app.Disposable",
      "org.jhotdraw.draw.action.AbstractSelectedAction",
      "org.jhotdraw.draw.figure.LabeledLineConnectionFigure",
      "org.jhotdraw.geom.BezierPath",
      "org.jhotdraw.draw.handle.ResizeHandleKit$EastHandle",
      "org.jhotdraw.draw.locator.FontSizeLocator",
      "org.jhotdraw.draw.tool.CreationTool",
      "org.jhotdraw.draw.handle.ResizeHandleKit$SouthEastHandle",
      "org.jhotdraw.geom.Geom",
      "org.jhotdraw.draw.liner.Liner",
      "org.jhotdraw.geom.Insets2D",
      "org.jhotdraw.draw.figure.EllipseFigure",
      "org.jhotdraw.geom.Insets2D$Double",
      "org.jhotdraw.draw.AttributeKeys$WindingRule",
      "org.jhotdraw.draw.handle.LocatorHandle",
      "org.jhotdraw.draw.tool.AbstractTool",
      "org.jhotdraw.draw.figure.ListFigure",
      "org.jhotdraw.draw.tool.TextCreationTool",
      "org.jhotdraw.draw.figure.ImageHolderFigure",
      "org.jhotdraw.draw.handle.TextOverflowHandle",
      "org.jhotdraw.draw.figure.LabelFigure",
      "org.jhotdraw.draw.io.ImageOutputFormat",
      "org.jhotdraw.util.ResourceBundleUtil",
      "org.jhotdraw.draw.action.AbstractSelectedAction$EventHandler",
      "org.jhotdraw.draw.tool.DefaultDragTracker",
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
      "org.jhotdraw.draw.handle.ResizeHandleKit$SouthHandle",
      "org.jhotdraw.geom.GrowStroke",
      "org.jhotdraw.draw.figure.TextFigure",
      "org.jhotdraw.draw.figure.RectangleFigure",
      "org.jhotdraw.draw.io.DOMStorableInputOutputFormat",
      "org.jhotdraw.draw.figure.LabeledLineConnectionFigure$ChildHandler",
      "org.jhotdraw.draw.DefaultDrawingEditor$ToolHandler",
      "org.jhotdraw.draw.tool.DelegationSelectionTool",
      "org.jhotdraw.draw.figure.TriangleFigure",
      "org.jhotdraw.util.prefs.ToolBarPrefsHandler",
      "org.jhotdraw.draw.action.MoveAction$South",
      "org.jhotdraw.draw.tool.DefaultHandleTracker",
      "org.jhotdraw.action.edit.CutAction",
      "org.jhotdraw.draw.event.HandleMulticaster",
      "org.jhotdraw.draw.figure.RoundRectangleFigure",
      "org.jhotdraw.draw.handle.RotateHandle",
      "org.jhotdraw.draw.io.InputFormat",
      "org.jhotdraw.draw.tool.TextAreaCreationTool",
      "org.jhotdraw.draw.locator.RelativeLocator",
      "org.jhotdraw.draw.figure.TextHolderFigure",
      "org.jhotdraw.draw.connector.AbstractConnector",
      "org.jhotdraw.action.edit.SelectAllAction",
      "org.jhotdraw.draw.text.FloatingTextArea$1",
      "org.jhotdraw.draw.DefaultDrawingEditor$1",
      "org.jhotdraw.xml.JavaxDOMInput",
      "org.jhotdraw.draw.tool.SelectionTool$TrackerHandler",
      "org.jhotdraw.draw.io.TextInputFormat",
      "org.jhotdraw.geom.Shapes",
      "org.jhotdraw.draw.handle.ConnectionEndHandle",
      "org.jhotdraw.draw.event.HandleEvent",
      "org.jhotdraw.draw.handle.MoveHandle",
      "org.jhotdraw.draw.figure.AbstractFigure",
      "org.jhotdraw.draw.DefaultDrawingEditor",
      "org.jhotdraw.draw.GridConstrainer",
      "org.jhotdraw.draw.AttributeKey$1",
      "org.jhotdraw.draw.handle.BezierScaleHandle",
      "org.jhotdraw.draw.tool.DefaultHandleTracker$EventHandler",
      "org.jhotdraw.draw.AttributeKeys$Orientation",
      "org.jhotdraw.draw.AttributeKeys$Underfill",
      "org.jhotdraw.draw.event.SelectionComponentRepainter",
      "org.jhotdraw.draw.connector.ChopDiamondConnector",
      "org.jhotdraw.draw.event.FigureSelectionListener",
      "org.jhotdraw.draw.locator.BezierLabelLocator",
      "org.jhotdraw.draw.AttributeKeys$StrokePlacement",
      "org.jhotdraw.draw.AttributeKeys$1",
      "org.jhotdraw.draw.GridConstrainer$1",
      "org.jhotdraw.draw.handle.ResizeHandleKit",
      "org.jhotdraw.draw.tool.ConnectionTool",
      "org.jhotdraw.draw.handle.BezierOutlineHandle",
      "org.jhotdraw.draw.DrawingEditorProxy$Forwarder",
      "org.jhotdraw.draw.tool.BezierTool",
      "org.jhotdraw.geom.BezierPath$Node",
      "org.jhotdraw.xml.JavaPrimitivesDOMFactory",
      "org.jhotdraw.geom.BezierPathIterator",
      "org.jhotdraw.draw.figure.LineConnectionFigure$ConnectionHandler",
      "org.jhotdraw.beans.WeakPropertyChangeListener",
      "org.jhotdraw.draw.event.CompositeFigureEvent",
      "org.jhotdraw.draw.event.FigureEvent",
      "org.jhotdraw.draw.figure.BezierFigure",
      "org.jhotdraw.action.edit.PasteAction",
      "org.jhotdraw.draw.figure.AbstractAttributedDecoratedFigure",
      "org.jhotdraw.draw.GraphicalCompositeFigure$PresentationFigureHandler",
      "org.jhotdraw.draw.action.MoveConstrainedAction$West",
      "org.jhotdraw.util.LocaleUtil",
      "org.jhotdraw.draw.action.MoveAction$North",
      "org.jhotdraw.draw.handle.FontSizeHandle",
      "org.jhotdraw.draw.handle.NullHandle",
      "org.jhotdraw.draw.tool.DnDTracker",
      "org.jhotdraw.draw.TranslationDirection",
      "org.jhotdraw.draw.tool.HandleTracker",
      "org.jhotdraw.draw.Drawing",
      "org.jhotdraw.draw.connector.LocatorConnector",
      "org.jhotdraw.xml.DOMStorable",
      "org.jhotdraw.draw.figure.CompositeFigure",
      "org.jhotdraw.draw.handle.ConnectorHandle",
      "org.jhotdraw.draw.AttributeKeys$Alignment",
      "org.jhotdraw.draw.event.CompositeFigureListener",
      "org.jhotdraw.draw.locator.AbstractLocator",
      "org.jhotdraw.draw.Constrainer",
      "org.jhotdraw.draw.handle.ResizeHandleKit$NorthWestHandle",
      "org.jhotdraw.draw.event.ToolAdapter",
      "org.jhotdraw.draw.figure.TextAreaFigure",
      "org.jhotdraw.draw.tool.DefaultSelectAreaTracker",
      "org.jhotdraw.beans.AbstractBean",
      "org.jhotdraw.draw.DefaultDrawingViewTransferHandler",
      "org.jhotdraw.draw.AttributeKeys$StrokeType",
      "org.jhotdraw.draw.action.MoveConstrainedAction$East",
      "org.jhotdraw.draw.tool.SelectionTool",
      "org.jhotdraw.draw.event.ToolEvent",
      "org.jhotdraw.draw.handle.BezierControlPointHandle",
      "org.jhotdraw.geom.QuadTree$QuadNode",
      "org.jhotdraw.draw.handle.BoundsOutlineHandle",
      "org.jhotdraw.draw.figure.GroupFigure",
      "org.jhotdraw.draw.figure.LineConnectionFigure",
      "org.jhotdraw.draw.decoration.LineDecoration",
      "org.jhotdraw.draw.text.FloatingTextField$1",
      "org.jhotdraw.draw.action.MoveAction$West",
      "org.jhotdraw.draw.handle.Handle",
      "org.jhotdraw.draw.AttributeKeys"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractTool_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jhotdraw.beans.AbstractBean",
      "org.jhotdraw.draw.tool.AbstractTool",
      "org.jhotdraw.draw.tool.SelectionTool",
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
      "org.jhotdraw.draw.tool.DnDTracker",
      "org.jhotdraw.draw.DrawingEditorProxy",
      "org.jhotdraw.draw.DrawingEditorProxy$Forwarder",
      "org.jhotdraw.draw.tool.DelegationSelectionTool",
      "org.jhotdraw.draw.tool.DefaultSelectAreaTracker",
      "org.jhotdraw.draw.event.ToolAdapter",
      "org.jhotdraw.draw.tool.SelectionTool$TrackerHandler",
      "org.jhotdraw.draw.figure.AbstractFigure",
      "org.jhotdraw.draw.figure.AbstractAttributedFigure",
      "org.jhotdraw.draw.figure.AbstractAttributedDecoratedFigure",
      "org.jhotdraw.draw.figure.ImageFigure",
      "org.jhotdraw.draw.tool.CreationTool",
      "org.jhotdraw.draw.tool.ImageTool",
      "org.jhotdraw.draw.AttributeKeys$1",
      "org.jhotdraw.geom.Geom",
      "org.jhotdraw.draw.AbstractConstrainer",
      "org.jhotdraw.draw.GridConstrainer",
      "org.jhotdraw.draw.tool.BezierTool",
      "org.jhotdraw.draw.figure.DiamondFigure",
      "org.jhotdraw.draw.figure.TextAreaFigure",
      "org.jhotdraw.draw.tool.TextAreaEditingTool",
      "org.jhotdraw.draw.tool.TextCreationTool",
      "org.jhotdraw.draw.DefaultDrawingView",
      "org.jhotdraw.draw.event.FigureAdapter",
      "org.jhotdraw.draw.DefaultDrawingView$1",
      "org.jhotdraw.draw.DefaultDrawingView$EventHandler",
      "org.jhotdraw.draw.DefaultDrawingViewTransferHandler",
      "org.jhotdraw.draw.tool.DefaultHandleTracker",
      "org.jhotdraw.draw.tool.DefaultHandleTracker$EventHandler",
      "org.jhotdraw.draw.event.HandleMulticaster",
      "org.jhotdraw.draw.tool.ConnectionTool",
      "org.jhotdraw.draw.figure.BezierFigure",
      "org.jhotdraw.draw.figure.LineFigure",
      "org.jhotdraw.draw.figure.LineConnectionFigure",
      "org.jhotdraw.draw.figure.LabeledLineConnectionFigure",
      "org.jhotdraw.geom.BezierPath",
      "org.jhotdraw.geom.BezierPath$Node",
      "org.jhotdraw.draw.figure.LineConnectionFigure$ConnectionHandler",
      "org.jhotdraw.draw.figure.LabeledLineConnectionFigure$ChildHandler",
      "org.jhotdraw.draw.handle.AbstractHandle",
      "org.jhotdraw.draw.handle.BoundsOutlineHandle",
      "org.jhotdraw.draw.handle.BezierControlPointHandle",
      "org.jhotdraw.draw.figure.TextFigure",
      "org.jhotdraw.draw.figure.LabelFigure",
      "org.jhotdraw.draw.tool.TextAreaCreationTool",
      "org.jhotdraw.draw.figure.AbstractCompositeFigure",
      "org.jhotdraw.draw.figure.AbstractAttributedCompositeFigure",
      "org.jhotdraw.draw.AbstractDrawing",
      "org.jhotdraw.draw.QuadTreeDrawing",
      "org.jhotdraw.draw.figure.AbstractCompositeFigure$EventHandler",
      "org.jhotdraw.draw.QuadTreeDrawing$QuadTreeEventHandler",
      "org.jhotdraw.geom.QuadTree",
      "org.jhotdraw.geom.QuadTree$QuadNode",
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
      "org.jhotdraw.draw.DefaultDrawing",
      "org.jhotdraw.draw.tool.DefaultDragTracker",
      "org.jhotdraw.draw.figure.RoundRectangleFigure",
      "org.jhotdraw.draw.handle.AbstractRotateHandle",
      "org.jhotdraw.draw.handle.RotateHandle",
      "org.jhotdraw.draw.connector.AbstractConnector",
      "org.jhotdraw.draw.connector.ChopRectangleConnector",
      "org.jhotdraw.draw.tool.TextEditingTool",
      "org.jhotdraw.draw.figure.CompositeFigure",
      "org.jhotdraw.draw.handle.LocatorHandle",
      "org.jhotdraw.draw.handle.MoveHandle",
      "org.jhotdraw.draw.locator.AbstractLocator",
      "org.jhotdraw.draw.locator.RelativeLocator",
      "org.jhotdraw.util.ReversedList",
      "org.jhotdraw.draw.handle.BezierNodeHandle",
      "org.jhotdraw.draw.handle.FontSizeHandle",
      "org.jhotdraw.draw.locator.FontSizeLocator",
      "org.jhotdraw.draw.liner.SlantedLiner",
      "org.jhotdraw.draw.text.FloatingTextArea",
      "org.jhotdraw.draw.text.FloatingTextArea$1",
      "org.jhotdraw.draw.figure.TriangleFigure",
      "org.jhotdraw.draw.figure.TriangleFigure$1",
      "org.jhotdraw.draw.locator.BezierPointLocator",
      "org.jhotdraw.draw.handle.CloseHandle",
      "org.jhotdraw.draw.handle.HandleAttributeKeys",
      "org.jhotdraw.draw.GraphicalCompositeFigure",
      "org.jhotdraw.draw.GraphicalCompositeFigure$PresentationFigureHandler",
      "org.jhotdraw.draw.locator.RelativeDecoratorLocator",
      "org.jhotdraw.draw.connector.LocatorConnector",
      "org.jhotdraw.draw.connector.ChopBezierConnector",
      "org.jhotdraw.draw.handle.ConnectorHandle",
      "org.jhotdraw.draw.handle.ResizeHandleKit",
      "org.jhotdraw.draw.handle.ResizeHandleKit$ResizeHandle",
      "org.jhotdraw.draw.handle.ResizeHandleKit$SouthEastHandle",
      "org.jhotdraw.draw.handle.ResizeHandleKit$SouthWestHandle",
      "org.jhotdraw.draw.handle.ResizeHandleKit$NorthEastHandle",
      "org.jhotdraw.draw.handle.ResizeHandleKit$NorthWestHandle",
      "org.jhotdraw.draw.handle.ResizeHandleKit$SouthHandle",
      "org.jhotdraw.draw.handle.ResizeHandleKit$NorthHandle",
      "org.jhotdraw.draw.handle.ResizeHandleKit$EastHandle",
      "org.jhotdraw.draw.handle.ResizeHandleKit$WestHandle",
      "org.jhotdraw.draw.handle.OrientationHandle",
      "org.jhotdraw.draw.figure.GroupFigure",
      "org.jhotdraw.draw.connector.ChopEllipseConnector",
      "org.jhotdraw.xml.JavaPrimitivesDOMFactory",
      "org.jhotdraw.xml.DefaultDOMFactory",
      "org.jhotdraw.xml.JavaxDOMOutput",
      "org.jhotdraw.draw.locator.BezierLabelLocator",
      "org.jhotdraw.draw.connector.ChopDiamondConnector",
      "org.jhotdraw.geom.BezierPathIterator",
      "org.jhotdraw.draw.AttributeKey$1",
      "org.jhotdraw.draw.connector.StickyRectangleConnector",
      "org.jhotdraw.draw.handle.AbstractConnectionHandle",
      "org.jhotdraw.draw.handle.ConnectionStartHandle",
      "org.jhotdraw.draw.handle.BezierOutlineHandle",
      "org.jhotdraw.draw.handle.ConnectionEndHandle",
      "org.jhotdraw.draw.event.FigureEvent",
      "org.jhotdraw.geom.DoubleStroke",
      "org.jhotdraw.geom.GrowStroke",
      "org.jhotdraw.draw.handle.RoundRectangleRadiusHandle",
      "org.jhotdraw.draw.layouter.AbstractLayouter",
      "org.jhotdraw.draw.layouter.HorizontalLayouter",
      "org.jhotdraw.draw.io.TextInputFormat",
      "org.jhotdraw.draw.io.DOMStorableInputOutputFormat",
      "org.jhotdraw.draw.io.ImageOutputFormat",
      "org.jhotdraw.draw.event.ToolEvent",
      "org.jhotdraw.draw.figure.EllipseFigure",
      "org.jhotdraw.draw.handle.BezierScaleHandle",
      "org.jhotdraw.draw.handle.NullHandle",
      "org.jhotdraw.xml.JavaxDOMInput",
      "org.jhotdraw.draw.text.FloatingTextField",
      "org.jhotdraw.draw.text.FloatingTextField$1",
      "org.jhotdraw.draw.handle.DragHandle",
      "org.jhotdraw.draw.handle.TextOverflowHandle",
      "org.jhotdraw.draw.RotationDirection",
      "org.jhotdraw.draw.GridConstrainer$1",
      "org.jhotdraw.draw.event.SelectionComponentRepainter",
      "org.jhotdraw.draw.figure.ListFigure",
      "org.jhotdraw.draw.layouter.VerticalLayouter",
      "org.jhotdraw.geom.Shapes",
      "org.jhotdraw.draw.figure.RectangleFigure",
      "org.jhotdraw.draw.event.SelectionComponentDisplayer",
      "org.jhotdraw.draw.io.ImageInputFormat",
      "org.jhotdraw.util.prefs.ToolBarPrefsHandler",
      "org.jhotdraw.draw.TranslationDirection"
    );
  }
}
