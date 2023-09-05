package Seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dd11 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement web= driver.findElement(By.id("ide"));
		Select sel=new Select(web);
		List<WebElement>ele=sel.getOptions();
		for(WebElement aa:ele)
		{
			System.out.println("all options"   +aa.getText());
		}
		sel.selectByIndex(0);
		Thread.sleep(5000);
		sel.selectByVisibleText("IntelliJ IDEA");
		Thread.sleep(2000);
		sel.selectByValue("nb");
		
		
		List<WebElement>ele1=sel.getAllSelectedOptions();
		for(WebElement bb:ele1)
		{
			System.out.println("all  selected options"   +bb.getText());
		}
		
		WebElement cc=sel.getFirstSelectedOption();
		System.out.println("all  first selected options"  +cc.getText());
		
		if(sel.isMultiple())
		{
			System.out.println("is multiple is dd");
		}
		else
		{
			System.out.println("is not multiple dd");
		}
	}

	}


