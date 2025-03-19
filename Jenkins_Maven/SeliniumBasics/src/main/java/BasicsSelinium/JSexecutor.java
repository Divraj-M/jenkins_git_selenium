package BasicsSelinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        
        
        WebElement btn=driver.findElement(By.id("alert2"));
        javascriptclick(driver,btn);  

	}
	public static void javascriptclick(WebDriver driver,WebElement btn)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()",btn);
	}

}
