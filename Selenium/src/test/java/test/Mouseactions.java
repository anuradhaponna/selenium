package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement hover=driver.findElement(By.xpath("//span[text()=\"Convert PDF\"]"));
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		ac.moveToElement(hover).build().perform();
		Thread.sleep(2000);
        ac.doubleClick(hover).build().perform();
		Thread.sleep(2000);
		ac.contextClick(hover).build().perform();//use to right click in mouse
		
		
		
		
		
		
		
		
		
		
		
	}

}
