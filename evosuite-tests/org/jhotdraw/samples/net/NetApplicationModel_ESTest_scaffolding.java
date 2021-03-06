/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jun 02 11:16:43 GMT 2021
 */

package org.jhotdraw.samples.net;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class NetApplicationModel_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jhotdraw.samples.net.NetApplicationModel"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NetApplicationModel_ESTest_scaffolding.class.getClassLoader() ,
      "org.jhotdraw.draw.DefaultDrawingView$EventHandler",
      "org.jhotdraw.draw.action.MoveConstrainedAction",
      "org.jhotdraw.draw.tool.Tool",
      "org.jhotdraw.samples.draw.DrawView",
      "org.jhotdraw.api.app.View",
      "org.jhotdraw.draw.AttributeKey",
      "org.jhotdraw.app.AbstractApplication",
      "org.jhotdraw.draw.io.OutputFormat",
      "org.jhotdraw.draw.event.FigureAdapter",
      "org.jhotdraw.draw.DefaultDrawingEditor$ToolHandler",
      "org.jhotdraw.draw.action.MoveAction",
      "org.jhotdraw.app.EmptyMenuBuilder",
      "org.jhotdraw.draw.action.MoveAction$South",
      "org.jhotdraw.draw.event.FigureListener",
      "org.jhotdraw.draw.layouter.Layouter",
      "org.jhotdraw.action.edit.CutAction",
      "org.jhotdraw.samples.odg.ODGView",
      "org.jhotdraw.draw.event.ToolListener",
      "org.jhotdraw.api.gui.URIChooser",
      "org.jhotdraw.app.CrossPlatformApplication",
      "org.jhotdraw.draw.io.InputFormat",
      "org.jhotdraw.draw.figure.TextHolderFigure",
      "org.jhotdraw.action.edit.SelectAllAction",
      "org.jhotdraw.api.app.ApplicationModel",
      "org.jhotdraw.app.DefaultApplicationModel",
      "org.jhotdraw.draw.DefaultDrawingEditor$1",
      "org.jhotdraw.draw.action.MoveAction$East",
      "org.jhotdraw.draw.figure.Figure",
      "org.jhotdraw.draw.action.MoveConstrainedAction$South",
      "org.jhotdraw.draw.action.MoveConstrainedAction$North",
      "org.jhotdraw.samples.teddy.text.NumberedEditorKit",
      "org.jhotdraw.geom.Dimension2DDouble",
      "org.jhotdraw.draw.event.HandleEvent",
      "org.jhotdraw.util.prefs.PreferencesUtil",
      "org.jhotdraw.app.AppletApplication",
      "org.jhotdraw.draw.DefaultDrawingEditor",
      "org.jhotdraw.draw.GridConstrainer",
      "org.jhotdraw.samples.teddy.TeddyView",
      "org.jhotdraw.action.edit.AbstractSelectionAction",
      "org.jhotdraw.draw.DrawingView",
      "org.jhotdraw.draw.AttributeKeys$Orientation",
      "org.jhotdraw.draw.event.SelectionComponentDisplayer",
      "org.jhotdraw.app.SDIApplication",
      "org.jhotdraw.draw.AttributeKeys$Underfill",
      "org.jhotdraw.xml.DOMInput",
      "org.jhotdraw.draw.event.FigureSelectionListener",
      "org.jhotdraw.draw.AttributeKeys$StrokePlacement",
      "org.jhotdraw.draw.AbstractConstrainer",
      "org.jhotdraw.draw.event.FigureSelectionEvent",
      "org.jhotdraw.app.AbstractView",
      "org.jhotdraw.action.AbstractApplicationAction$1",
      "org.jhotdraw.action.edit.CopyAction",
      "org.jhotdraw.geom.BezierPath$Node",
      "org.jhotdraw.beans.WeakPropertyChangeListener",
      "org.jhotdraw.samples.net.NetApplicationModelProduct",
      "org.jhotdraw.draw.connector.Connector",
      "org.jhotdraw.draw.event.HandleListener",
      "org.jhotdraw.draw.event.CompositeFigureEvent",
      "org.jhotdraw.draw.event.FigureEvent",
      "org.jhotdraw.xml.DOMFactory",
      "org.jhotdraw.action.edit.DeleteAction",
      "org.jhotdraw.draw.action.IncreaseHandleDetailLevelAction",
      "org.jhotdraw.samples.teddy.TeddyView$EditorPanel",
      "org.jhotdraw.action.edit.PasteAction",
      "org.jhotdraw.draw.action.MoveConstrainedAction$West",
      "org.jhotdraw.api.app.Application",
      "org.jhotdraw.app.action.file.ClearRecentFilesMenuAction",
      "org.jhotdraw.samples.teddy.text.NumberedViewFactory",
      "org.jhotdraw.draw.DefaultDrawingView$1",
      "org.jhotdraw.util.LocaleUtil",
      "org.jhotdraw.app.action.file.OpenFileAction",
      "org.jhotdraw.undo.UndoRedoManager$1",
      "org.jhotdraw.action.view.ViewPropertyAction",
      "org.jhotdraw.draw.action.MoveAction$North",
      "org.jhotdraw.action.AbstractApplicationAction",
      "org.jhotdraw.draw.DrawingEditor",
      "org.jhotdraw.app.OSXApplication",
      "org.jhotdraw.draw.TranslationDirection",
      "org.jhotdraw.draw.Drawing",
      "org.jhotdraw.samples.teddy.TeddyView$1",
      "org.jhotdraw.samples.teddy.TeddyView$2",
      "org.jhotdraw.xml.DOMStorable",
      "org.jhotdraw.xml.DOMOutput",
      "org.jhotdraw.app.action.file.NewFileAction",
      "org.jhotdraw.draw.RotationDirection",
      "org.jhotdraw.samples.teddy.TeddyView$3",
      "org.jhotdraw.draw.figure.CompositeFigure",
      "org.jhotdraw.samples.svg.SVGView",
      "org.jhotdraw.api.app.Disposable",
      "org.jhotdraw.draw.action.AbstractSelectedAction",
      "org.jhotdraw.undo.UndoRedoManager$UndoAction",
      "org.jhotdraw.draw.AttributeKeys$Alignment",
      "org.jhotdraw.geom.BezierPath",
      "org.jhotdraw.draw.event.CompositeFigureListener",
      "org.jhotdraw.app.DefaultMenuBuilder",
      "org.jhotdraw.draw.Constrainer",
      "org.jhotdraw.samples.odg.ODGPropertiesPanel",
      "org.jhotdraw.draw.liner.Liner",
      "org.jhotdraw.geom.Insets2D",
      "org.jhotdraw.draw.event.ToolAdapter",
      "org.jhotdraw.geom.Insets2D$Double",
      "org.jhotdraw.samples.teddy.text.NumberedParagraphView",
      "org.jhotdraw.app.AbstractApplicationModel",
      "org.jhotdraw.app.EmptyApplicationModel",
      "org.jhotdraw.app.action.file.ClearRecentFilesMenuAction$1",
      "org.jhotdraw.beans.AbstractBean",
      "org.jhotdraw.samples.pert.PertView",
      "org.jhotdraw.draw.AttributeKeys$WindingRule",
      "org.jhotdraw.samples.net.NetView",
      "org.jhotdraw.draw.DefaultDrawingViewTransferHandler",
      "org.jhotdraw.action.view.ToggleViewPropertyAction",
      "org.jhotdraw.app.action.app.AboutAction",
      "org.jhotdraw.draw.AttributeKeys$StrokeType",
      "org.jhotdraw.app.action.file.SaveFileAction",
      "org.jhotdraw.draw.action.MoveConstrainedAction$East",
      "org.jhotdraw.draw.event.ToolEvent",
      "org.jhotdraw.draw.figure.ImageHolderFigure",
      "org.jhotdraw.action.AbstractViewAction",
      "org.jhotdraw.util.ResourceBundleUtil",
      "org.jhotdraw.undo.UndoRedoManager$RedoAction",
      "org.jhotdraw.app.AbstractApplication$3",
      "org.jhotdraw.samples.net.NetApplicationModel$1",
      "org.jhotdraw.draw.action.AbstractSelectedAction$EventHandler",
      "org.jhotdraw.undo.UndoRedoManager",
      "org.jhotdraw.draw.figure.ConnectionFigure",
      "org.jhotdraw.api.app.MenuBuilder",
      "org.jhotdraw.samples.svg.SVGDrawingPanel",
      "org.jhotdraw.samples.net.NetApplicationModel",
      "org.jhotdraw.api.gui.EditableComponent",
      "org.jhotdraw.draw.DefaultDrawingView",
      "org.jhotdraw.draw.decoration.LineDecoration",
      "org.jhotdraw.draw.action.MoveAction$West",
      "org.jhotdraw.draw.handle.Handle",
      "org.jhotdraw.draw.AttributeKeys"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NetApplicationModel_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jhotdraw.beans.AbstractBean",
      "org.jhotdraw.app.AbstractApplicationModel",
      "org.jhotdraw.app.DefaultApplicationModel",
      "org.jhotdraw.samples.net.NetApplicationModel",
      "org.jhotdraw.app.DefaultMenuBuilder",
      "org.jhotdraw.samples.net.NetApplicationModel$1",
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
      "org.jhotdraw.samples.net.NetApplicationModelProduct",
      "org.jhotdraw.app.AbstractView",
      "org.jhotdraw.samples.net.NetView",
      "org.jhotdraw.util.prefs.PreferencesUtil",
      "org.jhotdraw.draw.DefaultDrawingView",
      "org.jhotdraw.draw.AbstractConstrainer",
      "org.jhotdraw.draw.GridConstrainer",
      "org.jhotdraw.draw.event.FigureAdapter",
      "org.jhotdraw.draw.DefaultDrawingView$1",
      "org.jhotdraw.draw.DefaultDrawingView$EventHandler",
      "org.jhotdraw.draw.DefaultDrawingViewTransferHandler",
      "org.jhotdraw.app.AbstractApplication",
      "org.jhotdraw.app.SDIApplication",
      "org.jhotdraw.app.CrossPlatformApplication",
      "org.jhotdraw.action.AbstractApplicationAction",
      "org.jhotdraw.app.action.app.AboutAction",
      "org.jhotdraw.action.AbstractApplicationAction$1",
      "org.jhotdraw.beans.WeakPropertyChangeListener",
      "org.jhotdraw.app.action.file.ClearRecentFilesMenuAction",
      "org.jhotdraw.app.action.file.ClearRecentFilesMenuAction$1",
      "org.jhotdraw.app.OSXApplication",
      "org.jhotdraw.samples.draw.DrawView",
      "org.jhotdraw.app.action.file.NewFileAction",
      "org.jhotdraw.app.AppletApplication",
      "org.jhotdraw.samples.odg.ODGView",
      "org.jhotdraw.samples.teddy.TeddyView",
      "org.jhotdraw.samples.teddy.TeddyView$EditorPanel",
      "org.jhotdraw.samples.teddy.TeddyView$1",
      "org.jhotdraw.samples.teddy.TeddyView$2",
      "org.jhotdraw.samples.teddy.text.NumberedEditorKit",
      "org.jhotdraw.samples.teddy.text.NumberedViewFactory",
      "org.jhotdraw.samples.teddy.text.NumberedParagraphView",
      "org.jhotdraw.undo.UndoRedoManager$1",
      "org.jhotdraw.undo.UndoRedoManager",
      "org.jhotdraw.undo.UndoRedoManager$UndoAction",
      "org.jhotdraw.undo.UndoRedoManager$RedoAction",
      "org.jhotdraw.samples.teddy.TeddyView$3",
      "org.jhotdraw.draw.DefaultDrawingEditor",
      "org.jhotdraw.draw.DefaultDrawingEditor$1",
      "org.jhotdraw.draw.event.ToolAdapter",
      "org.jhotdraw.draw.DefaultDrawingEditor$ToolHandler",
      "org.jhotdraw.action.edit.DeleteAction",
      "org.jhotdraw.action.edit.AbstractSelectionAction",
      "org.jhotdraw.action.edit.SelectAllAction",
      "org.jhotdraw.draw.action.AbstractSelectedAction",
      "org.jhotdraw.draw.action.IncreaseHandleDetailLevelAction",
      "org.jhotdraw.draw.action.AbstractSelectedAction$EventHandler",
      "org.jhotdraw.draw.action.MoveAction",
      "org.jhotdraw.draw.action.MoveAction$East",
      "org.jhotdraw.draw.action.MoveAction$West",
      "org.jhotdraw.draw.action.MoveAction$North",
      "org.jhotdraw.draw.action.MoveAction$South",
      "org.jhotdraw.draw.action.MoveConstrainedAction",
      "org.jhotdraw.draw.action.MoveConstrainedAction$East",
      "org.jhotdraw.draw.TranslationDirection",
      "org.jhotdraw.draw.action.MoveConstrainedAction$West",
      "org.jhotdraw.draw.action.MoveConstrainedAction$North",
      "org.jhotdraw.draw.action.MoveConstrainedAction$South",
      "org.jhotdraw.action.edit.CutAction",
      "org.jhotdraw.action.edit.CopyAction",
      "org.jhotdraw.action.edit.PasteAction",
      "org.jhotdraw.samples.svg.SVGView",
      "org.jhotdraw.app.action.file.OpenFileAction",
      "org.jhotdraw.samples.pert.PertView",
      "org.jhotdraw.app.AbstractApplication$3",
      "org.jhotdraw.app.EmptyApplicationModel",
      "org.jhotdraw.app.EmptyMenuBuilder",
      "org.jhotdraw.draw.event.SelectionComponentDisplayer"
    );
  }
}
