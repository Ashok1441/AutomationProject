package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cleartrip {
	
	 WebDriver driver;
     @Test
     public void ashok() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\AutomationProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//div[text()='Flights']")).click();
		driver.findElement(By.xpath("//p[text()='Multi-city']")).click();
	}
}
