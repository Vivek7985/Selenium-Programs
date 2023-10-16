package forandforeach;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forloop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
       List<WebElement> v=driver.findElements(By.xpath("//input[@type='checkbox']"));
       
       for(int i=0; i<v.size();i++)//click on each check box with for loop.
       {
          v.get(i).click();
       }
       
       Thread.sleep(2000);
       
       for (WebElement N:v)
       {
    	   N.click();
       }
	}

}
;