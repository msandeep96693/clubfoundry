package utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementutil {

	public WebDriver driver;
	
	public Elementutil(WebDriver driver) 
	{
		this.driver = driver;	
	}

	public WebElement waitForElement(WebElement element, long durationInSeconds) {

		WebElement webelement;

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
		webelement = wait.until(ExpectedConditions.elementToBeClickable(element));

		return webelement;
	}

	public void clickOnElement(WebElement element, long durationInSeconds) {
		WebElement clickonelement = waitForElement(element, durationInSeconds);
		clickonelement.click();
	}

	public void javascriptbyscrollbar(WebElement element, long durationInseconds) {
		JavascriptExecutor scrollbar = (JavascriptExecutor) driver;
		scrollbar.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void javascriptbyscrollbar1(List<WebElement> element, long durationInseconds) {
		JavascriptExecutor scrollbar = (JavascriptExecutor) driver;
		scrollbar.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void waitforvisibilityofelement(WebElement element1, long durationInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
		wait.until(ExpectedConditions.visibilityOf(element1));
	}
	
	
	
}
