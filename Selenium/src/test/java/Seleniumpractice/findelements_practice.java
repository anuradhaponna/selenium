package Seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements_practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
//find elements FROM address
		driver.findElement(By.id("src")).sendKeys("hyd");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//text"));
		System.out.println(list.size());

		for (WebElement anu : list) {
			System.out.println(anu.getText());
		}
		for (WebElement anu : list) {
			if (anu.getText().equals("Kukatpally, Hyderabad")) {
				anu.click();
				break;
			}

		}

//find elelments TO address

		driver.findElement(By.id("dest")).sendKeys("kolkata");
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//text"));
		System.out.println(list1.size());

		for (WebElement ele : list1) {
			System.out.println(ele.getText());
		}
		for (WebElement anu1 : list1) {
			if (anu1.getText().equals("Thane West, Mumbai")) {
				anu1.click();
				break;
			}

			driver.findElement(By.id("class=\"dateText\"")).sendKeys("13-september-2023");

		}

	}
}
