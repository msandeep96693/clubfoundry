package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = { 
					"src/test/resources/Incentivescenario/createincentive.feature", 
					"src/test/resources/Miniclub/Createminiclub.feature"
					},
 				glue = {"definitionsteps" },
 				dryRun = true,
// 				dryRun true will not execute
 				monochrome = true		
	        	)

public class TestRun {

}
//"src/test/resources/Miniclub/Createminiclub.feature"
//"src/test/resources/Loginscenario/loginscenario.feature"
 