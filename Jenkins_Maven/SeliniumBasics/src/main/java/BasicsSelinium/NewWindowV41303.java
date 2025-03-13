package BasicsSelinium;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowV41303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bing.com/");
        System.out.println("bing opened in new page");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://duckduckgo.com/");
        System.out.println("duckduck go open in new page");
        driver.quit();

	}

}
