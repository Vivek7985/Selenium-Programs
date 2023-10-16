package dropdownautomated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class flightbook {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	    driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
	    
	   WebElement drop=driver.findElement(By.xpath("//input[@id='autosuggest']"));
	        drop.click();
	        
	       drop.sendKeys("au");
	       Thread.sleep(2000);
	    
	       drop.clear();
	       
	    WebElement search=driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
	    search.click();
	    
	       
	    WebElement from=driver.findElement(By.xpath("//a[@value='CCU']"));
	       from.click();
	       Thread.sleep(2000);
	       
	   WebElement To=driver.findElement(By.xpath("(//a[@value='IXZ'])[2]"));
	   To.click();
	       
	       
	  

	        
	}

}
