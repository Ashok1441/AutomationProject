package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNewTab {
	
	public static void main(String args[]) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\AutomationProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/windows");
		String parentwin = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		for(String win:allwin) {
			Thread.sleep(2000);
			String title = driver.switchTo().window(win).getTitle();
			//System.out.println(title);
			if(title.equals("New Window")) {
				String text = driver.findElement(By.tagName("h3")).getText();
				break;
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(parentwin);
	}

}
