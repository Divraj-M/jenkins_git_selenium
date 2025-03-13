package BasicsSelinium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo {
       public static void main(String args[]) {
    	   ChromeDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
 		  driver1.manage().window().maximize();
 		  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		  driver1.get("https://demoqa.com/browser-windows");
 		  String ParentWin=driver1.getWindowHandle();
 		  System.out.println("parent window:"+ParentWin);
 		  WebElement newtab=driver1.findElement(By.id("tabButton"));
 		  newtab.click();
 		  Set<String> allwindowHandles=driver1.getWindowHandles();
 		  System.out.println("Count of Window:"+allwindowHandles.size());
 		  driver1.findElement(By.id("windowButton")).click();
 		  Set<String> newAllWindowHandles=driver1.getWindowHandles();
 		  System.out.println("New Count of Window:"+newAllWindowHandles.size());
 		  String ParentHandle =driver1.getWindowHandle();
 		  System.out.println("Parent Window:"+ParentHandle);
 		  Iterator<String> iterator = newAllWindowHandles.iterator();
 		  String mainWindow = iterator.next();
 		  String childWindow = iterator.next();
 		  System.out.println("mainwindow:"+mainWindow);
 		 System.out.println("childwindow:"+childWindow);
		  driver1.switchTo();
		  WebElement text = driver1.findElement(By.id("sampleHeading"));
		  System.out.println("Child Window Text: "+text.getText());
			driver1.switchTo().window(mainWindow);
			WebElement ele1=driver1.findElement(By.xpath("//h1[@class=\"text-center\"]"));
			System.out.println("Parent Window Text: "+ele1.getText());
			driver1.quit();
       }
}