package selenium.task;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ultimate_Forms {

	public static void main(String[] args) throws Throwable {
            
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ultimateqa.com/filling-out-forms");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Vimal");
		driver.findElement(By.xpath("//textarea[@placeholder='Message'][1]")).sendKeys("Welcome to Greens Technologies");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		TakesScreenshot t = (TakesScreenshot) driver;
		File f = t.getScreenshotAs(OutputType.FILE);
		File f1 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\ultimateform1.png");
		FileHandler.copy(f, f1);
		driver.findElement(By.xpath("//input[@id='et_pb_contact_name_1']")).sendKeys("Vimal");
		driver.findElement(By.xpath("//textarea[@id=\"et_pb_contact_message_1\"]")).sendKeys("Welcome to Greens Technologies");
		WebElement capcha = driver.findElement(By.xpath("//span[@class='et_pb_contact_captcha_question']"));
		String s=capcha.getText();
		System.out.println(s);
        String str=s.replaceAll("\\s", "");
        String[] string=str.split("\\+");
        String str1=string[0];
        String str2=string[1];
		System.out.println("Captcha Number1:"+str1);
		System.out.println("Captcha Number2:"+str2);
		Integer i1= Integer.valueOf(str1);
		Integer i2= Integer.valueOf(str2);
	    Integer cap=i1+i2;
	    String ans= String.valueOf(cap);
		System.out.println("Captcha Input:"+ans);
		driver.findElement(By.xpath("//input[@class=\"input et_pb_contact_captcha\"]")).sendKeys(ans);
		driver.findElement(By.xpath("/html/body/div/div/div/div/article/div/div/div/div/div[2]/div[2]/div/div[2]/form/div/button")).click();
		Thread.sleep(3000);
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File f2 = t1.getScreenshotAs(OutputType.FILE);
		File f3 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\ultimateform2.png");
		FileHandler.copy(f2, f3);
		driver.close();
	}
}
