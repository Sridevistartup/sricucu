package cucumberpracticeProject.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeatureBasicStepDefinition {
	
	public FeatureBasicStepDefinition() {
		// TODO Auto-generated constructor stub
	}
	
	 @Given("^when user enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void when_user_enter_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println("facebook username and Password");
	       // System.out.println(5/0);
	    }

	    @When("^click on submit$")
	    public void click_on_submit() throws Throwable {
	     System.out.println("user clicked on submit");  
	    }

	    @Then("^error displays$")
	    public void error_displays() throws Throwable {
	       System.out.println("error displayed");
	    }


}
