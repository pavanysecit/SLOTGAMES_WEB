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

public class UltraHot_Web_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value2 {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two$")
	public void chrome_browser_valid_URL_valid_login_details_Ultra_Hot_slot_game_balance_spin_button_win_amount_in_currency_credits_and_win_amount_in_credits_for_denomination_drop_down_value_two() throws Throwable {
		this.driver =  UltraHot_Web_URL_Login.getDriver();
	}

	@When("^Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance$")
	public void open_the_Ultra_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_the_dinomination_drop_down_value_two_click_on_spin_button_till_player_wins_click_on_balance_check_the_win_amount_and_click_on_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		balT.sendKeys("300");
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(3000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		Pattern spin=new Pattern("E:/Sikuli Images/UltraHot/spin.png");
		Pattern balance_credits_1=new Pattern("E:/Sikuli Images/UltraHot/balance_credits_2.png");
		Pattern credit_balance_1=new Pattern("E:/Sikuli Images/UltraHot/credit_balance_2.png");
		Pattern win_1=new Pattern("E:/Sikuli Images/UltraHot/win_2.png");
		Pattern take=new Pattern("E:/Sikuli Images/UltraHot/take.png");
	    Pattern win_credits_1=new Pattern("E:/Sikuli Images/UltraHot/win_credits_1.PNG");
		Pattern credit1=new Pattern("E:/Sikuli Images/UltraHot/credit1.png");
		Pattern credit=new Pattern("E:/Sikuli Images/UltraHot/credit.png");
		Pattern plum=new Pattern("E:/Sikuli Images/UltraHot/plum.png");
		Pattern orange=new Pattern("E:/Sikuli Images/UltraHot/orange.png");
		Pattern lemon=new Pattern("E:/Sikuli Images/UltraHot/lemon.png");
		Pattern lemon1=new Pattern("E:/Sikuli Images/UltraHot/lemon1.png");
		Pattern wm=new Pattern("E:/Sikuli Images/UltraHot/wm.png");
		Pattern bell=new Pattern("E:/Sikuli Images/UltraHot/bell.png");   
		
		screen.wait(spin, 50);
		screen.click(credit);
		Thread.sleep(2000);
		
		 //comparing the credit value should be 0.05
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Credit value is 0.05 & comparision successful.");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Credit value is 0.05 & comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 95);
		  

		//arranging the symbols to get a win
		screen.click(plum);
		Thread.sleep(1000);
		screen.click(bell);
		Thread.sleep(1000);
		screen.click(wm);
		Thread.sleep(1000);
		screen.click(orange);
		Thread.sleep(1000);
	    screen.click(bell);
		Thread.sleep(1000);
	    screen.click(lemon);
		Thread.sleep(1000);
		screen.click(orange);
		Thread.sleep(1000);
		screen.click(orange);
		Thread.sleep(1000);
	    screen.click(lemon1);
		Thread.sleep(1000);
		
		 //Clicking on Spin button
		 screen.click(spin);
		 Thread.sleep(5000);
		 screen.wait(win_1, 30);
	 
		 //comparing the win amount should exists after spin
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(win_1);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Win amount is 2.00 after spin and comparision completed successfully.");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount is 2.00 & comparision value equal to: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 92);
		  Thread.sleep(2000);
		  
		  //clicking on balance button to convert amount into to credits
		  screen.click(balance_credits_1);
		  Thread.sleep(2000);
		  
		  //comparing the win amount in credits 
	      Finder finder3 =new Finder(screen.capture().getImage());
	      String ht3 = finder3.find(win_credits_1);
	      double score3=20;                
	      System.out.println("the value of ht3"+" "+ht3);
		  if(finder3.hasNext())
		  {
		  Match m3=finder3.next();
		  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		  score3=(m3.getScore())*100;
		  System.out.println("Win amount in credits is 40 & comparision successfull.");
		  finder3.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount in credits is 40 & comparision value equal to: "+" "+score3 +"%");
		  Assert.assertTrue(score3 > 95);
		  Thread.sleep(2000);
		  
		  
		  //Comparing Balance in credits 
	      Finder finder4 =new Finder(screen.capture().getImage());
	      String ht4 = finder4.find(credit_balance_1);
	      double score4=20;                
	      System.out.println("the value of ht4"+" "+ht4);
		  if(finder4.hasNext())
		  {
		  Match m4=finder4.next();
		  System.out.println("Match Found with: "+(m4.getScore())*100+"%");
		  score4=(m4.getScore())*100;
		  System.out.println("Balance in credits 6,995 & comparision successfull. ");
		  finder4.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance in credits 6,995 & comparision value equal to	: "+" "+score4 +"%");
		  Assert.assertTrue(score4 > 91);
		  
		  //clicking on balance button to convert credits into to amount in currency
		  screen.click(credit_balance_1);
		  Thread.sleep(2000);
		  
		  //comparing the win amount in currency
	      Finder finder6 =new Finder(screen.capture().getImage());
	      String ht6 = finder6.find(win_1);
	      double score6=20;                
	      System.out.println("the value of ht6"+" "+ht6);
		  if(finder6.hasNext())
		  {
		  Match m6=finder6.next();
		  System.out.println("Match Found with: "+(m6.getScore())*100+"%");
		  score6=(m6.getScore())*100;
		  System.out.println("Win amount in credits 40 * credit value(0.05) = 2.00 in currnecy & comparision successfull.");
		  finder6.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount in credits 40 * credit value(0.05) = 2.00 in currnecy & comparision value equal to: "+" "+score6 +"%");
		  Assert.assertTrue(score6 > 93);
		  Thread.sleep(2000);
		  
		  screen.click(take);
	}

	@Then("^Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in Ultra Hot slot game$")
	public void win_amount_in_credit_multiplied_by_denomination_drop_down_value_two_is_equal_to_win_amount_in_currency_in_Ultra_Hot_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
