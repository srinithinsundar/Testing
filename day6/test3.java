package com.example.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_6_3 {
		public  static void main(String[] args) throws InterruptedException
		{
			WebDriverManager.edgedriver().setup();
		    WebDriver driver = new EdgeDriver();
		    String url="https://demo.wpeverest.com/user-registration/paypal-integration-form/";
		    driver.navigate().to(url);
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("synthiyasuresh1414@gmail.com");
		    driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("synthiya");
		    driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Keyboard\"]")).click();
		    driver.findElement(By.xpath("//*[@id=\"user-registration-form-310\"]/form/div[2]/button")).click();
		    WebElement checkbox =driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_CPU i5 8th Gen\"]"));
		    if(!checkbox.isSelected())
		    {
		    	System.out.println("Selected");
		    }
		    Thread.sleep(5000);
		    driver.quit();
		}

	

}