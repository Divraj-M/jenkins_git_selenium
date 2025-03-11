package BasicsSelinium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mobiles1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.lotmobiles.com/ ");
		WebElement one[]=new WebElement[3];
		one[0]=driver.findElement(By.xpath("//label[@class=\"label\"]//span[contains(text(),\"Search\")]//parent::label//following-sibling::div//child::input"));
		one[1]=driver.findElement(By.cssSelector("div.control>input#search"));
		one[2]=driver.findElement(By.id("search"));
		String a[]= {"placeholder","id","type"};
		for(int i=0;i<3;i++)
		{
			System.out.println(1.0+((i+1)*0.1)+" "+a[i]+" for search box :"+one[i].getDomAttribute(a[i]));	
		}
		WebElement two[]=new WebElement[3];
		two[0]=driver.findElement(By.xpath("//button[@type=\"submit\"]//child::span[text()=\"Search\"]"));
		two[1]=driver.findElement(By.cssSelector("div.actions>button>span"));
		two[2]=driver.findElement(By.className("actions"));
		
		System.out.println("2.1 tagname for search:"+two[0].getTagName());
		System.out.println("2.2 innertext for search:"+two[1].getText());
		System.out.println("2.3 bgcolor of the text:"+two[2].getCssValue("background-color"));
		
		WebElement Three[]=new WebElement[3];
		Three[0]=driver.findElement(By.xpath("//ul[@class=\"header links\"]//descendant::a"));
		Three[1]=driver.findElement(By.cssSelector("a[class$=\"login-link\"]"));
		Three[2]=driver.findElement(By.className("ajax-login-link"));
		System.out.println("3.1 Url For Login :"+Three[0].getDomAttribute("href"));
		System.out.println("3.2 Inner Text For Login is :"+Three[1].getText());
		System.out.println("3.3 Now Click the displayed :"+Three[2].isDisplayed());
		Three[2].click();
		WebElement four[]=new WebElement[3];
		four[0]=driver.findElement(By.cssSelector("li.login-type-last>a#loginwithajax"));
		four[1]=driver.findElement(By.id("loginwithajax"));
		four[2]=driver.findElement(By.xpath("//ul[@id=\"login-type\"]//li[position()=2]"));
		System.out.println("4.1 The CSS Value for Cursor:"+four[0].getCssValue("cursor"));
		System.out.println("4.2 The DomAttributes of href:"+four[1].getDomAttribute("href"));
		System.out.println("4.3 the CSS value of color:"+four[2].getCssValue("color"));
		four[1].click();
		WebElement five[]=new WebElement[3];
		five[0]=driver.findElement(By.xpath("//input[@type=\"text\" and @title=\"Email Address\" and @id=\"mobile-login-email\"]"));
		five[1]=driver.findElement(By.cssSelector(".input-box>#input-box-login>input"));
		five[2]=driver.findElement(By.name("login[username]"));
		System.out.println("5.1 The Email bar is enable:"+five[0].isEnabled());
		System.out.println("5.2 The DomAttributes of placeholder:"+five[1].getDomAttribute("placeholder"));
		System.out.println("5.3 the email bar is displayed:"+five[2].isDisplayed());
		five[2].sendKeys("2k21cse022@kiot.ac.in"+Keys.ENTER);
		
		WebElement six[]=new WebElement[3];
		six[0]=driver.findElement(By.xpath("//span[@id=\"input-box-password\"]//input[@type=\"password\"]"));
		six[1]=driver.findElement(By.cssSelector("span[id*=\"-password\"]>input"));
		six[2]=driver.findElement(By.name("login[password]"));
		System.out.println("6.1 The password bar is enable:"+six[0].isEnabled());
		System.out.println("6.2 The css of height:"+six[1].getCssValue("height"));
		System.out.println("6.3 the email bar is displayed:"+six[2].isDisplayed());
		six[2].sendKeys("Divraj@123");
		WebElement login1=driver.findElement(By.xpath("//div[@class=\"actions-toolbar\"]//button[@name=\"send\"]//span//child::span[@class=\"btn-title\"][contains(text(),\"Login\")]"));
		WebElement login2=driver.findElement(By.cssSelector(".actions-toolbar button[name=\"send\"] > span .btn-title"));
		WebElement login3=driver.findElement(By.className("btn-title"));
		System.out.println("7.1 the login button font family:"+login1.getCssValue("font-family"));
		System.out.println("7.2 the login button class :"+login2.getClass());
		System.out.println("7.3 Successfully Logged In and tag name :"+login3.getTagName());
		login1.click();
		WebElement seven[]=new WebElement[3];
		seven[0]=driver.findElement(By.linkText("Privacy Policy"));
		seven[1]=driver.findElement(By.cssSelector("#login-email>div.register1>a:nth-child(1)"));
		seven[2]=driver.findElement(By.xpath("//form[@id=\"login-otp\"]//div[@class=\"register1\"]//child::a//b[text()=\"Privacy Policy\"]"));
		System.out.println("8.1 The inner text in :"+seven[0].getText());
		System.out.println("8.2 The url for privacy policy:"+seven[1].getDomAttribute("href"));
		System.out.println("8.3 the cursor value:"+seven[2].getCssValue("cursor"));
		driver.get("https://www.lotmobiles.com/privacy-policy");
		WebElement Eight[]=new WebElement[3];
		Eight[0]=driver.findElement(By.cssSelector("div.welcome"));
		Eight[1]=driver.findElement(By.xpath("//div[@class=\"container\"]//descendant::div[@class=\"welcome\"]"));
		Eight[2]=driver.findElement(By.linkText("Store Locator"));
		System.out.println("9.1 Class Name for Number :"+Eight[0].getDomAttribute("class"));
		System.out.println("9.2 The inner text for number:"+Eight[1].getText());
		System.out.println("9.3 The inner text for store:"+Eight[2].getText());
		System.out.println(driver.getCurrentUrl());
		List<WebElement> link1=driver.findElements(By.tagName("a"));
		int c=link1.size();
		WebElement nine1=driver.findElement(By.xpath("//ul[@class=\"footer-links\"]//li//child::a[contains(text(),\"Disclaimer Policy\")]"));
		WebElement nine2=driver.findElement(By.cssSelector("ul.footer-links li:nth-of-type(3) a[href$=\"policy\"]"));
		System.out.println("10.1 the count of a tag:"+c);
		System.out.println("10.2 the tag text is:"+nine1.getTagName());
		System.out.println("10.3 the dom attributes are :"+nine2.getDomAttribute("data-bind")); 
		WebElement logo[]=new WebElement[3];
		logo[0]=driver.findElement(By.xpath("//h1[@class=\"logo text-hide\"]//child::a"));
		logo[1]=driver.findElement(By.cssSelector("div .logo>a"));
		System.out.println("11.1 the color of the img"+logo[0].getCssValue("color"));
		System.out.println("11.2 the url of the img:"+logo[1].getDomAttribute("href"));
		System.out.println("11.3 It is displayed :"+logo[1].isDisplayed());
		WebElement name[]=new WebElement[3];
		name[0]=driver.findElement(By.xpath("//div[@class=\"customer-name acc-btn\"]//div//following-sibling::div"));
		name[1]=driver.findElement(By.cssSelector("div[data-bind^=\"text: customer().firstname\"]"));
		name[2]=driver.findElement(By.className("name"));
		System.out.println("12.1 the name of the user :"+name[0].getText());
		System.out.println("12.2 the data bind value:"+name[1].getDomAttribute("data-bind"));
		System.out.println("12.3 the class name is :"+name[2].getClass());
		WebElement imageMobile[]=new WebElement[3];
		imageMobile[0]=driver.findElement(By.xpath("//a[@class=\"hover-effect01\"]//span[@class=\"btn-wrap\"]//preceding-sibling::span[position()=1]//img[@src=\"https://www.lotmobiles.com/media/wysiwyg/magebig/Category_Banner_-_Mobiles.jpg\"]"));
		imageMobile[1]=driver.findElement(By.cssSelector(".img-fluid[src$=\"obiles.jpg\"]"));
		//class name
		System.out.println("13.1 the url of the image:"+imageMobile[0].getDomAttribute("src"));
		System.out.println("13.2 the font family of image:"+imageMobile[1].getCssValue("font-family"));
		imageMobile[0].click();
		WebElement apple[]=new WebElement[3];
		apple[0]=driver.findElement(By.xpath("//label[@for=\"filter-manufacturer-5566\"]//span[text()=\"Apple\"]"));
		apple[1]=driver.findElement(By.cssSelector("#filter-manufacturer-5566"));
		apple[2]=driver.findElement(By.id("filter-manufacturer-5566"));
		System.out.println("14.1 the iiner text is:"+apple[0].getText());
		System.out.println("14.2 the for attributes :"+apple[1].getDomAttribute("for"));
		System.out.println("14.3 the padding left at :"+apple[2].getCssValue("padding-left"));
		apple[0].click();
		WebElement color[]=new WebElement[3];
		color[0]=driver.findElement(By.xpath("//input[@id=\"filter-sw-4\"]//following-sibling::label[1]"));
		color[1]=driver.findElement(By.cssSelector(".swatch-attribute-options label:nth-of-type(2) span[data-option-label*=\"Silver\"]"));
		System.out.println("15.1 the arial label of the black:"+color[0].getDomAttribute("aria-label"));
		System.out.println("15.2 the phone is:"+color[1].isDisplayed());
		
		/*
		 * 
		 * WebElement mobile[]=new WebElement[3]; mobile[0]=driver.findElement(By.
		 * xpath("//span[@class=\"product-image-wrapper\"]//img[@alt=\"Apple iPhone 13 (128GB, Starlight)\" and @width=\"270\"]"
		 * )); mobile[0].click();
		 */	
		
		

	}

}