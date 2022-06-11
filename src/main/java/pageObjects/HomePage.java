package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//http://retailm1.upskills.in/
public class HomePage {

	WebElement homepage = null;
	
	public WebElement textbox_search(WebDriver driver) {
		homepage = ((By) driver).findElement((SearchContext) By.className("tb_text"));
		return homepage;
	}
	
	
}
