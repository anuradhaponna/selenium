package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://itera-qa.azurewebsites.net/home/automation");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.id("name")).sendKeys("anu");
driver.findElement(By.id("phone")).sendKeys("6302504220");
driver.findElement(By.id("email")).sendKeys("anuradha.marolix99@gmail.com");
driver.findElement(By.id("password")).sendKeys("12345");
driver.findElement(By.id("address")).sendKeys(" naik nagar,Anantapur");
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

driver.findElement(By.id("female")).click();
driver.findElement(By.id("monday")).click();
driver.findElement(By.id("saturday")).click();
driver.findElement(By.xpath("//option[@value='6']")).click();
driver.findElement(By.xpath("//option[@value='5']")).click();
driver.findElement(By.xpath("//option[@value='3']")).click();
driver.findElement(By.xpath("//label[@for='3years']")).click();
driver.findElement(By.xpath("//label[@for='testng']")).click();
driver.findElement(By.xpath("//label[@for='selenium']")).click();
driver.findElement(By.id("file")).click();
driver.findElement(By.id("//span[@class='input-group-text']")).click();








	}

}
