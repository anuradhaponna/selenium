package Seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emph {
	public static void main(String[] args) {
		
	
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(15));
driver.get("http://empirehome.myprojectsonline.co.in/");
driver.manage().window().maximize();
driver.findElement(By.name("emailid")).sendKeys("sureshbabuemp@gmail.com");
driver.findElement(By.name("pword")).sendKeys("ZPMHQHIA");
driver.findElement(By.xpath("//button[text()='Login']")).click();
driver.findElement(By.xpath("//i[@class='fa fa-houzz']")).click();
driver.findElement(By.xpath("//a[@href='/Inventory/InventoryData']")).click();
WebElement ele =driver.findElement(By.xpath("//input[@name='RecievedDate']")).sendKeys("13-12-1999");
















}
}