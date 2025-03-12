package BasicsSelinium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver1,Duration.ofSeconds(30));
		driver1.manage().window().maximize();
		
		/*
		 * driver1.get(
		 * "https://configureselenium.blogspot.com/2020/11/selenium-tutorials.html");
		 * WebElement before=driver1.findElement(By.
		 * xpath("//span[@class=\"counter-wrapper text-counter-wrapper\"]"));
		 * System.out.println("views:"+before.getText()); WebElement
		 * b=driver1.findElement(By.xpath(
		 * "//li[@aria-hidden=\"false\"]//a[@href='https://configureselenium.blogspot.com/2020/11/selenium-tutorials.html'][contains(text(),'SELENIUM')]"
		 * )); b.click(); WebElement after=driver1.findElement(By.
		 * xpath("//span[@class=\"counter-wrapper text-counter-wrapper\"]"));
		 * wait.until(ExpectedConditions.visibilityOf(after));
		 * System.out.println("views:"+after.getText());
		 */
		driver1.get("https://www.rediff.com/");
		WebElement money=driver1.findElement(By.xpath("//div[@class=\"toplinks\"]//a[2]"));
		money.click();
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver1)
			       .withTimeout(Duration.ofSeconds(20))
			       .pollingEvery(Duration.ofSeconds(1))
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait1.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });
			 
		WebElement mon=driver1.findElement(By.xpath("//ul//li//a[@href=\"//money.rediff.com/indices/bse/sensex\"]//parent::li//following-sibling::li[1]"));
		System.out.println("number:"+mon.getText());
		
		

	}

}
