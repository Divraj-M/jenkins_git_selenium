package BasicsSelinium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class omayoblogpopup1303 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://omayo.blogspot.com");

        String parent = driver.getWindowHandle();
        System.out.println("Parent Window: " + parent);

        driver.findElement(By.id("selenium143")).click();
        driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Total Windows: " + allWindowHandles.size());

        for (String handle : allWindowHandles) {
            driver.switchTo().window(handle);
            System.out.println("Switched to Window: " + handle);

            try {
                String text = driver.findElement(By.xpath("//b//a[contains(text(),\"What is Selenium?\")]")).getText();
                System.out.println("Text in Window: " + text);
            } catch (Exception e) {
                System.out.println("text not");
                
            }
                
        }

        driver.switchTo().window(parent);
        System.out.println("Switched to Parent Window");
        String text1=driver.findElement(By.xpath("//a[contains(text(),\"Page One\")]")).getText();
        System.out.println(text1);

        driver.quit();
    }
}