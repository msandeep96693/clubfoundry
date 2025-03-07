package PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Elementutil;

public class clubdashboardpage {
	
	public WebDriver driver;
	
	public clubdashboardpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath = "((//div[.='Hello, Admin'])[2]/../following-sibling::div)[1]/div/div/div") private List<WebElement> dashboardannouncementdlistdata;
	
	@FindBy(xpath = "//div[.=' Overview ']/..//div/div/div") private List<WebElement> dashboardreviewvalidationdata;
	@FindBy(xpath = "//div[.=' Overview ']") private WebElement overviewtextname;
	
	@FindBy(xpath = "(//div[.='Submissions'])[2]/../../following-sibling::div/div/div/div/div") private List<WebElement> dashboardsubmissionlistdata;
	@FindBy(xpath = "//div[.='Submissions'])[2]") private WebElement submissiontextname;
	
	@FindBy(xpath = "//div[.='Winners']/../../following-sibling::div/div/div/div/div/div") private List<WebElement> dashboardwinnerlistdata;
	@FindBy(xpath = "//div[.='Winners']") private WebElement winnertextname;
	
	@FindBy(xpath = "//div[.='Members']/../../following-sibling::div/div/div/div") private List<WebElement> dashboardmemberlistdata;
	@FindBy(xpath = "//div[.='Members']") private WebElement membertextname;
	
	
	public void validatedashboardannouncementlistdata() throws InterruptedException
	{
		List<String> announcementDataList = new ArrayList<>();
		
		for(WebElement announcementlistdata : dashboardannouncementdlistdata)
		{
			Thread.sleep(2000);
			String listdata = announcementlistdata.getText();
			announcementDataList.add(listdata);	
		}	
		
		String announcementDataString = String.join(", ", announcementDataList);
		System.out.println("Dashboard announcement list data details: " + "[ "+announcementDataString+" ]");
		System.out.println();
	}
	
	public void validatedashboardreviewdata() throws InterruptedException
	{
		Elementutil elementutil = new Elementutil(driver);
		elementutil.javascriptbyscrollbar(overviewtextname, 2);
		
		List<String> reviewDataList = new ArrayList<>();
		
		for(WebElement reviewdata : dashboardreviewvalidationdata)
		{
			Thread.sleep(2000);
			String listdata = reviewdata.getText();
			reviewDataList.add(listdata);	
		}	
		
		String reviewDataString = String.join(", ", reviewDataList);
		System.out.println("Dashboard Overeview data details: " + "[ "+reviewDataString+" ]");
		System.out.println();
		
	}
	
	public void validatedashboardsubmissionlistdata() throws InterruptedException
	{
		
		List<String> submissionDataList = new ArrayList<>();
		
		for(WebElement submissionlistdata : dashboardsubmissionlistdata)
		{
			Thread.sleep(2000);
			String listdata = submissionlistdata.getText();
			submissionDataList.add(listdata);	
		}	
		
		String submissionDataString = String.join(", ", submissionDataList);
		System.out.println("Dashboard submission list data details: " + "[ "+submissionDataString+" ]");
		System.out.println();
	}
	
	
	public void validatedashboardwinnerlistdata() throws InterruptedException
	{
		List<String> winnerlistdatalist = new ArrayList<>();
		
		for(WebElement winnerlistdata : dashboardwinnerlistdata)
		{
			Thread.sleep(2000);
			String listdata = winnerlistdata.getText();
			winnerlistdatalist.add(listdata);	
		}	
		
		String winnerDataString = String.join(", ", winnerlistdatalist);
		System.out.println("Dashboard winner list data details: " + "[ "+winnerDataString+" ]");
		System.out.println();
	}
	
	
	public void validatedashboardmemberlistdata() throws InterruptedException
	{
		List<String> memberlistdatalist = new ArrayList<>();
		
		for(WebElement memberlistdata : dashboardmemberlistdata)
		{
			Thread.sleep(2000);
			String listdata = memberlistdata.getText();
			memberlistdatalist.add(listdata);	
		}	
		
		String memberDataString = String.join(", ", memberlistdatalist);
		System.out.println("Dashboard member list data details: " + "[ "+memberDataString+" ]");
		System.out.println();
	}
	}

