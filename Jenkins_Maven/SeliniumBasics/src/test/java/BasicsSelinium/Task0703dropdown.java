package BasicsSelinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task0703dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		/*
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://omayo.blogspot.com/"); WebElement
		 * drop=driver.findElement(By.xpath("//div[@class=\"dropdown\"]"));
		 * drop.click(); WebElement email=driver.findElement(By.xpath(
		 * "//div[@class=\"dropdown\"]//div//a[contains(text(),\"Gmail\")]"));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * email.click();
		 */
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		WebElement box=driver.findElement(By.xpath("//input[@id=\"adder\"]"));
		box.click();
		WebElement red=driver.findElement(By.xpath("//div[@id=\"box0\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("color:"+red.getDomAttribute("color"));


	}

}
