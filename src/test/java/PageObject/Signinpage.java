package PageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;
import utils.Elementutil;

public class Signinpage {
	
	public WebDriver driver;
	public Elementutil elementutil;
	
	public Signinpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='email']") private WebElement emailaddress;
	@FindBy(xpath = "//mat-label[.='Email address']") private WebElement emailvalidation;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "// mat-label[.='Password'] ") private WebElement passwordvalidation;
	@FindBy(xpath = "//label[.=' Remember me ']") private WebElement remembermecheckbox;
	@FindBy(xpath = "//label[.=' Remember me '] ") private WebElement remembermevalidation;
	@FindBy(xpath = "//span[.=' Sign in ']/span") private WebElement signinbutton;
	@FindBy(xpath = "//span[.=' Sign in ']/span") private WebElement signinbuttonvalidation;
	
	@FindBy(xpath = "(//div[.='Hello, Admin'])[2]") private WebElement dashboardvalidation;
	@FindBy(xpath = "//div[contains(text(),'Welcome')]") private WebElement navigatevalidation;
	@FindBy(xpath = "(//div[.='Hello, Admin'])[1]") private WebElement helloadmintextvalidation;
	
	
	@FindBy(xpath = "//button[@mattooltip='My Profile']") private WebElement userprofileicon;
//	@FindBy(xpath = "//p[.=' admin@foundry.com ']") private WebElement useremailverification;
	@FindBy(xpath = "//span[@class='flex flex-col items-center justify-center leading-none']/p") private List<WebElement> useradmintext;
	@FindBy(xpath = "(//span[.='Sign out'])[2] ") private WebElement signoutbutton;
	@FindBy(xpath = "//div[.='Sign in']") private WebElement Signintext;

	
	// ERROR MESSAGES 
	
	@FindBy(xpath = "//div[contains(text(), 'Invalid')]") private WebElement invalidemailaddressandpassworderrormessage;
	

	String emaillabel = "Email address";
	public void validateemailaddresslabel() 
	{
		if(driver.getPageSource().contains(emaillabel))
		{
			System.out.println("EMAIL ADDRESS FIELD NAME :- "+emailvalidation.getText());
		}
	}
					
	public void Emailfield(String Mail)
	{				
		emailaddress.clear();			
		emailaddress.sendKeys(Mail);			
	}				
	
	String passwordlabel = "Password";
	public void validatepasswordlabel() 
	{
		if(driver.getPageSource().contains(passwordlabel))
		{
			System.out.println("PASSWROD FIELD LABEL NAME :- "+passwordvalidation.getText());
		}
		
	}
	
	public void Passwordfield(String Pass) 
	{				
		password.clear();			
		password.sendKeys(Pass);			
	}	
	
	String Expectedremembermelabel = "Remember me";
	public void validateremembermelabel() 
	{
		if(driver.getPageSource().contains(Expectedremembermelabel))
		{
			System.out.println("CHECK BOX NAME :- "+remembermevalidation.getText());
		}
	}
	
	public void rememberme() 
	{
		remembermecheckbox.click();
	}
	
	String Expectedsigninbuttonlabel = " Sign in ";
	public void validatesigninbuttonlabel() 
	{
		if(driver.getPageSource().contains(Expectedsigninbuttonlabel))
		{
			System.out.println("SIGN IN BUTTON NAME :- "+signinbuttonvalidation.getText());
			elementutil = new Elementutil(driver);
			elementutil.waitforvisibilityofelement(signinbutton, 10);
			System.out.println("Element Visibled");
			
		}	
	}
	
	public void SigninButton() {	
		elementutil = new Elementutil(driver);
		elementutil.waitforvisibilityofelement(signinbutton, 1);	
		signinbutton.click();		
	}
	
	public void invaliderrormessage() {
		invalidemailaddressandpassworderrormessage.getText();
	}
	
	public void invalidemailfield(String Mail) {				
		emailaddress.clear();			
		emailaddress.sendKeys(Mail);			
	}
	
	public void navigatevalidationdashboard() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display='block';",navigatevalidation);
		Thread.sleep(2000);
		String Expectedwelcometext = "Welcome! You have successfully logged into your account.";
		String Actualwelcometext = navigatevalidation.getText();
		if(Actualwelcometext.equals(Expectedwelcometext))
		{
			System.out.println("Welcome to Foundry :- "+navigatevalidation.getText());
		}		
	}
	
	public void dashboardtextvalidation()
	{
		String Expectedtext = "Hello, Admin";
		String admintext = helloadmintextvalidation.getText();
		if(admintext.equals(Expectedtext))
		{
			System.out.println("Dashboard Verified");
			System.out.println("HELLO, ADMIN: "+ admintext);
		} else 
		{
			System.out.println("Dashboard not verified");   
		}
	}
	
	public void clickonuserprofileicon() throws InterruptedException
	{
		Thread.sleep(6000);
		userprofileicon.click();
	}

	public void validationofuser() throws InterruptedException
	{		
		 for(WebElement admintextnames:useradmintext)
		 {
			 String txtnames = admintextnames.getText();
			 System.out.println("admin text names in profile :- "+txtnames);
		 }
	}
	
	public void clickonsignoutbutton(long durationInSeconds) 
	{
		elementutil.clickOnElement(signoutbutton, durationInSeconds);
	}
	
	public void validatesignInpageafterlogout()
	{
		String ExpectedsigninText = "Sign in";
		if(driver.getPageSource().contains(ExpectedsigninText))
		{
			System.out.println("Sign In page Verified Text name :- "+ Signintext.getText());
		}
	}
}
