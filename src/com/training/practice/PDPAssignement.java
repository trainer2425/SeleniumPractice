package com.training.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PDPAssignement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		List<WebElement> mediaLinks = driver.findElements(By.xpath("//p[contains(@class,'socialsharing_product')]//button"));
		
		System.out.println("Social Media links displayed are:  ");
		
		for(WebElement ele: mediaLinks)
			System.out.println(ele.getText());
		
		
		driver.findElement(By.id("quantity_wanted")).clear();
		driver.findElement(By.id("quantity_wanted")).sendKeys("10");
		
		Select sizeList = new Select(driver.findElement(By.id("group_1")));
		
		sizeList.selectByVisibleText("L");
		
		driver.findElement(By.xpath("//p[@id='add_to_cart']//button/span")).click();
		
		Thread.sleep(3000);
		
		String textDisplayed = driver.findElement(By.xpath("//span[@title='Close window']/following-sibling::h2")).getText();
		
		System.out.println(textDisplayed);
		
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
