package stepDefinition_SkinfiriLotto;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import cucumber.api.java.Before;

public class SkinfiriLotto_URL_Login {
private static WebDriver driver;
	
	@Before
	public static void SkinfiriLotto_URL_Login() throws InterruptedException, MalformedURLException, FindFailed {

		System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[2]/div[1]/div")).click();
		Thread.sleep(2000);
				 
		driver.findElement(By.name("email")).sendKeys("8017627028");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[2]/input")).sendKeys("mans@123");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[3]/header/section/div[9]/div/div[2]/form/div[3]")).click();
		Thread.sleep(5000);

//		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[3]/div[1]/div")).click();
//		Thread.sleep(5000);
		Screen screen=new Screen();
		Pattern lotto=new Pattern("E:/Sikuli Images/SkinfiriLotto/skinfirilotto.PNG");
		screen.click(lotto);
		Thread.sleep(5000);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}