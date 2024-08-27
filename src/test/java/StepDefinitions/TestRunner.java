package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(
		features={"src/test/resources/FeatureFiles"}, 
		glue={"StepDefinitions"}, 
		plugin = {"pretty", "html:target/HTMLReports/reports.html"},
		tags = "@tag1")


public class TestRunner extends AbstractTestNGCucumberTests {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void startBrowser() {
		driver = WebDriverManager.chromedriver().create();	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();		
	}
	
	@AfterSuite
	public void quitBrowser() {
		//driver.quit();
	}
}


