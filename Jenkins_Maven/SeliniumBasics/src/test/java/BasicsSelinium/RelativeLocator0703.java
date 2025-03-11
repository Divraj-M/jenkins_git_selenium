package BasicsSelinium;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RelativeLocator0703 {
	public static void main(String args[])
	{
		ChromeOptions options = new ChromeOptions(); 
		WebDriver driver=new ChromeDriver(options);
		options.addArguments("--headless");
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement loginbtn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		String loginbtntxt = loginbtn.getText();
		WebElement submitbut = driver.findElement(with(By.tagName("button")).toLeftOf(loginbtn));
		String ele_2 = submitbut.getText();
		WebElement rigbut = driver.findElement(with(By.tagName("button")).toRightOf(loginbtn));
		String ele_3 = rigbut.getText();
		System.out.println(loginbtntxt);
		System.out.println(ele_2);
		System.out.println(ele_3);
		

		
	}

}
