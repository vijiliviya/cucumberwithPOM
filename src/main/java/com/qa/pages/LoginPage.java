package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath="//input[@name='email']")
	WebElement usernameTxtbox;
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTxtbox;
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtn;
	@FindBy(xpath="//div[contains(@class,'header item')]")
	WebElement imgLogo;
	@FindBy(xpath="//span[text()='Log In']")
	static
	WebElement Logbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateTitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean validateLogo()
	{
		return imgLogo.isDisplayed();
		
	}
	
	public static void logclidk()
	{
		
		Logbtn.click();
		//explicit  wait
		WebDriverWait wait=new WebDriverWait(driver, 40);
		WebElement expwait= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='email']")));
		expwait.click();
	}
	
	public HomePage login(String un, String pwd)
	
	{
		//driver.findElement(By.xpath("//span[text()='Log In']")).click();
		
		usernameTxtbox.sendKeys(un);
		passwordTxtbox.sendKeys(pwd);
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", loginBtn);
		
		return new HomePage();
		
	}

}
