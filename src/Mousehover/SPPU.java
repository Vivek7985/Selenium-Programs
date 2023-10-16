package Mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SPPU {

	public static void main(String[] args) throws InterruptedException {
         
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.unipune.ac.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//creating class for ACTIONS.
		Actions mouse=new Actions(driver);
		
		WebElement about=driver.findElement(By.xpath("//*[@id=\"stUI5_txt\"]"));
		Thread.sleep(2000);
		mouse.moveToElement(about).build().perform();
		Thread.sleep(1000);
		System.out.println("done1");
		
		WebElement academics=driver.findElement(By.xpath("//*[@id=\"stUI42_txt\"]"));
		Thread.sleep(1000);
		mouse.moveToElement(academics).build().perform();
		Thread.sleep(1000);
		System.out.println("done2");
		
		WebElement Research=driver.findElement(By.xpath("//*[@id=\"stUI184_txt\"]"));
		Thread.sleep(1000);
		mouse.moveToElement(Research).build().perform();
		Thread.sleep(1000);
		System.out.println("done3");
		
		WebElement Administration=driver.findElement(By.xpath("//*[@id=\"stUI194_txt\"]"));
	    Thread.sleep(1000);
	    mouse.moveToElement(Administration).build().perform();
	    Thread.sleep(1000);
	    System.out.println("done4");
	    
	    WebElement BOD=driver.findElement(By.xpath("//*[@id=\"stUI215_txt\"]"));
	    Thread.sleep(1000);
	    mouse.moveToElement(BOD).build().perform();
	    Thread.sleep(1000);
	    
	    WebElement StudentsCorner=driver.findElement(By.xpath("//*[@id=\"stUI229_txt\"]"));
	    Thread.sleep(1000);
	    mouse.moveToElement(StudentsCorner).build().perform();
	    Thread.sleep(1000);
	    
	    WebElement Usefullink=driver.findElement(By.xpath("//*[@id=\"stUI253_txt\"]"));
	    Thread.sleep(1000);
	    mouse.moveToElement(Usefullink).build().perform();
	    Thread.sleep(1000);
	    
	    WebElement Elearning=driver.findElement(By.xpath("//*[@id=\"stUI277_txt\"]"));
	    Thread.sleep(1000);
	    mouse.moveToElement(Elearning).build().perform();
	    Thread.sleep(1000);
	    
	    driver.quit();
	
	}

}
