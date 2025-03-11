package BasicsSelinium;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

//import com.sel.mavensel.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		driver1.manage().window().maximize();
		/*
		 * //driver.get("https://www.saucedemo.com/");
		 * driver.navigate().to("https://www.saucedemo.com/"); WebElement
		 * search_box=driver.findElement(By.id("user-name"));
		 * search_box.sendKeys("standard_user"+Keys.ENTER); WebElement
		 * search_box1=driver.findElement(By.name("password"));
		 * search_box1.sendKeys("secret_sauce"+Keys.ENTER);
		 * 
		 * WebElement search_box3=driver.findElement(By.name("login-button"));
		 * search_box3.sendKeys(Keys.ENTER); WebElement
		 * search_box2=driver.findElement(By.name(
		 * "add-to-cart-test.allthethings()-t-shirt-(red)")); try { Thread.sleep(3000);
		 * } catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * search_box2.sendKeys(Keys.ENTER);
		 * 
		 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		/*
		 * ChromeOptions option=new ChromeOptions(); option.addArguments("--headless");
		 */
		//WebDriver driver1 = new org.openqa.selenium.chrome.ChromeDriver();
		driver1.get("https://www.google.co.in/");
		WebElement search_box5=driver1.findElement(By.linkText("Gmail"));
		search_box5.sendKeys(Keys.ENTER);
		WebElement search_box6=driver1.findElement(By.linkText("Sign in"));
		search_box6.sendKeys(Keys.ENTER);
		
		WebElement search_box7=driver1.findElement(By.name("identifier"));
		
		search_box7.sendKeys("2k21cse022@kiot.ac.in"+Keys.ENTER);
		
		WebElement search_box8=driver1.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		search_box8.sendKeys(Keys.ENTER);
		WebElement search_box9=driver1.findElement(By.name("Passwd"));
		search_box9.sendKeys("Divraj@8744"+Keys.ENTER);
		WebElement search_box10=driver1.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
		search_box10.sendKeys(Keys.ENTER);
		
		String Currenturl=driver1.getCurrentUrl();
		String title=driver1.getTitle();
		driver1.getPageSource();
		System.out.println("Current url="+Currenturl);
		System.out.println("Title:"+title);
		//driver.close();

	}



}
