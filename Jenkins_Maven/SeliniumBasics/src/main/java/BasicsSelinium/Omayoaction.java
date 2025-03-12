package BasicsSelinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Omayoaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		  driver1.manage().window().maximize();
		  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver1.get("https://omayo.blogspot.com/");
		  WebElement blog=driver1.findElement(By.id("blogsmenu"));
		  Actions action=new Actions(driver1);
		  action.moveToElement(blog).perform();
		  WebElement opt=driver1.findElement(By.xpath("//li//span[text()=\"SeleniumByArun\"]"));
		  action.moveToElement(opt).click().build().perform();

	}

}
