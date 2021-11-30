package selenium.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Task2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(10000);
		//Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage= driver.switchTo().alert().getText(); 
		System.out.println(alertMessage);
		
	}

}
