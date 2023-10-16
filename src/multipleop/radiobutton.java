package multipleop;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
      
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement radiobutton1=driver.findElement(By.xpath("//input[@value='radio1']"));
		radiobutton1.click();
		Thread.sleep(1000);
		
		WebElement radiobutton2=driver.findElement(By.xpath("//input[@value='radio2']"));
		radiobutton2.click();
		Thread.sleep(1000);
		
		WebElement radiobutton3=driver.findElement(By.xpath("//input[@value='radio3']"));
		radiobutton3.click();
		Thread.sleep(1000);
		
	}

}
