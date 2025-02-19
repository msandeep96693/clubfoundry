Feature: crete incentive functionality

  Background: 
    Given user should navigate to the login page
    When user enter url as "https://tfc.tech-active.com/sign-in"
    And user enter the valid email address "admin@foundry.com"
    And user enter the valid password "1234"
    And user click on remember me check box
    And user click on sign in button
    And user successfully logged into the application
    Then user validate the dashboard

  Scenario: create incentive
  
		When user click on incentives from left navigation
		And user click on incentive+ button
		And user validate the label name and select mini club name option
		And user validate the label name and enter the title name as
		And user validate the label name and select the start date from calender
		And user validate the label name and select the end date from calender
		And user validate the label name and Add an image
		And user validate the label name and enter the max submission data as
		And user validate the label name and enter the Eligible winner data as
		And user validate the label name and enter the winner Title as
		And user click on currency dropdown1 and select the option
		And user validate the label name and enter the winner amount
		And user click on winner title+ icon 
		And user validate the label name and enter the winner Title2 as
		And user validate the label name and enter the winner amount2
		And user validate the link label name and enter the Link
		And user validate incentive details label name and enter the incentive details as
		And user validate the create button and click on it
		Then user incentive is created successfully and navigate to incentive details page
		Then user validate the incentive details
		   
    When user click on my profile icon in dashboard
    And user validate the user email id
    And user click on signout button
    Then user verify the sign in page
    And user close the browser
    
    
    
    
    