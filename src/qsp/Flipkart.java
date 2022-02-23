package qsp;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;


public class Flipkart 
{
      WebDriver driver;
      @Test
      public void flipkart() throws InterruptedException
	{
    	  
    	  String data="Laptops";
    	  
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\AutomationProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys(data);
		driver.findElement(By.className("L0Z3Pu")).click();
//		
//		String parentWin = driver.getWindowHandle();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
//		Thread.sleep(2000);
//		
//		Set<String> allWin = driver.getWindowHandles();
//		for(String wh:allWin)
//		{
//			String title = driver.switchTo().window(wh).getTitle();
//			System.out.println(title);
//			{		
//			if(title.equals(title))
//			{
//				
//			  driver.findElement(By.className("_36yFo0")).sendKeys("518401");
//			  driver.findElement(By.xpath("//span[text()='Check']")).click();
//			
//			  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//			  
//			  
//				break;	
//			}
			
	//	}
					
		//driver.switchTo().window(parentWin);
	//}
		
	}
    
//      @AfterMethod
//      public void failedScreenshot(ITestResult result) throws Throwable
//      {
//    	  if(ITestResult.FAILURE==result.getStatus()) {
//    		  TakesScreenshot ts = (TakesScreenshot) driver;
//  			File src = ts.getScreenshotAs(OutputType.FILE);
//  			File dest = new File("D:\\Selenium\\AutomationProject\\Screenshots\\failed1.jpg");
//  			Files.copy(src, dest);	  
//    	  }
//    	  else
//    	  {
//    		  Reporter.log("flipkart Method is not failed", true);
//    	  }
//    	  
//    	  
//    	  
//      }

}












