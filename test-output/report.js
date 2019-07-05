$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("../POMWithBDDFramework/src/main/java/com/qa/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 748894,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "validate Free CRM Home Page Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "click log in button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Logs details",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.user_open_browser()"
});
formatter.result({
  "duration": 8623914746,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 133730862,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.click_log_in_button()"
});
formatter.result({
  "duration": 11678828994,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.user_enters_username_and_password()"
});
formatter.result({
  "duration": 287521481,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.validate_home_page_title()"
});
formatter.result({
  "duration": 3553635,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.validate_logged_in_username()"
});
formatter.result({
  "duration": 10529012160,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[text()\u003d\u0027vijalakshmi R\u0027]//parent::div[@class\u003d\u0027right menu\u0027]\"}\n  (Session info: chrome\u003d75.0.3770.100)\n  (Driver info: chromedriver\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027ENCDTH061\u0027, ip: \u0027192.168.30.157\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_05\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628402 (536cd7adbad73a..., userDataDir: C:\\Users\\vraja\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:53762}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 75.0.3770.100, webStorageEnabled: true}\nSession ID: 35e20793b098599a3e54126e671aadd8\n*** Element info: {Using\u003dxpath, value\u003d//span[text()\u003d\u0027vijalakshmi R\u0027]//parent::div[@class\u003d\u0027right menu\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat com.qa.pages.HomePage.validateUserLabel(HomePage.java:36)\r\n\tat com.qa.stepDefinition.HomePageStep.validate_logged_in_username(HomePageStep.java:120)\r\n\tat ✽.Then validate logged in username(../POMWithBDDFramework/src/main/java/com/qa/features/freecrm.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 920735333,
  "status": "passed"
});
});