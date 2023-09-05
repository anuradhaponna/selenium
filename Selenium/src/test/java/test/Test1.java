package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Throwable {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://expressgrocerys.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension (100, 400));
		Thread.sleep(4000);
		driver.manage().window().setPosition(new  Point(100, 400));
		
		
		
		
	}

}
