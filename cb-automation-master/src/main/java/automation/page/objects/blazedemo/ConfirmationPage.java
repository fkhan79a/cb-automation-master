package automation.page.objects.blazedemo;

import org.openqa.selenium.By;

import automation.framework.WebDriverWrapper;

public class ConfirmationPage extends BasePage {
	
	protected WebDriverWrapper driver;

	public ConfirmationPage(WebDriverWrapper driver) {
		super(driver);
		this.driver = driver;
		
	}
	
	public String getHeaderMessage() {
		
		String value = driver.getTextFrom(By.xpath("//h1"));
		
		return value;
		
	}
	
public String getConfirmationstStatus() {
		
		String value = driver.getTextFrom(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]"));
		
		return value;

}

}