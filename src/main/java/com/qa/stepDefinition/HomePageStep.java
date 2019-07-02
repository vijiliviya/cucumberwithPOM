package com.qa.stepDefinition;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
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
	//public static ExtentReports reports;
	   //public static ExtentTest test;
	   //TestContext testContext;  
   //public HomePageStep()
	   //{
	   
//		   DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");	   
//			Date date = new Date(); 	 
//			String ReportName= "CRReport"+"_"+dateFormat.format(date);		
//			reports=new ExtentReports("..\\POMWithBDDFramework\\Reports\\" + ReportName + ".html");
//	   }
	@Before()
	public static void startTest()
	
	{
//		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//	     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//	     Reporter.setSystemInfo("Machine",prop.getProperty("username") );
//	     Reporter.setSystemInfo("Selenium", "3.7.0");
//	     Reporter.setSystemInfo("Maven", "3.5.2");
//	     Reporter.setSystemInfo("Java Version", "1.8.0_151");
		
//reports = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
//	reports
//    .addSystemInfo("Host Name", "CucumberProject")
//    .addSystemInfo("Environment", "Automation Testing")
//    .addSystemInfo("User Name", "CucumberUser");
	
//	test = reports.startTest("HomePageStep");
		//reports.addSystemInfo("username", "viji");
			
	}

	
	//@After()
//	public static void endTest()
//	
//	{
//		
//		Reporter.loadXMLConfig(new File("C:\\Users\\vraja\\workspace\\POMWithBDDFramework\\src\\main\\java\\com\\qa\\resources\\extent-config.xml"));
//		//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
//		Reporter.setSystemInfo("User Name", "AJ");
//		Reporter.setSystemInfo("Application Name", "Test App ");
//		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
//		Reporter.setSystemInfo("Environment", "Production");
//		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
//		}
//		
		
	
	//reports.endTest(test);
	
	//reports.flush();
	
	
	
	@After
	public void afterScenario(Scenario scenario){
	    try{
	        if(scenario.isFailed()){
	            // More code goes here.
	        	TestBase.getScreenshot();
	        }else {
	            //------------------------- Attaching Screen shot in the Report -------------------------
	            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	            scenario.embed(screenshot, "image/png");
	            TestBase.getScreenshot();
	        }
	        //ExtentManager.getReporter().flush();
	    }
	    catch(Exception e){
	        scenario.write("WARNING. Failed to take screenshot with following exception : "+e.getMessage());
	    }
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
