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

public class SkinfiriLotto_Web_Check_UserInstruction_Messages {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Lotto slot game, balance, spin button and user instruction message$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Lotto_slot_game_balance_spin_button_and_user_instruction_message() throws Throwable {
		this.driver =  SkinfiriLotto_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Lotto hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages$")
	public void open_the_Skinfiri_Lotto_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_and_check_the_user_instruction_messages() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput"))); 
	
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(20000);
		Screen screen=new Screen();
		Pattern spin=new Pattern("E:/Sikuli Images/SkinfiriLotto/spin.png");
		screen.wait(spin, 60);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";

		  //Comparing Place your bet message is displaying
	      Pattern credit1=new Pattern("E:/Sikuli Images/SkinfiriLotto/placebet.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Place your bet message is displayed and comparision successfull.");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Place your bet message is displayed and comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 97);
		  
		 //Clicking on spin button
		 screen.click(spin);
		 Thread.sleep(1000);
		 
		  //After clicking on home button, golden hot game should not be visible
	      Pattern winA=new Pattern("E:/Sikuli Images/SkinfiriLotto/goodluck.PNG");
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(winA);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Good luck message is displayed and comparision successfull.");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Good luck message is displayed and comparision value is equal to: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 95);
	}

	@Then("^User instruction message 'Please place your bet' should be displayed before spin button is clicked$")
	public void user_instruction_message_Please_place_your_bet_should_be_displayed_before_spin_button_is_clicked() throws Throwable {
		 Thread.sleep(3000); 
	}
	
	@Then("^User instruction message 'Good Luck' should be displayed after spin button is clicked in Skinfiri Lotto slot game$")
	public void user_instruction_message_Good_Luck_should_be_displayed_after_spin_button_is_clicked_in_Skinfiri_Lotto_slot_game() throws Throwable {
		driver.quit();
	}
}
