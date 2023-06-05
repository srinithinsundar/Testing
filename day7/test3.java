package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Day7_3 {
	WebDriver driver;
  @Test
  @BeforeMethod
  public void beforeMethod() throws InterruptedException{
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	
	   }
  @Test
  public void underMethod() throws InterruptedException
  {
	  Thread.sleep(2000);
	  //username
	  WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys("Admin");
	  //password
	  WebElement password= driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  //click login

	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	    //validate login
  String actualURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	  String expectedURL=driver.getCurrentUrl();
	  Assert.assertEquals(expectedURL, actualURL);
	
}
  @Test
  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }
