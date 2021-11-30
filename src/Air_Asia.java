import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Air_Asia {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.airasia.co.in/home");	
	    driver.findElement(By.id("One Way")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='flight-search-source-code']")).click();
	    driver.findElement(By.xpath("//button[@id='list-item'][2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@id='list-item'][3]")).click();
	    driver.findElement(By.xpath("//div[@class='flight-search-date-picker-wrapper']")).click();
	    WebElement month= driver.findElement(By.xpath("//div[text()='Jan 2022']"));
	    WebElement date = driver.findElement(By.xpath("//div[@id='31']"));
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("arguments[0].scrollIntoView", month);
	    Actions a= new Actions(driver);
	    a.moveToElement(date).perform();
	    a.click().perform();
}
}
