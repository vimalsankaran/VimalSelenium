package selenium.test.cases;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Task_Insta_Day2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.instagram.com");
        Thread.sleep(3000);
        WebElement userid = driver.findElement(By.name("username"));
        String att = userid.getAttribute("aria-label");
        System.out.println(att);
        userid.sendKeys("vimalsankaran@gmail.com");
        String val = userid.getAttribute("value");
        System.out.println(val);
        boolean d  = userid.isDisplayed();
        System.out.println(d);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Vimal2121");
        TakesScreenshot a = (TakesScreenshot) driver;
        File s1 = a.getScreenshotAs(OutputType.FILE);
        File f1 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\insta1.png");
        FileHandler.copy(s1, f1);
        boolean f = password.isEnabled();
        System.out.println(f);
        driver.findElement(By.xpath("//div[text()='Log In']")).click();
        TakesScreenshot b = (TakesScreenshot) driver;
        File s2 = b.getScreenshotAs(OutputType.FILE);
        File f2 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\insta2.png");
        FileHandler.copy(s2, f2);
        //WebElement loginbtn = driver.findElement(By.name("sqdOP  L3NKy   y3zKF     "));
        //loginbtn.click();
	}
	
}
