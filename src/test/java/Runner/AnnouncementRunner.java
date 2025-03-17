package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = {
//							"src/test/resources/Announcementscenario/updateannouncement.feature"
							 "src/test/resources/Announcementscenario/deleteannouncement.feature"
				},
 				glue = {"definitionsteps" },
 				dryRun = true,
// 				dryRun true will not execute
 				monochrome = true,
 				plugin = "html:Reports/announcement flow"
 				
	        	)

public class AnnouncementRunner {

}
 
/* 
 * "src/test/resources/Announcementscenario/createannouncement.feature",
							"src/test/resources/Announcementscenario/updateannouncement.feature",
							"src/test/resources/Announcementscenario/deleteannouncement.feature"
 *  
 *  */
