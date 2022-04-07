package com.training.testNGDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	@Test(dependsOnMethods = "loginWithvalidCredentials")
	public void updatePhoneNumber() {

		 System.setProperty("webdriver.chrome.driver",
					"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://automationpractice.com/index.php");
			
			
			String actualUrl = driver.getCurrentUrl();
			
			Assert.assertEquals(actualUrl, "http://automationpractice.com/index.php");
		System.out.println("Inside the method updatePhoneNumber()");

	}

	@Test (groups = "Regression")
	public void loginWithvalidCredentials() {
		 System.setProperty("webdriver.chrome.driver",
					"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://automationpractice.com/index.php");
			
			
			String actualUrl = driver.getCurrentUrl();
			
			Assert.assertEquals(actualUrl, "http://automationpractice.com/index.php");

		System.out.println("Inside the method loginWithvalidCredentials()");
		Assert.fail();
	}

	@Test (groups = "Regression")
	public void clickLoginWithoutEnteringCredntials() {
		 System.setProperty("webdriver.chrome.driver",
					"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://automationpractice.com/index.php");
			
			
			String actualUrl = driver.getCurrentUrl();
			
			Assert.assertEquals(actualUrl, "http://automationpractice.com/index.php");

		System.out.println("Inside the method clickLoginWithoutEnteringCredntials()");
	}

	@Test (groups = "Regression")
	public void loginWithInvalidCredentials() {
		 System.setProperty("webdriver.chrome.driver",
					"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://automationpractice.com/index.php");
			
			
			String actualUrl = driver.getCurrentUrl();
			
			Assert.assertEquals(actualUrl, "http://automationpractice.com/index.php");

		System.out.println("Inside the method loginWithInvalidCredentials()");
		
	}

}
