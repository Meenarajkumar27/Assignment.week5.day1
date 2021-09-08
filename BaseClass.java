package assignment.week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  ChromeDriver	driver;
	public static String incidentnumber;
	@BeforeMethod
		public void preCondition() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev113028.service-now.com");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 WebElement frame=driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		 driver.switchTo().frame(frame);
		 //Enter username
		 driver.findElement(By.id("user_name")).sendKeys("admin");
		 driver.findElement(By.id("user_password")).sendKeys("Meenu$160520");
		 driver.findElement(By.xpath("//button[text()='Log in']")).click();
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident",Keys.ENTER);
			Thread.sleep(2000);
			
	}
	@AfterMethod
	public void logout() {
		driver.close();
	}

}
