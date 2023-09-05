package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdraganddrop {
	public static void main(String[] args) {
		
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/droppable");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

Actions act=new Actions(driver);

WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));

WebElement target=driver.findElement(By.xpath("(//div[@id='droppable'])"));

act.dragAndDrop(source, target).perform();
}
}