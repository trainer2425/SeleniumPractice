package com.training.testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class UseOfMethods {
	WebDriver driver;
	WebDriverWait wait;

	@Test
	public void verifyBaseUrl() {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "http://automationpractice.com/index.php");
	}

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://automationpractice.com/index.php");
		

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	
	@Test(dependsOnMethods = "verifyBaseUrl")
	public void verifySignInUrl()  {
		
		FluentWait wait = new FluentWait(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='login']")));
		
		wait.withTimeout(Duration.ofSeconds(30));
		
		wait.pollingEvery(Duration.ofMillis(2500));
		
		wait.ignoring(NoSuchElementException.class);
		
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='login']")));
		driver.findElement(By.xpath("//a[@class='login']")).click();	
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

}
