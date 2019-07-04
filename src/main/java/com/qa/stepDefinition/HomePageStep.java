package com.qa.stepDefinition;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class HomePageStep extends TestBase {

	LoginPage loginpageobj;
	HomePage homepage;
	
	@Before()
	public static void startTest()

	{
		System.out.println("before");
	
	}
	
	
	
	@After()
	public void afterScenario(Scenario scenario) throws IOException{
		try
		{
		if (scenario.isFailed()) 

		{
			//This takes a screenshot from the driver at save it to the specified location
			 String screenshotName = scenario.getName().replaceAll(" ", "_");
		
		File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
		
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");	   
		Date date = new Date(); 	 
		String ReportName= screenshotName+"_"+dateFormat.format(date);		
//		reports=new ExtentReports("..\\POMWithBDDFramework\\Reports\\" + ReportName + ".html");
		//Building up the destination path for the screenshot to save
		 //Also make sure to create a folder 'screenshots'
		File destinationPath = new File(System.getProperty("user.dir") + "/screenshot/" + ReportName + ".png");

		 //Copy taken screenshot from source location to destination location
		Files.copy(sourcePath, destinationPath); 
		//This attach the specified screenshot to the test
		Reporter.addScreenCaptureFromPath(destinationPath.toString());
		}
		}
    
    catch(Exception e){
        scenario.write("WARNING. Failed to take screenshot with following exception : "+e.getMessage());
	    }
		
		System.out.println("after");
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
