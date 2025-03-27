Feature: Delete announcement

  Background:
    Given should navigate to the login page
    When enter url as "https://tfc.tech-active.com/sign-in"
    And enter the valid email address "admin@foundry.com"
    And enter the valid password "1234"
    And click on remember me check box
    And click on sign in button
    And admin successfully logged into the application
    Then admin validate the dashboard
    When click on announcement from left navigation

  Scenario: admin delete a announcement
  
		And select and click any announcement from list
#		When click on delete icon
#		And click yes button on delete popup
#		And verify announcement successfully deleted with confirmation message
		   
  #	When click on my profile icon in dashboard
  #  And admin validate the user email id
  #  And click on signout button
  #  Then admin verify the sign in page
   # And close the browser