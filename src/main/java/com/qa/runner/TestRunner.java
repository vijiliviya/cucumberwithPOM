package com.qa.runner;

import java.io.File;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
 features = "C:\\Users\\vraja\\workspace\\POMWithBDDFramework\\src\\main\\java\\com\\qa\\features\\freecrm.feature"
 ,glue={"com/qa/stepDefinition"},
 format = { "pretty","html:test-output" ,
		 "json:jsonreport/cucumber.json","junit:juit_xmlreport/cucumber.xml"},
 dryRun = false, monochrome=true,strict=true
 )

public class TestRunner {
	

	@AfterClass
	public static void setup()
	{
		Reporter.loadXMLConfig(new File("C:\\Users\\vraja\\workspace\\POMWithBDDFramework\\src\\main\\java\\com\\qa\\resources\\extent-config.xml"));
		 								
//		//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
		Reporter.setSystemInfo("User Name", "AJ");
		Reporter.setSystemInfo("Application Name", "Test App ");
		//Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment", "Production");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
		
		
		
			//Reporter.loadXMLConfig(new File("C:\\Users\\vraja\\workspace\\POMWithBDDFramework\\src\\main\\java\\com\\qa\\resources\\extent-config.xml"));
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//	     Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//	     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//	     Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
//	     Reporter.setSystemInfo("Selenium", "3.7.0");
//	     Reporter.setSystemInfo("Maven", "3.5.2");
//	     Reporter.setSystemInfo("Java Version", "1.8.0_151");
		
		}
		
}
