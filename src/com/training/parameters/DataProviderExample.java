package com.training.parameters;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	
  @Test(dataProvider = "dataProviderMethod")
  public void sum(int a, int b) {
	 Reporter.log("Sum of both values is: " + (a+ b));
  }
  
  
  @DataProvider(name = "dataProviderMethod")
  public Object[][] testData() {
	  Object[][] data = new Object[3][2];
	  
	  data[0][0] = 10;
	  data[0][1] = 20;
	  
	  data[1][0] = 40;
	  data[1][1] = 50;
	  
	  
	  data[2][0] = 100; 
	  data[2][1] = 200;
	  
	  return data;
	  
	  
  }
}
