package automation.amazon.test;

import amazon.page.objects.AmazonHomePage;
import amazon.page.objects.BaseAmazonPage;
import automation.framework.BaseTest;


import org.testng.annotations.Test;

public class AmazonHomePageTest extends BaseTest {

	@Test
	  public void amazonHomePageSearch() {
		  
		  // browser launches to home page which has a search feature
		AmazonHomePage amazonhomePage = new AmazonHomePage(driver);
		  
		//User enters information
	amazonhomePage.enterCriteria("Coffee");
	
	//User hits submit
	amazonhomePage.searchBtn();
	
	
	}

}
