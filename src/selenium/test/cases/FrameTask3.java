package selenium.test.cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTask3 {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/nested_frames");
	    System.out.println(driver.getCurrentUrl());
		List<WebElement> frames=driver.findElements(By.tagName("frame"));
		System.out.println("Frame Size:  "+frames.size());
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		System.out.println(driver.findElement(By.xpath("/html")).getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("/html/body/div")).getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		driver.close();
	}
	
}
