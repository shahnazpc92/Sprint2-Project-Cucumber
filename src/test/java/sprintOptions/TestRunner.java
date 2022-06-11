package sprintOptions;

//import org.junit.runner.RunWith;
//import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "classpath:features",
	    glue="stepDefinations",
	    dryRun=true,
	    plugin= {"html:target/test-output",
	    		"junit:target/junit-xml-report.xml"
	    		}
		)
public class TestRunner extends AbstractTestNGCucumberTests  {

}
