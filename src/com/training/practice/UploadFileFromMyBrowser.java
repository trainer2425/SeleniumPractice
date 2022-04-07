package com.training.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFileFromMyBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\OfficeDocuments\\Training\\Selenium\\MyWebsite\\examples\\MyWebPage.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions builder = new Actions(driver);
		
		
		builder.moveToElement(driver.findElement(By.xpath("//a[text()='Services']"))).perform();
		builder.moveToElement(driver.findElement(By.xpath("//a[text()='E-commerce']"))).perform();
		builder.moveToElement(driver.findElement(By.xpath("//a[text()='FlipKart']"))).click().build().perform();
		
		
		Thread.sleep(5000);
//		
//		builder.moveToElement(driver.findElement(By.xpath("//input[@type='file']"))).click().build().perform();
//	
//		Thread.sleep(3000);
//		
//		 Thread.sleep(5000);
		 
			// Get Location of the file to be uploaded 
//			  String fileLocation = "D:\\OfficeDocuments\\Training\\Selenium\\SeleniumNotes-Day1.txt";
//			  StringSelection filepath = new StringSelection(fileLocation);
//
//			  // Copy the file path
//			  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
//			  
//			  // Try block

		try {
//			   // Create object of Robot class
			   Robot robot = new Robot();
//
//			   // Press Ctrl key
//			   robot.keyPress(KeyEvent.VK_CONTROL);
//			   // Press Ctrl + V key - It will paste the file path in windows dialog  
//			   robot.keyPress(KeyEvent.VK_V);
//
//			   // Now release V + Ctrl key
//			   robot.keyRelease(KeyEvent.VK_V);
//			   robot.keyRelease(KeyEvent.VK_CONTROL);
//
//			   // Click Enter Key 
//			   robot.keyPress(KeyEvent.VK_ENTER);
//
//			   // Release Enter Key
//			   robot.keyRelease(KeyEvent.VK_ENTER);

			  } catch (AWTException e) {e.printStackTrace();}
			 }

			
		
	}

