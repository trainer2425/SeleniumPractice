package com.training.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithElements {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		
		 driver.findElement(By.name("firstname")).sendKeys("Sachin");
		
	
		
		Thread.sleep(5000);
		WebElement lastNameTextBox = driver.findElement(By.name("lastname"));
		lastNameTextBox.sendKeys("KS");
		Thread.sleep(5000);
		
		
		
		
		
		WebElement maleRadioButton = driver.findElement(By.id("sex-0"));
		maleRadioButton.click();
		Thread.sleep(5000);
		
		WebElement continentDropdown = driver.findElement(By.id("continents"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", continentDropdown);
		Thread.sleep(5000);;
		
		
		driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
		Thread.sleep(5000);
		
	
		
		Select dropdown = new Select(continentDropdown);
		dropdown.selectByIndex(4);
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		
		driver.close();
		
		
		
	}

}
