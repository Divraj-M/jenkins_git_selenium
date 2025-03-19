package BasicsSelinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorialsninjajsexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/");
        WebElement search=driver.findElement(By.xpath("//input[@name=\"search\"]"));
        WebElement submit=driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-lg\"]"));
        javascriptsendkey(driver,search);
        jsclick(driver,submit);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
        

	}
	public static void javascriptsendkey(WebDriver driver,WebElement search)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].value='HP'",search);
	}
	public static void jsclick(WebDriver driver,WebElement submit)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()",submit);
	}
	

}
