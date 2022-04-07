package com.training.parameters;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {

	
	@Parameters({"value1","value2"})
	 @Test
	  public void m1(int a, int b) {
		  System.out.println("Test cases without parameters");
		 Reporter.log("Product of " + a + " and " + b + " is:  " + (a*b));
	  }
}
