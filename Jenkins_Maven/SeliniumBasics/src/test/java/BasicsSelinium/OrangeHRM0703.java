package BasicsSelinium;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrangeHRM0703 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		WebElement username=driver.findElement(By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]//child::label[contains(text(),\"Username\")]//parent::div"));
		System.out.println(username.getText());
		WebElement fielduser=driver.findElement(with(By.tagName("input")).near(username));
		fielduser.sendKeys("Admin"+Keys.ENTER);
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.xpath("//label[text()='Password']"));
		WebElement passwordbox=driver.findElement(with(By.tagName("input")).near(password));
		passwordbox.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		WebElement forgot=driver.findElement(with(By.tagName("p")).below(login));
		System.out.println(forgot.getText());
		login.click();
		Thread.sleep(5000);
		WebElement log=driver.findElement(By.xpath("//li//span//child::img"));
		log.click();
		Thread.sleep(5000);
		WebElement logout=driver.findElement(By.xpath("//li/ul//li//a[contains(text(),\"Logout\")]"));
		logout.click();
		

	}

}
