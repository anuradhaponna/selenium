package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement element=driver.findElement(By.id("saturday"));
		element.click();
		
		System.out.println(element.isSelected());
		Thread.sleep(2000);
		System.out.println(element.isDisplayed());
		Thread.sleep(2000);

		System.out.println(element.isEnabled());
	}

}
