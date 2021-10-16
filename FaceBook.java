package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://en-gb.facebook.com/");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dharseni");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Selvaraju");
		 driver.findElement(By.name("reg_email__")).sendKeys("dharseni@gmail.com");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("Selva@13");
		 WebElement day=driver.findElement(By.id("day"));
		 Select dropDown=new Select(day);
		  dropDown.selectByIndex(2);	
		  WebElement month=driver.findElement(By.id("month"));
		 Select dropDown1=new Select(month);
		  dropDown1.selectByValue("2");	
		  WebElement year= driver.findElement(By.id("year"));
		 Select dropDown2=new Select(year);
		  dropDown2.selectByVisibleText("1999");	
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
