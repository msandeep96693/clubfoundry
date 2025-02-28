package definitionsteps;

import Basicflow.Baseclass;
import PageObject.Createminiclubpage;
import io.cucumber.java.en.*;

public class Stepcreateminiclub extends Baseclass {
	
	public Createminiclubpage creatminiclub;
	
	@And("user click on mini club from left navigation bar")
	public void user_click_on_mini_club_from_left_navigation_bar() {
		creatminiclub = new Createminiclubpage(driver);
		creatminiclub.clickonleftnavigationbutton();
	}
	
	@And("validate the mini club list page")
	public void validate_the_mini_club_list_page() {
	    
	}
	
	@And("user click on mini club+ button")
	public void user_click_on_mini_club_button() {
	    
	}
	
	@And("user validate label name and enter club name into the textfield")
	public void user_validate_label_name_and_enter_club_name_into_the_textfield() {
	  
	}
	
	@And("user validate label name and select access level option")
	public void user_validate_label_name_and_select_access_level_option() {
	    
	}
	@And("user validate label name and select the profile picture")
	public void user_validate_label_name_and_select_the_profile_picture() {
	   
	}
	
	@And("user validate label name and select the club type")
	public void user_validate_label_name_and_select_the_club_type() {
	    

	}
	@And("user validate label name and select the club tags")
	public void user_validate_label_name_and_select_the_club_tags() {
	   

	}
	@And("user validate label name and select the moderator")
	public void user_validate_label_name_and_select_the_moderator() {
	   

	}
	@And("user validate label name and select the members")
	public void user_validate_label_name_and_select_the_members() {
	    

	}
	@And("user validate label name and enter club details into the textarea")
	public void user_validate_label_name_and_enter_club_details_into_the_textarea() {
	  

	}
	@And("user validate the button name and click on create button")
	public void user_validate_the_button_name_and_click_on_create_button() {
	   
	}
	@Then("successfully mini club is created")
	public void successfully_mini_club_is_created() {
	   
	}
	@Then("validate the mini club details")
	public void validate_the_mini_club_details() {
	   
	}
}
