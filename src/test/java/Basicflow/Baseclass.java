package Basicflow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import PageObject.Createincentivepage;
import PageObject.Signinpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Baseclass {
	
	public static WebDriver driver;
	public Signinpage signin;
	public Createincentivepage createincentive;
	
//	@Before
	public void InitialiseBrowser(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome")) 
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--start-maximized");
			driver = new ChromeDriver(option);
			
		} else if(BrowserName.equalsIgnoreCase("firefox")) 
		{
			FirefoxOptions option2 = new FirefoxOptions();
			option2.addArguments("-safe-mode");
			driver = new FirefoxDriver(option2);
			
		} else if(BrowserName.equalsIgnoreCase("edge"))
		{
			 EdgeOptions option3 = new EdgeOptions();
			 option3.addArguments("--start-maximized");
			 driver = new EdgeDriver(option3);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		}
	
//	@After
	public void TearDown() {
		driver.quit();
	}

}
