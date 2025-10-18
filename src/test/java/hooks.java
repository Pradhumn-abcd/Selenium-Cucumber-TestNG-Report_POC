[RemoteTestNG] detected TestNG version 7.11.0
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.

Scenario: Create a new user                                        # src/test/resources/features/admin.feature:3
      io.cucumber.core.exception.CucumberException: Failed to instantiate class hooks.ReportHooks
	at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:67)
	at io.cucumber.core.backend.DefaultObjectFactory.getInstance(DefaultObjectFactory.java:45)
	at io.cucumber.java.AbstractGlueDefinition.invokeMethod(AbstractGlueDefinition.java:47)
	at io.cucumber.java.JavaHookDefinition.execute(JavaHookDefinition.java:64)
	at io.cucumber.core.runner.CoreHookDefinition.execute(CoreHookDefinition.java:47)
	at io.cucumber.core.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:21)
	at io.cucumber.core.runner.ExecutionMode$1.execute(ExecutionMode.java:10)
	at io.cucumber.core.runner.TestStep.executeStep(TestStep.java:81)
	at io.cucumber.core.runner.TestStep.run(TestStep.java:53)
	at io.cucumber.core.runner.TestCase.run(TestCase.java:78)
	at io.cucumber.core.runner.Runner.runPickle(Runner.java:75)
	at io.cucumber.testng.TestNGCucumberRunner.lambda$runScenario$1(TestNGCucumberRunner.java:135)
	at io.cucumber.core.runtime.CucumberExecutionContext.lambda$runTestCase$5(CucumberExecutionContext.java:136)
	at io.cucumber.core.runtime.RethrowingThrowableCollector.executeAndThrow(RethrowingThrowableCollector.java:23)
	at io.cucumber.core.runtime.CucumberExecutionContext.runTestCase(CucumberExecutionContext.java:136)
	at io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:132)
	at io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:35)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:141)
	at org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:687)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:230)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:63)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:995)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:203)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:154)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:134)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
	at org.testng.TestRunner.privateRun(TestRunner.java:741)
	at org.testng.TestRunner.run(TestRunner.java:616)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:421)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:413)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:373)
	at org.testng.SuiteRunner.run(SuiteRunner.java:312)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1274)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1208)
	at org.testng.TestNG.runSuites(TestNG.java:1112)
	at org.testng.TestNG.run(TestNG.java:1079)
	at org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)
	at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)
	at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:74)
	at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:501)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:485)
	at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:53)
	... 42 more
Caused by: java.lang.Error: Unresolved compilation problems: 
	The import reports cannot be resolved
	The public type ReportHooks must be defined in its own file
	ExtentManager cannot be resolved

	at hooks.ReportHooks.<init>(Hooks.java:7)
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
	... 45 more

  Given I am logged in as admin                                    # stepDefinitions.AdminSteps.i_am_logged_in_as_admin()
  And I navigate to the Admin module                               # stepDefinitions.AdminSteps.i_navigate_to_the_admin_module()
  When I add a new user with username "testuser9" and employee "t" # stepDefinitions.AdminSteps.i_add_a_new_user_with_username_and_employee(java.lang.String,java.lang.String)
  Then I close the browser                                         # stepDefinitions.AdminSteps.i_close_the_browser()
      io.cucumber.core.exception.CucumberException: Failed to instantiate class hooks.ReportHooks
	at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:67)
	at io.cucumber.core.backend.DefaultObjectFactory.getInstance(DefaultObjectFactory.java:45)
	at io.cucumber.java.AbstractGlueDefinition.invokeMethod(AbstractGlueDefinition.java:47)
	at io.cucumber.java.JavaHookDefinition.execute(JavaHookDefinition.java:64)
	at io.cucumber.core.runner.CoreHookDefinition.execute(CoreHookDefinition.java:47)
	at io.cucumber.core.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:21)
	at io.cucumber.core.runner.ExecutionMode$1.execute(ExecutionMode.java:10)
	at io.cucumber.core.runner.TestStep.executeStep(TestStep.java:81)
	at io.cucumber.core.runner.TestStep.run(TestStep.java:53)
	at io.cucumber.core.runner.TestCase.run(TestCase.java:90)
	at io.cucumber.core.runner.Runner.runPickle(Runner.java:75)
	at io.cucumber.testng.TestNGCucumberRunner.lambda$runScenario$1(TestNGCucumberRunner.java:135)
	at io.cucumber.core.runtime.CucumberExecutionContext.lambda$runTestCase$5(CucumberExecutionContext.java:136)
	at io.cucumber.core.runtime.RethrowingThrowableCollector.executeAndThrow(RethrowingThrowableCollector.java:23)
	at io.cucumber.core.runtime.CucumberExecutionContext.runTestCase(CucumberExecutionContext.java:136)
	at io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:132)
	at io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:35)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:141)
	at org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:687)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:230)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:63)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:995)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:203)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:154)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:134)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
	at org.testng.TestRunner.privateRun(TestRunner.java:741)
	at org.testng.TestRunner.run(TestRunner.java:616)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:421)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:413)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:373)
	at org.testng.SuiteRunner.run(SuiteRunner.java:312)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1274)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1208)
	at org.testng.TestNG.runSuites(TestNG.java:1112)
	at org.testng.TestNG.run(TestNG.java:1079)
	at org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)
	at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)
	at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:74)
	at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:501)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:485)
	at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:53)
	... 42 more
