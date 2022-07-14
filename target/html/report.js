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
  "status": "passed"
});
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
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I go to https://cucumber.io/training page",
  "keyword": "When "
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
  "name": "I should be on https://cucumber.io/training page",
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
formatter.after({
  "status": "passed"
});
});