package stepDefinition_SkinfiriLotto;

import java.io.File;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

public class SkinfiriLotto_Web_Balance_InsufficiantBalance_Validation {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Lotto slot game, balance, spin button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Lotto_slot_game_balance_spin_button_and_validation_message() throws Throwable {
		this.driver =  SkinfiriLotto_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message$")
	public void open_the_Skinfiri_Lotto_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_balance_turns_to_zero_and_check_the_validation_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Screen screen=new Screen();
		Pattern spin1=new Pattern("E:/Sikuli Images/SkinfiriLotto/spin.png");
		screen.wait(spin1, 80);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		Pattern betvalue_1_5=new Pattern("E:/Sikuli Images/SkinfiriLotto/betvalue_1_5.png");
		Pattern spin=new Pattern("E:/Sikuli Images/SkinfiriLotto/spin.png");
		
	    // Clicking the denomination and spin button
	    screen.click(betvalue_1_5);
	    Thread.sleep(2000);
	    screen.click(spin);
	    Thread.sleep(5000);
	
		 //comparing the in-sufficient balance message displayed or not
	      Pattern bal=new Pattern("E:/Sikuli Images/SkinfiriLotto/insufficiant.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(bal);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Insufficiant balance message displayed. Test case passed.");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Insufficiant balance message comparision value is equal to: "+" "+score +"%");
		  Assert.assertTrue(score > 97);
	}

	@Then("^Player should be blocked from playing the game when there is no balance in the account in Skinfiri Lotto game$")
	public void player_should_be_blocked_from_playing_the_game_when_there_is_no_balance_in_the_account_in_Skinfiri_Lotto_game() throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
