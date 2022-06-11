package stepDefinitions;

import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import pageObjects.FooterNavigation;
import resources.base;

public class NavigationStepDefinition extends base {
	 
	 	@Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
		 	driver =initializeDriver();
	    }

	 	@And("^Navigate to \"([^\"]*)\" site $")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }
	 
	    @Then("^Navigate to \"([^\"]*)\" About us Page$")
	    public void navigate_to_something_about_us_page(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }
	    
	    @And("^Navigate to \"([^\"]*)\" Delivery Information Page$")
	    public void navigate_to_something_delivery_information_page(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }
	    
	    @Then("^Navigate back to \"([^\"]*)\" About us Page Agian$")
	    public void navigate_back_to_something_about_us_page_agian(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }

	    @Then("^Navigate back to \"([^\"]*)\" Home Page again$")
	    public void navigate_back_to_something_home_page_again(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }

	    @And("^Navigate to \"([^\"]*)\" Privacy Page$")
	    public void navigate_to_something_privacy_page(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }
	    
	    @And("^Navigate to \"([^\"]*)\" Terms & Condition Page$")
	    public void navigate_to_something_terms_condition_page(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }
	    
	    @And("^Navigate to \"([^\"]*)\" Contact us Page$")
	    public void navigate_to_something_contact_us_page(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }
	    
	    @And("^Navigate to \"([^\"]*)\" Sitemap Page$")
	    public void navigate_to_something_sitemap_page(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }
	    
	    @Then("^Navigate to \"([^\"]*)\" Home Page Again$")
	    public void navigate_to_something_home_page_again(String strArg1) throws Throwable {
	    	driver.get(strArg1);
	    }
	
}