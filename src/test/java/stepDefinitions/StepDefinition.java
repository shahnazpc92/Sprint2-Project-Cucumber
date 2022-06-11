package stepDefinitions;

import cucumber.api.java.en.*;
import resources.base;

public class StepDefinition extends base {
	 

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	   System.out.println("Open Browser");
	}
	
	@Given("^Navigate to Sign in page$")
	public void navigate_to_Sign_in_page() throws Throwable {
		System.out.println("Verify login page");
	}
	
	@Given("^Navigate to login Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
		System.out.println("Open Home page");
	}
	
	@Given("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
		System.out.println("Open Login Page");
	}
	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
		System.out.println("Enter User and Pass");
	}
	
	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
		System.out.println("Successfully logged in");
	}

	    
}
