package simplewebelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");//web page URL.
		
		driver.get("https://www.airbus.com/en");
		
		Thread.sleep(6000);//use for pause/break
		
		driver.manage().window().maximize();//To maximize Web page window.	
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();//To minimize Web page window.
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());//To get title of web page on console.
		
		System.out.println(driver.getCurrentUrl());//To get URL of current web page on console.
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.isro.gov.in/Chandrayaan3.html");//URL of 2nd web page
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3500);
		
		driver.navigate().back();//TO back from 2nd web page to 1st web page.
		
		System.out.println("Done");
		
		Thread.sleep(2500);
		
		driver.navigate().forward();//To go forward from 1st page to 2nd.
		
		System.out.println("Done");
		
		driver.close();//It closes only current window.
		
		driver.quit();//It closes all web windows.
	}

}
