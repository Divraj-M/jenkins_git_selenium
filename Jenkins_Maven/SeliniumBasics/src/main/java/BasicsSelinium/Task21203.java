package BasicsSelinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task21203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ChromeDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		  driver1.manage().window().maximize();
		  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver1.get("https://bstackdemo.com/");
		  WebElement opt2=driver1.findElement(By.xpath("//select"));
		  JavascriptExecutor js=(JavascriptExecutor) driver1;
		  js.executeScript("arguments[0].value='lowestprice'", opt2);
		  System.out.println("clicked");
		  driver1.close();
		  
		 

	}

}
