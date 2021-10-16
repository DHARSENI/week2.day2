package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {public static void main(String[] args)  throws InterruptedException{
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
	  Thread.sleep(2000);
	  WebElement eleSource= driver.findElement(By.id("createLeadForm_dataSourceId"));
	  Select dropDown=new Select(eleSource);
	  dropDown.selectByIndex(2);	 

	  WebElement eleSource1=driver.findElement(By.id("createLeadForm_industryEnumId"));
			  Select dropDown1=new Select(eleSource1);
				dropDown1.selectByIndex(2);
	  

	WebElement eleSource2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown2=new Select(eleSource2);
	  dropDown2.selectByVisibleText("Partnership");
	  driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Car and Driver");
}  

}
