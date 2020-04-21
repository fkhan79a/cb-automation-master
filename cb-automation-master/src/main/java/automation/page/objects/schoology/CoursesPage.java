package automation.page.objects.schoology;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import automation.framework.WebDriverWrapper;
import automation.page.objects.blazedemo.PurchasePage;

public class CoursesPage extends BasePage {

	protected WebDriverWrapper driver;
	
	public CoursesPage(WebDriverWrapper driver) {
		super(driver);
		this.driver = driver;
	}
	
public CoursesPage clickTestCourse() {
		
		driver.clickElement(By.xpath("//a[@href='/course/886059580']"));
		return this;
	}

public CoursesPage clickUpdates() {
	
	driver.clickElement(By.xpath("//a[@href='/course/886059580/updates']"));
	return this;
}

public CoursesPage enterUpdate(String updateText) {
	driver.clearAndSendKeys(By.xpath("//iframe[@id='edit-body_ifr']"),updateText);
	return this;
}

public CoursesPage clickPost() {
	driver.clickElement(By.xpath("//input[@type='submit']"));
	return this;
}


public CoursesPage clickIconForUpdatingPost() throws InterruptedException {
	//driver.clickElement(By.xpath("//span[@class='action-links-unfold-text']"));
	driver.hoverElement("//span[contains(text(),'Updating manual post')]");
	

	//driver.clickElement(By.xpath ("//div[@class='update-post-action-links']"));
	Thread.sleep(20000);
	return this;
}
public CoursesPage clickDeletePost() {
	
	driver.clickElement(By.xpath("//a[@href='/update_post/2371331868/delete']"));
	return this;
}

}
