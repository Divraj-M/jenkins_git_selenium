package BasicsSelinium;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExe1803 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("document.getElementsByName('q')[0].value='Java Programming'");
        js.executeScript("document.getElementsByTagName('input')[0].click()");

	}
//	public static void javascriptclick(WebDriver driver,WebElement btn)
//	{
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].click()",btn);
//	}

}
