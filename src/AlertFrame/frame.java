package AlertFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		
		WebElement V=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		V.click();
	}

}
