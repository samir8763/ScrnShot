package com.pages.Actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Actitime.AutoConstant;
import com.generics.Actitime.BasePage;
import com.generics.Actitime.BaseTest;
import com.generics.Actitime.ExcellLibrary;

public class POMActitimeLoginPage extends BasePage implements AutoConstant {
	@FindBy(id="name")
	private WebElement usernameTextfield;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmelogincheck;
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgetyourpassword;
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actiTIMEInc;
	
	
	public POMActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcellLibrary.getcellvalue(excelpath, sheetname, 1, 0));
		passwordTextfield.sendKeys(ExcellLibrary.getcellvalue(excelpath, sheetname, 1, 1));
		keepmelogincheck.click();
		loginbutton.click();
	}
	
	public void forgetyourpasswordMethod()
	{
	forgetyourpassword.click();	
	}
	
	public void actitimeincMethod() 
	{
		actiTIMEInc.click();
	}

}
