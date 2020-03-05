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

public class TikeIsle_Web_Transfer_Validation_EmptyBalance {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Tike Isle game, empty balance, text field to transfer balance, Ok button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_Tike_Isle_game_empty_balance_text_field_to_transfer_balance_Ok_button_and_validation_message() throws Throwable {
		this.driver =  TikeIsle_Web_URL_Login.getDriver();
	}

	@When("^Open the Tike Isle slot game by entering the valid URL in browser, enter the valid login details,  do not enter the amount in the balance field and click on Ok butotn$")
	public void open_the_Tike_Isle_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_do_not_enter_the_amount_in_the_balance_field_and_click_on_Ok_butotn() throws Throwable {
		 WebElement balT = driver.findElement(By.id("transferInput"));
		 balT.clear();
		 Thread.sleep(2000);
		 driver.findElement(By.className("Transfer_Ok_but")).click();
		 Thread.sleep(2000);
		
		 String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		 Screen screen=new Screen();
		 Pattern bal=new Pattern("E:/Sikuli Images/Tiki Isle/emptybalance.png");

		  //Comparing the amount which is transferring to the slot game
	      Pattern credit1=new Pattern("E:/Sikuli Images/Tiki Isle/emptybalance.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Empty amount transfer should be blocked and transfer should get failed and validation message should be displayed");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Transfering the empty amount should be blocked and comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 95);
	}

	@Then("^An error should be displayed if the balance field is empty and player should be blocked from loading the Tike Isle game$")
	public void an_error_should_be_displayed_if_the_balance_field_is_empty_and_player_should_be_blocked_from_loading_the_Tike_Isle_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
