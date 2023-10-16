package slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class colorpicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(0);
		System.out.println("done1");
		
		//creating object for ACTION CLASS.
		Actions v=new Actions(driver);
		
		WebElement red=driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
		v.clickAndHold(red).moveByOffset(-100, 0).release().build().perform();
		Thread.sleep(2000);
		System.out.println("done2");
		
		WebElement green=driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		v.clickAndHold(green).moveByOffset(100, 0).release().build().perform();
		Thread.sleep(2000);
		System.out.println("done3");
		
		WebElement blue=driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
		v.clickAndHold(blue).moveByOffset(100, 0).release().build().perform();
		Thread.sleep(2000);
		System.out.println("done4");
		
		driver.quit();
        		
		
		
	}

}
