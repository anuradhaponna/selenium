package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws Throwable {
/*x-path by multiple attributes >>>>>//tagname [@AN='av' and @AN='AV']
 *x-Path by multiple attributes>>>>>>//tagname[@AN='AV' and text()='text value']
 *x-path by contains function>>>>>>>//tagname[contains(@AN),'AV']
 * 
 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
driver.get("https://www.facebook.com/")	;	
Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@type='text' and @class='inputtext _55r1 _6luy']")).sendKeys("ganesh shreya");
//Thread.sleep(2000);
driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@aria-label='Surname' and text()='First name']")).sendKeys("anu ponna");

		
	}

}
