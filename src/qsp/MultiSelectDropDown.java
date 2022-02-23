package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\AutomationProject\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/selenium%20notes/multipledropdown.html");
		
       WebElement seladd = driver.findElement(By.id("novotel"));
		
		Select sel = new Select(seladd);
		List<WebElement> allOpt = sel.getOptions();
		System.out.println("Total Options in DD: "+allOpt.size()); 
//		for(int i=0;i<allOpt.size();i++)
//			 {
//			 System.out.println(allOpt.get(i).getText());
//			 sel.selectByIndex(i);
//			 }
//		sel.deselectAll();
		
		for(int i=2;i<=5;i++)
			 {
			 sel.selectByIndex(i);
			}
			 
			 List<WebElement> alSelOp = sel.getAllSelectedOptions();
			 System.out.println(alSelOp.size());
			 
//			 WebElement firstSelOp = sel.getFirstSelectedOption();
//		    System.out.println(firstSelOp.getText()); 
		    
		    WebElement wrapEle = sel.getWrappedElement(); 
		    System.out.println(wrapEle.getText()); 
		
	}

}
