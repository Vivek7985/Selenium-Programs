package Draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragrahul {

	public static void main(String[] args) throws InterruptedException {
      
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//here the drag and drop option in frames so we have take path of that and then switch to FRAME.
	    driver.switchTo().frame(0);

		
		//path of DRAG.
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
		
		//path of DROP.
		WebElement Target=driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);
		
		//we have to create object for ACTION CLASS to perform ACTIONS.
		Actions v=new Actions(driver);
		
		//1st method to DRAG AND DROP.
		v.clickAndHold(source).build().perform();
		v.moveToElement(Target).build().perform();
		v.release().build().perform();
		Thread.sleep(2000);
		
		//2nd Method.
		v.clickAndHold(source).moveToElement(Target).build().perform();
		
		//3rd Method.
		v.dragAndDrop(source, Target).build().perform();
		 
		driver.quit();
		
	}

}
