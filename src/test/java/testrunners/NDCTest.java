package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class) 
@CucumberOptions(
	features = {"src/test/resources/features/NDC_Newlogin.feature"},
	glue= {"Steps"},
	plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class NDCTest extends AbstractTestNGCucumberTests {

}
