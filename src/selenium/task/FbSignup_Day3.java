package selenium.task;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class FbSignup_Day3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("vimalsankaran@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Vimal23223");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		//driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        driver.findElement(By.xpath("(//a[@data-testid='open-registration-form-button'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='firstname'])")).sendKeys("Vimal");
		driver.findElement(By.xpath("(//input[@name='lastname'])")).sendKeys("Sankaran");
		driver.findElement(By.name("reg_email__")).sendKeys("vimalsankaran@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vimalsankaran@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Vimal@2212");
		WebElement date = driver.findElement(By.id("day"));
		Select sel = new Select(date);
		sel.selectByValue("14");
		WebElement month = driver.findElement(By.id("month"));
		Select sel1 = new Select(month);
		sel1.selectByIndex(11);
		List<WebElement> list = sel1.getOptions();
		for(int i=0; i<list.size();i++) {
		System.out.println(list.get(i).getText());
		}
		System.out.println("________________");
		System.out.println(list.get(0).getText());
		System.out.println(list.get(11).getText());
		System.out.println("________________");
		System.out.println("The Selected month is:" +sel1.getFirstSelectedOption().getText());
		WebElement year = driver.findElement(By.id("year"));
		Select sel2 = new Select(year);
		sel2.selectByVisibleText("1990");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		//WebElement txt = driver.findElement(By.xpath("(//div[text()='Sign Up'])"));
		//String str1=txt.getText();
		//System.out.println(str1);
		//WebElement txt1 = driver.findElement(By.xpath("//div[contains(text(),\"quick and easy.\")]"));
		//String str2 =txt1.getText();
		//System.out.println(str2);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File s1 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\fb1.png");
		FileHandler.copy(s, s1);
		Thread.sleep(10000);
		s=t.getScreenshotAs(OutputType.FILE);
		File s2 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\fb2.png");
		FileHandler.copy(s, s2);
		driver.close();
		}	
	}

