package com.training.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"D:\\Softwares\\Selenium Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.id("customers"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> columns = table.findElements(By.tagName("th"));

		for (int i = 2; i <= rows.size(); i++) {
			for (int j = 1; j <= columns.size(); j++) {
				String str = driver.findElement(By.xpath("//*[@id='customers']//tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.println(str);

			}

		}

		for(WebElement ele: columns)
			System.out.println(ele.getText());

		driver.close();
	}

}
