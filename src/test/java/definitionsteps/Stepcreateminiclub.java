package definitionsteps;

import Basicflow.Baseclass;
import PageObject.Createminiclubpage;
import io.cucumber.java.en.*;

public class Stepcreateminiclub extends Baseclass {
	
	public Createminiclubpage creatminiclub;
	
	@And("click on mini club from left navigation bar")
	public void click_on_mini_club_from_left_navigation_bar() {
		creatminiclub = new Createminiclubpage(driver);
		creatminiclub.clickonleftnavigationbutton();
	}
	@And("validate the mini club list page")
	public void validate_the_mini_club_list_page() {
		creatminiclub.fetchthelistofminiclubdata();
	}
	
	@And("click on mini club button")
	public void click_on_mini_club_button() {
		creatminiclub.clickonminiclubbutton();
	}
	@And("enter club name into the textfield")
	public void enter_club_name_into_the_textfield() {
	    
	}
	@And("select access level option")
	public void select_access_level_option() {
		
	}
	@And("select the profile picture")
	public void select_the_profile_picture() {
	    
	}
	@And("select the club type")
	public void select_the_club_type() {
	    
	}
	@And("select the club tags")
	public void select_the_club_tags() {
	    
	}
	@And("select the moderator")
	public void select_the_moderator() {
	    
	}
	@And("select the members")
	public void select_the_members() {
	    
	}
	@And("enter club details into the textarea")
	public void enter_club_details_into_the_textarea() {
	    
	}
	@And("click on create button")
	public void click_on_create_button() {
	    
	}
	
	@Then("successfully mini club is created")
	public void successfully_mini_club_is_created() {
	    
	}
	@Then("validate the mini club details")
	public void validate_the_mini_club_details() {
	    
	}
}
