package BasicsSelinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandle1403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        WebElement send=driver.findElement(By.xpath("//input[@class=\"hasDatepicker\"]"));
        send.click();
        send.sendKeys("04/08/2004");
        WebElement month=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]"));
        WebElement year=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]"));
        System.out.println(month.getText());
        System.out.println(year.getText());
        if(!(month.getText().equals("May") && year.getText().equals("2025")))
        {
        	return;
        }
        

	}

}
