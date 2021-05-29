/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat May 29 12:44:38 GMT 2021
 */

package org.jhotdraw.app;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class OSXApplication_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jhotdraw.app.OSXApplication"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OSXApplication_ESTest_scaffolding.class.getClassLoader() ,
      "org.jhotdraw.action.AbstractViewAction$1",
      "org.jhotdraw.action.AbstractViewAction$2",
      "org.jhotdraw.action.AbstractApplicationAction$1",
      "org.jhotdraw.api.app.View",
      "org.jhotdraw.beans.WeakPropertyChangeListener",
      "org.jhotdraw.app.AbstractApplicationModel",
      "org.jhotdraw.app.EmptyApplicationModel",
      "org.jhotdraw.beans.AbstractBean",
      "org.jhotdraw.action.window.FocusWindowAction$1",
      "org.jhotdraw.util.prefs.PreferencesUtil",
      "org.jhotdraw.app.AppletApplication",
      "org.jhotdraw.app.AbstractApplication",
      "org.jhotdraw.app.action.app.AboutAction",
      "org.jhotdraw.api.app.Application",
      "org.jhotdraw.app.action.file.SaveFileAction",
      "org.jhotdraw.app.OSXApplication$QuitHandler",
      "org.jhotdraw.app.action.app.ExitAction",
      "org.jhotdraw.util.LocaleUtil",
      "org.jhotdraw.app.action.file.OpenFileAction",
      "org.jhotdraw.action.AbstractApplicationAction",
      "org.jhotdraw.app.EmptyMenuBuilder",
      "org.jhotdraw.action.AbstractViewAction",
      "org.jhotdraw.app.OSXApplication",
      "org.jhotdraw.app.SDIApplication",
      "org.jhotdraw.util.ResourceBundleUtil",
      "org.jhotdraw.action.window.MinimizeWindowAction",
      "org.jhotdraw.app.AbstractApplication$3",
      "org.jhotdraw.app.action.file.NewFileAction",
      "org.jhotdraw.action.window.FocusWindowAction",
      "org.jhotdraw.app.osx.OSXPaletteHandler$1",
      "org.jhotdraw.api.gui.URIChooser",
      "org.jhotdraw.app.osx.OSXPaletteHandler",
      "org.jhotdraw.app.osx.OSXPaletteHandler$2",
      "org.jhotdraw.api.app.MenuBuilder",
      "org.jhotdraw.app.OSXApplication$FrameHandler",
      "org.jhotdraw.app.CrossPlatformApplication",
      "org.jhotdraw.app.osx.OSXAdapter$1",
      "org.jhotdraw.app.osx.OSXAdapter$2",
      "org.jhotdraw.api.app.Disposable",
      "org.jhotdraw.app.osx.OSXAdapter$3",
      "org.jhotdraw.action.window.MaximizeWindowAction",
      "org.jhotdraw.util.Methods",
      "org.jhotdraw.api.app.ApplicationModel",
      "org.jhotdraw.app.osx.OSXAdapter",
      "org.jhotdraw.app.DefaultApplicationModel",
      "org.jhotdraw.app.OSXApplication$WindowMenuHandler",
      "org.jhotdraw.app.DefaultMenuBuilder"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OSXApplication_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jhotdraw.beans.AbstractBean",
      "org.jhotdraw.app.AbstractApplication",
      "org.jhotdraw.app.OSXApplication",
      "org.jhotdraw.app.OSXApplication$WindowMenuHandler",
      "org.jhotdraw.app.OSXApplication$FrameHandler",
      "org.jhotdraw.util.ResourceBundleUtil",
      "org.jhotdraw.util.prefs.PreferencesUtil",
      "org.jhotdraw.app.osx.OSXAdapter",
      "org.jhotdraw.app.SDIApplication",
      "org.jhotdraw.app.CrossPlatformApplication",
      "org.jhotdraw.util.Methods",
      "org.jhotdraw.app.osx.OSXPaletteHandler",
      "org.jhotdraw.app.osx.OSXPaletteHandler$1",
      "org.jhotdraw.app.osx.OSXPaletteHandler$2",
      "org.jhotdraw.util.LocaleUtil",
      "org.jhotdraw.action.AbstractApplicationAction",
      "org.jhotdraw.app.action.app.AboutAction",
      "org.jhotdraw.action.AbstractApplicationAction$1",
      "org.jhotdraw.beans.WeakPropertyChangeListener",
      "org.jhotdraw.app.AbstractApplicationModel",
      "org.jhotdraw.app.DefaultApplicationModel",
      "org.jhotdraw.action.window.FocusWindowAction",
      "org.jhotdraw.action.window.FocusWindowAction$1",
      "org.jhotdraw.action.AbstractViewAction",
      "org.jhotdraw.action.window.MaximizeWindowAction",
      "org.jhotdraw.action.AbstractViewAction$1",
      "org.jhotdraw.action.AbstractViewAction$2",
      "org.jhotdraw.action.window.MinimizeWindowAction",
      "org.jhotdraw.app.AppletApplication",
      "org.jhotdraw.app.AbstractApplication$3",
      "org.jhotdraw.app.EmptyApplicationModel",
      "org.jhotdraw.app.DefaultMenuBuilder",
      "org.jhotdraw.app.EmptyMenuBuilder",
      "org.jhotdraw.app.action.file.NewFileAction",
      "org.jhotdraw.app.action.file.OpenFileAction"
    );
  }
}