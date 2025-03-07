package definitionsteps;

import Basicflow.Baseclass;
import PageObject.clubdashboardpage;
import io.cucumber.java.en.*;

public class Stepdashboard extends Baseclass {
	
	
	@And("Dashboard announcement list data validation")
	public void dashboard_announcement_list_data_validation() throws InterruptedException {
		clubdashboard = new clubdashboardpage(driver);
		clubdashboard.validatedashboardannouncementlistdata();
	}
	
	@And("Dashboard review data validation")
	public void dashboard_review_data_validation() throws InterruptedException {
	   clubdashboard.validatedashboardreviewdata();
	}
	
	@And("Dashboard submission list data validation")
	public void dashboard_submission_list_data_validation() throws InterruptedException {
	   clubdashboard.validatedashboardsubmissionlistdata();
	}
	
	@And("Dashboard winner list data validation")
	public void dashboard_winner_list_data_validation() throws InterruptedException {
	   clubdashboard.validatedashboardwinnerlistdata();
	}
	
	@And("Dashboard member list data validation")
	public void dashboard_member_list_data_validation() throws InterruptedException {
	   clubdashboard.validatedashboardmemberlistdata();

}	
}
