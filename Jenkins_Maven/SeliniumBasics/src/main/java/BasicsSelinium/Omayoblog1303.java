package BasicsSelinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Omayoblog1303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		  driver1.manage().window().maximize();
		  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver1.get("https://omayo.blogspot.com/");
		  WebElement b=driver1.findElement(By.id("blogsmenu"));
		  Actions action=new Actions(driver1);
			
//			  WebElement search=driver1.findElement(By.
//			  xpath("//input[@name=\"q\" and @title=\"search\"]"));
//			  action.contextClick(search).perform();
//			  System.out.println("right click done");
			 
		  WebElement doubleclick=driver1.findElement(By.xpath("//button[contains(text(),\" Double click Here   \")]"));
		  action.doubleClick(doubleclick).perform();
		  
		  

	}

}
