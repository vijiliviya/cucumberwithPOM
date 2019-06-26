package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\vraja\\workspace\\POMWithBDDFramework\\src\\main\\java\\com\\qa\\features\\freecrm.feature"
 ,glue={"com/qa/stepDefinition"},format = { "pretty","html:test-output" ,
		 "json:jsonreport/cucumber.json","junit:juit_xmlreport/cucumber.xml"},
 dryRun = false, monochrome=true,strict=true
 )

public class TestRunner {

}
