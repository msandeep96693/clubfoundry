Feature: Login flow functionality

  Background: 
    Given user should navigate to the login page
    When user enter url as "https://tfc.tech-active.com/sign-in"

  Scenario: Login by valid credentials
    And user enter the valid email address "admin@foundry.com"
    And user enter the valid password "1234"
    And user click on remember me check box
    And user click on sign in button
    And user successfully logged into the application
    Then user validate the dashboard
    When user click on my profile icon in dashboard
    And user validate the user email id
    And user click on signout button
    Then user verify the sign in page
    And user close the browser