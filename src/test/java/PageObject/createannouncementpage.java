package PageObject;

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
	
	
}
