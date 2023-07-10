$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resource/Features/ActiLog.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "user able to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user able to login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I launched the Browser",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter  data \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on Login link",
  "keyword": "And "
});
formatter.step({
  "name": "logout the app",
  "keyword": "Then "
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "manager"
      ]
    },
    {
      "cells": [
        "trainee",
        "trainee"
      ]
    },
    {
      "cells": [
        "admin",
        "trainee"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user able to login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launched the Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.ActiLog.i_launched_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter  data \"admin\" and \"manager\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.ActiLog.enter_data_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.ActiLog.click_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logout the app",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.ActiLog.logout_the_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.ActiLog.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "user able to login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launched the Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.ActiLog.i_launched_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter  data \"trainee\" and \"trainee\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.ActiLog.enter_data_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.ActiLog.click_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logout the app",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.ActiLog.logout_the_app()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca href\u003d\"/logout.do\" id\u003d\"logoutLink\" class\u003d\"logout\"\u003e...\u003c/a\u003e is not clickable at point (1132, 16). Other element would receive the click: \u003cdiv id\u003d\"whiteMoireDiv\" class\u003d\"transformedMoireClass transparentMoire\" style\u003d\"display: block; left: 0px; top: 0px;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d113.0.5672.93)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-BEH2CCO\u0027, ip: \u0027192.168.0.143\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.93, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\MADHUS~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54134}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 45a6e7d6c0833429fd9e638758d673d2\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat StepDef.ActiLog.logout_the_app(ActiLog.java:55)\r\n\tat ✽.logout the app(file:///C:/Users/MadhusriChoppa/eclipse-workspace/Ecllipse_oxygen/Extent_BDD/src/test/resource/Features/ActiLog.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.ActiLog.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "user_able_to_login");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "user able to login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launched the Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.ActiLog.i_launched_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter  data \"admin\" and \"trainee\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.ActiLog.enter_data_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.ActiLog.click_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logout the app",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.ActiLog.logout_the_app()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(text(),\u0027Logout\u0027)]\"}\n  (Session info: chrome\u003d113.0.5672.93)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-BEH2CCO\u0027, ip: \u0027192.168.0.143\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.93, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\MADHUS~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:54180}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: ac8a5b0200145ff0a7d803267af4a976\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027Logout\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDef.ActiLog.logout_the_app(ActiLog.java:55)\r\n\tat ✽.logout the app(file:///C:/Users/MadhusriChoppa/eclipse-workspace/Ecllipse_oxygen/Extent_BDD/src/test/resource/Features/ActiLog.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.ActiLog.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", "user_able_to_login");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});