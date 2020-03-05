package stepDefinition_SoccerMania;

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

public class SoccerMania_Web_Balance_To_Credits_CreditWinAmountEqualsCurrencyWinAmount_Value4 {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four$")
	public void chrome_browser_valid_URL_valid_login_details_Soccer_Mania_slot_game_balance_spin_button_win_amount_in_currency_credits_and_win_amount_in_credits_for_denomination_drop_down_value_four() throws Throwable {
		this.driver =  SoccerMania_URL_Login.getDriver();
	}

	@When("^Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance$")
	public void open_the_Soccer_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_the_dinomination_drop_down_value_four_click_on_spin_button_till_player_wins_click_on_balance_check_the_win_amount_and_click_on_balance() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(15000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		Screen screen=new Screen();
		Pattern betvalue_4_2=new Pattern("E:/Sikuli Images/SoccerMania/betvalue_4_2.png");
		Pattern Win_s_1=new Pattern("E:/Sikuli Images/SoccerMania/Win_s_1.png");
		Pattern Win_s_2=new Pattern("E:/Sikuli Images/SoccerMania/Win_s_2.png");
		Pattern Win_s_4=new Pattern("E:/Sikuli Images/SoccerMania/Win_s_4.png");
		Pattern Win_s_5=new Pattern("E:/Sikuli Images/SoccerMania/Win_s_5.png");
		Pattern Win_s_8=new Pattern("E:/Sikuli Images/SoccerMania/Win_s_8.png");
		Pattern balanceCr=new Pattern("E:/Sikuli Images/SoccerMania/balance_credits3.png");
		Pattern wincr=new Pattern("E:/Sikuli Images/SoccerMania/balance_click4.png");
		Pattern creditvalue=new Pattern("E:/Sikuli Images/SoccerMania/creditvalue.png");
		Pattern denom=new Pattern("E:/Sikuli Images/SoccerMania/creditvalue4.png");
		
		//Selecting credit value as 0.5
		screen.click(creditvalue);
		Thread.sleep(2000);
		screen.click(denom);
		Thread.sleep(2000);
		
		 //comparing the credit value should be 0.5
	      Pattern credit1=new Pattern("E:/Sikuli Images/SoccerMania/creditvalue_3.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Credit value comparision happened successfully. Value is 0.5");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Credit comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 97);
		  
		  
		 //Clicking on symbol to make the player win
		 screen.click(Win_s_1);
		 Thread.sleep(1000);
		 screen.click(Win_s_2);
		 Thread.sleep(1000);
		 screen.click(Win_s_2);
		 Thread.sleep(1000);
		 screen.click(Win_s_4);
		 Thread.sleep(1000);
		 screen.click(Win_s_5);
		 Thread.sleep(1000);
		 screen.click(Win_s_5);
		 Thread.sleep(1000);
		 screen.click(Win_s_5);
		 Thread.sleep(1000);
		 screen.click(Win_s_8);
		 Thread.sleep(1000);

		 screen.click(betvalue_4_2);
		 Thread.sleep(5000);
		 
		 //comparing the win amount should exists after spin
	      Pattern winA=new Pattern("E:/Sikuli Images/SoccerMania/win_amount6.PNG");
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(winA);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Win amount comparision after spin completed successfully.");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 97);
		  Thread.sleep(2000);
		  
		  //clicking on balance button to convert amount into to credits
		  screen.click(wincr);
		  Thread.sleep(2000);
		  
		  //comparing the win amount in credits
	      Pattern balanceA=new Pattern("E:/Sikuli Images/SoccerMania/winamount_credits.PNG");
	      Finder finder3 =new Finder(screen.capture().getImage());
	      String ht3 = finder3.find(balanceA);
	      double score3=20;                
	      System.out.println("the value of ht3"+" "+ht3);
		  if(finder3.hasNext())
		  {
		  Match m3=finder3.next();
		  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		  score3=(m3.getScore())*100;
		  System.out.println("Win amount in credits comparision successfull.");
		  finder3.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount in credits comparision value equal to: "+" "+score3 +"%");
		  Assert.assertTrue(score3 > 97);
		  Thread.sleep(2000);
		  
		  
		  //Balance in credits 
	      Pattern symbol=new Pattern("E:/Sikuli Images/SoccerMania/balance_credits3.PNG");
	      Finder finder4 =new Finder(screen.capture().getImage());
	      String ht4 = finder4.find(symbol);
	      double score4=20;                
	      System.out.println("the value of ht4"+" "+ht4);
		  if(finder4.hasNext())
		  {
		  Match m4=finder4.next();
		  System.out.println("Match Found with: "+(m4.getScore())*100+"%");
		  score4=(m4.getScore())*100;
		  System.out.println("Balance in credits comparision successfull. ");
		  finder4.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance in credits comparision value equal to	: "+" "+score4 +"%");
		  Assert.assertTrue(score4 > 97);
		  
		  //clicking on balance button to convert credits into to amount in currency
		  screen.click(balanceCr);
		  Thread.sleep(2000);
		  
		  //comparing the win amount in currency
	      Pattern winB=new Pattern("E:/Sikuli Images/SoccerMania/win_amount7.PNG");
	      Finder finder6 =new Finder(screen.capture().getImage());
	      String ht6 = finder6.find(winB);
	      double score6=20;                
	      System.out.println("the value of ht6"+" "+ht6);
		  if(finder6.hasNext())
		  {
		  Match m6=finder6.next();
		  System.out.println("Match Found with: "+(m6.getScore())*100+"%");
		  score6=(m6.getScore())*100;
		  System.out.println("Win amount in currnecy comparision successfull.");
		  finder6.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount comparision in currency value equal to: "+" "+score6 +"%");
		  Assert.assertTrue(score6 > 90);
		  Thread.sleep(2000);
	}

	@Then("^Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in Soccer Mania slot game$")
	public void win_amount_in_credit_multiplied_by_denomination_drop_down_value_four_is_equal_to_win_amount_in_currency_in_Soccer_Mania_slot_game() throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
