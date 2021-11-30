package selenium.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Task3 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//span[@class='mr-3'])[1]")).getText());
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println();
		System.out.println(driver.findElement(By.xpath("(//span[@class='mr-3'])[2]")).getText());
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println();
		System.out.println(driver.findElement(By.xpath("(//span[@class='mr-3'])[3]")).getText());
		driver.findElement(By.id("confirmButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		System.out.println();
		System.out.println(driver.findElement(By.xpath("(//span[@class='mr-3'])[4]")).getText());
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("JAVA");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		driver.close();
        
	}

}
