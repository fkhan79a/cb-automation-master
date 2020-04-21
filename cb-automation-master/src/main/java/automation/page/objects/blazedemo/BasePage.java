package automation.page.objects.blazedemo;

import org.openqa.selenium.WebDriver;

import automation.framework.WebDriverWrapper;

public class BasePage {
	
	protected WebDriverWrapper driver;
	
	public BasePage(WebDriverWrapper driver) {
		this.driver = driver;
	}

}