Caused by: java.lang.Error: Unresolved compilation problems: 
	The import reports cannot be resolved
	The public type ReportHooks must be defined in its own file
	ExtentManager cannot be resolved

	at hooks.ReportHooks.<init>(Hooks.java:7)
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
	... 45 more


Scenario: Valid login with admin credentials            # src/test/resources/features/login.feature:3
      io.cucumber.core.exception.CucumberException: Failed to instantiate class hooks.ReportHooks
	at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:67)
	at io.cucumber.core.backend.DefaultObjectFactory.getInstance(DefaultObjectFactory.java:45)
	at io.cucumber.java.AbstractGlueDefinition.invokeMethod(AbstractGlueDefinition.java:47)
	at io.cucumber.java.JavaHookDefinition.execute(JavaHookDefinition.java:64)
	at io.cucumber.core.runner.CoreHookDefinition.execute(CoreHookDefinition.java:47)
	at io.cucumber.core.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:21)
	at io.cucumber.core.runner.ExecutionMode$1.execute(ExecutionMode.java:10)
	at io.cucumber.core.runner.TestStep.executeStep(TestStep.java:81)
	at io.cucumber.core.runner.TestStep.run(TestStep.java:53)
	at io.cucumber.core.runner.TestCase.run(TestCase.java:78)
	at io.cucumber.core.runner.Runner.runPickle(Runner.java:75)
	at io.cucumber.testng.TestNGCucumberRunner.lambda$runScenario$1(TestNGCucumberRunner.java:135)
	at io.cucumber.core.runtime.CucumberExecutionContext.lambda$runTestCase$5(CucumberExecutionContext.java:136)
	at io.cucumber.core.runtime.RethrowingThrowableCollector.executeAndThrow(RethrowingThrowableCollector.java:23)
	at io.cucumber.core.runtime.CucumberExecutionContext.runTestCase(CucumberExecutionContext.java:136)
	at io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:132)
	at io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:35)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:141)
	at org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:687)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:230)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:63)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:995)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:203)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:154)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:134)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
	at org.testng.TestRunner.privateRun(TestRunner.java:741)
	at org.testng.TestRunner.run(TestRunner.java:616)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:421)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:413)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:373)
	at org.testng.SuiteRunner.run(SuiteRunner.java:312)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1274)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1208)
	at org.testng.TestNG.runSuites(TestNG.java:1112)
	at org.testng.TestNG.run(TestNG.java:1079)
	at org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)
	at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)
	at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:74)
	at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:501)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:485)
	at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:53)
	... 42 more
