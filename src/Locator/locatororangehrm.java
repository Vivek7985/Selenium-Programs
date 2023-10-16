package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatororangehrm {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(1000);
		 
		 WebElement UN=driver.findElement(By.name("username"));
		 
		 UN.click();
		 UN.sendKeys("viveksale7985@gmail.com");
		 
		 Thread.sleep(1000);
		 
		 WebElement PASS=driver.findElement(By.name("password"));
		 
		 PASS.click();
		 PASS.sendKeys("Pass@7985");
		 
		 WebElement LOGIN=driver.findElement(By.tagName("button"));
		 
		 LOGIN.click();
		 
		 Thread.sleep(3000);
		 
		 driver.close();
		 
				 
	}

}
