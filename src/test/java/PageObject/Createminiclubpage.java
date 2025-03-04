package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//input[@id='name']") private WebElement Enterminiclubnameintotextfield;
	@FindBy(xpath = "//div[.='Club Profile Picture']") private WebElement clubprofilelabelname;
	@FindBy(xpath = "//p[.='Upload an Image']") private WebElement uploadanimage;
	
	@FindBy(xpath = "//textarea[@formcontrolname='description']") private WebElement clubdescription;
	@FindBy(xpath = "(//span[.='Create'])[2]") private WebElement createbutton;
	
	
	
	String miniclubname = " Mini Clubs ";
	public void clickonleftnavigationbutton()
	{
		if(driver.getPageSource().contains(miniclubname))
		{
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
	
	
}
