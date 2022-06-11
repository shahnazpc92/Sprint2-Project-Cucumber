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
import pageObjects.FooterNavigation;
import resources.base;
public class FooterNavigationPage extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @Test
	 public void initialize() throws IOException, InterruptedException
		{
		 		
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url"));
			 
			 driver.navigate().to("http://retailm1.upskills.in/about_us");
             
             Thread.sleep(2000);
             
              //driver.navigate().refresh();
             
             driver.navigate().to("http://retailm1.upskills.in/delivery");
             
             Thread.sleep(2000);
             
              driver.navigate().back();
              
              driver.navigate().to("http://retailm1.upskills.in/");
             
             Thread.sleep(2000);
             
              driver.navigate().forward();
              
              driver.navigate().to("http://retailm1.upskills.in/privacy");
              
              Thread.sleep(2000);
              
              driver.navigate().forward();
              
              driver.navigate().to("http://retailm1.upskills.in/terms");
              
              Thread.sleep(2000);
              
              driver.navigate().forward();
              
              driver.navigate().to("http://retailm1.upskills.in/information/contact");
              
              Thread.sleep(2000);
              
              driver.navigate().forward();
              
              driver.navigate().to("http://retailm1.upskills.in/information/sitemap");
              
              Thread.sleep(2000);
              
              driver.navigate().forward();
              
              driver.navigate().to("http://retailm1.upskills.in/");
              
              Thread.sleep(2000);
            
              driver.quit();
			 
		   	 
		    driver.close();
			driver=null; 
			
		}
}


	 
	 

