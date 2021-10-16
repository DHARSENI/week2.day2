package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditNumber {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		  driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		  driver.findElement(By.className("decorativeSubmit")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Find Leads")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys("Selvi");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//button[text()='Find Leads'])")).click();
		  Thread.sleep(3000);
		  WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Lead List']/following::table[2]/tbody/tr/td[1]/div/a"));
			
			
			String title = driver.getTitle();
			
			System.out.println("Title is "+title);
			
			findElement3.click();
		  String strTitle= driver.getTitle();
		  System.out.println(strTitle);	 	
		  driver.findElement(By.linkText("Edit")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("updateLeadForm_companyName")).clear();
		  driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Wipro");
		  driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(2000);
		 driver.close();

	}

}
