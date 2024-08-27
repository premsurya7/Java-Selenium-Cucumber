package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchProductsPage {
		
	WebDriver driver;
	
	By dropdown = (By.xpath("//select[@class='product_sort_container']"));
	By ListOfddValues = (By.xpath("//select[@class='product_sort_container']"));
	By firstItemPrice = (By.xpath("(//div[@class='inventory_item_price'])[1]"));
	
	public SearchProductsPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public String getFirstItemPrice() {
		return driver.findElement(firstItemPrice).getText();
	}
	
	public void clickSearchProductDropdown() {
		driver.findElement(dropdown).click();
	}
	
	public void selectDropdownValue(String value) {
		Select sDD = new Select(driver.findElement(ListOfddValues)); 
		sDD.selectByVisibleText(value);
	}
	
}
