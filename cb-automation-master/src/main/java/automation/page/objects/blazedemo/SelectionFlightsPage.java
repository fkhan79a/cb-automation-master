package automation.page.objects.blazedemo;

import org.openqa.selenium.By;

import automation.framework.WebDriverWrapper;

public class SelectionFlightsPage extends BasePage {
	
	protected WebDriverWrapper driver;

	public SelectionFlightsPage(WebDriverWrapper driver) {
		super(driver);
		this.driver = driver;
	}
	
	public PurchasePage clickFirstFlightFromResults() {
		
		driver.clickElement(By.xpath("//html/body/div[2]/table/tbody/tr[1]/td/input"));
		return new PurchasePage(driver);
	}

}
