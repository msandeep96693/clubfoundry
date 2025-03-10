Feature: Login flow functionality

  Background: 
    Given should navigate to the login page
    When enter url as "https://tfc.tech-active.com/sign-in"

  Scenario: Login by valid credentials
    And enter the valid email address "admin@foundry.com"
    And enter the valid password "1234"
    And click on remember me check box
    And click on sign in button
    And admin successfully logged into the application
    Then admin validate the dashboard
    When click on my profile icon in dashboard
    And admin validate the user email id
    And click on signout button
    Then admin verify the sign in page
    And close the browser