Caused by: java.lang.Error: Unresolved compilation problems: 
	The import reports cannot be resolved
	The public type ReportHooks must be defined in its own file
	ExtentManager cannot be resolved

	at hooks.ReportHooks.<init>(Hooks.java:7)
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
	... 45 more

  Given I am on the OrangeHRM login page                # stepDefinitions.LoginSteps.i_am_on_the_orange_hrm_login_page()
  When I enter username "Admin" and password "admin123" # stepDefinitions.LoginSteps.i_enter_credentials(java.lang.String,java.lang.String)
  Then I should see the OrangeHRM dashboard             # stepDefinitions.LoginSteps.i_should_see_dashboard()
      io.cucumber.core.exception.CucumberException: Failed to instantiate class hooks.ReportHooks
	at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:67)
	at io.cucumber.core.backend.DefaultObjectFactory.getInstance(DefaultObjectFactory.java:45)
	at io.cucumber.java.AbstractGlueDefinition.invokeMethod(AbstractGlueDefinition.java:47)
	at io.cucumber.java.JavaHookDefinition.execute(JavaHookDefinition.java:64)
	at io.cucumber.core.runner.CoreHookDefinition.execute(CoreHookDefinition.java:47)
	at io.cucumber.core.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:21)
	at io.cucumber.core.runner.ExecutionMode$1.execute(ExecutionMode.java:10)
	at io.cucumber.core.runner.TestStep.executeStep(TestStep.java:81)
	at io.cucumber.core.runner.TestStep.run(TestStep.java:53)
	at io.cucumber.core.runner.TestCase.run(TestCase.java:90)
	at io.cucumber.core.runner.Runner.runPickle(Runner.java:75)
	at io.cucumber.testng.TestNGCucumberRunner.lambda$runScenario$1(TestNGCucumberRunner.java:135)
	at io.cucumber.core.runtime.CucumberExecutionContext.lambda$runTestCase$5(CucumberExecutionContext.java:136)
	at io.cucumber.core.runtime.RethrowingThrowableCollector.executeAndThrow(RethrowingThrowableCollector.java:23)
	at io.cucumber.core.runtime.CucumberExecutionContext.runTestCase(CucumberExecutionContext.java:136)
	at io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:132)
	at io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:35)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:141)
	at org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:687)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:230)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:63)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:995)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:203)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:154)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:134)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
	at org.testng.TestRunner.privateRun(TestRunner.java:741)
	at org.testng.TestRunner.run(TestRunner.java:616)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:421)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:413)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:373)
	at org.testng.SuiteRunner.run(SuiteRunner.java:312)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1274)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1208)
	at org.testng.TestNG.runSuites(TestNG.java:1112)
	at org.testng.TestNG.run(TestNG.java:1079)
	at org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)
	at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)
	at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:74)
	at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:501)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:485)
	at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:53)
	... 42 more
Caused by: java.lang.Error: Unresolved compilation problems: 
	The import reports cannot be resolved
	The public type ReportHooks must be defined in its own file
	ExtentManager cannot be resolved

	at hooks.ReportHooks.<init>(Hooks.java:7)
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
	... 45 more

FAILED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Valid login with admin credentials", "OrangeHRM Login Functionality")
        Runs Cucumber Scenarios
io.cucumber.core.exception.CucumberException: Failed to instantiate class hooks.ReportHooks
	at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:67)
	at io.cucumber.core.backend.DefaultObjectFactory.getInstance(DefaultObjectFactory.java:45)
	at io.cucumber.java.AbstractGlueDefinition.invokeMethod(AbstractGlueDefinition.java:47)
	at io.cucumber.java.JavaHookDefinition.execute(JavaHookDefinition.java:64)
	at io.cucumber.core.runner.CoreHookDefinition.execute(CoreHookDefinition.java:47)
	at io.cucumber.core.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:21)
	at io.cucumber.core.runner.ExecutionMode$1.execute(ExecutionMode.java:10)
	at io.cucumber.core.runner.TestStep.executeStep(TestStep.java:81)
	at io.cucumber.core.runner.TestStep.run(TestStep.java:53)
	at io.cucumber.core.runner.TestCase.run(TestCase.java:78)
	at io.cucumber.core.runner.Runner.runPickle(Runner.java:75)
	at io.cucumber.testng.TestNGCucumberRunner.lambda$runScenario$1(TestNGCucumberRunner.java:135)
	at io.cucumber.core.runtime.CucumberExecutionContext.lambda$runTestCase$5(CucumberExecutionContext.java:136)
	at io.cucumber.core.runtime.RethrowingThrowableCollector.executeAndThrow(RethrowingThrowableCollector.java:23)
	at io.cucumber.core.runtime.CucumberExecutionContext.runTestCase(CucumberExecutionContext.java:136)
	at io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:132)
	at io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:35)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:141)
	at org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:687)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:230)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:63)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:995)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:203)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:154)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:134)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
	at org.testng.TestRunner.privateRun(TestRunner.java:741)
	at org.testng.TestRunner.run(TestRunner.java:616)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:421)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:413)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:373)
	at org.testng.SuiteRunner.run(SuiteRunner.java:312)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1274)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1208)
	at org.testng.TestNG.runSuites(TestNG.java:1112)
	at org.testng.TestNG.run(TestNG.java:1079)
	at org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)
	at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)
	at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:74)
	at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:501)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:485)
	at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:53)
	... 42 more
