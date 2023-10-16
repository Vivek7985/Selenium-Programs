package linktextpartial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathparentchild {

	public static void main(String[] args) throws InterruptedException {

		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://login.salesforce.com/?locale=in");
		   
		   driver.manage().window().maximize();
		   
		   WebElement remember=driver.findElement(By.xpath("//div[@class=\'w0 pr ln3 p16 remember\']/input"));
		   
		   Thread.sleep(3000);
		   
		   remember.click();
	}

}
