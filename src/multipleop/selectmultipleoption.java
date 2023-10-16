package multipleop;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectmultipleoption {

	public static void main(String[] args) throws InterruptedException {

		   WebDriver driver=new ChromeDriver();
	      
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   
		   driver.manage().window().maximize();
		   
		   Thread.sleep(2000);
		   
		   WebElement checkbox1=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		   
		   checkbox1.click();
		   
		   System.out.println(checkbox1.isDisplayed());
		   System.out.println(checkbox1.isEnabled());
		   System.out.println(checkbox1.isSelected());
		   
		   WebElement checkbox2=driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		   
		   checkbox2.click();
		   Thread.sleep(2000);
		   
		   System.out.println(checkbox2.isDisplayed());
		   System.out.println(checkbox2.isEnabled());
		   System.out.println(checkbox2.isSelected());
		   
		   WebElement checkbox3=driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		   
		   checkbox3.click();
		   
		   System.out.println(checkbox3.isDisplayed());
		   System.out.println(checkbox3.isEnabled());
		   System.out.println(checkbox3.isSelected());
			
		}
	
	
	}


