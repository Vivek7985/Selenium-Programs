package keyboardhandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardops {

	public static void main(String[] args) throws InterruptedException {
      
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	    Login.click();
	    Thread.sleep(2000);
	    
	    Login.sendKeys("Admin");
	    Thread.sleep(2000);
	    
	    Login.sendKeys(Keys.CONTROL+"a");//To select All.
	    Thread.sleep(2000);
	    
	    Login.sendKeys(Keys.CONTROL+"c");//To copy.
	    Thread.sleep(3000);
	    
	    Login.sendKeys(Keys.TAB);//To Move.
	    
	    WebElement PASSWORD=driver.findElement(By.name("password"));
	    PASSWORD.click();
	    Thread.sleep(3000);
	    
	    PASSWORD.sendKeys(Keys.CONTROL+"v");//To Paste.
	    Thread.sleep(2000);
	       
	    PASSWORD.sendKeys(Keys.BACK_SPACE);//To delete one letter at a time.
	    PASSWORD.sendKeys(Keys.BACK_SPACE);
	    PASSWORD.sendKeys(Keys.BACK_SPACE);
	    PASSWORD.sendKeys(Keys.BACK_SPACE);
	    PASSWORD.sendKeys(Keys.BACK_SPACE);
       
	    driver.quit();
	}

}
