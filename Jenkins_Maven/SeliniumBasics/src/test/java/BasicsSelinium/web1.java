package BasicsSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web1 {
	public static void main(String args[])
	{
		ChromeDriver dvr=new org.openqa.selenium.chrome.ChromeDriver();
		  dvr.manage().window().maximize();
		  
		  dvr.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html"); 
	WebElement checkbox = dvr.findElement(By.name("color"));
		  WebElement opera = dvr.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]"));
		        System.out.println("Checkbox enabled: " + checkbox.isEnabled());
	        System.out.println("Checkbox selected: " + checkbox.isSelected());
		        checkbox.click();
		        System.out.println("Checkbox selected: " + checkbox.isSelected());
		        System.out.println("Opera selected: " + opera.isSelected());
	}

}
