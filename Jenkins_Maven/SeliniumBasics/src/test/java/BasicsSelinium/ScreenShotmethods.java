package BasicsSelinium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotmethods {
	public static void main(String args[]) throws IOException
	{
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage();
		 * driver.get("https://configureselenium.blogspot.com/"); TakesScreenshot ts =
		 * (TakesScreenshot) driver; File source = ts.getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(source, new File ("./Screenshots/selenium1" +
		 * System.currentTimeMillis()+" .png"));
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		try {
			WebElement logo = driver.findElement(By.xpath("//*[@id=\"Layer_1\"]"));
			File source = ((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/logo"+ System.currentTimeMillis()+".png"));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("The Screenshot is taken");


		
		
	}
}
