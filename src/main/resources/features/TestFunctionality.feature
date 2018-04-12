Feature: Test website automationpractice.com

  @scenario1 @browser
  Scenario: Register on website with Valid email
    Given User navigates to homepage
    And User clicks on SignIn button
    When User enters "validemail@czz.com" email address and clicks on Create Account button
    Then Verify user is taken to YourPersonalInformation page

  @scenario2 @browser
  Scenario: Register on website with Invalid email
    Given User navigates to homepage
    And User clicks on SignIn button
    When User enters "invalidemail@zzz" email address and clicks on Create Account button
    Then Verify error message is displayed

  @scenario3 @browser
  Scenario: Verify working of MegaMenu main menu
    Given User navigates to homepage
    When User clicks on SummerDresses link from MegaMenu
    Then Verify Summer Dresses page is displayed
    And User selects "Price: Lowest first" option to sort display
    Then Verify products are shown in correct sorted order