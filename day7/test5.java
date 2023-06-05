package com.example.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7_5 {
	WebDriver driver= new EdgeDriver();
  @Test
  public void executeURL() throws InterruptedException{
			WebDriverManager.edgedriver().setup();
			driver.get("https://www.godaddy.com/en-in");
			driver.manage().window().maximize();
	  String actual=driver.getTitle();
	  String expected="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy";
	  Assert.assertEquals(expected,actual);
	  String url=driver.getCurrentUrl();
	  String expectedurl="https://www.godaddy.com/en-in";
	  Assert.assertEquals(expectedurl,url);
	  driver.close();
	  
  }
  public void automate1()
  {
	  WebDriverManager.edgedriver().setup();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		
  }
}