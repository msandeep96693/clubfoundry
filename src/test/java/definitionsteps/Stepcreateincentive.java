package definitionsteps;

import java.awt.AWTException;

import org.testng.internal.BaseClassFinder;

import Basicflow.Baseclass;
import PageObject.Createincentivepage;
import io.cucumber.java.en.*;

public class Stepcreateincentive extends Baseclass {
	
	public Createincentivepage createincentive;
	
	@When("user click on incentives from left navigation")
	public void user_click_on_incentives_from_left_navigation() {
		createincentive = new Createincentivepage(driver);
		createincentive.LeftnvigationIncentiveButton(2);
	}
	
	@And("user click on incentive+ button")
	public void user_click_on_incentive_button() {
		createincentive.clickonincentiveaddbutton();
	}
	
	@And("user validate the label name and select mini club name option")
	public void user_validate_the_label_name_and_select_mini_club_name_option() throws InterruptedException {
		createincentive.Dropdownlabelnamevalidationandaction("Investors Hub");
	}
	
	@And("user validate the label name and enter the title name as")
	public void user_validate_the_label_name_and_enter_the_title_name_as() throws InterruptedException {
		createincentive.Allcomponenttextfieldlabelnamevalidationandaction(null, "Create Automation Incentive", null, null, null, null, null, null);
	}
	
//	@And("user validate the label name and select the start date from calender")
//	public void user_validate_the_label_name_and_select_the_start_date_from_calender() {
//		createincentive.startandenddatevalidationandaction("Start date", "FEB 2025", "2025", "FEB", "28");
//	}
//	
//	@And("user validate the label name and select the end date from calender")
//	public void user_validate_the_label_name_and_select_the_end_date_from_calender() {
//		createincentive.startandenddatevalidationandaction("Last date", "FEB 2025", "2025", "MAR", "10");
//	}
	@And("user validate the label name and Add an image")
	public void user_validate_the_label_name_and_add_an_image()  {
		createincentive.addimagelabelvalidationandaction();
	}
	
	@And("user validate the label name and enter the max submission data as")
	public void user_validate_the_label_name_and_enter_the_max_submission_data_as() throws InterruptedException {
	    createincentive.Allcomponenttextfieldlabelnamevalidationandaction(null, null, "30", null, null, null, null, null);
	}
	
	@And("user validate the label name and enter the Eligible winner data as")
	public void user_validate_the_label_name_and_enter_the_eligible_winner_data_as() throws InterruptedException {
	    createincentive.Allcomponenttextfieldlabelnamevalidationandaction(null, null, null, "1", null, null, null, null);
	}
	
	@And("user validate the label name and enter the winner Title as")
	public void user_validate_the_label_name_and_enter_the_winner_title_as() throws InterruptedException {
	    createincentive.Allcomponenttextfieldlabelnamevalidationandaction(null, null, null, null, "LEVEL 1", null, null, null);
	}
	
	@And("user click on currency dropdown1 and select the option")
	public void user_click_on_currency_dropdown1_and_select_the_option() throws InterruptedException {
	    createincentive.Dropdownlabelnamevalidationandaction("INR ₹");   
	}
	
	@And("user validate the label name and enter the winner amount")
	public void user_validate_the_label_name_and_enter_the_winner_amount() throws InterruptedException {
		createincentive.Allcomponenttextfieldlabelnamevalidationandaction(null, null, null, null, null, "1000", null, null);
	}
	
//	@And("user click on winner title+ icon")
//	public void user_click_on_winner_title_icon() {
//	    
//	}
	
//	@And("user validate the label name and enter the winner Title2 as")
//	public void user_validate_the_label_name_and_enter_the_winner_title2_as() {
//	    
//	}
//	@And("user validate the label name and enter the winner amount2")
//	public void user_validate_the_label_name_and_enter_the_winner_amount2() {
//	    
//	}
	@And("user validate the link label name and enter the Link")
	public void user_validate_the_link_label_name_and_enter_the_link() throws InterruptedException {
		createincentive.Allcomponenttextfieldlabelnamevalidationandaction(null, null, null, null, null, null, "https://www.incentive.com", null);
	}
	
	@And("user validate incentive details label name and enter the incentive details as")
	public void user_validate_incentive_details_label_name_and_enter_the_incentive_details_as() throws InterruptedException {
	   createincentive.Allcomponenttextfieldlabelnamevalidationandaction(null, null, null, null, null, null, null, "Incentive Details");
	}
	@And("user validate the create button and click on it")
	public void user_validate_the_create_button_and_click_on_it() {
	    createincentive.validatecreatebuttonandaction();
	}
	@Then("user incentive is created successfully and navigate to incentive details page")
	public void user_incentive_is_created_successfully_and_navigate_to_incentive_details_page() {
	    createincentive.validatethecreatedincentivedata();
	}
	@Then("user validate the incentive details")
	public void user_validate_the_incentive_details() {
		createincentive.validateincentivedetailstextnameindetailspage();
	}


}
