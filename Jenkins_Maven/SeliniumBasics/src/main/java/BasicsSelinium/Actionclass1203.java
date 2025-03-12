package BasicsSelinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass1203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		  driver1.manage().window().maximize();
		  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver1.get("https://bstackdemo.com/");
		  WebElement opt2=driver1.findElement(By.xpath("//select"));
		  Actions a=new Actions(driver1);
		  a.moveToElement(opt2).perform();
		  WebElement b=driver1.findElement(By.xpath("//option[text()=\"Lowest to highest\"]"));
		  b.click();
		  System.out.println("clicked");
		  driver1.close();

	}

}
