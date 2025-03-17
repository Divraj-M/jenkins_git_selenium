package BasicsSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundFrames1403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/frame.xhtml");
        WebElement one=driver.findElement(By.xpath("//iframe[@src=\"default.xhtml\"]"));
        driver.switchTo().frame(one);
        WebElement a=driver.findElement(By.xpath("//button[@style=\"color:#ffffff;background: linear-gradient(240deg, #ff7295 0%, #fe875d 100%);border: 0 none;width:15%;height:40%\"]"));
        a.click();
        String t=a.getText();
        System.out.println("text click1:"+t);
        driver.switchTo().defaultContent();
        WebElement bottom=driver.findElement(By.id("j_idt96"));
        System.out.println("main page:"+bottom.getText());
        System.out.println("button-1");
        WebElement two=driver.findElement(By.xpath("//iframe[@src=\"nested.xhtml\"]"));
        driver.switchTo().frame(2);
        //WebElement b=driver.findElement(By.xpath("//button[@style=\"background: linear-gradient(240deg, #00aadf 0%, #0071bc 100%);color:#ffffff;border: 0 none;width:25%;height:40%\"]"));
        driver.switchTo().defaultContent();
        WebElement three=driver.findElement(By.xpath("//iframe[@src=\"page.xhtml\"]"));
        driver.switchTo().frame(three);
        WebElement c=driver.findElement(By.xpath("//iframe[@src=\"framebutton.xhtml\"]"));
        driver.switchTo().frame(c);
        driver.findElement(By.xpath("//button[@style=\"background: linear-gradient(240deg, #4b7ecf 0%, #8e70ee 100%); color:#ffffff;border: 0 none;width:15%;height:40%\"]")).click();
        System.out.println("i am here in nested frame button-3");
        driver.switchTo().defaultContent();
        System.out.println("main page:"+bottom.getText());
        
        
        

	}

}
