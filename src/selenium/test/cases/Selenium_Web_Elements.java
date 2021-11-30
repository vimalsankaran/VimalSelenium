package selenium.test.cases;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selenium_Web_Elements {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com");
        WebElement username = driver.findElement(By.id("email"));
        String att = username.getAttribute("placeholder");
        System.out.println(att);
        username.sendKeys("psvimalbe@gmail.com");
        String val = username.getAttribute("value");
        System.out.println(val);
        //username.clear();
        //boolean d  = username.isDisplayed();
        //System.out.println(d);
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Vimal2121");
        boolean f = password.isEnabled();
        TakesScreenshot a = (TakesScreenshot) driver;
        File s1 = a.getScreenshotAs(OutputType.FILE);
        File f1 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\insta1.png");
        FileHandler.copy(s1, f1);
        System.out.println(f);
        WebElement loginbtn = driver.findElement(By.name("login"));
        loginbtn.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.id("u_0_2_hf")).click();
}      
}
