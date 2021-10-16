package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leafground.com/pages/radio.html"); 
		 driver.findElement(By.id("no")).click();
		 Boolean eledefault = driver.findElement(By.xpath("//label[text()='Find default selected radio button']/following::input[2]")).isSelected();
		 if (eledefault==true) {
			 System.out.println("Default selection is checked");
		}
		 else
		 {
			 System.out.println("Default selection is unchecked");
		}
		 driver.findElement(By.xpath("(//input[@type='radio'])[8]")).click();

	}

}
