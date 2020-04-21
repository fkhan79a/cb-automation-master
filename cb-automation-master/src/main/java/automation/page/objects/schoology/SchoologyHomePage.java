package automation.page.objects.schoology;

import org.openqa.selenium.By;

import automation.framework.WebDriverWrapper;

public class SchoologyHomePage extends BasePage {

	protected WebDriverWrapper driver;
	
	public SchoologyHomePage(WebDriverWrapper driver) {
		super(driver);
		this.driver = driver;
	}

public CoursesPage clickCourses() {
		
		driver.clickElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[2]/div[1]/button[1]/span[1]"));
		return new CoursesPage(driver);
	}
}
	
	
	
