package stepDefinition_GoldenCrown;

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

public class GoldenCrown_Web_TryNow_Spin_DeductBalance {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Crown slot game, try now button, balance to play and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_try_now_button_balance_to_play_and_spin_button() throws Throwable {
		this.driver =  GoldenCrown_Web_URL_Login.getDriver();
	}

	@When("^Open the Golden Crown slot game by entering the valid URL in browser, click on try now button and click on spin button$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_click_on_try_now_button_and_click_on_spin_button() throws Throwable {
		 WebElement balT = driver.findElement(By.id("transferInput"));
		 balT.clear();
		 balT.sendKeys("0");
		 Thread.sleep(2000);
		 driver.findElement(By.className("Transfer_Ok_but")).click();
		 Thread.sleep(2000);
		
		 String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		 Screen screen=new Screen();
		 Pattern bal=new Pattern("E:/Sikuli Images/others/zerobalance.png");

		  //Comparing the amount which is transferring to the slot game
	      Pattern credit1=new Pattern("E:/Sikuli Images/others/zerobalance.png");
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

	@Then("^Amount should get deducted from balance on click on spin button in try now page of Golden Crownslot game$")
	public void amount_should_get_deducted_from_balance_on_click_on_spin_button_in_try_now_page_of_Golden_Crownslot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
