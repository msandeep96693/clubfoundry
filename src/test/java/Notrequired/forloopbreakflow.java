package Notrequired;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Elementutil;

public class forloopbreakflow {
	
	public WebDriver driver;
	public Elementutil elementutil;
	
	public forloopbreakflow(WebDriver driver)
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
	
	@FindBy(xpath = "//button[@aria-label='Open calendar']") private List<WebElement> calenderstartandenddatebutton;
	@FindBy(xpath = "//button[@aria-label='Choose month and year']") private WebElement clickonmonthandyearcombined;
	
	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[1]") private WebElement calenderstartandenddatebutton1;
	@FindBy(xpath = "(//button[@aria-label='Open calendar'])[2]") private WebElement calenderstartandenddatebutton2;
	
	@FindBy(xpath = "(//tbody[@class='mat-calendar-body']/tr)//td/button") private List<WebElement> calenderyearlist;
	@FindBy(xpath = "(//tbody[@class='mat-calendar-body']/tr)//td/button") private List<WebElement> calendremonthlist;
	@FindBy(xpath = "//tbody[@class='mat-calendar-body']/tr/td/button") private List<WebElement> calenderdaylist;
	
	@FindBy(xpath = "//p[.='Upload an Image']") private WebElement uploadanimage;
	@FindBy(xpath = "//input[@placeholder='Max. submissions']") private WebElement maxsubmissiontextfield;
	@FindBy(xpath = "//input[@placeholder='Eligible winners']") private WebElement eligiblewinnertextfield;
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
		
	
	public void Allcomponenttextfieldlabelnamevalidationandaction(
	        String labelName, String incentiveName, String maxSubmissionNumber, String eligibleWinnerNumber,
	        String winner1Title, String winnerAmount, String link, String incentiveDetails) {
	    
	    for (WebElement allLabelNameList : Alllabelvalidation) {
	        String fetchLabelNames = allLabelNameList.getText(); // Convert text to lowercase
	        
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

	
	
	public void Dropdownlabelnamevalidationandaction(String labelname, String optionname) throws InterruptedException
	{
//		System.out.println("LENGTHE SIZE :- "+Alllabelvalidation.size());
		for(WebElement Alllabelnamelist:Alllabelvalidation)
		{
//			System.out.println("webelement :------"+Alllabelnamelist.getText());
			
			 String fetchlabelnamelist = Alllabelnamelist.getText();
			 System.out.println("fetchlabelname list DROPDOWN:- "+fetchlabelnamelist +" condition labelname:- "+labelname);

			 if(fetchlabelnamelist.equalsIgnoreCase(labelname))
			 {
//				 System.out.println("EXECUTE --------------------");
				 Thread.sleep(2000);
				 clickonminiclubdropdown.click();
				 for(WebElement miniclubdropdownoption : miniclubdropdownoptionlist)
				 {
					 try {
						 String minicluboptionnamelist = miniclubdropdownoption.getText();
//						 System.out.println("List of mini club Names :- "+minicluboptionnamelist);
						 if(minicluboptionnamelist.equalsIgnoreCase(optionname))
						 {
							 Thread.sleep(2000);
							 miniclubdropdownoption.click();
							 break;
						 }
					} catch (StaleElementReferenceException e) {
						
						System.out.println("StaleElementReferenceException");
					}
					 
				 }
				 break;
			 } 
			 else {
				 if(fetchlabelnamelist.equalsIgnoreCase(labelname))
				 {
					 System.out.println("TEST 2 ----------------");
					 Thread.sleep(2000);
					 clickoncountrydropdown.click();
					 for(WebElement countrydropdownoption : countrycurrencydropdownlist)
					 {
						 String countryoptionnamelist = countrydropdownoption.getText();
//						 System.out.println("List of country name :- "+countryoptionnamelist);
						 if(countryoptionnamelist.equalsIgnoreCase(optionname))
						 {
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
	public void addimagelabelvalidationandaction() 
	{
		 if(driver.getPageSource().contains(addanimagelabel))
		 {
			 System.out.println("Name of the Label: "+ addimagelabelvalidation.getText());
			
//			 WebElement addanimagetext = driver.findElement(By.xpath("//div[.='Add an Image']"));
//			 JavascriptExecutor js = (JavascriptExecutor) driver;
//			 js.executeScript("arguments[0].scrollIntoView(true);", addanimagetext);
//			 js.executeScript("arguments[0].style.display='block';", uploadanimage);
//			 js.executeScript("arguments[0].setAttribute('style', 'visibility:visible; opacity:1;');", uploadanimage);
//			 js.executeScript("arguments[0].removeAttribute('onchange');", uploadanimage);
//			 uploadanimage.sendKeys("/home/active34/Downloads/photos/A16Z crypto.jpeg");
//			 js.executeScript("arguments[0].dispatchEvent(new Event('change', { bubbles: true }));", uploadanimage);
			 
//			 JavascriptExecutor js = (JavascriptExecutor) driver;
//			 WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']/../div/p/preceding-sibling::input[@type='file']"));
//			 js.executeScript("arguments[0].style.display='block'; arguments[0].style.visibility='visible';", uploadInput);
//			 uploadInput.sendKeys("/home/active34/Downloads/photos/A16Z_crypto.jpeg");
//			 System.out.println("File uploaded successfully!");
			 
			 
//			 StringSelection filePath = new StringSelection("/home/active34/Downloads/photos/A16Z crypto.jpeg"); // Change file path
//		        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
//
//		        // Use Robot class to paste the file path and press Enter
//		        Robot robot = new Robot();
//
//		        // Press CTRL + V (paste)
//		        robot.keyPress(KeyEvent.VK_CONTROL);
//		        robot.keyPress(KeyEvent.VK_V);
//		        robot.keyRelease(KeyEvent.VK_V);
//		        robot.keyRelease(KeyEvent.VK_CONTROL);
//
//		        // Press Enter to upload
//		        robot.keyPress(KeyEvent.VK_ENTER);
//		        robot.keyRelease(KeyEvent.VK_ENTER);
//
//		        System.out.println("File uploaded successfully!");

		 }
	}
	
	
//	public void startandenddatevalidationandaction(String labelname, String datenumber) throws InterruptedException
//	{
//		for(WebElement Alllabelnamelist:Alllabelvalidation)
//			{
//				 String fetchlabelnamelist = Alllabelnamelist.getText();
//				 System.out.println("input data :-" +labelname);
//				 System.out.println("fetchlabelname list :- "+fetchlabelnamelist +" condition labelname:- "+labelname);
//
//				 if(fetchlabelnamelist.equalsIgnoreCase(labelname))
//				 { 
//					 calenderstartandenddatebutton1.click();
//					 for(WebElement daylist : calenderdaylist)
//							{
//								String monthtext = daylist.getText();
//								if(monthtext.equalsIgnoreCase(datenumber))
//								{	
//									Thread.sleep(2000);
//									daylist.click();
//									break;	
//								}
//							}
//					 break;
//				 } 
//				
//			}
//	}
//		for(WebElement Alllabelnamelist:Alllabelvalidation)
//			{
//				 String fetchlabelnamelist = Alllabelnamelist.getText();
//				 System.out.println();
//				 System.out.println("fetchlabelname list :- "+fetchlabelnamelist +" condition labelname:- "+labelname);
//
//				 if(fetchlabelnamelist.equalsIgnoreCase(labelname))
//				 {	
//					 System.out.println("condition Okay :- "+fetchlabelnamelist);
//					 for(WebElement calenderbutton:calenderstartandenddatebutton)
//					 {
//						 System.out.println("calenderbutton click "+calenderbutton);
//
//						 calenderbutton.click();
//						 
//						 for(WebElement daylist : calenderdaylist)
//							{
//								String monthtext = daylist.getText();
//								if(monthtext.equalsIgnoreCase(datenumber))
//								{	
//									Thread.sleep(2000);
//									daylist.click();
//									
//									break;	
//								} 
////								break;
//							}
//						 break;
//					 }
//					 
//				 }
////				 break;
//			}
	
	
	public void startandenddatevalidationandaction(String labelname, String monthyeartextname, String yeartextname,
			String monthtextname, String daytextname)
	{
		for(WebElement Alllabelnamelist:Alllabelvalidation)
		{
			 String fetchlabelnamelist = Alllabelnamelist.getText();
			 if(fetchlabelnamelist.equalsIgnoreCase(labelname))
			 { 
				 calenderstartandenddatebutton1.click();
				 calenderactioncode(monthyeartextname, yeartextname, monthtextname, daytextname );
			 } else {
				 calenderstartandenddatebutton2.click();
				 calenderactioncode(monthyeartextname, yeartextname, monthtextname, daytextname );
			 }
		}
		
	}		 
		
		private void calenderactioncode(String monthyeartextname, String yeartextname,
				String monthtextname, String daytextname)
			 {
						try {
						String monthandyeartext = clickonmonthandyearcombined.getText();
						if(monthandyeartext.equalsIgnoreCase(monthyeartextname))
							{
								clickonmonthandyearcombined.click();
								for(WebElement yearlist : calenderyearlist)
								{
									String yeartext = yearlist.getText();
									if(yeartext.equalsIgnoreCase(yeartextname))
									{
										yearlist.click();
										for(WebElement monthlist : calendremonthlist)
										{
											String monthtext = monthlist.getText();
											if(monthtext.equalsIgnoreCase(monthtextname))
											{
												System.out.println("Name of the Month :- "+monthtext);
												monthlist.click();
												for(WebElement daylist : calenderdaylist)
												{
														String daytext = daylist.getText();
														if(daytext.equalsIgnoreCase(daytextname))
														{
															daylist.click();
															break;
														}
													
												}
												break;
											}
//											break;
										}
										
									}
//									break;
								}
							
							}
							
						} catch (StaleElementReferenceException e) {
							e.printStackTrace();
						}
						
					}
	
		
	public void validatecreatebuttonandaction()
	{

//		createbutton.click();
	}
	
	public void validatethecreatedincentivedata()
	{
		String Incentivedetails = validateincentivedetailsdata.getText();
		System.out.println("Incentivedetails :- "+ Incentivedetails);
	}
	
	public void validateincentivedetailstextnameindetailspage() 
	{
		String Incentivename = validateincentivedetailname.getText();
		System.out.println("Incentivename :- "+ Incentivename);
	}
}


