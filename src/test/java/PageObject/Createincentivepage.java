package PageObject;

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

//	@FindBy(xpath = "") private
}
