package selenium.test.cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Task1 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		System.out.println(driver.getCurrentUrl());
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println("Frame Size:  "+frames.size());
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("/html/body/p")).getText());
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		driver.close();
	}

}
