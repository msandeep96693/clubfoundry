package definitionsteps;

import java.awt.AWTException;

import org.testng.Assert;

import Basicflow.Baseclass;
import PageObject.Createminiclubpage;
import io.cucumber.java.en.*;

public class Stepcreateminiclub extends Baseclass {
	
	public Createminiclubpage createminiclub;
	
	@And("click on mini club from left navigation bar")
	public void click_on_mini_club_from_left_navigation_bar() throws InterruptedException {
		createminiclub = new Createminiclubpage(driver);
		createminiclub.clickonleftnavigationbutton();
	}
	@And("validate the mini club list page")
	public void validate_the_mini_club_list_page() {
		createminiclub.fetchthelistofminiclubdata();
	}
	
	@And("click on mini club button")
	public void click_on_mini_club_button() {
		createminiclub.clickonminiclubbutton();
	}
	@And("enter club name into the textfield")
	public void enter_club_name_into_the_textfield() {
	    createminiclub.enterthedataintominiclubtextfield("Create mini club Automation");
	}
	@And("select access level option")
	public void select_access_level_option() throws InterruptedException, AWTException {
		createminiclub.clickondropdown("Club Access Level");
		createminiclub.selectoptionfromdropdown();
		
	}
	@And("select the profile picture")
	public void select_the_profile_picture() {
	   System.out.println("WE NEED TO IMPLEMENT"); 
	}
	@And("select the club type")
	public void select_the_club_type() throws InterruptedException, AWTException {
		createminiclub.clickondropdown("Club Type");
		createminiclub.selectoptionfromdropdown();
	}
	@And("select the club tags")
	public void select_the_club_tags() throws AWTException, InterruptedException {
	    createminiclub.clickondropdown("Club Tags");
	    createminiclub.clubtagdropdownaction();
	}
	@And("select the moderator")
	public void select_the_moderator() throws AWTException, InterruptedException {
		createminiclub.clickondropdown("Moderators");
		createminiclub.moderatorandmemberdropdownaction();
	}
	@And("select the members")
	public void select_the_members() throws AWTException, InterruptedException {
		createminiclub.clickondropdown("Members");
		createminiclub.moderatorandmemberdropdownaction();
	}
	@And("enter club details into the textarea")
	public void enter_club_details_into_the_textarea() {
	    createminiclub.clubdescriptiontextarea("Create mini club Automation");
	}
	@And("click on create button")
	public void click_on_create_button() {
	    createminiclub.clickoncreatebutton();
	}
	
	@Then("successfully mini club is created")
	public void successfully_mini_club_is_created() {
	    createminiclub.successfullyminiclubcreated();
	}
	@Then("validate the mini club details")
	public void validate_the_mini_club_details() {
	    createminiclub.miniclubdetailsvalidation();
	}
	
	/* ------------------ update mini club -------------------*/
	
	@And("click on edit icon from mini club list")
	public void click_on_edit_icon_from_mini_club_list() {
	   
	}
	
	@And("click on update mini club button")
	public void click_on_update_mini_club_button() {
	   
	}
	
	@Then("successfully mini club is updated")
	public void successfully_mini_club_is_updated() {
	   Assert.assertEquals(createminiclub.updateminiclubconfirmationmessage(), "The mini club has been updated successfully.");
	}
}
