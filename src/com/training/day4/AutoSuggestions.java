package com.training.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");

		Thread.sleep(3000);

		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[@role='option']"));

		for (WebElement ele : autoSuggestions) {
			System.out.println(ele.getText());
			if (ele.getText().contains("selenium download")) {
				System.out.println("Got the match");
				ele.click();
				Thread.sleep(5000);
				break;

			}

		}

		driver.close();

	}

}
