package stepDefinition_SkinfiriLotto;

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

public class SkinfiriLotto_Web_Transfer_Validation_AvailableBalance {
WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Lotto game, balance greater than available balance, text field to transfer balance, Ok button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Lotto_game_balance_greater_than_available_balance_text_field_to_transfer_balance_Ok_button_and_validation_message() throws Throwable {
		this.driver =  SkinfiriLotto_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details, enter the amount greater than available balance and click on Ok butotn$")
	public void open_the_Skinfiri_Lotto_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_enter_the_amount_greater_than_available_balance_and_click_on_Ok_butotn() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput"))); 
		
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(2000);
		balT.sendKeys("500000000");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(3000);
		
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Tike Isle\\balance_beforeSpin_1_1.PNG";
		Screen screen=new Screen();


		  //Comparing the amount which is transferring to the slot game
	      Pattern credit=new Pattern("E:/Sikuli Images/SkinfiriLotto/morebalance.PNG");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Transfering the amount which is greater than available balance and transfer is should get faailed and valiadation message should be displayed.");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Transfer should get failed and validation message should be displayed and comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 95);
	}

	@Then("^Player should be blocked from loading the Skinfiri Lotto game when the amount entered in the transfer page is more than the available balance$")
	public void player_should_be_blocked_from_loading_the_Skinfiri_Lotto_game_when_the_amount_entered_in_the_transfer_page_is_more_than_the_available_balance() throws Throwable {
	    
	}
}
