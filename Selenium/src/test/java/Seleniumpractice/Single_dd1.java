package Seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_dd1 {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement web=driver.findElement(By.id("course"));
		Select sel=new Select(web);
		List<WebElement> wb=sel.getOptions();
		for(WebElement aa:wb)
		{
			System.out.println(aa.getText());
		}
		
		
	      sel.selectByIndex(1);
		  Thread.sleep(2000);
	      sel.selectByVisibleText("Python");
	      Thread.sleep(2000);
          sel.selectByValue("js");
		
		
		
		
		
	}

}
