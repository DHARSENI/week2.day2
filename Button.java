package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leafground.com/pages/Button.html");
		 Thread.sleep(2000);
		 Point eleLocation = driver.findElement(By.id("position")).getLocation();
		 Thread.sleep(2000);
		 System.out.println("The location:"+eleLocation);
		 String elecolor=  driver.findElement(By.id("color")).getAttribute("style");
		 System.out.println("The color is:"+elecolor);
		 Thread.sleep(2000);
		 Dimension elesize= driver.findElement(By.id("size")).getSize();
		 System.out.println("The height and width is:"+elesize);
		 Thread.sleep(2000);
		 driver.findElement(By.id("home")).click();
	}

}
