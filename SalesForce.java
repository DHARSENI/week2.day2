package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?");
		 Thread.sleep(3000);
		 driver.findElement(By.name("UserFirstName")).sendKeys("Selva");
		 driver.findElement(By.name("UserLastName")).sendKeys("Selvi");
		 driver.findElement(By.name("UserEmail")).sendKeys("selvaselvi.com");
		 driver.findElement(By.name("UserTitle")).sendKeys("Sales Manager");
		 driver.findElement(By.name("CompanyName")).sendKeys("Cognizant");
		 driver.findElement(By.name("CompanyEmployees")).sendKeys("1 - 25 employees");
		 driver.findElement(By.name("UserPhone")).sendKeys("8765432100");
		 driver.findElement(By.name("CompanyCountry")).sendKeys("India");
		 Thread.sleep(3000);
		driver.close();
	}
}
