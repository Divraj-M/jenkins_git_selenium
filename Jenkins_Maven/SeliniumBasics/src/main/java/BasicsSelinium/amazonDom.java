package BasicsSelinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonDom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		
		WebDriver driver2=new org.openqa.selenium.chrome.ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		String partlink=driver2.findElement(By.partialLinkText("Orange")).getText();
		System.out.println(partlink);
		Thread.sleep(2000);
		/*
		 * List<WebElement> li1=driver2.findElements(By.tagName("a")); int
		 * c1=li1.size(); for(WebElement a1:li1) {
		 * System.out.println(a1.getText()+"-"+a1.getDomAttribute("href")); }
		 * System.out.println("size:"+c1);
		 */
		
		driver2.findElement(By.name("username")).sendKeys("Admin");
		driver2.findElement(By.name("password")).sendKeys("admin123");
		WebElement login=driver2.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.click();
		WebElement link=driver2.findElement(By.xpath("//div"));

		Thread.sleep(1000);
		
		
		
		  List<WebElement> li=driver2.findElements(By.tagName("a")); 
		  int c=li.size();
		  for(WebElement a:li) {
		  System.out.println(a.getText()+"-"+a.getDomAttribute("href")); }
		  System.out.println("size:"+c); 
		// TODO Auto-generated method stub
			/*
			 * WebDriver driver1=new ChromeDriver(); driver1.manage().window().maximize();
			 * driver1.get("https://www.leafground.com/select.xhtml"); WebElement
			 * drop=driver1.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]"));
			 * Select down=new Select(drop); List<WebElement> opt=down.getOptions();
			 * System.out.println("the size of list :"+opt.size()); for(WebElement g:opt) {
			 * System.out.println("the option list are :"+g.getText()); } Boolean
			 * multi=down.isMultiple(); System.out.println("it is multiple option :"+multi);
			 * down.selectByIndex(1); down.selectByVisibleText("Selenium");
			 */
		//	down.deselectByVisibleText("Selenium");
		  
		 
		
		
		
	}

}
