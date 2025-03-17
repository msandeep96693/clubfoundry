package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = { "src/test/resources/Loginscenario/loginscenario.feature"},
 				glue = {"definitionsteps" },
 				dryRun = true,
// 				dryRun true will not execute
 				monochrome = true,
 				plugin = "html:Reports/Loginscenario"
 				
	        	)

public class LoginRunner {

}
 