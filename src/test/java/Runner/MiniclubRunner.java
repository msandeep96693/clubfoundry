package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = { "src/test/resources/Miniclub/Createminiclub.feature" },
 				glue = {"definitionsteps" },
 				dryRun = true,
// 				dryRun true will not execute
 				monochrome = true,
 				plugin = "html:Reports/miniclub flow"
 				
	        	)

public class MiniclubRunner {

}



 