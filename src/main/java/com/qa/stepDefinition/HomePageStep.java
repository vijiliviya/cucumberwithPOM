package com.qa.stepDefinition;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageStep extends TestBase {

	LoginPage loginpageobj;
	HomePage homepage;

	@Given("^open browser$")
	public void user_open_browser() throws Throwable {

		TestBase.initialization();

	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		
		
		loginpageobj=new LoginPage();
		String actualtitle=loginpageobj.ValidateTitle();
		Assert.assertEquals("Free CRM software for any Business",actualtitle);


	}
	@Then("^click log in button$")
	public void click_log_in_button() throws Throwable {
		Thread.sleep(4000);
	    LoginPage.logclidk();
	    
	}


	@When("^Logs details$")
	public void user_enters_username_and_password() throws Throwable {

		homepage=loginpageobj.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		String homepagetitle= homepage.ValidateHomeTitle();
		Assert.assertEquals("CRM",homepagetitle);
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
		
boolean flag=homepage.validateUserLabel();
Assert.assertTrue(flag);

	}



}
