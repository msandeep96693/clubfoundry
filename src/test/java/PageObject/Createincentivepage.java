package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Elementutil;

public class Createincentivepage {

	public WebDriver driver;
	public Elementutil elementutil;

	public Createincentivepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.=' Incentives ']")
	private WebElement leftnavigationIncentivebutton;

	@FindBy(xpath = "//app-add-button[@mattooltip='Add Incentive']/button")
	private WebElement createincentiveplusbutton;

	// common xpath for text field label identification
	@FindBy(xpath = "//mat-form-field/div/div/div/label/mat-label")
	private List<WebElement> Alllabelvalidation;
	@FindBy(xpath = "//div[.='Add an Image']")
	private WebElement addimagelabelvalidation;

	@FindBy(xpath = "//mat-select[@formcontrolname='mini_club'] ")
	private WebElement clickonminiclubdropdown;
	@FindBy(xpath = "//div[@role='listbox']/div/mat-option")
	private List<WebElement> miniclubdropdownoptionlist;

	@FindBy(xpath = "//input[@placeholder='Enter title']")
	private WebElement Enterincentivenameintotextfield;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	private List<WebElement> calenderstartandenddatebutton;
	@FindBy(xpath = "//button[@aria-label='Choose month and year']")
	private WebElement clickonmonthandyearcombined;

	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[1]")
	private WebElement calenderstartandenddatebutton1;
	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[2]")
	private WebElement calenderstartandenddatebutton2;

	@FindBy(xpath = "(//tbody[@class='mat-calendar-body']/tr)//td/button")
	private List<WebElement> calenderyearlist;
	@FindBy(xpath = "(//tbody[@class='mat-calendar-body']/tr)//td/button")
	private List<WebElement> calendremonthlist;
	@FindBy(xpath = "//tbody[@class='mat-calendar-body']/tr/td/button")
	private List<WebElement> calenderdaylist;

	@FindBy(xpath = "//div[@class='flex flex-col items-center ng-star-inserted']")	
	private WebElement uploadanimage;
	@FindBy(xpath = "//input[@placeholder='Max. submissions']")
	private WebElement maxsubmissiontextfield;
	@FindBy(xpath = "//input[@placeholder='Eligible winners']")
	private WebElement eligiblewinnertextfield;
	@FindBy(xpath = "//input[@formcontrolname='winner_title']")
	private WebElement winnertitletextfield;

	@FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
	private WebElement clickoncountrydropdown;
	@FindBy(xpath = "//div[@role='listbox']/mat-option")
	private List<WebElement> countrycurrencydropdownlist;

	@FindBy(xpath = "//input[@formcontrolname='winner_amount']")
	private WebElement winneramounttextfield;
	@FindBy(xpath = "//button[@mattooltip='Add Winner']")
	private WebElement addwinnerbutton;

	@FindBy(xpath = "//input[@formcontrolname='link']")
	private WebElement linktextfield;
	@FindBy(xpath = "//textarea[@formcontrolname='details']")
	private WebElement Enterincentivedetailstextdata;
	@FindBy(xpath = "(//span[.='Create'])[2]")
	private WebElement createbutton;
	@FindBy(xpath = "//div[.=' Offer New Incentive ']")
	private WebElement newincentivename;
	@FindBy(xpath = "//div[.='Incentive Details']")
	private WebElement validateincentivedetailname;
	@FindBy(xpath = "((//router-outlet[@class='ng-star-inserted']/..//preceding-sibling::div[2])[2]/div)[1]/div/div/div[2]/div/div")
	private List<WebElement> validateincentivedetailsdata;

	public void LeftnvigationIncentiveButton(int durationInSeconds) {
		elementutil = new Elementutil(driver);
		elementutil.clickOnElement(leftnavigationIncentivebutton, durationInSeconds);
		leftnavigationIncentivebutton.click();
	}

	public void clickonincentiveaddbutton() {
		createincentiveplusbutton.click();
	}

	public void Allcomponenttextfieldlabelnamevalidationandaction(String labelName, String incentiveName,
			String maxSubmissionNumber, String eligibleWinnerNumber, String winner1Title, String winnerAmount,
			String link, String incentiveDetails) {

		for (WebElement allLabelNameList : Alllabelvalidation) {
			String fetchLabelNames = allLabelNameList.getText(); 
			
			switch (fetchLabelNames) {
			case "Title":
				if (incentiveName != null) {
					Enterincentivenameintotextfield.sendKeys(incentiveName);
				}
				break;

			case "Max Submission":
				if (maxSubmissionNumber != null) {
					maxsubmissiontextfield.sendKeys(maxSubmissionNumber);
				}
				break;

			case "Eligible Winner":
				if (eligibleWinnerNumber != null) {
					eligiblewinnertextfield.sendKeys(eligibleWinnerNumber);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;

			case "Winner 1 Title":
				if (winner1Title != null) {
					winnertitletextfield.sendKeys(winner1Title);
				}
				break;

			case "Winner 1 Amount":
				if (winnerAmount != null) {
					winneramounttextfield.sendKeys(winnerAmount);
				}
				break;

			case "Link 1":
				if (link != null) {
					linktextfield.sendKeys(link);
				}
				break;

			case "Incentive Details":
				if (incentiveDetails != null) {
					Enterincentivedetailstextdata.sendKeys(incentiveDetails);
				}
				break;

			default:
				System.out.println("No matching label found for: " + fetchLabelNames);
				break;
			}
		}
	}

	public void Dropdownlabelnamevalidationandaction(String labelname, String optionname) throws InterruptedException {
//		System.out.println("LENGTHE SIZE :- "+Alllabelvalidation.size());
		for (WebElement Alllabelnamelist : Alllabelvalidation) {
//			System.out.println("webelement :------"+Alllabelnamelist.getText());

			String fetchlabelnamelist = Alllabelnamelist.getText();
			System.out.println(
					"fetchlabelname list DROPDOWN:- " + fetchlabelnamelist + " condition labelname:- " + labelname);

			if (fetchlabelnamelist.equalsIgnoreCase(labelname)) {
//				 System.out.println("EXECUTE --------------------");
				Thread.sleep(2000);
				clickonminiclubdropdown.click();
				for (WebElement miniclubdropdownoption : miniclubdropdownoptionlist) {
					try {
						String minicluboptionnamelist = miniclubdropdownoption.getText();
//						 System.out.println("List of mini club Names :- "+minicluboptionnamelist);
						if (minicluboptionnamelist.equalsIgnoreCase(optionname)) {
							Thread.sleep(2000);
							miniclubdropdownoption.click();
							break;
						}
					} catch (StaleElementReferenceException e) {

						System.out.println("StaleElementReferenceException");
					}

				}
				break;
			} else {
				if (fetchlabelnamelist.equalsIgnoreCase(labelname)) {
					System.out.println("TEST 2 ----------------");
					Thread.sleep(2000);
					clickoncountrydropdown.click();
					for (WebElement countrydropdownoption : countrycurrencydropdownlist) {
						String countryoptionnamelist = countrydropdownoption.getText();
//						 System.out.println("List of country name :- "+countryoptionnamelist);
						if (countryoptionnamelist.equalsIgnoreCase(optionname)) {
							Thread.sleep(2000);
							countrydropdownoption.click();

							break;

						}
					}
				}
			}
			break;
		}

	}

	String addanimagelabel = "Add an Image";

	public void addimagelabelvalidationandaction() throws InterruptedException, AWTException {
		if (driver.getPageSource().contains(addanimagelabel)) {
			System.out.println("Name of the Label: " + addimagelabelvalidation.getText());

//			 WebElement addanimagetext = driver.findElement(By.xpath("//div[.='Add an Image']"));
//			 JavascriptExecutor js = (JavascriptExecutor) driver;
////		 js.executeScript("arguments[0].scrollIntoView(true);", addanimagetext);
//			 js.executeScript("arguments[0].style.display='block';", uploadanimage);
//			 uploadanimage.sendKeys("/home/active34/Downloads/photos/A16Z crypto.jpeg");
			
			
		}
	}
	
	public void clickFirstButton() {
        if (calenderstartandenddatebutton.size() > 0) {
        	calenderstartandenddatebutton.get(0).click();
            System.out.println("Clicked First Button");
        } else {
            System.err.println("No buttons found!");
        }
    }
	
	public void clickSecondButton() {
        if (calenderstartandenddatebutton.size() > 1) {
            calenderstartandenddatebutton.get(1).click();
            System.out.println("Clicked Second Button");
        } else {
            System.err.println("Second button not found!");
        }
    }
	
	public void clickdaylistdata(String Expectedtext) throws InterruptedException
	{
		
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
	
	public void validatecreatebuttonandaction() 
	{
		createbutton.click();
	}

	public void validatethecreatedincentivedata() 
	{
		for(WebElement Incentivedetails : validateincentivedetailsdata)
		{
			String Incentivedetail = Incentivedetails.getText();
			System.out.println("Incentivedetails :- " + Incentivedetail);
		}
		
	}

	public void validateincentivedetailstextnameindetailspage() 
	{
		String Incentivename = validateincentivedetailname.getText();
		System.out.println("Incentivename :- " + Incentivename);
	}
}
