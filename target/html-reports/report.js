$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestFunctionality.feature");
formatter.feature({
  "line": 1,
  "name": "Test website automationpractice.com",
  "description": "",
  "id": "test-website-automationpractice.com",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11142734991,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Register on website with Valid email",
  "description": "",
  "id": "test-website-automationpractice.com;register-on-website-with-valid-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@scenario1"
    },
    {
      "line": 3,
      "name": "@browser"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigates to homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"validemail@czz.com\" email address and clicks on Create Account button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify user is taken to YourPersonalInformation page",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUserRegistration.navigateToHomePage()"
});
formatter.result({
  "duration": 8807418871,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegistration.clickSignInButton()"
});
formatter.result({
  "duration": 2936899660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "validemail@czz.com",
      "offset": 13
    }
  ],
  "location": "NewUserRegistration.enterValidEmailAndSubmit(String)"
});
formatter.result({
  "duration": 1507833861,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegistration.verifyCreateAccountPage()"
});
formatter.result({
  "duration": 2208554781,
  "status": "passed"
});
formatter.after({
  "duration": 1486277303,
  "status": "passed"
});
formatter.before({
  "duration": 5820577069,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Register on website with Invalid email",
  "description": "",
  "id": "test-website-automationpractice.com;register-on-website-with-invalid-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@scenario2"
    },
    {
      "line": 10,
      "name": "@browser"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User navigates to homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User clicks on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enters \"invalidemail@zzz\" email address and clicks on Create Account button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Verify error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUserRegistration.navigateToHomePage()"
});
formatter.result({
  "duration": 7952696026,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegistration.clickSignInButton()"
});
formatter.result({
  "duration": 2766810159,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalidemail@zzz",
      "offset": 13
    }
  ],
  "location": "NewUserRegistration.enterValidEmailAndSubmit(String)"
});
formatter.result({
  "duration": 1289531556,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegistration.verifyErrorMessageDisplayed()"
});
formatter.result({
  "duration": 1329215436,
  "status": "passed"
});
formatter.after({
  "duration": 1575714520,
  "status": "passed"
});
formatter.before({
  "duration": 5622687603,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify working of MegaMenu main menu",
  "description": "",
  "id": "test-website-automationpractice.com;verify-working-of-megamenu-main-menu",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@scenario3"
    },
    {
      "line": 17,
      "name": "@browser"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User navigates to homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User clicks on SummerDresses link from MegaMenu",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Verify Summer Dresses page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User selects \"Price: Lowest first\" option to sort display",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Verify products are shown in correct sorted order",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUserRegistration.navigateToHomePage()"
});
formatter.result({
  "duration": 8731701151,
  "status": "passed"
});
formatter.match({
  "location": "ValidateMegaMenu.clickSummerDressesLink()"
});
formatter.result({
  "duration": 565469699,
  "status": "passed"
});
formatter.match({
  "location": "ValidateMegaMenu.verifySummerDressesPage()"
});
formatter.result({
  "duration": 10866069143,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price: Lowest first",
      "offset": 14
    }
  ],
  "location": "ValidateMegaMenu.userSelectsSortByOption(String)"
});
formatter.result({
  "duration": 10528856640,
  "status": "passed"
});
formatter.match({
  "location": "ValidateMegaMenu.verifyProductsSorted()"
});
formatter.result({
  "duration": 384099183,
  "status": "passed"
});
formatter.after({
  "duration": 1378997573,
  "status": "passed"
});
});