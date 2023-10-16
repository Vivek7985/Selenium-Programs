package calenderPassenger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.etihad.com/en-in/?CID=PPC-INDIA-GOOGLE&&&&&gad=1&gclid=CjwKCAjw3oqoBhAjEiwA_UaLtuMLP1lW7AAyDsqMa-OytyAxjZ-nk1qL6-5k8U8H8txQwVThkdoGixoCNpMQAvD_BwE&gclsrc=aw.ds");
		
		driver.manage().window().maximize();
		
		WebElement start=driver.findElement(By.xpath("//*[@id=\"roundTripCalendarDepartDate\"]"));
		start.click();
		
		WebElement click=driver.findElement(By.xpath("//*[@id=\"flightsearch_copy\"]/div/form/div[2]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[2]"));
	    click.click();
	    Thread.sleep(2000);
	    System.out.println("Departure confirmed");
	    
	    WebElement Return=driver.findElement(By.xpath("//*[@id=\"flightsearch_copy\"]/div/form/div[2]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[5]"));
	    Thread.sleep(1000);
	    Return.click();
	    Thread.sleep(2000);
	    System.out.println("Return confirmed");
	    
	    driver.close();
	}

}
