Feature: crete miniclub functionality

  Background:
    Given should navigate to the login page
    When enter url as "https://tfc.tech-active.com/sign-in"
    And enter the valid email address "admin@foundry.com"
    And enter the valid password "1234"
    And click on remember me check box
    And click on sign in button
    And admin successfully logged into the application
    Then admin validate the dashboard

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
		   
    When click on my profile icon in dashboard
    And admin validate the user email id
    And click on signout button
    Then admin verify the sign in page
    And close the browser
    
    