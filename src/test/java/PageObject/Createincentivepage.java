package PageObject;

import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Elementutil;

public class Createincentivepage {
	
	public WebDriver driver;
	public Elementutil elementutil;
	
	public Createincentivepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.=' Incentives ']") private WebElement leftnavigationIncentivebutton;
	
	@FindBy(xpath = "//app-add-button[@mattooltip='Add Incentive']/button") private WebElement createincentiveplusbutton;
	
	// common xpath for text field label identification
	@FindBy(xpath = "//mat-form-field/div/div/div/label/mat-label") private List<WebElement> Alllabelvalidation;
	@FindBy(xpath = "//div[.='Add an Image']") private WebElement addimagelabelvalidation;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='mini_club'] ") private WebElement clickonminiclubdropdown;
	@FindBy(xpath = "//div[@role='listbox']/div/mat-option") private List<WebElement> miniclubdropdownoptionlist;
	
	@FindBy(xpath = "//input[@placeholder='Enter title']") private WebElement Enterincentivenameintotextfield;
	
	@FindBy(xpath = "//button[@aria-label='Open calendar']") private WebElement calenderstartandenddatebutton;
	@FindBy(xpath = "//button[@aria-label='Choose month and year'] ") private WebElement clickonmonthandyearcombined;
	@FindBy(xpath = "(//tbody[@class='mat-calendar-body']/tr)//td/button") private List<WebElement> calenderyearlist;
	@FindBy(xpath = "(//tbody[@class='mat-calendar-body']/tr)//td/button") private List<WebElement> calendremonthlist;
	@FindBy(xpath = "//tbody[@class='mat-calendar-body']/tr/td/button") private List<WebElement> calenderdaylist;
	
	@FindBy(xpath = "//p[.='Upload an Image']") private WebElement uploadanimage;
	@FindBy(xpath = "//input[@formcontrolname='max_submissions']") private WebElement maxsubmissiontextfield;
	@FindBy(xpath = "//input[@formcontrolname='eligible_winners']") private WebElement eligiblewinnertextfield;
	@FindBy(xpath = "//input[@formcontrolname='winner_title']") private WebElement winnertitletextfield;
	
	@FindBy(xpath = "(//mat-select[@role='combobox'])[2]") private WebElement clickoncountrydropdown;
	@FindBy(xpath = "//div[@role='listbox']/mat-option") private List<WebElement> countrycurrencydropdownlist;
	
	@FindBy(xpath = "//input[@formcontrolname='winner_amount']") private WebElement winneramounttextfield;
	@FindBy(xpath = "//button[@mattooltip='Add Winner']") private WebElement addwinnerbutton;
	
	@FindBy(xpath = "//input[@formcontrolname='link']") private WebElement linktextfield;
	@FindBy(xpath = "//textarea[@formcontrolname='details']") private WebElement Enterincentivedetailstextdata;
	@FindBy(xpath = "(//span[.='Create'])[2]") private WebElement createbutton;
	@FindBy(xpath = "//div[.=' Offer New Incentive ']") private WebElement newincentivename;
	@FindBy(xpath = "//div[.='Incentive Details']") private WebElement validateincentivedetailname;
	@FindBy(xpath = "(//router-outlet[@class='ng-star-inserted']/..//preceding-sibling::div[2])[2]") private WebElement validateincentivedetailsdata;
	
	
	public void LeftnvigationIncentiveButton(int durationInSeconds)
	{
		elementutil = new Elementutil(driver);
		elementutil.clickOnElement(leftnavigationIncentivebutton, durationInSeconds);
		leftnavigationIncentivebutton.click();
	}
	
	public void clickonincentiveaddbutton() 
	{
		createincentiveplusbutton.click();
	}
	
	public void Allcomponenttextfieldlabelnamevalidationandaction(String labelname, String Incentivename, String maxsubmissionnumber, String eligiblewinnernumber,
			String winner1title, String winneramount, String link, String incentivedetails)
	{
		for(WebElement Alllabelnamelist:Alllabelvalidation)
		{
			 String fetchlabelnames = Alllabelnamelist.getText();
			 if(fetchlabelnames.equalsIgnoreCase(labelname))
			 {
				 Enterincentivenameintotextfield.sendKeys(Incentivename);
				 
			 }else if(fetchlabelnames.equalsIgnoreCase(labelname))
			 {
				 maxsubmissiontextfield.sendKeys(maxsubmissionnumber);
				 
			 } else if(fetchlabelnames.equalsIgnoreCase(labelname))
			 {
				 eligiblewinnertextfield.sendKeys(eligiblewinnernumber);
				 
			 } else if(fetchlabelnames.equalsIgnoreCase(labelname))
			 {
				 winnertitletextfield.sendKeys(winner1title);
				 
			 } else if(fetchlabelnames.equalsIgnoreCase(labelname))
			 {
				 winneramounttextfield.sendKeys(winneramount);
				 
			 } else if(fetchlabelnames.equalsIgnoreCase(labelname))
			 {
				 linktextfield.sendKeys(link);
				 
			 } else if(fetchlabelnames.equalsIgnoreCase(labelname))
			 {
				 Enterincentivedetailstextdata.sendKeys(incentivedetails);
				 
			 }
		}
	}
	
	public void Dropdownlabelnamevalidationandaction(String labelname, String optionname) throws InterruptedException
	{
		for(WebElement Alllabelnamelist:Alllabelvalidation)
		{
			 String fetchlabelnamelist = Alllabelnamelist.getText();
			 if(fetchlabelnamelist.equalsIgnoreCase(labelname))
			 {
				 clickonminiclubdropdown.click();
				 for(WebElement miniclubdropdownoption : miniclubdropdownoptionlist)
				 {
					 try {
						 String minicluboptionnamelist = miniclubdropdownoption.getText();
						 System.out.println("List of mini club Names :- "+minicluboptionnamelist);
						 if(minicluboptionnamelist.equalsIgnoreCase(optionname))
						 {
							 miniclubdropdownoption.click();
						 }
					} catch (StaleElementReferenceException e) {
						String minicluboptionnamelist = miniclubdropdownoption.getText();
						System.out.println("List of mini club Names :- "+minicluboptionnamelist);
					}
				 }
			 } else 
			 {
				 clickoncountrydropdown.click();
				 for(WebElement countrydropdownoption : countrycurrencydropdownlist)
				 {
					 String countryoptionnamelist = countrydropdownoption.getText();
					 System.out.println("List of country name :- "+countryoptionnamelist);
					 if(countryoptionnamelist.equalsIgnoreCase(optionname))
					 {
						 countrydropdownoption.click();
					 }
				 }
			 }
		}
	}
	
	String addanimagelabel = "Add an Image";
	public void addimagelabelvalidationandaction()
	{
		 if(driver.getPageSource().contains(addanimagelabel))
		 {
			 System.out.println("Name of the Label: "+ addimagelabelvalidation.getText());
			 uploadanimage.sendKeys("/home/active34/Downloads/photos /A16Z crypto.jpeg");
		 }
	}
	
	
//	public void startandenddatevalidationandaction(String labelname)
//	{
//		for(WebElement Alllabelnamelist:Alllabelvalidation)
//		{
//			 String fetchlabelnamelist = Alllabelnamelist.getText();
//			 if(fetchlabelnamelist.equalsIgnoreCase(labelname))
//			 {
//				 
//			 }
//	}
//}
	
	public void validatecreatebuttonandaction(long durationInSeconds)
	{
		elementutil.waitforvisibilityofelement(createbutton, durationInSeconds);
		System.out.println("create button is visibled");
		createbutton.click();
	}
	
	public void validatethecreatedincentivedata()
	{
		String Incentivedetails = validateincentivedetailsdata.getText();
		System.out.println(Incentivedetails);
	}
	
	public void validateincentivedetailstextnameindetailspage() 
	{
		String Incentivename = validateincentivedetailname.getText();
		System.out.println(Incentivename);
	}
}


