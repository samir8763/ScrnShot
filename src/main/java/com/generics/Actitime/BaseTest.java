package com.generics.Actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
public static WebDriver driver;
@BeforeClass
public void openBrowser()
{
	System.setProperty(chrome_key, chrome_value);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(url);
}
@BeforeMethod
public void closeBrowser()
{
	//driver.close();
	
}


}
