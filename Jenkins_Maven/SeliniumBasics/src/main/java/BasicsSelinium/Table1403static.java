package BasicsSelinium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1403static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        List<WebElement> t=driver.findElements(By.xpath("//*//table[@id=\"table1\"]//th"));
        System.out.println("size of list:"+t.size());
        for(WebElement b:t)
        {
        	System.out.println("the th:"+b.getText());
        }
        System.out.println("\n");
        List<WebElement> body=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody"));
        System.out.println("size of list:"+t.size());
        for(WebElement data:body)
        {
        	System.out.println(data.getText());
        }
        System.out.println("\n");
        List<WebElement> row1=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody//tr[1]//td"));
        System.out.println("count of row 1:"+row1.size());
        for(WebElement row11:row1)
        {
        	System.out.println("row 1:"+row11.getText());
        }
        System.out.println("\n");
        List<WebElement> row2=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody//tr[2]//td"));
        System.out.println("count of row 2:"+row2.size());
        for(WebElement row11:row2)
        {
        	System.out.println("row 2:"+row11.getText());
        }
        System.out.println("\n");
        List<WebElement> row3=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody//tr[3]//td"));
        System.out.println("count of row 3:"+row3.size());
        for(WebElement row11:row3)
        {
        	System.out.println("row 3:"+row11.getText());
        }
        System.out.println("\n");
        
        WebElement specific=driver.findElement(By.xpath("//table[@id=\"table1\"]//tbody//tr[2]//td[3]"));
        System.out.println("2nd row third col :"+specific.getText());
        
        List<WebElement> col=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody//tr//td[2]"));
        System.out.println("count of col 2:"+col.size());
        for(WebElement row11:col)
        {
        	System.out.println("col 2:"+row11.getText());
        }
        System.out.println("\n");
        List<WebElement> rowsizes=driver.findElements(By.xpath("//table[@id=\"table1\"]//tr"));
        int rowsize=rowsizes.size();
        List<WebElement> colsizes=driver.findElements(By.xpath("//table[@id=\"table1\"]//th"));
        int colsize=colsizes.size();
        System.out.println("row size:"+rowsize);
        System.out.println("col size:"+colsize);
        
        for(int i=1;i<=rowsize;i++)
        {
        	for(int j=1;j<=colsize;j++)
        	{
        		if(i==1)
        		{
        			WebElement data=driver.findElement(By.xpath("//table[@id=\"table1\"]//tr["+i+"]//th["+j+"]"));
        			System.out.print(data.getText()+"	");
        		}
        		else
        		{
        			WebElement data=driver.findElement(By.xpath("//table[@id=\"table1\"]//tr["+(i-1)+"]//td["+(j)+"]"));
        			System.out.print(data.getText()+"	");
        		}
        	}
        	System.out.println();
        }
        //check jenkins 1
        
	}

}
