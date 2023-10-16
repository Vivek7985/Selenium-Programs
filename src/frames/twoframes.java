package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class twoframes {

	public static void main(String[] args) throws InterruptedException {

                WebDriver driver=new EdgeDriver();
				
				driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				//finding FRAME1 by XPATH.
				WebElement Frame1=driver.findElement(By.xpath("//iframe[@id='frm1']"));//choosing path which is cover entire frame.
				driver.switchTo().frame(Frame1);
				Thread.sleep(2000);
				System.out.println("doneFrame1");
				
				//click on Dropdown on FRAME1
				WebElement Dropdown=driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
				Dropdown.click();
				Thread.sleep(1000);
				System.out.println("doneDropdown");
				
				//Return from FRAME1 to MAIN page.
				driver.switchTo().defaultContent();
				
				//finding FRAME2 by XPATH.
				WebElement Frame2=driver.findElement(By.xpath("//iframe[@id='frm2'][1]"));
				driver.switchTo().frame(Frame2);
				Thread.sleep(1000);
				System.out.println("doneFrame2");
						
				//click on Basic control Dropdown on FRAME 2.
				WebElement Drop=driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
				Drop.click();
				System.out.println("doneDropdown2");
				
				driver.close();
				
				
			}

		}
				
				
				
				

