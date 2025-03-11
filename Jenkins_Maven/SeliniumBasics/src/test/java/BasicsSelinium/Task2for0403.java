package BasicsSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2for0403 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
		drive.get("https://demoqa.com/radio-button");
		drive.manage().window().maximize();
		 WebElement one = drive.findElement(By.cssSelector("label[for='yesRadio']"));
         WebElement two = drive.findElement(By.cssSelector("label[for='impressiveRadio']"));
         WebElement three = drive.findElement(By.cssSelector("label[for='noRadio']"));
         System.out.println("Radio Button Options:");
         System.out.println(one.getText());
         System.out.println(two.getText());
         System.out.println(three.getText());
       
			
			  WebElement rad = drive.findElement(By.xpath("//input[@id=\"yesRadio\"]")); 
			  boolean firstradio =rad.isSelected(); 
			  Thread.sleep(1000); 
			  if(firstradio) 
			  {
			  System.out.println("First button is selected!"); 
			  }
			  else 
			  {
			  System.out.println("First button is  not selected"); 
			  } 
			  Thread.sleep(1000);
			  String selected; 
			  if(firstradio) 
			  { 
				 two.click(); 
				 selected = two.getText(); 
			  } 
			  else 
			  {
				one.click(); 
				selected = one.getText(); 
			  }
			  System.out.println("Selected Button Value: " + selected);
			 

	}

}