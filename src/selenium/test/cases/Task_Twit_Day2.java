package selenium.test.cases;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;  

public class Task_Twit_Day2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.sendKeys("Vimal");
        String att, val;
        att= firstname.getAttribute("placeholder");
        System.out.println(att);
        val = firstname.getAttribute("value");
        System.out.println(val);
        boolean a  = firstname.isDisplayed();
        System.out.println(a);
        WebElement lastname = driver.findElement(By.id("lastName"));
        lastname.sendKeys("Sankaran");
        att= lastname.getAttribute("placeholder");
        System.out.println(att);
        val = lastname.getAttribute("value");
        System.out.println(val);
        boolean b  = lastname.isDisplayed();
        System.out.println(b);
        
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("vimalsankaran@gmail.com");
       // att= email.getAttribute("placeholder");
        //System.out.println(att);
        //val = email.getAttribute("value");
        //System.out.println(val);
       // WebElement gender = driver.findElement(By.name("gender"));
        //gender.click();
        //boolean d = gender.isSelected();
        //System.out.println(d);
        //if(d == false) {
        //WebElement radio1 = driver.findElement(By.id("gender-radio-1"));
        //radio1.click();
        // WebElement radio2 = driver.findElement(By.id("gender-radio-2"));
       //WebElement radio3 = driver.findElement(By.id("gender-radio-3"));
        //radio1.click();
        driver.findElement(By.id("userNumber")).sendKeys("9876543210");
        TakesScreenshot s = (TakesScreenshot) driver;
        File s1 = s.getScreenshotAs(OutputType.FILE);
        File f1 = new File("C:\\Users\\Vimal\\eclipse-workspace\\SeleniumTest\\Screenshot\\demo1.png");
        FileHandler.copy(s1, f1);
        //driver.findElement(By.id("subjectsContainer")).sendKeys("Maths & Science");
       // att= mobile.getAttribute("placeholder");
        //System.out.println(att);
        //val = mobile.getAttribute("value");
        //System.out.println(val);
} 
}
