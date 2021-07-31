package cucumberpracticeProject.StepDefinition;

import org.openqa.selenium.WebDriver;
import cucumberpracticeProject.DriverInitialisation;
import io.cucumber.java.Before;

public class Hooks extends DriverInitialisation{
	
	
	WebDriver driver;
	
	
	
	@Before
	public void callDriver()
	{
		driver=invokeDriver();
	}

}
