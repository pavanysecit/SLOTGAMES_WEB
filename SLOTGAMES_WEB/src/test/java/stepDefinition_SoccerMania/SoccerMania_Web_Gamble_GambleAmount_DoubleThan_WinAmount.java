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

public class SoccerMania_Web_Gamble_GambleAmount_DoubleThan_WinAmount {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Soccer Mania slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Soccer_Mania_slot_game_balance_spin_button_win_amount_gamble_button_gamble_amount_and_gamble_to_win_amount() throws Throwable {
		this.driver =  SoccerMania_URL_Login.getDriver();
	}

	@When("^Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount$")
	public void open_the_Soccer_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_to_win_amount() throws Throwable {
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
		Pattern status=new Pattern("E:/Sikuli Images/SoccerMania/gamble_win_amount.png");

		
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
		  System.out.println("Gamble Win amount comparision completed successfully. Win amount is 20.00 YSI");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble Win amount comparision after Win: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 97);
		  Thread.sleep(5000);
		  
		  
		  //comparing the gamble 2x win amount should be double than as win amount
	      Pattern winB=new Pattern("E:/Sikuli Images/SoccerMania/2x_gamble.PNG");
	      Finder finder3 =new Finder(screen.capture().getImage());
	      String ht3 = finder3.find(winB);
	      double score3=20;                
	      System.out.println("the value of ht2"+" "+ht3);
		  if(finder3.hasNext())
		  {
		  Match m3=finder3.next();
		  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		  score3=(m3.getScore())*100;
		  System.out.println("Color Win amount comparision completed successfully. Gamble Win amount is 40.00 YSI");
		  finder3.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Color Win amount comparision value equals to: "+" "+score3 +"%");
		  Assert.assertTrue(score3 > 97);
		  Thread.sleep(2000);
		  
		  //comparing the gamble 4x win amount should be double than as win amount
	      Pattern winBB=new Pattern("E:/Sikuli Images/SoccerMania/4x_gamble.PNG");
	      Finder finder33 =new Finder(screen.capture().getImage());
	      String ht33 = finder33.find(winBB);
	      double score33=20;                
	      System.out.println("the value of ht2"+" "+ht33);
		  if(finder33.hasNext())
		  {
		  Match m33=finder33.next();
		  System.out.println("Match Found with: "+(m33.getScore())*100+"%");
		  score33=(m33.getScore())*100;
		  System.out.println("Gamble 4x Win amount comparision completed successfully. Gamble Win amount is 80.00 YSI");
		  finder33.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble 4x Win amount comparision value equals to: "+" "+score33 +"%");
		  Assert.assertTrue(score33 > 97);
		  Thread.sleep(3000);
		  
		  screen.click(collect);
	}

	@Then("^Gamble To Win amount should be double than Gamble amount in the gamble page of the Soccer Mania slot game$")
	public void gamble_To_Win_amount_should_be_double_than_Gamble_amount_in_the_gamble_page_of_the_Soccer_Mania_slot_game() throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
