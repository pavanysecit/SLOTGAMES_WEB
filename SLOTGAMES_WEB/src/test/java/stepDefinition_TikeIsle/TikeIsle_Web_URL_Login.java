package stepDefinition_TikeIsle;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import cucumber.api.java.Before;

public class TikeIsle_Web_URL_Login {
private static WebDriver driver;
	
	@Before
	public static void TikeIsle_Web_URL_Login() throws InterruptedException, MalformedURLException, FindFailed {
		
		System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();

		Screen screen=new Screen();
		Pattern tikiIsle=new Pattern("E:/Sikuli Images/Tiki Isle/tikiIsle.PNG");
		screen.click(tikiIsle);
		Thread.sleep(4000);
		
				 
		driver.findElement(By.name("email")).sendKeys("8017627028");
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[2]/input")).sendKeys("mans@123");
		
		driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[3]")).click();
		Thread.sleep(5000);

		screen.click(tikiIsle);
		Thread.sleep(5000);	
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}