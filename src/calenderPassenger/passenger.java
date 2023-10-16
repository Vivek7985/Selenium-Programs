package calenderPassenger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class passenger {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.etihad.com/en-in/?CID=PPC-INDIA-GOOGLE&&&&&gad=1&gclid=CjwKCAjw3oqoBhAjEiwA_UaLtuMLP1lW7AAyDsqMa-OytyAxjZ-nk1qL6-5k8U8H8txQwVThkdoGixoCNpMQAvD_BwE&gclsrc=aw.ds");
	    
		driver.manage().window().maximize();
		
		WebElement passenger=driver.findElement(By.xpath("//*[@id=\"dd-passenger-type\"]/label[2]"));
	    passenger.click();	
	    
	    WebElement Adults=driver.findElement(By.xpath("//*[@id=\"passenger-type-inc-0\"]"));
	    Adults.click();
	
	    for(int i=0; i<=8; i++)
	    {
	    	Adults.click();
	    	Thread.sleep(2000);
	    }
	    System.out.println("Done");
	    driver.close();
	}

}
