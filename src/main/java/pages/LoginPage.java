package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {		
	
	WebDriver driver;	
	
	By txtUserName = (By.xpath("//input[@id='user-name']"));	
	By txtPassword = (By.xpath("//input[@id='password']"));
	By btnLogin = (By.xpath("//input[@id='login-button']"));
	
	public LoginPage (WebDriver driver) {		
		this.driver = driver;		
	}
	
	public void InputUserName() {
		driver.findElement(txtUserName).sendKeys("standard_user");
	}
	
	public void InputPassword() {
		driver.findElement(txtPassword).sendKeys("secret_sauce");
	}
	
	public void ClickLogin() {
		driver.findElement(btnLogin).click();
	}

	public String getTitleDisplayed() {
		return driver.getTitle();
	}
}