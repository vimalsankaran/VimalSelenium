package selenium.test.cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        driver.get("https://www.facebook.com");
        driver.navigate().to("https://www.instagram.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        //driver.close();
        String a = driver.getTitle();
        System.out.println(a);
        String b = driver.getCurrentUrl();
        System.out.println(b);
	}

}
