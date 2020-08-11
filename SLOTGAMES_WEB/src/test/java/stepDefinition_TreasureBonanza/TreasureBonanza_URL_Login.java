package stepDefinition_TreasureBonanza;

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
import io.appium.java_client.MobileElement;

public class TreasureBonanza_URL_Login {
private static WebDriver driver;
	
	@Before
	public static void TreasureBonanza_URL_Login() throws InterruptedException, MalformedURLException, FindFailed {

		System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();
	
		JavascriptExecutor js = (JavascriptExecutor) driver;   		
        WebElement Element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[9]/div[2]/div[2]"));		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[9]/div[1]")).click();
        Thread.sleep(3000);
				 
		driver.findElement(By.name("email")).sendKeys("test8");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[2]/header/section/div[10]/div/div[2]/form/div[2]/input")).sendKeys("mans@123");
		Thread.sleep(2000);


		driver.findElement(By.xpath("/html/body/div[2]/header/section/div[10]/div/div[2]/form/button")).click();
		Thread.sleep(5000);
		
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[9]/div[1]")).click();
        Thread.sleep(3000);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}