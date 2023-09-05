package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	driver.manage().window().maximize();
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(15));
	driver.findElement(By.id("populate-text")).click();
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.id("h2"));
	driver.findElement(By.id("checkbox")).click();
	wait.until(ExpectedConditions.visibilityOf(element));
	System.out.println(element.isDisplayed());
	//System.out.println(element.isSelected());
	//System.out.println(element.isEnabled());
	
	
	
	
	
	
	
	
}
}
