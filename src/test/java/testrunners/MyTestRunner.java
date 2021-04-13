package testrunners;

import org.junit.runner.RunWith;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/parallel/NDC_NewLogin.feature"},
		glue = {"parallel"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"				
		}
		
		)

public class MyTestRunner extends AbstractTestNGCucumberTests {
	  private TestNGCucumberRunner testNGCucumberRunner;
	    
	    @BeforeClass(alwaysRun = true)
	    public void setUpCucumber() {
	    	 testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }
}
