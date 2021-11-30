package selenium.test.cases;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Mini_Project1_2 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.getTitle();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("vimalsankaran@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Vimal@2021");
		driver.findElement(By.xpath("//i[@class=\"icon-lock left\"]")).click();
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-id-product='2']")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]/div/div[2]/div[2]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[5]/div/div[2]/div[2]/a[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();
		WebElement top1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[5]/div/a[2]/span/i"));
		WebElement top2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[5]/div/a[2]/span/i"));
		for(int i=1;i<=3;i++) {
			top1.click();
		}
		for(int j=1;j<=2;j++) {
			top2.click();
		}
		System.out.println(driver.findElement(By.id("cart_title")).getText());
		System.out.println();
		String s1=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[2]/p")).getText();
        String s2=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[2]/td[2]/p/a")).getText();
        String s3=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[5]/input[2]")).getAttribute("value");
        String s4=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[2]/td[5]/input[2]")).getAttribute("value");
        System.out.println("You have added"+s1+"of quantity"+s3);
        System.out.println("You have added"+s2+"of quantity"+s4);
        System.out.println();
        String s5=driver.findElement(By.id("total_product")).getText();
        String s6=driver.findElement(By.id("total_shipping")).getText();
        System.out.println("Total Product Cost:"+s5);
        System.out.println("Total Shipping Cost:"+s6);
        System.out.println();
        String add=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[3]/div[2]/ul")).getText();
        System.out.println("ADDRESS:");
        System.out.println(add);
        System.out.println();
		TakesScreenshot t = (TakesScreenshot) driver;
		File f = t.getScreenshotAs(OutputType.FILE);
		File f1 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\Project1.1.png");
		FileHandler.copy(f, f1);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/div/div[3]/textarea")).sendKeys("I will be available at My home from 9 A.M to 3 P.M");
		System.out.println("Delivery Note:"+driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/div/div[3]/textarea")).getText());
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File f2 = t1.getScreenshotAs(OutputType.FILE);
		File f3 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\Project1.2.png");
		FileHandler.copy(f2, f3);
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")).click();
        System.out.println();
		String ship=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[3]/text()[2]")).getText();
        System.out.println("Shipping Method:"+ship);
		TakesScreenshot t2 = (TakesScreenshot) driver;
		File f4 = t2.getScreenshotAs(OutputType.FILE);
		File f5 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\Project1.3.png");
		FileHandler.copy(f4, f5);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
		System.out.println();
		System.out.println("Payment Method:"+driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).getText());
		String order=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/div")).getText();
		System.out.println("PAYMENT SUMMARY:");
		System.out.println(order);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();
		TakesScreenshot t3 = (TakesScreenshot) driver;
		File f6 = t3.getScreenshotAs(OutputType.FILE);
		File f7 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\Project1.4.png");
		FileHandler.copy(f6, f7);
		driver.close();
	}

}
