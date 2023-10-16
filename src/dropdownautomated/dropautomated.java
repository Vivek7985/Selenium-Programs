package dropdownautomated;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropautomated {

	public static void main(String[] args) throws InterruptedException {
          
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement dropdownButton=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		  // dropdownButton.click();
		
		Select s=new Select(dropdownButton);//create string here.
		
		Thread.sleep(2000);
		
	    s.selectByIndex(1);//here we select element by index value.
	    
	    Thread.sleep(2000);
	    
	    s.selectByVisibleText("Option2");//here we select value by text as it is case sensitive.
	    
	    Thread.sleep(2000);
	    
	    s.selectByValue("option3");//here we select option3 by text not case sensitive.
	    
	    Thread.sleep(2000);
	    
	    List<WebElement>L=s.getOptions();
	    
	    for(int i=1;i<L.size();i++)
	    {
	    	System.out.println(L.get(i).getText());
	    }
	    
	    driver.close();
	}

}
