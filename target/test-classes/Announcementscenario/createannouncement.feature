Feature: crete announcement functionality

  Background: 
    Given user should navigate to the login page
    When user enter url as "https://tfc.tech-active.com/sign-in"
    And user enter the valid email address "admin@foundry.com"
    And user enter the valid password "1234"
    And user click on remember me check box
    And user click on sign in button
    And user successfully logged into the application
    Then user validate the dashboard

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
			   
    When user click on my profile icon in dashboard
    And user validate the user email id
    And user click on signout button
    Then user verify the sign in page
    And user close the browser
    
    
    
    
    