Feature: crete miniclub functionality

  Background: 
    Given user should navigate to the login page
    When user enter url as "https://tfc.tech-active.com/sign-in"
    And user enter the valid email address "admin@foundry.com"
    And user enter the valid password "1234"
    And user click on remember me check box
    And user click on sign in button
    And user successfully logged into the application
    Then user validate the dashboard

  Scenario: create miniclub
  
		And user click on mini club from left navigation bar
		And validate the mini club list page
		And user click on mini club+ button
		And user validate label name and enter club name into the textfield
		And user validate label name and select access level option
		And user validate label name and select the profile picture
		And user validate label name and select the club type 
		And user validate label name and select the club tags
		And user validate label name and select the moderator
		And user validate label name and select the members
		And user validate label name and enter club details into the textarea
		And user validate the button name and click on create button
		Then successfully mini club is created
		Then validate the mini club details
		   
    When user click on my profile icon in dashboard
    And user validate the user email id
    And user click on signout button
    Then user verify the sign in page
    And user close the browser