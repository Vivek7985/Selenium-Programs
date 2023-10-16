package Mousehover;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
      
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//create object on ACTION CLASS.
		Actions v=new Actions(driver);
		
		WebElement Mousehover=driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
	    Thread.sleep(2000);
	    
	    //To MOUSEHOVER .
	    v.moveToElement(Mousehover).build().perform();
	    Thread.sleep(2000);
	
	}

}
