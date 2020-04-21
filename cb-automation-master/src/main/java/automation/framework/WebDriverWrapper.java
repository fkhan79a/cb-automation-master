package automation.framework;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWrapper extends BaseTest {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	

	public WebDriverWrapper(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	//this is a method for maximizing the window 
	public void maximizeWindow() {
		System.out.println("Maximize Window");
		driver.manage().window().maximize();
	}
	
	public void get(String url) {
		System.out.println("----Opening page to : " +url);
		driver.get(url);
	}
	
	public void close() {
		driver.close();
	}
	
	public WebElement findElement(By by) {
		
		System.out.println("Finding WebElement..." + by);
		WebElement elem = wait.until(ExpectedConditions.presenceOfElementLocated(by));
		highlightWebElement(elem);
		return elem;
	}
	
	private void highlightWebElement(WebElement elem) {
		
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elem);
			
		} catch (Exception e) {
			
			// log if something goes wrong
		}
		
	}
	
	public void clearAndSendKeys(By by, String value) {
		
		// delete what is currently in the element
		String selectAll = Keys.chord(Keys.CONTROL, "a");		
		WebElement elem = findElement(by);
		elem.sendKeys(selectAll);
		elem.sendKeys(Keys.DELETE);
	
		// send keys to element
		elem.sendKeys(value);
	}
	
	public void selectFromDropdown(By by, String selection) {
		
		//this is from selenium
		Select select = new Select(driver.findElement(by));
		select.selectByValue(selection);
		
	}
	
	
	public void clickElement(By by) {
		
		driver.findElement(by).click();
	}
	
	
	public void hoverElement(String by) {
		
		Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath(by))).build().perform();
	    	
	} 
	
	public String getTextFrom(By by) {
		
		return driver.findElement(by).getText();
	}

	public boolean switchToWindowByTitle(String title) {
		
		boolean foundWindow = false;
		
		String winHandleBefore = driver.getWindowHandle();
		
		// Switch to new window handle opened then check title
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		    if (driver.getTitle().contains(title)) {
		    	foundWindow = true;
		    	break;
		    } else {
		    	foundWindow = false;
		    }
		}
		 return foundWindow;
		
	}

}
