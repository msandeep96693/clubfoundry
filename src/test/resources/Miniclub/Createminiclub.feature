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
  
		And click on mini club from left navigation bar
		And validate the mini club list page
		And click on mini club button
		And enter club name into the textfield
		And select access level option
		And select the profile picture
		And select the club type 
		And select the club tags
		And select the moderator
		And select the members
		And enter club details into the textarea
		And click on create button
		Then successfully mini club is created
		Then validate the mini club details
		   
    When user click on my profile icon in dashboard
    And user validate the user email id
    And user click on signout button
    Then user verify the sign in page
    And user close the browser