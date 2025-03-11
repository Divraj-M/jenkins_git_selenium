package BasicsSelinium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class File {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("filename.properties");
		prop.load(fis);
		String browser1;
		browser1=prop.getProperty("browser1");
		if(browser1.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		
		
		
		

	}

}
