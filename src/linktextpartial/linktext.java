package linktextpartial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import simplewebelements.web;

public class linktext {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
        driver.get("https://login.salesforce.com/?locale=in");	     
		
        driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement link=driver.findElement(By.linkText("Forgot Your Password?"));//give as it is text from web page.
		
		Thread.sleep(2000);
		
		System.out.println(link.isDisplayed());//link is available on that web page.
		System.out.println(link.isSelected());
		System.out.println(link.isEnabled());//here it can check for link is enabled or not.
		
		System.out.println("\n");
		
		Thread.sleep(2000);
		
		WebElement remember=driver.findElement(By.xpath("//*[@id=\"rememberUn\"]"));
		
		remember.click();
		System.out.println(remember.isEnabled());//made enabled method true.(bcoz of clicking on checkbox.)
		//link.click();
		
		System.out.println("\n");
		
		Thread.sleep(2000);
		
		WebElement custom=driver.findElement(By.partialLinkText("Use Custom"));
		
        System.out.println(custom.isDisplayed());
		System.out.println(custom.isEnabled());
		System.out.println(custom.isSelected());
		
		custom.click();
			
		}
	    
	}


