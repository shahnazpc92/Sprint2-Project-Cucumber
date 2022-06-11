package stepDefinitions;

import cucumber.api.java.en.*;
//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;
import pageObjects.Newsletter;
import resources.base;

public class newsletterStepDefinition extends base {
	 

	@Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
		driver =initializeDriver();
    }
	
	@And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);
    }

    @Then("^Click on Newsletter$")
    public void click_on_newsletter() throws Throwable {
    	Newsletter e=new Newsletter(driver);
    	e.getNewsletterLink().click();
    }
    
    @And("^Navigate to \"([^\"]*)\" Login site$")
    public void navigate_to_something_login_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }

    @Then("^User enters (.+) and (.+)$")
    public void user_enters_and(String email, String pass) throws Throwable {
    	Newsletter e=new Newsletter(driver);
    	e.getUser().sendKeys("shahnazpc9@gmail.com");
		e.getPass().sendKeys("Naaz@123");
    }
    
    @And("^click on Login$")
    public void click_on_login() throws Throwable {
    	Newsletter e=new Newsletter(driver);
    	e.getLoginBtn().click();
    }

    @Then("^Select radio Button to Subscribe$")
    public void select_radio_button_to_subscribe() throws Throwable {
    	Newsletter e=new Newsletter(driver);
    	e.getRadioBtnYes().click();
    }
    
    @And("^Click on Continue$")
    public void click_on_continue() throws Throwable {
    	Newsletter e=new Newsletter(driver);
    	e.getContinueBtn().click();
    }

    @Then("^verify that Success: Your newsletter subscription has been successfully updated!$")
    public void verify_that_success_your_newsletter_subscription_has_been_successfully_updated() throws Throwable {
       
    }

    @And("^close the browser$")
    public void close_the_browser() throws Throwable {
    	driver.close();
    }

}