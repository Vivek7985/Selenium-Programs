package xpathandcss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import simplewebelements.web;

public class youtubexpathandcss {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=CeSAjK2CBEA");
		
		driver.manage().window().maximize();
		
	WebElement SEARCH=driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button']"));
	
	      SEARCH.click();
    
	WebElement PLAY=driver.findElement(By.xpath("//*[@class='ytp-fullscreen-button ytp-button']"));
	      
	      PLAY.click();
	      
	      Thread.sleep(260000);
	     
	      driver.close();
         
	}

}
