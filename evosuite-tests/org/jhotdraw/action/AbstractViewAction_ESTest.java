/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 02 14:25:13 GMT 2021
 */

package org.jhotdraw.action;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jhotdraw.action.edit.RedoAction;
import org.jhotdraw.action.edit.UndoAction;
import org.jhotdraw.action.window.MaximizeWindowAction;
import org.jhotdraw.action.window.MinimizeWindowAction;
import org.jhotdraw.api.app.View;
import org.jhotdraw.app.CrossPlatformApplication;
import org.jhotdraw.app.EmptyApplicationModel;
import org.jhotdraw.app.OSXApplication;
import org.jhotdraw.samples.teddy.TeddyView;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractViewAction_ESTest extends AbstractViewAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CrossPlatformApplication crossPlatformApplication0 = new CrossPlatformApplication();
      UndoAction undoAction0 = new UndoAction(crossPlatformApplication0, (View) null);
      assertTrue(undoAction0.isEnabled());
      
      undoAction0.setEnabled(true);
      boolean boolean0 = undoAction0.isEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OSXApplication oSXApplication0 = new OSXApplication();
      UndoAction undoAction0 = new UndoAction(oSXApplication0, (View) null);
      undoAction0.getApplication();
      assertTrue(undoAction0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CrossPlatformApplication crossPlatformApplication0 = new CrossPlatformApplication();
      TeddyView teddyView0 = new TeddyView();
      crossPlatformApplication0.setEnabled(false);
      MaximizeWindowAction maximizeWindowAction0 = new MaximizeWindowAction(crossPlatformApplication0, teddyView0);
      maximizeWindowAction0.getApplication();
      assertTrue(maximizeWindowAction0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CrossPlatformApplication crossPlatformApplication0 = new CrossPlatformApplication();
      TeddyView teddyView0 = new TeddyView();
      MaximizeWindowAction maximizeWindowAction0 = new MaximizeWindowAction(crossPlatformApplication0, teddyView0);
      assertTrue(maximizeWindowAction0.isEnabled());
      
      teddyView0.getInheritsPopupMenu();
      maximizeWindowAction0.setEnabled(false);
      assertFalse(maximizeWindowAction0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CrossPlatformApplication crossPlatformApplication0 = new CrossPlatformApplication();
      TeddyView teddyView0 = new TeddyView();
      RedoAction redoAction0 = new RedoAction(crossPlatformApplication0, teddyView0);
      View view0 = redoAction0.getActiveView();
      assertTrue(redoAction0.isEnabled());
      assertNotNull(view0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OSXApplication oSXApplication0 = new OSXApplication();
      MinimizeWindowAction minimizeWindowAction0 = new MinimizeWindowAction(oSXApplication0, (View) null);
      minimizeWindowAction0.getActiveView();
      assertTrue(minimizeWindowAction0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CrossPlatformApplication crossPlatformApplication0 = new CrossPlatformApplication();
      TeddyView teddyView0 = new TeddyView();
      crossPlatformApplication0.setEnabled(false);
      MaximizeWindowAction maximizeWindowAction0 = new MaximizeWindowAction(crossPlatformApplication0, teddyView0);
      assertTrue(maximizeWindowAction0.isEnabled());
      
      maximizeWindowAction0.setEnabled(false);
      assertFalse(maximizeWindowAction0.isEnabled());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CrossPlatformApplication crossPlatformApplication0 = new CrossPlatformApplication();
      TeddyView teddyView0 = new TeddyView();
      MaximizeWindowAction maximizeWindowAction0 = new MaximizeWindowAction(crossPlatformApplication0, teddyView0);
      maximizeWindowAction0.setEnabled(true);
      // Undeclared exception!
      try { 
        crossPlatformApplication0.add(teddyView0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jhotdraw.app.AbstractApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      OSXApplication oSXApplication0 = new OSXApplication();
      UndoAction undoAction0 = new UndoAction(oSXApplication0, (View) null);
      EmptyApplicationModel emptyApplicationModel0 = new EmptyApplicationModel();
      oSXApplication0.setModel(emptyApplicationModel0);
      boolean boolean0 = undoAction0.isEnabled();
      assertTrue(boolean0);
  }
}
