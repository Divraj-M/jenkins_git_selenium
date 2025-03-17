package BasicsSelinium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1403 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.id("alert1")).click();
        System.out.println("simple alert:"+driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("prompt")).click();
        System.out.println(driver.switchTo().alert().getText());
    	driver.switchTo().alert().sendKeys("Divraj");
    	driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("confirm")).click();
        System.out.println("confirmation alert:"+driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        

	}

}
