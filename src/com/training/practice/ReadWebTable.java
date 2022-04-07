package com.training.practice;

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
		
		driver.get("D:\\OfficeDocuments\\Training\\Selenium\\MyWebsite\\examples\\MyWebPage.html");
		
		Thread.sleep(3000);
		
		int columnIndex = 1;
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='myTable']//th"));
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='myTable']//tr"));
		
		for(WebElement ele: columns) {
			if(ele.getText().equals("Employee")) {
				break;
			}else
			{
				columnIndex++;
			}
		}
		
		System.out.println("Employee column is found at index: " + columnIndex);
		
		List<String> employees = new ArrayList<>();
		
		
		for(int i=2;i<=rows.size();i++) {
			String str = driver.findElement(By.xpath("//table[@name='myTable']//tr[" + i + "]/td[" + columnIndex + "]")).getText();
			employees.add(str);
		}
		
		
		
		System.out.println("List of employees are: ");
		
		for(String str: employees)
			System.out.println(str);
		
		driver.close();

	}

}
