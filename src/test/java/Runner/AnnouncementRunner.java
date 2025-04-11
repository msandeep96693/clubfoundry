package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = {
							
							"src/test/resources/Announcementscenario/createannouncement.feature",
							"src/test/resources/Announcementscenario/updateannouncement.feature",
							 "src/test/resources/Announcementscenario/deleteannouncement.feature"       
				},
 				glue = {"definitionsteps" },
 				dryRun = false,
// 				dryRun true will not execute
 				monochrome = true,
 				plugin = {  "pretty",
 							"html:target/cucumber-reports/CucumberReport.html",
					        "json:target/cucumber-reports/CucumberReport.json",
					        "junit:target/cucumber-reports/CucumberReport.junit",
					        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
 						    }
	        	)

public class AnnouncementRunner {

}
 

