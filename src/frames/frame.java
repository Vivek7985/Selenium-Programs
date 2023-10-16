package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class frame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//1st method to FRAME by NAME.
		driver.switchTo().frame("iframe-name");//entering into frame by name.
		
		Thread.sleep(1000);
		
		//2nd method to FRAME by XPATH.
		/*WebElement f=driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(f);//for finding frame by xpath we have to do this by switchTo method.
        */
		
		WebElement blog=driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[8]/a"));
	     blog.click();
	     
	     Thread.sleep(1000);
	     
	     driver.switchTo().defaultContent();//to exit from frame to main page.
	     
	     Thread.sleep(1000);
	     
	     WebElement alert=driver.findElement(By.xpath("//*[@id='alertbtn']"));
	     Thread.sleep(1000);
	     alert.click();
	     
	     System.out.println(driver.switchTo().alert().getText());
	     
	     driver.switchTo().alert().accept();
	     
	     driver.close();
	     
	}

}
