package stepDefinition_GoldenCrown;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.Before;


public class GoldenCrown_Web_URL_Login {
private static WebDriver driver;
	
	@Before
	public static void GoldenCrown_Web_URL_Login() throws InterruptedException, MalformedURLException, FindFailed {
		
		System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[7]/div[1]/div")).click();
		Thread.sleep(2000);
				 
		driver.findElement(By.name("email")).sendKeys("8017627028");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[2]/input")).sendKeys("mans@123");
		Thread.sleep(2000);
				
		WebElement sub = driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[3]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", sub);
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[7]/div[1]/div")).click();
		//Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[7]/div[1]/div"));		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(4000);
        
		Screen screen=new Screen();
		Pattern game=new Pattern("E:/Sikuli Images/gamble/goldenCrown.png");
		screen.click(game);
		Thread.sleep(5000);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}