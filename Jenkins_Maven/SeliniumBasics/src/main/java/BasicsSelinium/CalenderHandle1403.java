//package BasicsSelinium;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class CalenderHandle1403 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
//        WebElement send=driver.findElement(By.xpath("//input[@class=\"hasDatepicker\"]"));
//        send.click();
//        send.sendKeys("04/08/2004");
//        WebElement month=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]"));
//        WebElement year=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]"));
//        System.out.println(month.getText());
//        System.out.println(year.getText());
//        if(!(month.getText().equals("May") && year.getText().equals("2025")))
//        {
//        	return;
//        }
//        
//
//	}
//
//}
package BasicsSelinium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderHandle1403 {
    public static void main(String[] args) {
        WebDriver dvr = new ChromeDriver();
        dvr.manage().window().maximize();
        dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(dvr, Duration.ofSeconds(5));

        dvr.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        
        WebElement datepick = dvr.findElement(By.id("datepicker"));
//        datepick.sendKeys("02/22/2023"+Keys.ENTER);
        datepick.click();

        while (true) {
            WebElement month = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-month']")));
            WebElement year = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-year']")));

            if (month.getText().equals("December") && year.getText().equals("2024")) {
                break;
            }
            WebElement prev = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Prev')]")));
            prev.click();
        }
//        dvr.quit();
    }
}
