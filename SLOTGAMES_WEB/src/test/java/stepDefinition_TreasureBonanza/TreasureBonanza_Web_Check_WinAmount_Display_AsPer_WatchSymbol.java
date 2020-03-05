package stepDefinition_TreasureBonanza;

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

public class TreasureBonanza_Web_Check_WinAmount_Display_AsPer_WatchSymbol {
WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type, denomination as (\\d+)\\.(\\d+) & (\\d+), balance, watch symbols, spin button, win amount, game info page and payout table$")
	public void chrome_browser_valid_URL_valid_login_details_Treasure_Bonanza_slot_game_bet_type_denomination_as_balance_watch_symbols_spin_button_win_amount_game_info_page_and_payout_table(int arg1, int arg2, int arg3) throws Throwable {
		this.driver =  TreasureBonanza_URL_Login.getDriver();
	}

	@When("^Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination as (\\d+)\\.(\\d+) & (\\d+), click on spin button till player wins, check the watch symbols and its count and navigate to payout table$")
	public void open_the_Treasure_Bonanza_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_as_click_on_spin_button_till_player_wins_check_the_watch_symbols_and_its_count_and_navigate_to_payout_table(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Screen screen=new Screen();
		Pattern spin1=new Pattern("E:/Sikuli Images/TreasureBonanza/spin.png");
		screen.wait(spin1, 60);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";

		Pattern betvalue_1_1=new Pattern("E:/Sikuli Images/TreasureBonanza/betvalue_1_1.png");
		Pattern betvalue_1_5=new Pattern("E:/Sikuli Images/TreasureBonanza/betvalue_1_5.png");
		Pattern spin=new Pattern("E:/Sikuli Images/TreasureBonanza/spin.png");
		Pattern Win_s_42=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_42.png");
		Pattern Win_s_43=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_43.png");
		Pattern Win_s_44=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_44.png");
		Pattern Win_s_45=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_45.png");
		Pattern Win_s_33=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_33.png");
		Pattern Win_s_35=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_35.png");
		Pattern Win_s_46=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_46.png");
		Pattern Win_s_47=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_47.png");
		Pattern collect=new Pattern("E:/Sikuli Images/TreasureBonanza/collect.png");

		  //comparing the credit value should be 0.01
	      Pattern credit1=new Pattern("E:/Sikuli Images/TreasureBonanza/creditvalue_1.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Credit value comparision happened successfully.");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Credit comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 97);
		  
		  
		 //Clicking on symbol to make the player win
		 screen.click(Win_s_42);
		 Thread.sleep(1000);
		 screen.click(Win_s_43);
		 Thread.sleep(1000);
		 
		 screen.click(Win_s_44);
		 Thread.sleep(1000);
		 screen.click(Win_s_45);
		 Thread.sleep(1000);
		 screen.click(Win_s_45);
		 Thread.sleep(1000);
		 screen.click(Win_s_33);
		 Thread.sleep(1000);
		 
		 screen.click(Win_s_33);
		 Thread.sleep(1000);
		 
		 screen.click(Win_s_35);
		 Thread.sleep(1000);
		 
