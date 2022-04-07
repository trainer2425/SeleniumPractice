package com.training.day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		
		driver.get("D:\\OfficeDocuments\\Training\\Selenium\\MyWebsite\\examples\\ConfirmationPage.html");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(5000);
		
		
		Alert alert = driver.switchTo().alert();
		
		
		// alert.dismiss();
		
		alert.sendKeys("Sachin");
		
		 alert.accept();
		
		Thread.sleep(5000);
		
		
		System.out.println(driver.findElement(By.id("demo")).getText());
		
		
		driver.close();

	}

}
