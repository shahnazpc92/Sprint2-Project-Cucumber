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
import pageObjects.ContactUs;
import resources.base;
public class Contactus extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 @Test
	 public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url"));
			 ContactUs e=new ContactUs(driver);
		     
			 e.getContactlink().click();
		     e.getCName().sendKeys("Shahnaz Patel");
			 e.getemail().sendKeys("shahnazpc9@gmail.com");
			 e.getenquiry().sendKeys("I want to know more new fancy products into your carts");
			 e.getsubmitbtn().click();
			 e.getcontinuebtn().click();
		   		    
		    driver.close();
			driver=null; 
			
		}
}


	 
	 

