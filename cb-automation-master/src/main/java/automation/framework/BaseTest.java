package automation.framework;

import automation.framework.FrameworkSetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

  
  public WebDriverWrapper driver = null;
  protected WebDriverWait wait = null;
	
  @BeforeSuite
  public void suiteSetup() {
	  
	 //Any framework Properties
	 FrameworkSetting.initProperties();
	  
  }
  
  @BeforeMethod
  public void testSetup() {
	 
	 if (FrameworkSetting.browserName.equalsIgnoreCase("chrome")) {
		 
	 System.setProperty("webdriver.chrome.driver", FrameworkSetting.baseDir + FrameworkSetting.fileSeparator + "drivers\\chromedriver.exe");
	 WebDriver driverFromSelenium = new ChromeDriver();
	 wait = new WebDriverWait(driverFromSelenium, FrameworkSetting.maxTimeout);
	 this.driver = new WebDriverWrapper(driverFromSelenium, wait);
	 wait = new WebDriverWait(driverFromSelenium, FrameworkSetting.maxTimeout);
	 
 	} else if (FrameworkSetting.browserName.equalsIgnoreCase("ie")) {
	 
 		System.setProperty("webdriver.ie.driver", FrameworkSetting.baseDir + FrameworkSetting.fileSeparator + "drivers\\IEDriverServer.exe");
 		WebDriver driverFromSelenium = new InternetExplorerDriver(); 
 		wait = new WebDriverWait(driverFromSelenium, FrameworkSetting.maxTimeout);
 		this.driver = new WebDriverWrapper(driverFromSelenium, wait);
 	} else {
	 System.out.println("------------MUST SPECIFY IE OR CHROME--------------");
 	}

	 
	 driver.get(FrameworkSetting.url);
	 driver.maximizeWindow();
  }
  
  @AfterMethod
  public void closeTest() {
	 driver.close();
  }
}

