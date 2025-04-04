Feature: crete announcement functionality

  Background:
    Given should navigate to the login page
    When enter url as "https://tfc.tech-active.com/sign-in"
    And enter the valid email address "admin@foundry.com"
    And enter the valid password "1234"
    And click on remember me check box
    And click on sign in button
    And admin successfully logged into the application
    Then admin validate the dashboard

  Scenario: create announcement
  
		When click on announcement from left navigation
		And click on announcement button
		And enter announcement name into textfield
		And select a announcement date from calender
		And upload a image
		And enter a link into the textfield
		And enter a announcement details into textarea
		When click on create button1
		And successfully announcement is created
		And validate the announcement details
			   
  	When click on my profile icon in dashboard
    And admin validate the user email id
    And click on signout button
    Then admin verify the sign in page
    And close the browser
    
    
    
    
    