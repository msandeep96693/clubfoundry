package PageObject;

import org.openqa.selenium.WebDriver;
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

//	@FindBy(xpath = "") private

}
