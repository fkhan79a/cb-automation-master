package automation.page.objects.blazedemo;

import org.openqa.selenium.By;

import automation.framework.WebDriverWrapper;

public class SearchPage extends BasePage {
	
	protected WebDriverWrapper driver;

	public SearchPage(WebDriverWrapper driver) {
		super(driver);
		this.driver = driver;
	}
	
	public SearchPage selectDepartCity(String city) {
		
		driver.selectFromDropdown(By.xpath("//select[@name='fromPort']"), city);
		return this;
		
	}
	
	public SearchPage selectDestinationCity(String city) {
		
		driver.selectFromDropdown(By.xpath("//select[@name='toPort']"), city);
		return this;
	}
	
	public SelectionFlightsPage clickFindFlightsBtn() {
		
		driver.clickElement(By.xpath("//input[@value='Find Flights']"));
		return new SelectionFlightsPage(driver);
	}
	
	
}
