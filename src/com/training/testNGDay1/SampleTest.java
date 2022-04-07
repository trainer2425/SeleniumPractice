package com.training.testNGDay1;

import org.testng.annotations.Test;

public class SampleTest extends BaseTest{
	
  @Test(groups = "Smoke")
  public void f() {
	  System.out.println("Inside Sample Test");
  }
  
  @Test(groups = "Regression")
  public void g() {
	  System.out.println("Inside Sample Test");
  }
  
  
}
