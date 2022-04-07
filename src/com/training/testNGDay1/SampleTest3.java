package com.training.testNGDay1;

import org.testng.annotations.Test;

public class SampleTest3 extends BaseTest{
  @Test(groups = "Smoke")
  public void f() {
	  System.out.println("Inside Sample Test3");
  }
}
