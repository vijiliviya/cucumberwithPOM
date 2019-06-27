package com.qa.stepDefinition;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageStep extends TestBase {

	LoginPage loginpageobj;
	HomePage homepage;
	public static ExtentReports reports;
	   public static ExtentTest test;
//	   
//	   public HomePageStep()
//	   {
//		   DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");	   
//			Date date = new Date(); 	 
//			String ReportName= "CRReport"+"_"+dateFormat.format(date);		
//			reports=new ExtentReports("..\\POMWithBDDFramework\\Reports\\" + ReportName + ".html");
//	   }
	@Before()
	public static void startTest()
	
	{
	
reports = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
//	reports
//    .addSystemInfo("Host Name", "CucumberProject")
//    .addSystemInfo("Environment", "Automation Testing")
//    .addSystemInfo("User Name", "CucumberUser");
	
//	test = reports.startTest("HomePageStep");
		reports.addSystemInfo("username", "viji");
			
	}

	
	@After()
	public static void endTest()
	
	{
		
	
	reports.endTest(test);
	
	reports.flush();
	
	}
	
	

	

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
