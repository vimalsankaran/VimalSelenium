package selenium.task;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project1 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.getTitle();
		driver.findElement(By.className("login")).click();
		System.out.println(driver.findElement(By.className("page-subheading")).getText());
	    System.out.println("Sign Up Page URL:"+driver.getCurrentUrl());
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),\"create an account\")]")).getText());
	    driver.findElement(By.id("email_create")).sendKeys("vimalsankdamran@gmail.com");
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/form/div/div[3]/button/span")).click();
	    System.out.println();
	    System.out.println("Current URL:"+driver.getCurrentUrl());
	    System.out.println("Current Page Heading: "+driver.findElement(By.className("page-subheading")).getText());
	   // System.out.println(driver.findElement(By.xpath("//label[@text()='Title']")).getText());
	    Thread.sleep(2000);
	    System.out.println();
	    boolean b1 =driver.findElement(By.name("id_gender")).isSelected();
	    if(b1==true) {
	    System.out.println("Salutation Radio Button is Selected");}else {
	    	System.out.println("Salutation Radio Button is not selected");
	    }
	    System.out.println();
	    driver.findElement(By.id("id_gender1")).click(); 
	    boolean b2 =driver.findElement(By.name("id_gender")).isSelected();
	    if(b2==true) {
	    System.out.println("Salutation Radio Button is Selected with : "+driver.findElement(By.xpath("//label[@for='id_gender1']")).getText());}else {
	    	System.out.println("Salutation Radio Button is not selected");
	    }
	    System.out.println();
	    System.out.println(driver.findElement(By.xpath("//label[@for='customer_firstname']")).getText());
	    driver.findElement(By.id("customer_firstname")).sendKeys("Vimal");
	    System.out.println(driver.findElement(By.id("customer_firstname")).getAttribute("value"));
	    System.out.println();
	    System.out.println(driver.findElement(By.xpath("//label[@for='customer_lastname']")).getText());
	    driver.findElement(By.id("customer_lastname")).sendKeys("Sankaran");
	    System.out.println(driver.findElement(By.id("customer_lastname")).getAttribute("value"));
	    System.out.println();
	    System.out.println(driver.findElement(By.xpath("//label[@for='email']")).getText());
	    System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
	    System.out.println();
	    System.out.println(driver.findElement(By.xpath("//label[@for='passwd']")).getText());
	    System.out.println(driver.findElement(By.className("form_info")).getText());
	    driver.findElement(By.id("passwd")).sendKeys("Vimal@2021");
	    System.out.println();
	    
	    WebElement day = driver.findElement(By.id("days"));
	    Select s1=new Select(day);
	    s1.selectByIndex(14);
	    
	    WebElement month = driver.findElement(By.id("months"));
	    Select s2=new Select(month);
	    s2.selectByVisibleText("December ");
	    
	    WebElement year = driver.findElement(By.id("years"));
	    Select s3=new Select(year);
	    s3.selectByValue("1990");
	    
	    if(s1.isMultiple()||s2.isMultiple()||s3.isMultiple() == true) {
	    	System.out.println("Date of Birth drop down is Multiple Drop Down");
	    }else {
	    	System.out.println("Date of Birth drop down is not Multiple");
	    }
	    System.out.println();
	    System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/div[6]/label")).getText());
	    System.out.println(s1.getFirstSelectedOption().getText());
	    System.out.println(s2.getFirstSelectedOption().getText());
	    System.out.println(s3.getFirstSelectedOption().getText());
	    System.out.println();
	    System.out.println(driver.findElement(By.xpath("//label[@for='newsletter']")).getText());
	    if(driver.findElement(By.xpath("//label[@for='newsletter']")).isSelected()==true) {
	    	System.out.println("Newsletter Sign up Radio Button is Selected");
	    }else {
	    	System.out.println("Newsletter Sign up Radio Button is not Selected");
	    }
	    System.out.println();
	    System.out.println();
	    System.out.println(driver.findElement(By.className("page-subheading")).getText());
	    System.out.println();
	    //driver.findElement(By.id("firstname")).sendKeys("Vimal");
	    //driver.findElement(By.id("lastname")).sendKeys("Sankaran");
	    driver.findElement(By.id("company")).sendKeys("Greens Technologies");
	    driver.findElement(By.id("address1")).sendKeys("3, Leisure Lane");
	    driver.findElement(By.id("address2")).sendKeys("Boulder St");
	    driver.findElement(By.id("city")).sendKeys("Los Angeles");
	    WebElement state = driver.findElement(By.id("id_state"));
	    Select s4=new Select(state);
	    s4.selectByVisibleText("California");
	    driver.findElement(By.id("postcode")).sendKeys("91303");
	    driver.findElement(By.id("other")).sendKeys("Landmark: Near KFC");
	    //driver.findElement(By.id("phone")).sendKeys("9842123456");
	    driver.findElement(By.id("phone_mobile")).sendKeys("9842123456");
	    driver.findElement(By.id("alias")).clear();
	    driver.findElement(By.id("alias")).sendKeys("Home");
	    Thread.sleep(4000);
	    System.out.println("Given Personal Information:");
	    System.out.println();
	    System.out.println("First Name: "+driver.findElement(By.id("firstname")).getAttribute("value"));
	    System.out.println();
	    System.out.println("Last Name: "+driver.findElement(By.id("lastname")).getAttribute("value"));
	    System.out.println();
	    System.out.println("Company: "+driver.findElement(By.id("company")).getAttribute("value"));
	    System.out.println();
	    System.out.println("Address: ");
	    System.out.println(driver.findElement(By.id("address1")).getAttribute("value"));
	    System.out.println(driver.findElement(By.id("address2")).getAttribute("value"));
	    System.out.println(driver.findElement(By.id("city")).getAttribute("value"));
	    System.out.println(s4.getFirstSelectedOption().getText());
	    System.out.println("ZIP Code:"+driver.findElement(By.id("postcode")).getAttribute("value"));
	    System.out.println();
	    System.out.println("Additional Information: ");
	    System.out.println(driver.findElement(By.id("other")).getAttribute("value"));
	    System.out.println();
	    System.out.println("Phone: "+driver.findElement(By.id("phone")).getAttribute("value"));
	    System.out.println();
	    System.out.println("Mobile: "+driver.findElement(By.id("phone_mobile")).getAttribute("value"));
	    System.out.println();
	    System.out.println("Address Reference Name:  "+driver.findElement(By.id("alias")).getAttribute("value"));
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span")).click();
	    Thread.sleep(3000);
		TakesScreenshot t = (TakesScreenshot) driver;
		File f = t.getScreenshotAs(OutputType.FILE);
		File f1 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\Project1.png");
		FileHandler.copy(f, f1);
		driver.close();
	}
}
