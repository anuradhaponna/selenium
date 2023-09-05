package test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://testautomationpractice.blogspot.com/");
System.out.println(driver.getCurrentUrl());
driver.get("https://www.meesho.com/");
System.out.println(driver.getPageSource());
System.out.println(driver.getTitle());
System.out.println(driver.getWindowHandle());
System.out.println(driver.getWindowHandles());
System.out.println(driver.manage());
System.out.println(driver.navigate());
CharSequence anu;
System.out.println();
System.out.println(driver.findElements(null));
System.out.println(driver.switchTo());
driver.close();
driver.quit();






	}

}
      