package definitionsteps;

import org.openqa.selenium.WebDriver;

import Basicflow.Baseclass;
import PageObject.Signinpage;
import io.cucumber.java.en.*;

public class Stepsignin extends Baseclass {
	
	@Given("should navigate to the login page")
	public void user_should_navigate_to_the_login_page() {
		InitialiseBrowser("chrome");
		signin = new Signinpage(driver);
		
		System.out.println("User navigate to login page");	
	}
	
	@And("enter url as {string}")
	public void user_enter_url_as(String url) {
		driver.get(url);
	}
	
	@And("enter the valid email address {string}")
	public void user_enter_the_valid_email_address(String mail) {
		signin.validateemailaddresslabel();
		signin.Emailfield(mail);
	}
	
	@And("enter the valid password {string}")
	public void user_enter_the_valid_password(String pass) {
		signin.validatepasswordlabel();
		signin.Passwordfield(pass);
	}
	
	@And("click on remember me check box")
	public void user_click_on_remember_me_check_box() {
		signin.validateremembermelabel();
		signin.rememberme();
	}
	
	@And("click on sign in button")
	public void user_click_on_sign_in_button() {
		signin.validatesigninbuttonlabel();
		signin.SigninButton();
	}
	
	@And("admin successfully logged into the application")
	public void user_successfully_logged_into_the_application() throws InterruptedException
	{
		signin.navigatevalidationdashboard();
	}
	
	@Then("admin validate the dashboard")
	public void user_validate_the_dashboard() 
	{
		signin.dashboardtextvalidation();
	
	}
	
	@When("click on my profile icon in dashboard")
	public void user_click_on_my_profile_icon_in_dashboard() throws InterruptedException {
	    signin.clickonuserprofileicon();
	}
	
	@And("admin validate the user email id")
	public void user_validate_the_user_email_id() throws InterruptedException {
	    signin.validationofuser();
	}
	
	@And("click on signout button")
	public void user_click_on_signout_button() {
	   signin.clickonsignoutbutton(1);
	}
	
	@Then("admin verify the sign in page")
	public void user_verify_the_sign_in_page() {
	    signin.validatesignInpageafterlogout();
	}
	
	@And("close the browser")
	public void user_close_the_browser() {
		TearDown();
	}
	
	
}
