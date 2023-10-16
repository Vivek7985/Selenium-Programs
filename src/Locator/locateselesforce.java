package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateselesforce {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");//open url.
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement UN=driver.findElement(By.id("username"));//locate on user name text field.
		
		UN.click();//click on UNTF.
		
		UN.sendKeys("salevivekd@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement PASS=driver.findElement(By.name("pw"));//locate Password text field.
		
	          PASS.click();
	          PASS.sendKeys("Pass@1234");//
	          
	          Thread.sleep(1000);
	          
	          WebElement login=driver.findElement( By.name("Login"));
	          
	          login.click();
	          
	          driver.close();
	}

}
