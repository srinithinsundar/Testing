package com.example.testing.day5;

public class Test1 {
	public static <JavascriptExecutor> void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://j2store.net/free/");
		
		driver.manage().window().maximize();
		
		String title1 = driver.getTitle();
		
		if(title1.equals("Home"))
		{
			System.out.println("It is Home");
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        ((Object) js).executeScript("window.scrollBy(0,1000)", "");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();
        
		String title2 = driver.getTitle();
		
		if(title2.equals("Shop"))
		{
			System.out.println("It is Shop");
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}