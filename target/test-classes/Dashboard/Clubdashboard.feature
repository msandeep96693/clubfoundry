Feature: Foundry club Dashboard validation

  Background: 
    Given user should navigate to the login page
    When user enter url as "https://tfc.tech-active.com/sign-in"
    And user enter the valid email address "admin@foundry.com"
    And user enter the valid password "1234"
    And user click on remember me check box
    And user click on sign in button
    And user successfully logged into the application
    Then user validate the dashboard

  Scenario: Dashboard validation
  
		And Dashboard announcement list data validation
		And Dashboard review data validation
		And Dashboard submission list data validation
		And Dashboard winner list data validation
		And Dashboard member list data validation	
			
			   
    When user click on my profile icon in dashboard
    And user validate the user email id
    And user click on signout button
    Then user verify the sign in page
    And user close the browser