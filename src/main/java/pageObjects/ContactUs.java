package pageObjects;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

//http://retailm1.upskills.in/

public class ContactUs {
	
public WebDriver driver;
	
	By contactlink = By.linkText("Contact Us");
	By cname = By.id("input-name");
	By email = By.name("email");
	By enquiry = By.tagName("textarea");
	By submitbtn = By.xpath("//*[@id=\'System_CJEl16l4\']/form/div/div/input");
	By continuebtn = By.cssSelector("#System_s3bhXNDb > div.buttons > div > a");
	
	public ContactUs(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	public WebElement getContactlink()
	{
		return driver.findElement(contactlink);
		
	}
	
	public WebElement getCName()
	{
		return driver.findElement(cname);
		
	}

	public WebElement getemail()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement getenquiry()
	{
		return driver.findElement(enquiry);
		
	}
	
	public WebElement getsubmitbtn()
	{
		return driver.findElement(submitbtn);
		
	}

	public WebElement getcontinuebtn()
	{
		return driver.findElement(continuebtn);
	}
	
	
}
