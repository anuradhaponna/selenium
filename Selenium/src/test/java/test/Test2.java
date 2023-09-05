package test;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {

		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		//driver.get("https://www.meesho.com/");
		/*System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());*/
		
		//System.out.println(driver.getWindowHandle());
		
		//driver.findElement(By.linkText("Home")).click();
//driver.findElement(By.id("name")).sendKeys("jakkam");
		//WebElement name=driver.findElement(By.id("name"));
		//name.sendKeys("welcome everyone");
		
		
		//driver.findElement(By.id("female"));
		WebElement checkbox=driver.findElement(By.id("female"));
		checkbox.click();
System.out.println(checkbox.isSelected());

//driver.findElement(By.id("monday"));
WebElement check=driver.findElement(By.id("monday"));
check.click();
System.out.println(check.isSelected());

//driver.findElement(By.id("thursday"));
WebElement check1=driver.findElement(By.id("thursday"));
check1.click();
System.out.println(check1.isSelected());
	}

}
