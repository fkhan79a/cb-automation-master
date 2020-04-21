package automation.page.objects.blazedemo;

import org.openqa.selenium.By;

import automation.framework.WebDriverWrapper;

public class PurchasePage extends BasePage {
	
	protected WebDriverWrapper driver;
	
	public PurchasePage(WebDriverWrapper driver) {
		super(driver);
		this.driver = driver;
	}
	public PurchasePage enterName(String nameText) {
		driver.clearAndSendKeys(By.id("inputName"), nameText);
		return this;
		
	}
	public PurchasePage enterAddress(String addressText) {
		driver.clearAndSendKeys(By.id("address"), addressText);
		return this;
	}
	public PurchasePage enterCity(String cityText) {
		driver.clearAndSendKeys(By.id("city"), cityText);
		return this;
	}
	public PurchasePage selectState(String stateText) {
		driver.clearAndSendKeys(By.id("state"), stateText);
		return this;
	}
	public PurchasePage selectZipCode(String zipcodeNum) {
		driver.clearAndSendKeys(By.id("zipCode"), zipcodeNum);
		return this;
	}
	public PurchasePage selectCardType(String cardType) {
		driver.selectFromDropdown(By.id("cardType"), cardType);
		return this;
	}
	public PurchasePage selectCreditCardNumber(String cardNumber) {
		driver.clearAndSendKeys(By.id("creditCardNumber"), cardNumber);
		return this;
	}
	public PurchasePage selectCreditCardMonth(String cardMonth) {
		driver.clearAndSendKeys(By.id("creditCardMonth"), cardMonth);
		return this;
	}
	public PurchasePage selectCreditCardYear(String cardYear) {
		driver.clearAndSendKeys(By.id("creditCardYear"), cardYear);
		return this;
	}
	public PurchasePage selectNameOnCard(String cardHolder) {
		driver.clearAndSendKeys(By.id("nameOnCard"), cardHolder);
		return this;
	}	
	public PurchasePage clickRememberMeCheckBox() {
		driver.clickElement (By.id("rememberMe"));
		return this;
	}
	public ConfirmationPage purchaseFlightBtn() {
		driver.clickElement (By.xpath("//input[@value = 'Purchase Flight']"));
		return new ConfirmationPage(driver);
	}
}
