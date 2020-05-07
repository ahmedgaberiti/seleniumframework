package runner;

import io.cucumber.testng.CucumberOptions;
import tests.TestBase;
/*
 Abstract TestNG Cucumber Test that we make testbase class extends from it 
 Runs each cucumber scenario found in the features as separated test.
 */

@CucumberOptions(features="src/test/java/features"
,glue= {"steps"}
,plugin= {"pretty","html:target/cucumber-html-report"})
public class TestRunner extends TestBase {
	
	

}
