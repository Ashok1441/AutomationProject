package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultilpeWindows {
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\AutomationProject\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
//		String wh = driver.getWindowHandle();
//		System.out.println(wh);
		
	    /*//to close main window
		driver.close();
		
		//to close all windows opened by selenium
		driver.quit();
	*/
		Set<String> whs = driver.getWindowHandles();
//		for(String wh:whs) {
//			driver.switchTo().window(wh);
//			driver.close();
//			Thread.sleep(3000);
//		}
		
		//perform action on a particular browser
		for(String wh:whs) {
			
			String title = driver.switchTo().window(wh).getTitle();
			System.out.println(title);
			if(title.equals("Tech Mahindra")) {
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.close();
				break;
			}
		}
		
	}

}
