package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Elementutil;

public class Createminiclubpage {
	
	public WebDriver driver;
	public Elementutil elementutil;
	
	public Createminiclubpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//span[.=' Mini Clubs ']") private WebElement leftnavigationminiclubbutton;
	@FindBy(xpath = "(//div[.='Mini Clubs']/../following-sibling::div/div)[1]/div/div/div") private List<WebElement> miniclubvalidationlistdata;
	
	@FindBy(xpath = "//app-add-button[@mattooltip='Create Club']/button") private WebElement miniclubcreatebutton;
	
	@FindBy(xpath = "//mat-form-field/div/div/div/label") private List<WebElement> Allvalidationoflabelname;
	@FindBy(xpath = "//mat-select[@role='combobox']") private List<WebElement> clickondropdowncomponent;
	@FindBy(xpath = "//div[@role='listbox']/mat-option/span") private List<WebElement> dropdownoptionlist;
	@FindBy(xpath = "//div[@role='listbox']/div/mat-option/span") private List<WebElement> clubtagdropdownoptionlist;
	
	@FindBy(xpath = "//input[@id='name']") private WebElement Enterminiclubnameintotextfield;
	@FindBy(xpath = "//div[.='Club Profile Picture']") private WebElement clubprofilelabelname;
	@FindBy(xpath = "//p[.='Upload an Image']") private WebElement uploadanimage;
	
	@FindBy(xpath = "//textarea[@formcontrolname='description']") private WebElement clubdescription;
	@FindBy(xpath = "(//span[.='Create'])[2]") private WebElement createbutton;
	
	@FindBy(xpath = "(((//div[.='Club Details']/../../..//following-sibling::div)[2]/div)[1]/div/div/div)[2]") private List<WebElement> newlycreatedclubdetails;
	
	
	
	String miniclubname = " Mini Clubs ";
	public void clickonleftnavigationbutton() throws InterruptedException
	{
		if(driver.getPageSource().contains(miniclubname))
		{
			Thread.sleep(1000);
			leftnavigationminiclubbutton.click();
		}
	}
	
	public void fetchthelistofminiclubdata()
	{
		for( WebElement miniclublistdata : miniclubvalidationlistdata)
		{
			String validationlistdata = miniclublistdata.getText();
			System.out.println("List of mini club :- "+ validationlistdata);
		}
	}

	public void clickonminiclubbutton()
	{
		miniclubcreatebutton.click();
	}
	
	public void enterthedataintominiclubtextfield(String Inputdata)
	{
		Enterminiclubnameintotextfield.sendKeys(Inputdata);
	}
	
	public void clickondropdown(String Labelname) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        for (int i = 0; i < Allvalidationoflabelname.size(); i++) {
//        	System.out.println("Allvalidationoflabelname.size :- "+ Allvalidationoflabelname.size());
            String fetchedLabel = Allvalidationoflabelname.get(i).getText();
            System.out.println("Label Found: " + fetchedLabel);
            
            if(fetchedLabel.equalsIgnoreCase(Labelname))
            {
            	System.out.println("Matching Label: " + Labelname);
            	
            	
//            		System.out.println("clickondropdowncomponent.size :- "+ clickondropdowncomponent.size());
            		WebElement dropdown = clickondropdowncomponent.get(i-1);
            		wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
//                    System.out.println("Clicked on dropdown for: " + Labelname);
            	
                break;  // Exit loop after clicking the correct dropdown
            } 
        }
	}
	
	public void selectoptionfromdropdown()
	{
		for(int i = 0; i < dropdownoptionlist.size(); i++)
		{
			try {
				dropdownoptionlist.get(0).click();
			} catch (StaleElementReferenceException e) {
				System.out.println("select option from dropdown");
			}
			
		}
	}		
	
	public void clubtagdropdownaction() throws AWTException
	{
		for(int i = 0; i< clubtagdropdownoptionlist.size(); i++)
		{
//			clubtagdropdownoptionlist.get(1).click();
			clubtagdropdownoptionlist.get(i).click();
		}
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
	}
	
	public void moderatorandmemberdropdownaction() throws AWTException
	{
		for(int i = 0; i < dropdownoptionlist.size(); i++)
		{
			dropdownoptionlist.get(i).click();
		}
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}
	
	public void clubdescriptiontextarea(String clubdescriptiondata)
	{
		clubdescription.sendKeys(clubdescriptiondata);
	}
	
	public void clickoncreatebutton()
	{
		if(createbutton.isDisplayed() || createbutton.isEnabled())
		{
			createbutton.click();
		}	
	}
	
	public void successfullyminiclubcreated()
	{
		System.out.println("successfully mini club created");	
	}
	
	public void miniclubdetailsvalidation()
	{
		for(WebElement createdclubdetails:newlycreatedclubdetails)
		{
			String clubdetails = createdclubdetails.getText();
			System.out.println("Club Details :"+ clubdetails);
		}
	}
}
