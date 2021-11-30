package selenium.test.cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Day1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.navigate().to("https://www.instagram.com");
        driver.navigate().back();
        driver.navigate().to("https://www.youtube.com");
        String a,b;
        a= driver.getTitle();
        System.out.println(a);
        b = driver.getCurrentUrl();
        System.out.println(b);
        driver.navigate().back();
        driver.navigate().to("https://twitter.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        a= driver.getTitle();
        System.out.println(a);
        b = driver.getCurrentUrl();
        System.out.println(b);
        driver.close();
	}
}
