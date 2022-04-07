package com.training.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4Assignement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("(//div[text()='Categories']/following-sibling::ul//*[@title='Dresses'])[2]"))).perform();
		
		
		Thread.sleep(5000);
		
		
		action.moveToElement(driver.findElement(By.xpath("(//div[text()='Categories']/following-sibling::ul//*[@title='Summer Dresses'])[2]"))).click().build().perform();
		
		
		Thread.sleep(10000);
		
		action.moveToElement(driver.findElement(By.xpath("(//div[@class='product-container'])[1]"))).perform();
		
		driver.findElement(By.xpath("(//*[@title='Add to cart'])[1]")).click();
		
		Thread.sleep(6000);
		
		String productAddedMsg = driver.findElement(By.xpath("//*[@title='Close window']/following-sibling::h2")).getText();
		System.out.println("Clicked on Add to cart");
		
		System.out.println(productAddedMsg);
		
		String productName = driver.findElement(By.xpath("//span[@id='layer_cart_product_title']")).getText();
		
		if(productAddedMsg.equals("Product successfully added to your shopping cart"))
			System.out.println("Product added to cart!!!!");
		
		String productQty = driver.findElement(By.xpath(" //span[@id='layer_cart_product_quantity']")).getText();
		
		String productPrice = driver.findElement(By.xpath("//span[@id='layer_cart_product_price']")).getText();
		
		System.out.println("Product Name is:   " + productName);
		
		System.out.println("Qty is:  " + productQty);
		
		System.out.println("Product Price is:   " + productPrice);
		
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']/span")).click();
		
		Thread.sleep(8000);
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("controller=order"))
			System.out.println("Navigated to checkout page");
		
		driver.quit();
	

	}

}
