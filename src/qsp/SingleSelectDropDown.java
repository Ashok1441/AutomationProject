package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\AutomationProject\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/selenium%20notes/singledropdown.html");
		
		WebElement seladd = driver.findElement(By.id("novotel"));
		
		Select sel = new Select(seladd);
		List<WebElement> options = sel.getOptions();
		System.out.println(options.size());
		sel.selectByIndex(2);
//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());
//			
//		}
		
		
	}

}
