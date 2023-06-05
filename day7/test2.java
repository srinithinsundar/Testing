package com.example.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {
  int num1=20;
  int num2=10;
  @Test(priority=1)
  
  public void add() {
	  int sum=num1+num2;
	  Assert.assertEquals(sum,30);
	  }
  @Test(priority=4)
  public void subtract()
  {
	  int dif=num1-num2;
	  Assert.assertEquals(dif, 10);
  }
  @Test(priority=3)
  public void multiply()
  {
	  int prod=num1*num2;
	  Assert.assertEquals(prod, 200);
  }
  @Test(priority=2)
  public void divide()
  {
	  int quotient=num1/num2;
	  Assert.assertEquals(quotient, 2);
  }
}