		 screen.click(betvalue_1_1);
		 Thread.sleep(2000);
		 screen.click(spin);
		 Thread.sleep(5000);
		 
		 
		  //comparing the win amount based on gold symbol
	      Pattern balance=new Pattern("E:/Sikuli Images/TreasureBonanza/5watch_win.PNG");
	      Finder finder1 =new Finder(screen.capture().getImage());
	      String ht1 = finder1.find(balance);
	      double score1=20;                
	      System.out.println("the value of ht1"+" "+ht1);
		  if(finder1.hasNext())
		  {
		  Match m1=finder1.next();
		  System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		  score1=(m1.getScore())*100;
		  System.out.println("If 5 Watch symbols sappears on the screen and denomination is 0.2, Win amount should be 0.20.");
		  finder1.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("5 Watch symbols comparision for denomination 0.2: "+" "+score1 +"%");
		  Assert.assertTrue(score1 > 97);
		  
	     //clicking on collect button
	     screen.click(collect);
	     Thread.sleep(2000);
	     //Making 4 watch symbols appear on the screen
		 screen.click(Win_s_46);
		 Thread.sleep(2000);
		 screen.click(spin);
		 Thread.sleep(5000);
		 
		 
		 //comparing the win amount based on watch symbol
	      Pattern winA=new Pattern("E:/Sikuli Images/TreasureBonanza/4watch_win.PNG");
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(winA);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("If 4 Watch symbols appears on the screen and denomination is 0.2, Win amount should be 0.10.");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("4 Watch symbols comparision for denomination 0.2: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 97);
		  Thread.sleep(2000);
		  
		  //clicking on collect button
		  screen.click(collect);
		  Thread.sleep(2000);
	      //Making 3 watch symbols appear on the screen
		  screen.click(Win_s_47);
		  Thread.sleep(1000);
		  screen.click(spin);
		  Thread.sleep(5000);
		 
		  //comparing the balance amount after win
	      Pattern balanceA=new Pattern("E:/Sikuli Images/TreasureBonanza/3watch_win.PNG");
	      Finder finder3 =new Finder(screen.capture().getImage());
	      String ht3 = finder3.find(balanceA);
	      double score3=20;                
	      System.out.println("the value of ht3"+" "+ht3);
		  if(finder3.hasNext())
		  {
		  Match m3=finder3.next();
		  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		  score3=(m3.getScore())*100;
		  System.out.println("If 3 Watch symbols appears on the screen and denomination is 0.2, Win amount should be 0.05.");
		  finder3.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("3 Watch symbols comparision for denomination 0.2: "+" "+score3 +"%");
		  Assert.assertTrue(score3 > 97);
		  
		 //clicking on collect button
	     screen.click(collect);
	     Thread.sleep(2000);
	     //Making 5 watch symbols appear on the screen
		 screen.click(betvalue_1_5);
		 Thread.sleep(2000);
	     screen.click(Win_s_35);
	     Thread.sleep(1000);
	     screen.click(Win_s_33);
	     Thread.sleep(1000);
		 screen.click(spin);
		 Thread.sleep(6000);
		 
		  //comparing the balance amount after win
	      Pattern balanceAA=new Pattern("E:/Sikuli Images/TreasureBonanza/5watch_win_1.PNG");
	      Finder finder31 =new Finder(screen.capture().getImage());
	      String ht31 = finder31.find(balanceAA);
	      double score31=20;                
	      System.out.println("the value of ht31"+" "+ht31);
		  if(finder31.hasNext())
		  {
		  Match m31=finder31.next();
		  System.out.println("Match Found with: "+(m31.getScore())*100+"%");
		  score31=(m31.getScore())*100;
		  System.out.println("If 5 Watch symbols appears on the screen and denomination is 4, Win amount should be 4.00.");
		  finder31.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("5 Watch symbols comparision for denomination 4: "+" "+score31 +"%");
		  Assert.assertTrue(score31 > 97);
		  
	     //clicking on collect button
	     screen.click(collect);
	     Thread.sleep(2000);
	     //Making 4 watch symbols appear on the screen
		 screen.click(Win_s_46);
		 Thread.sleep(2000);
		 screen.click(spin);
		 Thread.sleep(6000);
		 
		 
		 //comparing the win amount based on watch symbol
	      Pattern winAB=new Pattern("E:/Sikuli Images/TreasureBonanza/4watch_win_1.PNG");
	      Finder finder21 =new Finder(screen.capture().getImage());
	      String ht21 = finder21.find(winAB);
	      double score21=20;                
	      System.out.println("the value of ht21"+" "+ht21);
		  if(finder21.hasNext())
		  {
		  Match m21=finder21.next();
		  System.out.println("Match Found with: "+(m21.getScore())*100+"%");
		  score21=(m21.getScore())*100;
		  System.out.println("If 4 Watch symbols appears on the screen and denomination is 4, Win amount should be 2.00.");
		  finder21.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("4 Watch symbols comparision for denomination 4: "+" "+score21 +"%");
		  Assert.assertTrue(score21 > 97);
		  Thread.sleep(2000);
		  
		  //clicking on collect button
		  screen.click(collect);
		  Thread.sleep(2000);
	      //Making 3 watch symbols appear on the screen
		  screen.click(Win_s_47);
		  Thread.sleep(1000);
		  screen.click(spin);
		  Thread.sleep(6000);
		 
		  //comparing the balance amount after win
	      Pattern balanceAC=new Pattern("E:/Sikuli Images/TreasureBonanza/3watch_win_1.PNG");
	      Finder finder32 =new Finder(screen.capture().getImage());
	      String ht32 = finder32.find(balanceAC);
	      double score32=20;                
	      System.out.println("the value of ht32"+" "+ht32);
		  if(finder32.hasNext())
		  {
		  Match m32=finder32.next();
		  System.out.println("Match Found with: "+(m32.getScore())*100+"%");
		  score32=(m32.getScore())*100;
		  System.out.println("If 3 Watch symbols appears on the screen and denomination is 4, Win amount should be 1.00.");
		  finder32.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("3 Watch symbols comparision for denomination 4: "+" "+score32 +"%");
		  Assert.assertTrue(score32 > 97);
		  
		  screen.click(collect);
	}

	@Then("^Win amount should be displayed based on watch symbols & its occurance and should be same as amount configured on the payout table in Treasure Bonanza game$")
	public void win_amount_should_be_displayed_based_on_watch_symbols_its_occurance_and_should_be_same_as_amount_configured_on_the_payout_table_in_Treasure_Bonanza_game() throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
