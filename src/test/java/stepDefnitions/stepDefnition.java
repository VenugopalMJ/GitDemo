package stepDefnitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefnition {

	 @Given("^User in login page$")
	    public void user_is_on_login_page(){
	        System.out.println("y");
	      //  throw new PendingException();
	    }

	    @When("^User login with username and password$")
	    public void user_login_with_username_and_password() throws Throwable  {
	    	  System.out.println("v");
	    	  System.out.println("Keep learning dont let it happen");
	    	  System.out.println("Kill your opponents with your success and silence");
	    	  throw new PendingException();
	    }
	    
	   @Then("^Home page will open$")
	    public void home_page_is_populated()  {
	    	  System.out.println("r");
	    	 //throw new PendingException();
	    }
	   
	   @When("^User login with \"([^\"]*)\" and password \"([^\"]*)\"$")
	   public void user_login_with_and_password(String arg1, String arg2) {
		   System.out.println(arg1);
		   System.out.println(arg2);
	       //throw new PendingException();
	   }


//	    @And("^Cards are displayed$")
//	    public void cards_are_displayed()  {
//	    	  System.out.println("f");
//	    	  //throw new PendingException();
//	    }
	   
	   @Then("^Cards displayed are \"([^\"]*)\"$")
	   public void cards_displayed_are(String arg1) {
	       System.out.println(arg1);
	       //throw new PendingException();
	   }
	   
	   @When("^User sign up with following details$")
	    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
	        List<List<String>> obj = data.raw();
	        System.out.println(obj.get(0).get(0));
	        System.out.println(obj.get(0).get(1));
	        System.out.println(obj.get(0).get(2));
	        System.out.println(obj.get(0).get(3));
	        System.out.println(obj.get(0).get(4));
	    }
	   
	   @When("^User login to application with (.+) and (.+)$")
	    public void user_login_to_application_with_and(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }

}