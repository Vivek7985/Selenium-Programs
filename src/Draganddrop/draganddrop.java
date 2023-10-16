package Draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
       
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        WebElement washington=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
        WebElement unitedstates=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
	    Thread.sleep(2000);
	    
	    Actions v=new Actions(driver);
	    
	    v.dragAndDrop(washington,unitedstates).build().perform();
	    
	    WebElement oslo=driver.findElement(By.xpath("//*[@id=\"box1\"]"));
	    WebElement norway=driver.findElement(By.xpath("//*[@id=\"box101\"]"));
	    Thread.sleep(2000);
	    v.dragAndDrop(oslo, norway).build().perform();
	    
	    WebElement stockholm=driver.findElement(By.xpath("//*[@id=\"box2\"]"));
	    WebElement swedan=driver.findElement(By.xpath("//*[@id=\"box102\"]"));
	    Thread.sleep(2000);
	    v.dragAndDrop(stockholm, swedan).build().perform();
	    
	    WebElement seoul=driver.findElement(By.xpath("//*[@id=\"box5\"]"));
	    WebElement southkorea=driver.findElement(By.xpath("//*[@id=\"box105\"]"));
	    Thread.sleep(2000);
	    v.dragAndDrop(seoul, southkorea).build().perform();
	    
	    WebElement Rome=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
	    WebElement Italy=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
	    Thread.sleep(2000);
	    v.dragAndDrop(Rome, Italy).build().perform();
	    
	    WebElement copehhagen=driver.findElement(By.xpath("//*[@id=\"box4\"]"));
	    WebElement Denmark=driver.findElement(By.xpath("//*[@id=\"box104\"]"));
	    Thread.sleep(2000);
	    v.dragAndDrop(copehhagen, Denmark).build().perform();
	    
	    WebElement Madrid=driver.findElement(By.xpath("//*[@id=\"box7\"]"));
	    WebElement Spain=driver.findElement(By.xpath("//*[@id=\"box107\"]"));
	    Thread.sleep(2000);
	    v.dragAndDrop(Madrid, Spain).build().perform();
	    Thread.sleep(2000);
	    
	    driver.quit();
	
	}

}
