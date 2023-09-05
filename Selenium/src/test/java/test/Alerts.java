package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//driver.findElement(By.cssSelector("[onclick='alertbox()']")).click();
		//driver.findElement(By.xpath("//a[@class='analystic']")).click();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		
		
		
		Alert al=driver.switchTo().alert();
		Thread.sleep(3000);
		//al.accept();
		//al.dismiss();
		al.sendKeys("hello everyone");
	}

}
