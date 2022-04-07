package com.training.testNGDay1;

import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest{
	
	
  @Test(groups = {"Regression","AddToCartModule"} )
  public void addFirstproductToCart() {
	  
	  System.out.println("Inside the method addFirstproductToCart()");
  }
  
  
  @Test(groups = {"Regression","AddToCartModule"})
  public void addMultipleProductsToCart() {
	  
	  System.out.println("Inside the method addMultipleProductsToCart()");
  }
  
  
  
}
