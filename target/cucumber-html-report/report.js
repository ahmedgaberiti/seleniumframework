$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/UserRegisteration.feature");
formatter.feature({
  "name": "User Registration",
  "description": "   I want to check that the user can register in our e-commerce website.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User Registration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "name": "I entered \"\u003cfirstname\u003e\" , \"\u003clastname\u003e\" , \"\u003cemail\u003e\" , \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "The registration page displayed successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "ahmedd",
        "mohamedd",
        "ahmed@user4344.com",
        "1234567"
      ]
    },
    {
      "cells": [
        "Moatazd",
        "ahmedd",
        "test@newuser2433.com",
        "8765432"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Registration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.UserRegisterationn.the_user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register link",
  "keyword": "When "
});
formatter.match({
  "location": "steps.UserRegisterationn.i_click_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered \"ahmedd\" , \"mohamedd\" , \"ahmed@user4344.com\" , \"1234567\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.UserRegisterationn.i_entered(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The registration page displayed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.UserRegisterationn.the_registration_page_displayed_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Registration",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.UserRegisterationn.the_user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register link",
  "keyword": "When "
});
formatter.match({
  "location": "steps.UserRegisterationn.i_click_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered \"Moatazd\" , \"ahmedd\" , \"test@newuser2433.com\" , \"8765432\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.UserRegisterationn.i_entered(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The registration page displayed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.UserRegisterationn.the_registration_page_displayed_successfully()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Log out\"}\n  (Session info: chrome\u003d81.0.4044.129)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-U8G89I5\u0027, ip: \u0027192.168.80.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.129, chrome: {chromedriverVersion: 81.0.4044.69 (6813546031a4b..., userDataDir: C:\\Users\\Ahmad\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:3610}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0b235269a1d0f784f85ae76b5513d81c\n*** Element info: {Using\u003dlink text, value\u003dLog out}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy26.click(Unknown Source)\r\n\tat pom_pages.PageBase.clickbutton(PageBase.java:21)\r\n\tat pom_pages.UserRegisteration.logoutpage(UserRegisteration.java:69)\r\n\tat steps.UserRegisterationn.the_registration_page_displayed_successfully(UserRegisterationn.java:44)\r\n\tat ✽.The registration page displayed successfully(file:///G:/ITI/Test%20Automation/maven/testautomationframework/src/test/java/features/UserRegisteration.feature:8)\r\n",
  "status": "failed"
});
});