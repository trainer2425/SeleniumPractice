package com.training.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver",
//				"D:\\Softwares\\Selenium Drivers\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		driver.get("D:\\OfficeDocuments\\Training\\Selenium\\MyWebsite\\examples\\ConfirmationPage.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		String alertMsg = alert.getText();
		
		
		
		alert.sendKeys("Sachin K S");
		Thread.sleep(5000);
		
		
		
		
		System.out.println(alertMsg);
		alert.accept();
		
	//	alert.dismiss();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
