package stepDefinition_SkinfiriLotto;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SkinfiriLotto_Web_Check_MaximizeAndMinimize_Buttons {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Lotto slot game, maximize button and minimize button$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Lotto_slot_game_maximize_button_and_minimize_button() throws Throwable {
		this.driver =  SkinfiriLotto_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button$")
	public void open_the_Skinfiri_Lotto_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_maximize_button_and_click_on_minimize_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Screen screen=new Screen();
		Pattern spin=new Pattern("E:/Sikuli Images/SkinfiriLotto/spin.png");
		screen.wait(spin, 80);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		Pattern url=new Pattern("E:/Sikuli Images/SkinfiriLotto/url.png");
		Pattern min=new Pattern("E:/Sikuli Images/SkinfiriLotto/minimize.png");
		Pattern max=new Pattern("E:/Sikuli Images/SkinfiriLotto/maximize.png");
		Pattern settings=new Pattern("E:/Sikuli Images/SkinfiriLotto/settings.png");
		 
		//Clicking on setting icon and then clicking on maximize icon 
		 screen.click(settings);
		 Thread.sleep(2000);
		 screen.click(max);
		 Thread.sleep(6000);
		 
		  //if the screen is maximized, comparing URL bar should not be visible
	      Pattern credit1=new Pattern("E:/Sikuli Images/SkinfiriLotto/url.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("If the screen is maximized, url bar should not be visible and comparisin successfull.");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("If the screen is maximized, url bar should not be visible and comparisin value equals to: "+" "+score +"%");
		  Assert.assertFalse(score > 97);
		  
		 //Clicking on manimize icon 
		 screen.click(min);
		 Thread.sleep(5000);
		 
		  //if the screen is minimized, comparing URL bar should  be visible
	      Pattern winA=new Pattern("E:/Sikuli Images/SkinfiriLotto/url.PNG");
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(winA);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("URl bar should be visible if the bar is minimized and comparision successfull.");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("URl bar should be visible if the bar is minimized and comparision value is equal to: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 90);
		  Thread.sleep(2000);
	}

	@Then("^Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Skinfiri Lotto slot game$")
	public void full_screen_should_be_displayed_after_clicking_on_maximize_button_and_minimized_screen_should_be_displayed_after_clicking_on_minimize_button_in_Skinfiri_Lotto_slot_game() throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
