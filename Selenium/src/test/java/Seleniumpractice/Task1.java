package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//a[@rel='async']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("anu");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("ponna");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("vemareddypalleanuradha@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("vemareddypalleanuradha@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("#anu#6302");
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@id='day']")).sendKeys("12");
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("december");
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@title='Year']")).sendKeys("1999");
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Female']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Male']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Custom']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@name='preferred_pronoun']")).sendKeys("she:wish her a happy birthday");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@aria-label='Gender (optional)']")).sendKeys("anu radha");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
Thread.sleep(2000);


	}

}
