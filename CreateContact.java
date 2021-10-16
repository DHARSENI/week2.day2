package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args)  throws InterruptedException{
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		  driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		  driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		  Thread.sleep(2000);		  
		  driver.findElement(By.className("decorativeSubmit")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Contacts")).click();
		  driver.findElement(By.linkText("Create Contact")).click();		  
		  driver.findElement(By.id("firstNameField")).sendKeys("Dharseni");
		  driver.findElement(By.id("lastNameField")).sendKeys("Selvaraju");		 
		  driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Tamil");
		  driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Selvi");
		  driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Car and Driver");
		  driver.findElement(By.id("createContactForm_description")).sendKeys("Contact Address");		
		  driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("priya@gmail.com");
		  driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("Georgia");     
		  Thread.sleep(2000);
		  driver.findElement(By.className("smallSubmit")).click();
		  driver.findElement(By.linkText("Edit")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("updateContactForm_description")).clear();
		  driver.findElement(By.id("updateContactForm_description")).sendKeys("update Address");
		  driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		 Thread.sleep(2000); 
		  String strTitle= driver.getTitle();
		  System.out.println(strTitle);	 	
		 driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(2000);
		 driver.close();
	}
		
		



}
