package com.training.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithElements2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		
//		Select continentDropdown = new Select(driver.findElement(By.xpath("//select[@id='continents']")));
//		
//		System.out.println("Is this multiple selection dropdown :   " + continentDropdown.isMultiple());
//		
//		
//		System.out.println("Default selected value is:   " + continentDropdown.getFirstSelectedOption().getText());
//		
//		continentDropdown.selectByIndex(3);
//		
//		Thread.sleep(3000);
//		
//		System.out.println("Selected value is:   " + continentDropdown.getFirstSelectedOption().getText());
//		
//		continentDropdown.selectByVisibleText("Europe");
//		
//		Thread.sleep(3000);
//		
//		System.out.println("Later Selected value is:   " + continentDropdown.getFirstSelectedOption().getText());
//		
//		
//		
//		List<WebElement> options = continentDropdown.getOptions();
//		
//		System.out.println("List of continents are:   ");
//		
		Thread.sleep(5000);
		
		
		List<WebElement> informationElements = driver.findElements(By.xpath("//section[@id='block_various_links_footer']//li"));
		
		System.out.println("Number of elements under Information is:  " + informationElements.size());
		
		
		for(WebElement ele:informationElements)
			System.out.println(ele.getText());
		
		driver.close();
		
		

	}

}
