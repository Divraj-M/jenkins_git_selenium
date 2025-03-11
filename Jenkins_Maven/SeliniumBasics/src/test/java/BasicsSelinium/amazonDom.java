package BasicsSelinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonDom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		/*
		 * WebDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		 * driver1.manage().window().maximize();
		 * driver1.get("https://www.facebook.com/"); WebElement
		 * text=driver1.findElement(By.xpath(
		 * "//*[@id=\"content\"]/div/div/div/div[1]/h2"));
		 * System.out.println(text.getDomAttribute("class")); WebElement
		 * text1=driver1.findElement(By.xpath(
		 * "//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
		 * System.out.println(text1.getDomAttribute("class"));
		 * System.out.println(text1.getDomAttribute("src"));
		 */
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
		  WebElement out=driver2.findElement(By.xpath("//*//p[1]"));
		  WebElement logout=driver2.findElement(By.xpath("WebElement out=driver2.findElement(By.xpath(\"//*//p[1]\"));"));
		  logout.click();
		 
		
		
		
	}

}
