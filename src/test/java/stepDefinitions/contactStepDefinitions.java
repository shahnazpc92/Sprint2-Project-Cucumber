package stepDefinitions;

import cucumber.api.java.en.*;
//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;
import pageObjects.ContactUs;
import resources.base;

public class contactStepDefinitions extends base {
	 

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	driver =initializeDriver();
        
    }
    
    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
        
    }
    
    @Then("^Click on Contact Us$")
    public void click_on_contact_us() throws Throwable {
    	ContactUs e=new ContactUs(driver);
    	e.getContactlink().click();
    }
    
    @Then("^User enters \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\" $")
    public void user_enters_something_something_and_something(String name, String email, String enquiry) throws Throwable {
    	ContactUs e=new ContactUs(driver);
    	 e.getCName().sendKeys("Shahnaz Patel");
		 e.getemail().sendKeys("shahnazpc9@gmail.com");
		 e.getenquiry().sendKeys("I want to know more new fancy products into your carts");
        
    }
    
    @And("^click on Submit$")
    public void click_on_submit() throws Throwable {
    	ContactUs e=new ContactUs(driver);
		e.getsubmitbtn().click();
        
    }

    @Then("^verify you get(.+)$")
    public void verify_you_get(String yourenquiryhasbeensuccessfullysenttothestoreowner) throws Throwable {
        
    }
    
    @Then("^click on continue$")
    public void click_on_continue() throws Throwable {
    	ContactUs e=new ContactUs(driver);
		e.getcontinuebtn().click();
    }

    @And("^close the browser$")
    public void close_the_browser() throws Throwable {
    	driver.close();
        
    }


}