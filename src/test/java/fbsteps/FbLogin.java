package fbsteps;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin 
{
	
	public WebDriver driver;
	
	@Given("^Browser is invoked$")
	public void browser_is_invoked() 
	{
		System.out.println("Browser is opened");
	}

	@When("^the user navigates to login page$")
	public void the_user_navigates_to_login_page() 
	{
		System.out.println("User navigates to login page");
	}

	@And("^enters \"([^\"]*)\" username$")
	public void enters_valid_username(String username) 
	{
		System.out.println("username is :- "+username);
	}

	@And("^enters \"([^\"]*)\" password$")
	public void enters_valid_password(String password) 
	{
		System.out.println("Password is :- "+password);
	}

	@And("^clicks on login button$")
	public void clicks_on_login_button()
	{
		System.out.println("CLicks on login button");
	}

	@Then("^Login \"([^\"]*)\" suceed$")
	public void login_should_suceed(String status) 
	{
		System.out.println("Login status :- "+status);
	}
	
	@And("^enters invalid username$")
	public void enters_invalid_username() 
	{
		System.out.println("Enters invalid username");
	    
	}

	@And("^enters invalid password$")
	public void enters_invalid_password()  
	{
		System.out.println("Enters invalid password");
	}

	@Then("^Login shouldnot suceed$")
	public void login_shouldnot_suceed() 
	{
		System.out.println("Login shouldnot suceed");
	}
}
