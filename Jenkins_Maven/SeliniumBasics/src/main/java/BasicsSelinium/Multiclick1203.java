package BasicsSelinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiclick1203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://bstackdemo.com/");
		driver1.findElement(By.xpath("//select")).click();
		List<WebElement> allopt=driver1.findElements(By.cssSelector("select option"));
		System.out.println("option size:"+allopt.size());
		String l="Lowest to highest";
		for(int i=0;i<allopt.size();i++)
		{
			if(allopt.get(i).getText().contains(l))
			{
				allopt.get(i).click();
				System.out.println("clicked");
				break;
			}
		}
	}

}
