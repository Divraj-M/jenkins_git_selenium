package BasicsSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flash1803 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        WebElement mail=driver.findElement(By.xpath("//input[@name=\"email\"]"));
        flash(driver,mail);
	}
	public static void flash(WebDriver driver,WebElement mail)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String original=mail.getCssValue("backgroundColor");
		System.out.println(original);
		for(int i=0;i<3;i++)
		{
			js.executeScript("arguments[0].style.backgroundColor='red';",mail);
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		js.executeScript("arguments[0].style.backgroundColor='"+original+"';",mail);
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
	}
}
