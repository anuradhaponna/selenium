package Seleniumpractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Screenshot {
public static void main(String[] args) throws Throwable{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	
	//SCREEN SHOTS FOR WEBPAGE
	
	//synatx:parent class p=new childclass();
	//childclass c=(childclass)parent reference variable
	TakesScreenshot ts= (TakesScreenshot)driver;
	File From=ts.getScreenshotAs(OutputType.FILE);
	File to=new File("C:\\Users\\user\\Desktop\\my pics.jpg");
	Files.copy(From, to);
	
	
	//PARTICULAR ELEMENT ON WEBPAGE
	WebElement ele=driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).
			File From = ts.getScreenshotAs(OutputType.FILE);
	File to1=new File("");
	Files.copy(From, to1);
	
	
	
	
	
	
		
		
	
	
	
	
	
	
	
}
}
