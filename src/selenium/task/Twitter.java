package selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twitter.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Log in'])")).click();
        Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vimalsankaran@gmail.com");
	}

}
