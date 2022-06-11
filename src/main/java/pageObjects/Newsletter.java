package pageObjects;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

//http://retailm1.upskills.in/

public class Newsletter {
	
public WebDriver driver;
	
	By NewsletterLink = By.linkText("Newsletter");
	By user = By.name("email");
	By pass = By.id("input-password");
	By loginBtn = By.xpath("//*[@id=\"System_nyHsmShk\"]/div/div[2]/div/form/div/div[2]/input");
	By RadioBtnYes = By.cssSelector("#System_s3bhXNDb > form > fieldset > div > div > label:nth-child(1) > input[type=radio]");
	By RadioBtnNo = By.cssSelector("#System_s3bhXNDb > form > fieldset > div > div > label:nth-child(2) > input[type=radio]");
	By ContinueBtn = By.xpath("//*[@id=\"System_s3bhXNDb\"]/form/div/div[2]/input");
	
	public Newsletter(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	public WebElement getNewsletterLink()
	{
		return driver.findElement(NewsletterLink);
		
	}
	
	public WebElement getUser()
	{
		return driver.findElement(user);
		
	}
	
	public WebElement getPass()
	{
		return driver.findElement(pass);
		
	}

	public WebElement getLoginBtn()
	{
		return driver.findElement(loginBtn);
		
	}
	
	public WebElement getRadioBtnYes()
	{
		return driver.findElement(RadioBtnYes);
		
	}
	
//	public WebElement getRadioBtnNo()
//	{
//		return driver.findElement(RadioBtnNo);
//		
//	}

	public WebElement getContinueBtn()
	{
		return driver.findElement(ContinueBtn);
	
	}
	
	
}
