package BasicsSelinium;
import java.awt.RenderingHints.Key;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

//import com.sel.mavensel.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class WebMethod {
	public static void main(String args[])
	{
		WebDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com/");
		WebElement one=driver1.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]"));
		String text=one.getText();
		System.out.println(text);
		String color=one.getCssValue("color");
		System.out.println(color);
		int link=one.getLocation().getX();
		System.out.println(link);
		Dimension height=one.getSize();
		System.out.println("height and width"+height);
		String link1=driver1.getTitle();
		System.out.println(link1);
		String url=driver1.getCurrentUrl();
		System.out.println(url);
		
		String mobileurl=one.getDomProperty("href");
		System.out.println(mobileurl);
		one.sendKeys(Keys.ENTER);
		System.out.println("using xpath");
		  WebElement one1=driver1.findElement(By.xpath(
		  "//*//div[@class=\"XqNaEv\"]"
		  )); String url1=driver1.getCurrentUrl(); System.out.println(url1); boolean
		  check=one1.isDisplayed(); System.out.println(check); boolean
		  select=one1.isEnabled(); System.out.println(select);
		 System.out.println("by using css selector");
		WebElement one3=driver1.findElement(By.cssSelector("div.XqNaEv"));
		//one3.click();
		boolean check1=one3.isDisplayed();
		System.out.println(check1);
		boolean select1=one3.isSelected();
		System.out.println(select1);
		//WebElement one7=driver1.findElement(By.class("_6i1qKy"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
