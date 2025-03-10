package PageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Elementutil;

public class createannouncementpage {
	
	public WebDriver driver;
	public Elementutil elementutil;

	public createannouncementpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//span[.=' Announcements ']") private WebElement leftannouncementbutton;
	@FindBy(xpath = "//app-add-button[@mattooltip='Add Announcement']/button") private WebElement addannouncement;
	@FindBy(xpath = "(//div[.=' New Announcement ']/../../../following-sibling::div/div)[1]/div/mat-form-field/div/div/div/label/mat-label") private List<WebElement> fourvalidationlabelname;     
	@FindBy(xpath = "//input[@id='title']") private WebElement enterannouncementname;
	
	@FindBy(xpath = "//button[@aria-label='Open calendar']") private WebElement calenderdatebutton;
	@FindBy(xpath = "//tbody[@class='mat-calendar-body']/tr/td/button") private List<WebElement> calenderdaylist;
	
	@FindBy(xpath = "(//input[@placeholder='Link'])[1]") private WebElement enterlinkdataintotextfield1;
	@FindBy(xpath = "(//input[@placeholder='Link'])[2]") private WebElement enterlinkdataintotextfield2;
	
	@FindBy(xpath = "//textarea[@formcontrolname='details']") private WebElement enterdescriptiontextarea;
	@FindBy(xpath = "(//span[.='Create'])[2]/../..") private WebElement createbutton;
	@FindBy(xpath = "(((//div[.=' Announcement Details ']/../../../following-sibling::div/div)[1]/div)[1]/div)[2]/div") private List<WebElement> announcmentdetailsdata;
	
	// delete announcement xpath
	
	@FindBy(xpath = "//span[.=' Completed']/..") private List<WebElement> completdstatusannouncementlist;
	@FindBy(xpath = "//span[.='Not Started']") private WebElement completedstatus;
	
	@FindBy(xpath = "//span[.='On-going']/..") private List<WebElement> ongoingstatusannouncementlist;
	@FindBy(xpath = "//span[.='On-going']") private WebElement ongoingstatus;
	
	@FindBy(xpath = "//span[.='Not Started']/..") private List<WebElement> notstartedstatusannouncementlist;
	@FindBy(xpath = "//span[.='Not Started']") private WebElement notstartedstatus;
	
	@FindBy(xpath = "//div[@class='flex flex-auto items-center gap-2 sm:gap-6']//span[2]") private List<WebElement> announcementstatus;	
	@FindBy(xpath = "(//div[.='Announcements']/../../following-sibling::div)[1]/div/div/div/div/div[1]") private List<WebElement> listofannouncement;
	

	
	public void clicksidebarannouncementbutton()
	{
		if(leftannouncementbutton.isDisplayed() || leftannouncementbutton.isEnabled())
		{
			leftannouncementbutton.click();
		}
	}
	
	public void clickonaddannouncemnticon()
	{
		addannouncement.click();
	}
	
	public void selectdatefromcalender(String Expectedtext)
	{
		calenderdatebutton.click();
		for(WebElement daylist:calenderdaylist)
		{
			try {
				String daydata = daylist.getText();
				if(daydata.equalsIgnoreCase(Expectedtext))
				{
					daylist.click();
				}
			} catch (StaleElementReferenceException e) {
				System.out.print("");
			}	
		}
	}
	
	public void Enterdataintotextfield(String Labelname, String announcementname, String link1data, String link2data, String detailsdata)
	{
		for(WebElement validationlabelname:fourvalidationlabelname)
		{
			String labelnames = validationlabelname.getText();
//			System.out.println("List of Labelnames :"+ labelnames);
			
			switch (labelnames) {
			case "Title":
				if (announcementname != null) {
					enterannouncementname.sendKeys(announcementname);
				}
				break;

			case "Link 1":
				if (link1data != null) {
					enterlinkdataintotextfield1.sendKeys(link1data);
				}
				break;

			case "Link 2":
				if (link2data != null) {
					enterlinkdataintotextfield2.sendKeys(link2data);

				}
				break;

			case "Details":
				if (detailsdata != null) {
					enterdescriptiontextarea.sendKeys(detailsdata);
				}
				break;

		}
		}
	}
	
	public void clickoncreatebutton()
	{
		if(createbutton.isDisplayed() || createbutton.isEnabled())
		{
			createbutton.click();
		}
	}
	
	public void validateannouncementdetailspage() throws InterruptedException
	{
		for(WebElement validationdetails : announcmentdetailsdata)
		{
			Thread.sleep(2000);
			String detailsdata = validationdetails.getText();
			System.out.println("Announcement details data :"+ detailsdata);
		}
	}
	
	// -----------------delete announcement ---------------------------
	
	
	public void announcementstatusinalist()
	{
		for(int i = 0; i<announcementstatus.size(); i++)
		{
			String completedstatusname = announcementstatus.get(0).getText();
			System.out.println("completed status names :"+ completedstatusname);
		}
	}
	
	
	
	
	
	public void Ensureannouncementstatusinalist(String statusname) throws InterruptedException  
	{

		
		for(int i = 0; i<announcementstatus.size(); i++)
        {
            String completedstatusname = announcementstatus.get(i).getText();
            if(completedstatusname.equalsIgnoreCase(statusname) )
            {
                listofannououcementdata(i);
            }
            
        }
    }
    
    public void listofannououcementdata(int index) throws InterruptedException
    {
       
            
			listofannouncement.get(index/2).click();
    }
    
}
		
		
			
//			if(ongoingstatus.getText().equalsIgnoreCase(ongoing))
//			{
//				System.out.println("Ongoing name :"+ ongoingstatus.getText());
//				for(int i = 0; i<ongoingstatusannouncementlist.size(); i++)
//				{
//					String ongoingstatusname = ongoingstatusannouncementlist.get(i).getText();
//					System.out.println("ongoing status names :"+ ongoingstatusname);
//					ongoingstatusannouncementlist.get(i).click();
//					break;
//				}
//				
//				
//			} else if (notstartedstatus.getText().equalsIgnoreCase(notstarted))
//				{
//				System.out.println("notstarted name :"+ notstartedstatus.getText());
//				for(int i = 0; i<notstartedstatusannouncementlist.size(); i++)
//				{
//					String notstartedstatusname = notstartedstatusannouncementlist.get(i).getText();
//					System.out.println("not started status names :"+ notstartedstatusname);
//					notstartedstatusannouncementlist.get(i).click();
//					break;
//				}
//			} else {
//				
//				System.out.println("Donot required completed status list ");
//			}
//			
//		
//		
//	}
		
	
	


