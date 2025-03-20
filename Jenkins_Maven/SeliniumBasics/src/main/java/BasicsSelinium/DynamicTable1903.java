package BasicsSelinium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable1903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("2k21cse021@kiot.ac.in");
        WebElement pass=driver.findElement(By.id("password"));
        pass.sendKeys("Divraj@123");
        driver.findElement(By.id("submit")).click();
        List<WebElement> t=driver.findElements(By.xpath("//thead//tr//th"));
        System.out.println("size of list:"+t.size());
        for(WebElement b:t)
        {
        	System.out.println("the th:"+b.getText());
        }
        
        List<WebElement> col=driver.findElements(By.xpath("//tr[@class=\"contactTableBodyRow\"]//td[2]"));
        System.out.println("size of list:"+col.size());
        for(WebElement b:col)
        {
        	System.out.println(b.getText());
        }
        String expName="Divraj M";
        int i=1;
        for(WebElement name:col)
        {
        	if(name.getText().equals(expName))
        	{
        		List<WebElement> l=driver.findElements(By.xpath("//table[@class=\"contactTable\"]//tr["+i+"]"));
        		for(WebElement row:l)
        		{
        			System.out.println(row.getText());
        		}
        	}
        	i++;
        }
        
	}

}
