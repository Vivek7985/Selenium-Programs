package Resize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//FRAME.
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement Resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions v=new Actions(driver);
		
		//here we have to put x-axis and y-axis values.
		v.dragAndDropBy(Resize, 302,207).perform();	
		
		
		
	}

}
