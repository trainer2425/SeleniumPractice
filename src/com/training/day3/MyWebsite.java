package com.training.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyWebsite {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\OfficeDocuments\\Training\\Selenium\\PracticeSite.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		Select dropdown = new Select(driver.findElement(By.id("cars")));
		
		System.out.println("Default selected value:  " + dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("honda");
		
		System.out.println("Selected value:  " + dropdown.getFirstSelectedOption().getText());
		
		driver.close();
	}

}
