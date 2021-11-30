package selenium.task;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AirAsia_Project {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.airasia.co.in/home");	
	    driver.findElement(By.id("One Way")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='flight-search-source-code']")).click();
	    driver.findElement(By.xpath("//button[@id='list-item'][2]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//button[@id='list-item'][3]")).click();
	    driver.findElement(By.xpath("//div[@class='flight-search-date-picker-wrapper']")).click();
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    WebElement month= driver.findElement(By.xpath("//div[text()='Dec 2021']"));
	    jse.executeScript("arguments[0].scrollIntoView()",month);
	    Thread.sleep(4000);
	    WebElement dr = driver.findElement(By.xpath("//div[@id='31'][1]"));
        Actions a = new Actions(driver);
        a.moveToElement(dr).perform();
        a.click().perform();
        
        driver.findElement(By.xpath("//button[text()='Back']")).click();
	    driver.findElement(By.xpath("//div[@class='flight-seach-passanger-select']")).click();
	    driver.findElement(By.xpath("//img[@alt='plus'][1]")).click();
	    driver.findElement(By.xpath("//img[@alt='plus'][1]")).click();
	    driver.findElement(By.xpath("//img[@id='scp'][2]")).click();
		TakesScreenshot t2 = (TakesScreenshot) driver;
		File f4 = t2.getScreenshotAs(OutputType.FILE);
		File f5 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\AirAsia1.png");
		FileHandler.copy(f4, f5);
	    driver.findElement(By.xpath("//button[text()='Done']")).click();
	    driver.findElement(By.xpath("//img[@alt='select']")).click();
	    driver.findElement(By.name("nonstop")).click();
	    driver.findElement(By.xpath("//label[@id='arrAfterSix']")).click();
	    System.out.println("Prices For Economy:");
	    for(int i=1;i<=5;i++) {
	    	System.out.println(driver.findElement(By.xpath("//label[@class='discounted-price'][i]")).getText());
	    	
	    }
	    }
	}

