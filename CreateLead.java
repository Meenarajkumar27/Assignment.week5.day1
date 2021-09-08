package testcase;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends Base{
	@Test(dataProvider="sendData")
	public  void runcreateLead(String fname,String lastname,String company,String phone) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider
		public String[][] sendData() {
		String[][] data =new String[2][4];
		data[0][0]="Hariprasad";
		data[0][1]="R";
		data[0][2]="Testleaf";
		data[0][3]="89";
		data[1][0]="Mansi";
		data[1][1]="R";
		data[1][2]="Testleaf";
		data[1][3]="99";
			return data;
		
	}
	
}




	

