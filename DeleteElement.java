package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteElement {
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
		  driver.findElement(By.linkText("Phone")).click();		 
		  driver.findElement(By.xpath("(//input[@name='phoneNumber'])")).sendKeys("8765432100");
		  driver.findElement(By.xpath("(//button[text()='Find Leads'])")).click();
		  Thread.sleep(2000);
		  WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Lead List']/following::table[2]/tbody/tr/td[1]/div/a"));
		String title = driver.getTitle();			
		System.out.println("Title is "+title);			
			findElement3.click();
		  driver.findElement(By.linkText("Delete")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Find Leads")).click();
		  driver.findElement(By.className("id")).sendKeys(title);
		  driver.findElement(By.xpath("(//button[text()='Find Leads'])")).click();
		  Boolean boolDisplay = driver.findElement(By.linkText("No records to display")).isDisplayed();
		  if (boolDisplay==true) {
				 System.out.println("ID is successfully Deleted");
			}
			 else
			 {
				 System.out.println("ID is not Deleted");
			}
		  driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(2000);
		 driver.close();
	}

}
