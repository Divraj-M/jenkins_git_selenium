
package BasicsSelinium;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownSelect1203 {
	public static void main(String[] args) {
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.selenium.dev/selenium/web/formPage.html");
		WebElement opt=driver1.findElement(By.xpath("//select[@name=\"multi\" and @multiple=\"multiple\"]"));
		Select down=new Select(opt);
		List<WebElement> all=down.getOptions();
		System.out.println("size :"+all.size());
		for(WebElement a:all)
		{
			System.out.println("the options are :"+a.getText());
		}
		List<String> srt=new ArrayList<>();
		for(WebElement i:all)
		{
			srt.add(i.getText());
		}
		Collections.sort(srt);
		System.out.println("the sorted list");
		System.out.println(srt);
		
		down.deselectAll();
		System.out.println("is multi selected :"+down.isMultiple());
		down.selectByVisibleText("Eggs");
		down.selectByValue("onion gravy");
		List<WebElement>  b=down.getAllSelectedOptions();
		for(WebElement g:b)
		{
			System.out.println("the selected opt:"+g.getText());
		}
		down.deselectByIndex(0);
		down.deselectAll();
		driver1.close();
		
		
		
		
		
		
		
	}

}
