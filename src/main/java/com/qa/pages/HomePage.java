package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[text()='vijayalakshmi R']//parent::div[@class='right menu']")
	@CacheLookup
	WebElement userNameLabel;
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contactsLink;
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateHomeTitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean validateUserLabel()
	{
		return userNameLabel.isDisplayed();
		
	}
	
	public void clickOnContacts()
	
	{
		Actions action=new Actions(driver);
		action.moveToElement(contactsLink).click().build().perform();
		
		
	}

}
