package definitionsteps;

import Basicflow.Baseclass;
import PageObject.createannouncementpage;
import io.cucumber.java.en.*;

public class Stepcreateannouncement extends Baseclass {
	
	
	@When("click on announcement from left navigation")
	public void click_on_announcement_from_left_navigation() {
		createannoucement = new createannouncementpage(driver);
		createannoucement.clicksidebarannouncementbutton();
	}
	
	// ---------------create announcement --------------------------
	
	@And("click on announcement button")
	public void click_on_announcement_button() {
	   createannoucement.clickonaddannouncemnticon();
	}
	@And("enter announcement name into textfield")
	public void enter_announcement_name_into_textfield() {
	    createannoucement.Enterdataintotextfield("Title", "Create automation announcement 1", null, null, null);
	}
	@And("select a announcement date from calender")
	public void select_a_announcement_date_from_calender() throws InterruptedException {
		createannoucement.selectdatefromcalender("7");
	}
	@And("upload a image")
	public void upload_a_image() {
	    System.out.println("upload an image : Add an image");
	}
	@And("enter a link into the textfield")
	public void enter_a_link_into_the_textfield() {
	    createannoucement.Enterdataintotextfield("Link 1", null, "https://www.announcement.com", null, null);
	    createannoucement.Enterdataintotextfield("Link 2", null, null, "https://www.announcement.com", null);
	}
	@And("enter a announcement details into textarea")
	public void enter_a_announcement_details_into_textarea() {
	   createannoucement.Enterdataintotextfield("Details", null, null, null, "create automation announcement 1");
	}
	
	@When("click on create button1")
	public void click_on_create_button() {
		createannoucement.clickoncreatebutton();
	}
	
	@And("successfully announcement is created")
	public void successfully_announcement_is_created() {
	    System.out.println("successfully announcement is created");
	}
	@And("validate the announcement details")
	public void validate_the_announcement_details() throws InterruptedException {
	   createannoucement.validateannouncementdetailspage();
	}
	
	// -------------------------------- delete announcement -----------------------------------
	
	@And("Ensure the announcement status in a list")
	public void validate_the_announcement_status_in_a_list() {
	   createannoucement.announcementstatusinalist();
	}
	
	@And("select and click any announcement from list")
	public void select_and_click_any_announcement_from_list() throws InterruptedException {
	   createannoucement.Ensureannouncementstatusinalist("On-going", "Not Started");  // "Ongoing", "Not started"
	}
	
	@And("Ensure the annoucement details page")
	public void ensure_the_annoucement_details_page() {
	    
	}
	
	@When("click on delete icon")
	public void click_on_delete_icon() {
	    
	}
	
	@And("Ensure admin redirected to announcement home page")
	public void ensure_admin_redirected_to_announcement_home_page() {
	   
	}
	
	
	
}
