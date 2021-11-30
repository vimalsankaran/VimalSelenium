package selenium.test.cases;

import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Selenium_Testsite {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        WebElement txt = driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site ')]"));
        System.out.println(txt.getText());
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vimal");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Sankaran");
        driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("1/60, Avvaiyar Street, Tirukoilur");
        driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("vimalsankaran@gmail.com");
        driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("9876542143");
        driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("firstpassword")).sendKeys("Vimal@2122");
        driver.findElement(By.id("secondpassword")).sendKeys("Vimal@2122");
        driver.findElement(By.xpath("//button[text()=\" Submit \"]")).click();
        Thread.sleep(1000);
        Screenshot sc= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(sc.getImage(),"PNG",new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\auto1.png"));
        driver.close();
	}
}
