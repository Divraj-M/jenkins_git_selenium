package BasicsSelinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		  driver1.manage().window().maximize();
		  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Actions action=new Actions(driver1);
		  driver1.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
		  WebElement box1=driver1.findElement(By.id("box6"));
		  WebElement box2=driver1.findElement(By.id("box106"));
		 // action.clickAndHold(box1).moveToElement(box2).release().build().perform();
		  action.dragAndDrop(box1, box2).build().perform();
		  String Exp=box1.getCssValue("background-color");
		  if(Exp.equals(box1.getCssValue("background-color")))
		  {
			  System.out.println("both are same");
		  }
		  else
			  System.out.println("bg-color actual :"+box1.getCssValue("background-color"));
		  
		  

	}

}
