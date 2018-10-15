package com.sample.firstmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleHomePageTest {
	
	public WebDriver driver; 
	@BeforeMethod
	 public void openbrowser() { 
		 String  BrowserPath= "E:\\eclipse_Aravind\\AravindPartone\\src\\browersExe\\";
		  System.setProperty("webdriver.gecko.driver", BrowserPath+ "geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
	 }

	 //@AfterMethod defines this method has to run after every @Test methods
	 @AfterMethod
	 public void closebrowser() {
	  System.out.print("\nBrowser close");
	  driver.quit();
	 }
	 
	 @Test
	 public void testmethodone() {
	   String title = driver.getTitle();
	   System.out.print("Current page title is : "+title);
	   System.out.print("\n'TestNGOne -> TestNGOnePack -> ClassOne -> testmethodone' has been executed successfully");
	 }
	
}