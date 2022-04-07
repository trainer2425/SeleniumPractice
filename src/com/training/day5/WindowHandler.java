package com.training.day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\OfficeDocuments\\Training\\Selenium\\MyWebsite\\examples\\MyWebPage.html");
		
		Thread.sleep(3000);
		
		String parentHandle = driver.getWindowHandle();
		
		System.out.println("Parent Window is: " + parentHandle);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Services']"))).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'commerce')]"))).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'FlipKart')]"))).click().build().perform();
		
		Thread.sleep(3000);
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println("Number of tabs open are: " + windows.size());
		
		for(String str: windows) {
			System.out.println(str);
			if(!str.equals(parentHandle)) {
				driver.switchTo().window(str);
				break;
			}
		}
		
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentHandle);
		
		driver.findElement(By.id("fname")).sendKeys("Sachin");
		
		driver.findElement(By.id("lname")).sendKeys("K S");
		
		Thread.sleep(3000);

		
		driver.quit();

		
		
	}

}
