package com.training.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		
		Thread.sleep(9000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		String text = driver.findElement(By.id("draggable")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		String url = driver.getCurrentUrl();
		
		if(url.equals("https://jqueryui.com/droppable/"))
			System.out.println("Moved to droppable page");
		
		driver.close();
	}

}
