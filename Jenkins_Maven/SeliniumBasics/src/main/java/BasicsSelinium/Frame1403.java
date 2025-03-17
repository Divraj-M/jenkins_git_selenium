package BasicsSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        WebElement frame=driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame);
        String f1=driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("switch by locator:"+f1);
        driver.switchTo().defaultContent();
        String text=driver.findElement(By.xpath("//div[@id=\"framesWrapper\"]//h1")).getText();
        System.out.println("text in main page:"+text);
//        WebElement frame2=driver.findElement(By.id("frame2"));
//        driver.switchTo().frame(frame2);
        driver.switchTo().frame(3);
        String f2=driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
        System.out.println("switch by locator:"+f2);
        driver.switchTo().parentFrame();
        String text1=driver.findElement(By.xpath("//div[@id=\"framesWrapper\"]//h1")).getText();
        System.out.println("text in main page:"+text1);
        
        
        

	}

}
