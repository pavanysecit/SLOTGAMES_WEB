package stepDefinition_TikeIsle;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TikeIsle_Web_Transfer_Validation_ZeroBalance {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Tike Isle game, zero balance, text field to transfer balance, Ok button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_Tike_Isle_game_zero_balance_text_field_to_transfer_balance_Ok_button_and_validation_message() throws Throwable {
		this.driver =  TikeIsle_Web_URL_Login.getDriver();
	}

	@When("^Open the Tike Isle slot game by entering the valid URL in browser, enter the valid login details, enter the amount as zero SRD and click on Ok butotn$")
	public void open_the_Tike_Isle_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_enter_the_amount_as_zero_SRD_and_click_on_Ok_butotn() throws Throwable {
		 WebElement balT = driver.findElement(By.id("transferInput"));
		 balT.clear();
		 balT.sendKeys("0");
		 Thread.sleep(2000);
		 driver.findElement(By.className("Transfer_Ok_but")).click();
		 Thread.sleep(3000);
		
		 String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		 Screen screen=new Screen();
		 Pattern bal=new Pattern("E:/Sikuli Images/Tiki Isle/zerobalance.png");

		  //Comparing the amount which is transferring to the slot game
	      Pattern credit1=new Pattern("E:/Sikuli Images/Tiki Isle/zerobalance.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Zero amount transfer should be blocked and transfer should get failed and validation message should be displayed");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Transfering the zero amount should be blocked and comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 95);
	}

	@Then("^An error should be displayed if balance entered was zero and player should be blocked from loading the Tike Isle game$")
	public void an_error_should_be_displayed_if_balance_entered_was_zero_and_player_should_be_blocked_from_loading_the_Tike_Isle_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
