package Seleniumpractice;
/*1.X-Path by Unique attributes .====>>>>//tagname[@AN='AV']
 *2.X-Path by text()function.=====>>>>>//tagname[text()='text value']
 *3.X-Path by Multiple attributes.=====>>>>>>>//tagname[@AN='AV' and text()='text value']
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get("https://www.facebook.com/"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@type='text']")).
		 * sendKeys("ganesh shreya"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(
		 * "6302504220"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		 */

		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.xpath("//a[text()='Cancel Ticket']")).click();
		Thread.sleep(2000);

		/*
		 * x-path by unique attributes;>>>>>>//tagname[@AV='AN'] "//input[@type='text']"
		 * "//input[@name='email']" "//input[@type='password']" "//input[@id='pass']"
		 * "//input[@placeholder='Password']"
		 */

		/*
		 * x-path by text() function;>>>>>>//tagname[text()='text value']
		 * "//a[@text()='Forgotten password?']" fb
		 * "//span[text()='Log in with Facebook']" 
		 * "//span[text()='Sign up']"
		 * "//a[text()='Forgot password?']" 
		 * "//a[text()='Ticket Status']"
		 * "//a[text()='Cancel Ticket']"
		 */

	}
}