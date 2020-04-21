package automation.page.objects.schoology;

import org.openqa.selenium.By;

import automation.framework.WebDriverWrapper;

public class LoginPage extends BasePage {

	protected WebDriverWrapper driver;
	
	public LoginPage(WebDriverWrapper driver) {
		super(driver);
		this.driver = driver;
	}

	public LoginPage enterUsername (String usernameValue) {
		driver.clearAndSendKeys(By.id("edit-mail"),usernameValue);
		return this;
	}
	
	public LoginPage enterPassword (String passwordValue) {
		driver.clearAndSendKeys(By.id("edit-pass"),passwordValue);
		return this;
	}
	
public SchoologyHomePage clickLogin() {
		
		driver.clickElement(By.id("edit-submit"));
		return new SchoologyHomePage(driver);
	}
}


