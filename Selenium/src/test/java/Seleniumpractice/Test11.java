package Seleniumpractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://expressgrocerys.com/");
Thread.sleep(2000);
driver.manage().window().minimize();
Thread.sleep(2000);
driver.manage().window().setSize(new Dimension (200, 500));
Thread.sleep(2000);
driver.manage().window().setPosition(new Point (100, 400));





	}

}
