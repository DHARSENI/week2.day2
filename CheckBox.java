package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leafground.com/pages/checkbox.html");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		 Boolean boolCheckBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected();
		 if (boolCheckBox==true) {
			 System.out.println("The Selenium Check box is selected");
		}
		 else
		 { System.out.println("The Selenium Check box is notselected");}
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
	}


}
