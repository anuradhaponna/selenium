package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webtable2 {
	WebDriver driver;
	  @BeforeTest
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    }

	    @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @Test
	    public void test1() {
	        driver.get("https://cosmocode.io/automation-practice-webtable/");
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,500)", "");

	        int rowsCount = driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
	        System.out.println(rowsCount);
	        int columnCount = driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
	        System.out.println(columnCount);

	        for (int i = 2; i <= rowsCount; i++) {
	            for (int j = 2; j <= columnCount; j++) {
	                String value = driver.findElement(By.xpath("//table[@id='countries']//tr[" + i + "]//td[" + j + "]")).getText();
	                System.out.println(value);
	            }
	        }

	        CellValue(driver, "4", "4");
	        CellValue(driver, "5", "2");

	        checkboxclick(driver, "3");
	        checkboxclick(driver, "6");
	    }

	    public static void CellValue(WebDriver driver, String rowNumber, String columnNumber) {
	        String cellValue = driver.findElement(By.xpath("//table[@id='countries']//tr[" + rowNumber + "]//td[" + columnNumber + "]")).getText();
	        System.out.println(cellValue);
	    }

	    public static void checkboxclick(WebDriver driver, String rowNumber) {
	        driver.findElement(By.xpath("//table[@id='countries']//tr[" + rowNumber + "]//td[1]//input")).click();
	    }
	}

