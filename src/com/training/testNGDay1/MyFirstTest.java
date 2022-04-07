package com.training.testNGDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest extends BaseTest{
	
	
  @Test(groups = "Regression")
  public void validateSignInUrl() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(5000);
		
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, "http://automationpractice.com/index.php");
		
		System.out.println("Url is launched successfully");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		Thread.sleep(5000);
		
		actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, "http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.close();
  }
  
  @Test (groups = "Regression")
  public void test2() {
	  
	  System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, "http://automationpractice.com/index.php");
	  System.out.println("My Second Test case");
	  
  }
  
  @Test (groups = "Regression")
  public void test3() {
	  System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, "http://automationpractice.com/index.php");
	  
	  System.out.println("My Third Test case");
	  
  }
}
