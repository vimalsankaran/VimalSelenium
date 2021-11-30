package selenium.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Task1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	    driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	    driver.switchTo().alert().dismiss();
	    String t1= driver.findElement(By.id("demo")).getText();
	    System.out.println(t1);
	    System.out.println();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	    driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	    Alert alert = driver.switchTo().alert();
	    String name = "Java";
	    alert.sendKeys(name);
	    String t = alert.getText();
	    System.out.println(t);
	    System.out.println();
	    System.out.println("Entered Name:"+name);
	    alert.accept();
	    String t2= driver.findElement(By.id("demo1")).getText();
	    System.out.println();
	    System.out.println(t2);
	    boolean b = t2.toLowerCase().contains(name.toLowerCase());
	    System.out.println();
	    System.out.println("Message contains given name:"+b);
	    driver.close();
	}

}
