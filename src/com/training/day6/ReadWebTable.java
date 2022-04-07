package com.training.day6;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("D:\\OfficeDocuments\\Training\\Selenium\\MyWebsite\\examples\\MyWebPage.html");

		Thread.sleep(5000);

		int columnIndex = 1;

		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='myTable']//tr/th"));

		System.out.println("Number of columns in Web Table is:  " + columns.size());

		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='myTable']//tr"));

		for (WebElement ele : columns) {
			if (ele.getText().equals("Employee")) {
				break;
			} else {
				columnIndex++;
			}
		}

		System.out.println("Employee column is found at index:  " + columnIndex);

		List<String> empList = new ArrayList<>();

		for (int rowIndex = 2; rowIndex <= rows.size(); rowIndex++) {
			String name = driver
					.findElement(By.xpath("//table[@name='myTable']//tr[" + rowIndex + "]/td[" + columnIndex + "]"))
					.getText();

			empList.add(name);
		}

		System.out.println("Names of all Employees are:  ");

		for (String str : empList)
			System.out.println(str);

		driver.close();
	}

}
