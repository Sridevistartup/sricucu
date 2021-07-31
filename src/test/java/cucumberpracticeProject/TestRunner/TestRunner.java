package cucumberpracticeProject.TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/main/java/cucumberpracticeProject/Feature",
		glue="cucumberpracticeProject.StepDefinition",
		plugin= {"pretty",
				"json:target/reports/myjson.json",
				"junit:target/reports/myxmlreport.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/h.html"
				},
		monochrome=true
	
		)

	

public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
          return super.scenarios();
    }

}
