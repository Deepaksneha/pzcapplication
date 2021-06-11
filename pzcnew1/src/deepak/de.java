package deepak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class de {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://172.16.1.41:8001/primaryOutReach/Login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='entityCode']")).sendKeys("0621");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("TODAYSDATACEO");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Adm!n@!234");
		driver.findElement(By.xpath("//button[@name='logInBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Log Out']")).click();
		driver.quit();
		
	
		
		
		
	}

}


