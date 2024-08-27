package comms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPages {
	
	WebDriver driver;
	
	public CommonPages (WebDriver driver) {		
		this.driver = driver;		
	}
	
	public void Wait(By ele) {
		System.out.println("Inside wait method");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		System.out.println("Done with wait method");
	}
	
	
}
