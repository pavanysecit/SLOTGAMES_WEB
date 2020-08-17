package stepDefinition_UltraHot;

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

public class UltraHot_Web_Navigate_HomeScreen {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Ultra Hot slot game and home button$")
	public void chrome_browser_valid_URL_valid_login_details_Ultra_Hot_slot_game_and_home_button() throws Throwable {
		this.driver =  UltraHot_Web_URL_Login.getDriver();
	}

	@When("^Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button$")
	public void open_the_Ultra_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_and_click_on_home_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(1000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(3000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		Pattern home=new Pattern("E:/Sikuli Images/UltraHot/home.png");
		Pattern spin=new Pattern("E:/Sikuli Images/UltraHot/spin.png");
	    Pattern ultrahot=new Pattern("E:/Sikuli Images/UltraHot/ultrahot.PNG");
	    
		 screen.wait(spin, 30);
		 
		  //Comparing whether golden crown game is loaded and home button is visible
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(ultrahot);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Golden Crown game is loaded and comparisin successfull.");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Golden Crown game is loaded and comparisin value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 95);
		  
		 //Clicking on home button
		 screen.click(home);
		 Thread.sleep(5000);

		 
		  //After clicking on home button, golden crown game should not be visible
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(ultrahot);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Navigated to the home screen & golden crown home page should not be visible and comparision successfull.");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Navigate to the home screen of the slot games and comparision value is equal to: "+" "+score2 +"%");
		  Assert.assertFalse(score2 > 95);
	}

	@Then("^System should take the player to Home page after clicking on home button from Ultra Hot game$")
	public void system_should_take_the_player_to_Home_page_after_clicking_on_home_button_from_Ultra_Hot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
