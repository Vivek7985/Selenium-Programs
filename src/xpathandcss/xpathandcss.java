package xpathandcss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathandcss {

	public static void main(String[] args) throws InterruptedException {
          
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement UN=driver.findElement(By.xpath("//input[@id='username']"));
		                                           //button[@type='submit']
		
		   UN.click();
		   UN.sendKeys("vieksale17@gmail.com");
		   
		   
	WebElement PASS=driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']"));
		
		PASS.click();
		PASS.sendKeys("Vivek@7777");
		
		Thread.sleep(2000);
		
		WebElement LOGIN=driver.findElement(By.cssSelector("input[class='button r4 wide primary']"));
		
		LOGIN.click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
