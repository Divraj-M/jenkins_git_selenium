package BasicsSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//duckduckgo.com
public class Task1for0403 {
    public static void main(String args[]) throws InterruptedException {
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--headless");
		 */
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://duckduckgo.com");
        System.out.println("Title:"+driver1.getTitle());
        Thread.sleep(1000);
        WebElement search=driver1.findElement(By.xpath("//*//input[@name=\"q\"]"));
        System.out.println("Displayed:"+search.isDisplayed());
        System.out.println("Enabled:"+search.isEnabled());
		search.sendKeys("JAVA"+Keys.ENTER);
		
        
        

    }
}