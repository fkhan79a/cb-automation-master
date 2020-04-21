package amazon.page.objects;

import org.openqa.selenium.By;

import automation.framework.WebDriverWrapper;
import automation.page.objects.blazedemo.ConfirmationPage;
import automation.page.objects.blazedemo.PurchasePage;

public class AmazonHomePage extends BaseAmazonPage {

	protected WebDriverWrapper driver;
	
	public AmazonHomePage(WebDriverWrapper driver) {
		super(driver);
		this.driver = driver;		
	}

	public AmazonHomePage enterCriteria(String criteriaText) {
		driver.clearAndSendKeys(By.id("twotabsearchtextbox"), criteriaText);
		return this;
		}

	public AmazonHomePage searchBtn() {
		driver.clickElement (By.xpath("//input[@type = 'submit']"));
		return this;	
}
	
}