Caused by: java.lang.Error: Unresolved compilation problems: 
	The import reports cannot be resolved
	The public type ReportHooks must be defined in its own file
	ExtentManager cannot be resolved

	at hooks.ReportHooks.<init>(Hooks.java:7)
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
	... 45 more

FAILED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Create a new user", "Admin User Management")
        Runs Cucumber Scenarios
io.cucumber.core.exception.CucumberException: Failed to instantiate class hooks.ReportHooks
	at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:67)
	at io.cucumber.core.backend.DefaultObjectFactory.getInstance(DefaultObjectFactory.java:45)
	at io.cucumber.java.AbstractGlueDefinition.invokeMethod(AbstractGlueDefinition.java:47)
	at io.cucumber.java.JavaHookDefinition.execute(JavaHookDefinition.java:64)
	at io.cucumber.core.runner.CoreHookDefinition.execute(CoreHookDefinition.java:47)
	at io.cucumber.core.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:21)
	at io.cucumber.core.runner.ExecutionMode$1.execute(ExecutionMode.java:10)
	at io.cucumber.core.runner.TestStep.executeStep(TestStep.java:81)
	at io.cucumber.core.runner.TestStep.run(TestStep.java:53)
	at io.cucumber.core.runner.TestCase.run(TestCase.java:78)
	at io.cucumber.core.runner.Runner.runPickle(Runner.java:75)
	at io.cucumber.testng.TestNGCucumberRunner.lambda$runScenario$1(TestNGCucumberRunner.java:135)
	at io.cucumber.core.runtime.CucumberExecutionContext.lambda$runTestCase$5(CucumberExecutionContext.java:136)
	at io.cucumber.core.runtime.RethrowingThrowableCollector.executeAndThrow(RethrowingThrowableCollector.java:23)
	at io.cucumber.core.runtime.CucumberExecutionContext.runTestCase(CucumberExecutionContext.java:136)
	at io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:132)
	at io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:35)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:141)
	at org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:687)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:230)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:63)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:995)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:203)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:154)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:134)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
	at org.testng.TestRunner.privateRun(TestRunner.java:741)
	at org.testng.TestRunner.run(TestRunner.java:616)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:421)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:413)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:373)
	at org.testng.SuiteRunner.run(SuiteRunner.java:312)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1274)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1208)
	at org.testng.TestNG.runSuites(TestNG.java:1112)
	at org.testng.TestNG.run(TestNG.java:1079)
	at org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)
	at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)
	at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:74)
	at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:501)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:485)
	at io.cucumber.core.backend.DefaultObjectFactory.cacheNewInstance(DefaultObjectFactory.java:53)
	... 42 more
Caused by: java.lang.Error: Unresolved compilation problems: 
	The import reports cannot be resolved
	The public type ReportHooks must be defined in its own file
	ExtentManager cannot be resolved

	at hooks.ReportHooks.<init>(Hooks.java:7)
	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
	... 45 more


===============================================
    Default test
    Tests run: 1, Failures: 2, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 2, Passes: 0, Failures: 2, Skips: 0
===============================================

