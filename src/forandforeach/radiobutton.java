package forandforeach;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {

		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  
		  driver.manage().window().maximize();
		  
		  Thread.sleep(2000);
		  
		  List<WebElement>v=driver.findElements(By.xpath("//input[@name='radioButton']"));
		  
		  for (int i=0; i<v.size(); i++)
		  {
			  v.get(i).click();
			  Thread.sleep(1000);
			  
		  }
		  
		  for (WebElement s:v)
		  {
			  s.click();
			  Thread.sleep(1000);
		  }
		  
		 
	}

}
