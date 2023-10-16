package dropdownautomated;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bykeyboard {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       
       driver.manage().window().maximize();
       
       Thread.sleep(2000);
       
       WebElement country=driver.findElement(By.xpath("//input[@id='autosuggest']"));
       country.click();
       
       country.sendKeys("ind");
       
       Thread.sleep(1000);
       
       country.sendKeys(Keys.ARROW_DOWN);//To going downwards.
       Thread.sleep(1000);
       country.sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(1000);
       
       country.sendKeys(Keys.ENTER);
       
       List<WebElement>drop=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));//here we are gave path of BRITISH INDIAN TEROTARY which is option 1.
       
       Thread.sleep(1000);
       
       for(int i=0; i<drop.size(); i++)//select country INDIA by for loop.
       
       if(drop.get(i).getText().equalsIgnoreCase("india"))
       {
    	   drop.get(i).click();
       }
	}

}
