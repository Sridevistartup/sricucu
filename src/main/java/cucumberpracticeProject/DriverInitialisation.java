package cucumberpracticeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInitialisation {
	WebDriver driver;
	
	public WebDriver invokeDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		return driver;
		
	}

}
