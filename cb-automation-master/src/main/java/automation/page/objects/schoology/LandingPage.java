package automation.page.objects.schoology;

import org.openqa.selenium.By;

import automation.framework.WebDriverWrapper;

public class LandingPage extends BasePage {

	protected WebDriverWrapper driver;
	
	public LandingPage(WebDriverWrapper driver) {
		super(driver);

		this.driver = driver;
	}
	
	public LoginPage clickLogin() {
		
		driver.findElement(By.id("login-header")).click();
		driver.switchToWindowByTitle("Log in to Schoology");
		return new LoginPage(driver);
	}
	
}
