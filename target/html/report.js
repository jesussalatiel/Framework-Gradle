$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/VisitCucumberPage.feature");
formatter.feature({
  "name": "As a user i want to visit cucumber pages",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Visit cucumber pages",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Critical"
    }
  ]
});
formatter.step({
  "name": "I go to \u003chome\u003e page",
  "keyword": "Given "
});
formatter.step({
  "name": "I should be on \u003chome\u003e page",
  "keyword": "Then "
});
formatter.step({
  "name": "I click jam on menu",
  "keyword": "When "
});
formatter.step({
  "name": "I should be on \u003cjam\u003e page",
  "keyword": "Then "
});
formatter.step({
  "name": "I go to \u003ctraining\u003e page",
  "keyword": "When "
});
formatter.step({
  "name": "I should be on \u003ctraining\u003e page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "home",
        "jam",
        "training"
      ]
    },
    {
      "cells": [
        "https://cucumber.io/",
        "https://cucumber.io/jam",
        "https://cucumber.io/training"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Visit cucumber pages",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Critical"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to https://cucumber.io/ page",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationPageSteps.java:17"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should be on https://cucumber.io/ page",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationPageSteps.java:21"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click jam on menu",
  "keyword": "When "
});
formatter.match({
  "location": "ActionPageSteps.java:13"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".Header-nav-item[href*\u003djam]\"}\n  (Session info: chrome\u003d103.0.5060.114)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.2.1\u0027, revision: \u0027ac4d0fdd4a\u0027\nSystem info: host: \u0027DEVELOPER\u0027, ip: \u0027192.168.0.36\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.15\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [7f9c339cc676f6a1d98c5a1b2a45b15a, findElement {using\u003dcss selector, value\u003d.Header-nav-item[href*\u003djam]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 103.0.5060.114, chrome: {chromedriverVersion: 103.0.5060.53 (a1711811edd7..., userDataDir: C:\\Windows\\TEMP\\scoped_dir4...}, goog:chromeOptions: {debuggerAddress: localhost:9222}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:9222/devtool..., se:cdpVersion: 103.0.5060.114, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7f9c339cc676f6a1d98c5a1b2a45b15a\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:551)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:369)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy36.click(Unknown Source)\r\n\tat cucumber.glue.pageObjects.ActionPageObjects.clickJamMenu(ActionPageObjects.java:22)\r\n\tat cucumber.glue.steps.ActionPageSteps.lambda$new$0(ActionPageSteps.java:14)\r\n\tat ✽.I click jam on menu(src/test/resources/features/VisitCucumberPage.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I should be on https://cucumber.io/jam page",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationPageSteps.java:21"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.step({
  "name": "I go to https://cucumber.io/training page",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationPageSteps.java:17"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.step({
  "name": "I should be on https://cucumber.io/training page",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationPageSteps.java:21"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});