package Steps;



import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.pages.*;


public class NDC_LoginSteps {
	NDC_LoginPage login= new NDC_LoginPage(DriverFactory.getDriver());
	
	@Given("I am on NDC home page")
	public void i_am_on_ndc_home_page() {
		DriverFactory.getDriver()
		.get("http://10.0.18.223:9089/BOKQA/servlet/BrowserServlet");
	    
	}

	@When("I enter username as {string} and password as {string} to login page")
	public void i_enter_username_as_and_password_as_to_login_page(String userName, String password) {
		login.enterUserName(userName);
	    login.enterPassword(password);
	   
	}

	@Then("I click on login button")
	public void i_click_on_login_button() {
		login.clickLoginButton();
	  
	}

	@And("I click on tools")
	public void i_click_on_tools() throws InterruptedException {
		login.clickTools();
	    
	}

	@And("I select the branch")
	public void i_select_the_branch() throws InterruptedException {
		 login.clickBranch();
	    
	}

	@And("I verify that I am on desired Page")
	public void i_verify_that_i_am_on_desired_page() {
		try {
			login.verifyDesiredPage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	
}
