package com.training.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClasses {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\OfficeDocuments\\Training\\Selenium\\MyWebsite\\examples\\MyWebPage.html");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Services']"))).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'commerce')]"))).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'FlipKart')]"))).click().build().perform();
		
		
		
		Thread.sleep(3000);
		
		String currentUrl = driver.getCurrentUrl();
		
		if(currentUrl.equalsIgnoreCase("https://www.flipkart.com/"))
			System.out.println("Successfully clicked on Flipkart!!!!!!!!!");
		
		driver.close();

		
		// Other important methods
		
		/* dragAndDrop
		 * doubleClick
		 * contextClick
		 * 
		 */
	}

}
