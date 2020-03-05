package stepDefinition_SoccerMania;

import java.io.File;
import java.util.regex.Matcher;

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

public class SoccerMania_Web_Gamble_Select_NoGoal_CheckWinAmount {
WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, bet type, denomination, balance, spin button, win amount, gamble button and no goal button in gamble page$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_bet_type_denomination_balance_spin_button_win_amount_gamble_button_and_no_goal_button_in_gamble_page() throws Throwable {
		this.driver =  SoccerMania_URL_Login.getDriver();
	}

	@When("^Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Soccer Mania slot game, select bet type & denomination, click on spin button till player wins, click on gamble button and click on No goal button in gamble page$")
	public void open_the_Soccer_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_Soccer_Mania_slot_game_select_bet_type_denomination_click_on_spin_button_till_player_wins_click_on_gamble_button_and_click_on_No_goal_button_in_gamble_page() throws Throwable {
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
		Pattern pat1=new Pattern("E:/Sikuli Images/SoccerMania/balance.PNG");
		Pattern spin=new Pattern("E:/Sikuli Images/SoccerMania/betvalue_1_4.png");
		Pattern collect=new Pattern("E:/Sikuli Images/SoccerMania/gamble_collect.png");
		Pattern Win_s_1=new Pattern("E:/Sikuli Images/SoccerMania/Win_s_1.png");
		Pattern Win_s_2=new Pattern("E:/Sikuli Images/SoccerMania/Win_s_2.png");
		Pattern Win_s_4=new Pattern("E:/Sikuli Images/SoccerMania/Win_s_4.png");
		Pattern Win_s_5=new Pattern("E:/Sikuli Images/SoccerMania/Win_s_5.png");
		Pattern Win_s_8=new Pattern("E:/Sikuli Images/SoccerMania/Win_s_8.png");
		Pattern win=new Pattern("E:/Sikuli Images/SoccerMania/win_amount4.png");
		Pattern gamble=new Pattern("E:/Sikuli Images/SoccerMania/gamble.png");
		Pattern statusbutton=new Pattern("E:/Sikuli Images/SoccerMania/gamble_nogoal.png");
		Pattern pat2=new Pattern("E:/Sikuli Images/SoccerMania/win.PNG");
		  
		  //comparing the balance before Win
	      Pattern balance=new Pattern("E:/Sikuli Images/SoccerMania/balance.PNG");
	      Finder finder1 =new Finder(screen.capture().getImage());
	      String ht1 = finder1.find(balance);
	      double score1=20;                
	      System.out.println("the value of ht1"+" "+ht1);
		  if(finder1.hasNext())
		  {
		  Match m1=finder1.next();
		  System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		  score1=(m1.getScore())*100;
		  System.out.println("Balance comparision before spin completed successfully. Balance is 300 YSI");
		  finder1.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		  Assert.assertTrue(score1 > 97);
		  
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

		 screen.click(spin);
		 Thread.sleep(5000);
		 
		 screen.click(gamble);
		 Thread.sleep(3000);
		 
		 //comparing the win amount should exists after spin
	      Pattern winA=new Pattern("E:/Sikuli Images/SoccerMania/gamble_win_amount.PNG");
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(winA);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Win amount comparision completed successfully. Win amount is 20.00 YSI");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 97);
		  Thread.sleep(5000);
		  
		  try{
			    String path1 = "E:/Sikuli Images/SoccerMania/gamble.png";
			    Pattern target = new Pattern(path1);
			    Screen scr = new Screen();
			    scr.click(target);
			    }
			    catch(Exception e)
			    {
			        e.printStackTrace();
			    }
		  Thread.sleep(2000);
		  //Clicking on No Goal button
		  screen.click(statusbutton);
		  Thread.sleep(2000);
		  
		  //comparing the balance amount after spin
		  if  (screen.exists("E:/Sikuli Images/SoccerMania/win.png") != null)
	      {
	    	  Pattern gambleStatus=new Pattern("E:/Sikuli Images/SoccerMania/win.PNG");
		      Finder finder3 =new Finder(screen.capture().getImage());
		      String ht3 = finder3.find(gambleStatus);
		      double score3=20;                
		      System.out.println("the value of ht3"+" "+ht3);
			  if(finder3.hasNext())
			  {
			  Match m3=finder3.next();
			  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			  score3=(m3.getScore())*100;
			  System.out.println("Gamble Win.");
			  finder3.destroy();  
			  }         
			  else    
			  { 
			  System.out.println("Comparision failed. Test case failed");         
			  }
			  System.out.println("Gamble win comparision: "+" "+score3 +"%");
			  Assert.assertTrue(score3 > 97);			  
			  Thread.sleep(3000);

			  Pattern bal=new Pattern("E:/Sikuli Images/SoccerMania/gamble_nogoal_win.PNG");
		      Finder finder6 =new Finder(screen.capture().getImage());
		      String ht6 = finder6.find(bal);
		      double score6=20;                
		      System.out.println("the value of ht3"+" "+ht6);
			  if(finder6.hasNext())
			  {
			  Match m6=finder6.next();
			  System.out.println("Match Found with: "+(m6.getScore())*100+"%");
			  score6=(m6.getScore())*100;
			  System.out.println("Gamable Win amount should be increased by 2x. That is 40.00 YSI");
			  finder6.destroy();  
			  }         
			  else    
			  { 
			  System.out.println("Comparision failed. Test case failed");         
			  }
			  System.out.println("Gamble No Goal 2x win amount comparision: "+" "+score6 +"%");
			  Assert.assertTrue(score6 > 97);
			  Thread.sleep(2000);
			  
			  screen.click(collect);
			  Thread.sleep(4000);
			  
			  Pattern bal11=new Pattern("E:/Sikuli Images/SoccerMania/nogoal_winamount.PNG");
		      Finder finder61 =new Finder(screen.capture().getImage());
		      String ht61 = finder6.find(bal11);
		      double score61=20;                
		      System.out.println("the value of ht31"+" "+ht61);
			  if(finder61.hasNext())
			  {
			  Match m61=finder61.next();
			  System.out.println("Match Found with: "+(m61.getScore())*100+"%");
			  score61=(m61.getScore())*100;
			  System.out.println("Gamable Win amount should get added to main balance. Balance should be 337.00 YSI");
			  finder61.destroy();  
			  }         
			  else    
			  { 
			  System.out.println("Comparision failed. Test case failed");         
			  }
			  System.out.println("Gamble win added to the balance comparision: "+" "+score61 +"%");
			  Assert.assertTrue(score61 > 97);
			  Thread.sleep(2000);
	      }
	      else
	      {			
	    	  Thread.sleep(3000);
			  Pattern Abalance=new Pattern("E:/Sikuli Images/SoccerMania/balance_aftergamblelose.PNG");
		      Finder finder11 =new Finder(screen.capture().getImage());
		      String ht11 = finder11.find(Abalance);
		      double score11=20;                
		      System.out.println("the value of ht1"+" "+ht11);
			  if(finder11.hasNext())
			  {
			  Match m11=finder11.next();
			  System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			  score11=(m11.getScore())*100;
			  System.out.println("Balance After losing in gamble. Balance is 297 YSI");
			  finder11.destroy();  
			  }         
			  else    
			  { 
			  System.out.println("Comparision failed. Test case failed");         
			  }
			  System.out.println("Balance comparision after lose: "+" "+score1 +"%");
			  Assert.assertTrue(score1 > 97);		  
	      }
	}

	@Then("^Win amount multipled by (\\d+)x should get added to the main balance after clicking on No Goal button and after player wins in gamble in Soccer Mania game$")
	public void win_amount_multipled_by_x_should_get_added_to_the_main_balance_after_clicking_on_No_Goal_button_and_after_player_wins_in_gamble_in_Soccer_Mania_game(int arg1) throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}