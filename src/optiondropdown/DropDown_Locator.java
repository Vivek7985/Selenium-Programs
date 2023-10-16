package optiondropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_Locator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement  select=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		          select.click();
		
		WebElement option1=driver.findElement(By.xpath("//option[@value='option1']"));
		         option1.click();
		         Thread.sleep(2000);

		WebElement option2=driver.findElement(By.xpath("//option[@value='option2']"));
				 option2.click();
				 Thread.sleep(2000);
				       
	   WebElement option3=driver.findElement(By.xpath("//option[@value='option3']"));
	             option3.click();
	             Thread.sleep(2000);
	  
	}

}
