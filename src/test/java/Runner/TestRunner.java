package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="Feature"
		,monochrome=true,
		strict=true,
		glue= {"StepDefinition"},
		dryRun=false,

         format= {"pretty","html:test-output"}
	
		
		)



public class TestRunner {



}
