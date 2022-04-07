package com.training.testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	
	
	@Parameters ({"val1", "val2"})
	@Test
	public void sum(int a, int b) {
		System.out.println("Sum of " + a + " and " + b  +  " is: " + (a + b));
		Reporter.log("Sum of " + a + " and " + b  +  " is: " + (a + b));
		
	}

}
