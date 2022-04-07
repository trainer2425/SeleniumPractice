package com.training.testNGDay1;

import org.testng.annotations.Test;

public class NewTest extends BaseTest{
  @Test(groups = "Regression")
  public void f() {
	  System.out.println("Newly added test cases");
  }
}
