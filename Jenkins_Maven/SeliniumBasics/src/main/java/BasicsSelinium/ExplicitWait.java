package BasicsSelinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * WebDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		 * WebDriverWait wait=new WebDriverWait(driver1,Duration.ofSeconds(5));
		 * driver1.manage().window().maximize();
		 * driver1.get("https://omayo.blogspot.com/"); WebElement
		 * time=driver1.findElement(By.id("input#timerButton"));
		 * 
		 * time.click();
		 */
		WebDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver1,Duration.ofSeconds(10));
		driver1.manage().window().maximize();
		driver1.get("https://www.selenium.dev/selenium/web/dynamic.html");
		WebElement reveal=driver1.findElement(By.xpath("//input[@id=\"reveal\"]"));
		reveal.click();
		WebElement revealed=driver1.findElement(By.xpath("//input[@id=\"revealed\"]"));
		wait.until(ExpectedConditions.visibilityOf(revealed));
		revealed.sendKeys("Divraj"+Keys.ENTER);
		System.out.println("name:"+revealed.getDomProperty("value"));
		 
		
		
	}

}
