package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	
	WebDriver driver = TestRunner.driver;

	LoginPage lp = new LoginPage(driver);
	
	@Given("I launch the website")
	public  void i_launch_the_website() {					
		driver.get("https://www.saucedemo.com/v1/");			
	}

	@When("I provide username and password")
	public void i_provide_username_and_password() {		
		lp.InputUserName();
		lp.InputPassword();
	}

	@When("Click on login button")
	public void click_on_login_button() {
		lp.ClickLogin();
	}

	@Then("I am logged into the website")
	public void i_am_logged_into_the_website() {	
	    String ActualTitle = lp.getTitleDisplayed();
	    System.out.println(ActualTitle);
	    //Assert.assertEquals(ActualTitle, "Swag Labs");	    	    
	}
}
