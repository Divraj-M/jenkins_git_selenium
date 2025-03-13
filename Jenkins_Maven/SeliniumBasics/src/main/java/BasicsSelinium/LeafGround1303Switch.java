package BasicsSelinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround1303Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/window.xhtml;jsessionid=node01fnku9g48ltyz1bgfma1cf2ncb8926340.node0");
        String parent = driver.getWindowHandle();
        System.out.println("Parent Window: " + parent);

        driver.findElement(By.xpath("//button[@id=\"j_idt88:new\"]/span")).click();
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Total Windows: " + allWindowHandles.size());
        for (String handle : allWindowHandles) {
            driver.switchTo().window(handle);
            System.out.println("Switched to Window: " + handle);

            try {
                String text = driver.findElement(By.xpath("//div[@class=\"overview-box monthly-sales\"]//div[@class=\"overview-title\"]")).getText();
                System.out.println("Text in Window: " + text);
            } catch (Exception e) {
                System.out.println("text not");
                
            }
                
        }
        driver.switchTo().window(parent);
        driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt91\"]//span")).click();
        driver.findElement(By.xpath("//span[@class=\"ui-button-icon-right ui-icon ui-c pi pi-bookmark\"]//following-sibling::span")).click();
        driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt95\"]//span")).click();
        driver.quit();
        

	}

}
