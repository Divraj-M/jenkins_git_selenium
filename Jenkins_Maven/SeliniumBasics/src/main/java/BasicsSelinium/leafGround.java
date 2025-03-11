package BasicsSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class leafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://leafground.com/input.xhtml");
		WebElement one=driver1.findElement(By.name("j_idt88:name"));
		one.sendKeys("DIVRAJ M"+Keys.ENTER);
		WebElement two=driver1.findElement(By.id("j_idt88:j_idt91"));
		two.clear();
		two.sendKeys(",India"+Keys.ENTER);
		WebElement three=driver1.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
		System.out.println(three.isEnabled());
		WebElement four=driver1.findElement(By.id("j_idt88:j_idt95"));
		four.clear();
		
		
		  WebElement
		  five=driver1.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		  System.out.println(five.getAttribute("value"));
		 
		WebElement five1=driver1.findElement(By.xpath("//*[@id=\"j_idt88:j_idt99\"]"));
		five1.sendKeys("2k21cse022@kiot.ac.in and	"+Keys.DOWN+"I am divraj M from the KIOT");
		
		/*
		 * WebElement six=driver1.findElement(By.id("j_idt106:thisform:age"));
		 * six.sendKeys(Keys.ENTER);
		 */
		WebElement seven=driver1.findElement(By.id("j_idt106:float-input"));
		seven.sendKeys("User"+Keys.ENTER);
		WebElement eight=driver1.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete_input\"]"));
		eight.sendKeys("Divraj"+Keys.ENTER);
		WebElement opt=driver1.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete_panel\"]/ul/li[4]"));
		opt.click();
		WebElement opt1=driver1.findElement(By.xpath("//*[@id=\"j_idt106\"]/input[2]"));
		opt1.click();
		opt.sendKeys(Keys.ENTER);
	
		WebElement date=driver1.findElement(By.xpath("//*[@id=\"j_idt106:j_idt116_input\"]"));
		date.sendKeys("04/08/2004"+Keys.ENTER);
		
		
		
		
		
		
		
		

	}

}
