package selenium.test.cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTask2 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/iframe");	
	    System.out.println(driver.getCurrentUrl());
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println("Frame Size:  "+frames.size());
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("/html/body/p")).getText());
		driver.findElement(By.xpath("/html/body/p")).clear();
		driver.findElement(By.xpath("/html/body/p")).sendKeys("Welcome to Automation Testing");
		System.out.println(driver.findElement(By.xpath("/html/body/p")).getText());
		driver.close();
	}
}
