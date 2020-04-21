package automation.qa.test;

import org.testng.annotations.Test;

import automation.framework.BaseTest;
import automation.page.objects.blazedemo.PurchasePage;
import automation.page.objects.blazedemo.SearchPage;
import automation.page.objects.schoology.CoursesPage;
import automation.page.objects.schoology.LandingPage;
import automation.page.objects.schoology.LoginPage;
import automation.page.objects.schoology.SchoologyHomePage;


public class SchoologyTest extends BaseTest {
	
	
	@Test
	public void studentLoginPositiveScenario() throws InterruptedException { 
	
	//How do we create a landing page?
	LandingPage landingPage = new LandingPage(driver);
	
	LoginPage loginPage = landingPage.clickLogin()
	                                 .enterUsername("maytesting551@gmail.com")
	                                 .enterPassword("pwdmay3534");
	
	
	// Users click Login after entering the above information
	
	SchoologyHomePage schoologyHomePage = loginPage.clickLogin();
	 
	  Thread.sleep(2000);
	  
	  CoursesPage coursesPage = schoologyHomePage.clickCourses();
	  Thread.sleep(2000);

	// Users select new course, click Updates, enter a text, click post and then delete one of the posts
	 coursesPage.clickTestCourse().clickUpdates().enterUpdate("Updating third auto post").clickPost();
	 Thread.sleep(5000);
	 coursesPage.clickIconForUpdatingPost();
	 Thread.sleep(2000);
	 coursesPage.clickDeletePost();
	 Thread.sleep(2000);
	}
		
}
