package slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slide {

	public static void main(String[] args) throws InterruptedException {
      
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		Actions v=new Actions(driver);
		
		WebElement slide=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		v.clickAndHold(slide).moveByOffset(300, 0).release().build().perform();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
