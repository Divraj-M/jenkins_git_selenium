package BasicsSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorialautom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        WebElement names=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        javascriptclick(driver,names,"Divraj");
        WebElement last=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        javascriptclick(driver,last,"M");

	}
	public static void javascriptclick(WebDriver driver,WebElement names,String name)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].value='"+name+"';",names);
	}
}
