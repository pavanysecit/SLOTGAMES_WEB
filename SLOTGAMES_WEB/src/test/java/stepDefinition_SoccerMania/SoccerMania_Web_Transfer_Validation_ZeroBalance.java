package stepDefinition_SoccerMania;

import org.junit.Assert;
import org.openqa.selenium.By;
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

public class SoccerMania_Web_Transfer_Validation_ZeroBalance {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Soccer Mania game, zero balance, text field to transfer balance, Ok button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_Soccer_Mania_game_zero_balance_text_field_to_transfer_balance_Ok_button_and_validation_message() throws Throwable {
		this.driver =  SoccerMania_URL_Login.getDriver();
	}

	@When("^Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok butotn$")
	public void open_the_Soccer_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_enter_the_amount_as_zero_SRD_and_click_on_Ok_butotn() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput"))); 
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("00");
		Thread.sleep(2000);
		 driver.findElement(By.className("Transfer_Ok_but")).click();
		 Thread.sleep(2000);
		
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		Screen screen=new Screen();

		  //Comparing the amount which is transferring to the slot game
	      Pattern credit1=new Pattern("E:/Sikuli Images/SoccerMania/zerobalance.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Transfering the zero balance and transfer is should get failed and valiadation message should be displayed.");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Transfer should get failed and validation message should be displayed and comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 95);
	}

	@Then("^An error should be displayed if balance entered was zero and player should be blocked from loading the Soccer Mania game$")
	public void an_error_should_be_displayed_if_balance_entered_was_zero_and_player_should_be_blocked_from_loading_the_Soccer_Mania_game() throws Throwable {
	    Thread.sleep(3000);
	    driver.quit();
	}
}
