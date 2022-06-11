package pages;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.Newsletter;
import resources.base;
public class NewsletterPage extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @Test
	 public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url"));
			 Newsletter e=new Newsletter(driver);
		     
			 e.getNewsletterLink().click();
		     e.getUser().sendKeys("shahnazpc9@gmail.com");
			 e.getPass().sendKeys("Naaz@123");
			 e.getLoginBtn().click();
			 e.getRadioBtnYes().click();
//			 e.getRadioBtnNo().click();
		   	 e.getContinueBtn().click();
		   	 
		    driver.close();
			driver=null; 
			
		}
}


	 
	 

