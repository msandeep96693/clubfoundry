package PageObject;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(xpath = "(((//div[.=' Announcement Details ']/../../../following-sibling::div/div)[1]/div)[2]/div/button)[2]/svg-icon") private WebElement deletebutton;
	@FindBy(xpath = "(((//div[.=' Announcement Details ']/../../../following-sibling::div/div)[1]/div)[2]/div//button)[2]") private WebElement completeddeletebutton;
	@FindBy(xpath = "((//div[.=' Announcement Details ']/../../../following-sibling::div/div)[1]/div)[2]/div") private List<WebElement> ongoingnotstartedcomponent;
	
	@FindBy(xpath = "//span[.='Yes']/..") private WebElement deletepopupyesbutton;
	@FindBy(xpath = "//div[text()='Announcement deleted successfully.']") private WebElement deleteconfirmationmessage;
	
	@FindBy(xpath = "//div[@class='ng-star-inserted']//div/div/div") private List<WebElement> listofannoouncementdata;
	
	
	// update announcement xpath
	
	@FindBy(xpath = "(//button)[6]") private WebElement updatebutton;
	@FindBy(xpath = "//div[text()='Announcement updated successfully.']") private WebElement updateconfirmationmessage;
	
	
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
	
	public void Ensureannouncementstatusinalist(String statusname) throws InterruptedException  
	{
		String sendingdata = null;
		int[] targetIndices = {2, 6, 10}; // 2nd, 6th, and 10th (Zero-based index)

	            // Iterate through the selected indices and print the addresses
	            for (int index : targetIndices)
	            {
	                if (index < listofannoouncementdata.size())
	                { // Ensure the index is within the list range
//	                    System.out.println("Address " + (index + 1) + ": " + listofannoouncementdata.get(index).getText());
	                    Thread.sleep(2000);
	                    if(listofannoouncementdata.get(index).getText().contains(statusname)) // "Not Started"
	                    {
//	                    	Thread.sleep(3000);
	                    	sendingdata = listofannoouncementdata.get(index).getText();
	                    	System.out.println("sending data :-"+sendingdata);
	                    	listofannoouncementdata.get(index).click();
	                    	break;	
	                    }
	                }
	            }
	            
	            // delete button functionality 
	            if(sendingdata.contains("On-going")) 
	            {
            		deletebutton.click();
            	} else if (sendingdata.contains("Not Started"))
            	{
            		deletebutton.click();
            	} else if (sendingdata.contains("Completed")) {
            		completeddeletebutton.click();
            		
            	}
	}
	
   public void deleteannouncementpopup()
   {
	   deletepopupyesbutton.click();
   }
    
   public void getdeleteconfirmationmessage()
   {
	  String deletemessage = deleteconfirmationmessage.getText();
	  System.out.println(" Delete announcement confirmation message :"+deletemessage); 
	  
	  Assert.assertEquals(deletemessage, "Announcement deleted successfully.");
   }
   
   
   // --------------------------- update announcement methods ---------------------
   
   public void selectandclickanyannouncementlist(String statusname) throws InterruptedException
   {
	   int[] targetIndices = {2, 6, 10}; // 2nd, 6th, and 10th (Zero-based index)

       // Iterate through the selected indices and print the addresses
       for (int index : targetIndices)
       {
           if (index < listofannoouncementdata.size())
           { // Ensure the index is within the list range
//               System.out.println("Address " + (index + 1) + ": " + listofannoouncementdata.get(index).getText());
               Thread.sleep(2000);
               if(listofannoouncementdata.get(index).getText().contains(statusname)) // "Not Started"
               {
               	String sendingdata = listofannoouncementdata.get(index).getText();
               	System.out.println("sending data :-"+sendingdata);
               	listofannoouncementdata.get(index).click();
               	break;	
               }
           }
       }
   }
   
   
   
   public void clickonupdatebutton()
   {
	   updatebutton.click();
   }
   
   public String getupdateconfirmationmessage()
   {
	  return updateconfirmationmessage.getText();  
   }
   
}
	


