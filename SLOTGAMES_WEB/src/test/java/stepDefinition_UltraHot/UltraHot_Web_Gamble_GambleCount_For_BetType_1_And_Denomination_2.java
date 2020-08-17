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

public class UltraHot_Web_Gamble_GambleCount_For_BetType_1_And_Denomination_2 {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as (\\d+)\\.(\\d+), denomination as (\\d+)\\.(\\d+), balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_bet_type_as_denomination_as_balance_spin_button_win_amount_gamble_button_gamble_amount_game_info_page_and_gamble_count_in_gamble_page(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		this.driver =  UltraHot_Web_URL_Login.getDriver();
	}

	@When("^Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as (\\d+)\\.(\\d+) & denomination as (\\d+)\\.(\\d+), click on spin button till player wins, click on gamble button and check the gamble count in gamble page$")
	public void open_the_Ultra_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_select_bet_type_as_denomination_as_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_count_in_gamble_page(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(1000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(3000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		Screen screen=new Screen();
		Pattern spin=new Pattern("E:/Sikuli Images/UltraHot/spin.png");
		Pattern collect=new Pattern("E:/Sikuli Images/UltraHot/collect.png");
		Pattern plum=new Pattern("E:/Sikuli Images/UltraHot/plum.png");
		Pattern plum1=new Pattern("E:/Sikuli Images/UltraHot/plum1.png");
		Pattern cherry=new Pattern("E:/Sikuli Images/UltraHot/cherry.png");
		Pattern cherry1=new Pattern("E:/Sikuli Images/UltraHot/cherry1.png");
		Pattern cherry2=new Pattern("E:/Sikuli Images/UltraHot/cherry2.png");
		Pattern orange=new Pattern("E:/Sikuli Images/UltraHot/orange.png");
		Pattern orange1=new Pattern("E:/Sikuli Images/UltraHot/orange1.png");
		Pattern orange2=new Pattern("E:/Sikuli Images/UltraHot/orange2.png");
		Pattern gamble=new Pattern("E:/Sikuli Images/UltraHot/gamble.png");
		Pattern lemon=new Pattern("E:/Sikuli Images/UltraHot/lemon.png");
		Pattern lemon1=new Pattern("E:/Sikuli Images/UltraHot/lemon1.png");
		Pattern lemon2=new Pattern("E:/Sikuli Images/UltraHot/lemon2.png");
		Pattern wm=new Pattern("E:/Sikuli Images/UltraHot/wm.png");
		Pattern bell=new Pattern("E:/Sikuli Images/UltraHot/bell.png");
	    Pattern bet1_1=new Pattern("E:/Sikuli Images/UltraHot/bet1_2.PNG");
	    Pattern win_g1_1_1=new Pattern("E:/Sikuli Images/UltraHot/win_g1_2_1.PNG");
	    Pattern gambleCount1=new Pattern("E:/Sikuli Images/UltraHot/gambleCount1.png");
	    Pattern gambleCount2=new Pattern("E:/Sikuli Images/UltraHot/gambleCount2.png");
	    Pattern gambleCount3=new Pattern("E:/Sikuli Images/UltraHot/gambleCount3.png");
	    Pattern win_g1_1_2=new Pattern("E:/Sikuli Images/UltraHot/win_g1_2_2.PNG");
	    Pattern win_g1_1_3=new Pattern("E:/Sikuli Images/UltraHot/win_g1_2_3.PNG");
	    Pattern win_g1_1_4=new Pattern("E:/Sikuli Images/UltraHot/win_g1_2_4.PNG");
	    Pattern maxbet=new Pattern("E:/Sikuli Images/UltraHot/maxbet.PNG");
	    Pattern take=new Pattern("E:/Sikuli Images/UltraHot/take.PNG");
	    Pattern betvalue=new Pattern("E:/Sikuli Images/UltraHot/betvalue.PNG");
	    
		screen.wait(spin, 30);
		screen.click(betvalue);
		Thread.sleep(2000);
		//comparing denomination as 0.3
	     Finder finder0 =new Finder(screen.capture().getImage());
	     String ht0 = finder0.find(bet1_1);
	     double score0=20;                
	     System.out.println("the value of ht1"+" "+ht0);
		 if(finder0.hasNext())
		 {
		 Match m0=finder0.next();
		 System.out.println("Match Found with: "+(m0.getScore())*100+"%");
		 score0=(m0.getScore())*100;
		 System.out.println("selected Denomination is 0.3, comparision successful.");
		 finder0.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Denomination comparision is successful and value equal to: "+" "+score0 +"%");
		 Assert.assertTrue(score0 > 92);
		
		 //Arranging the symbols to generate gamble count as 5
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
		 screen.click(spin);
		 Thread.sleep(6000);

		 
		 //comparing gamble count based on win amount
	     Finder finder1 =new Finder(screen.capture().getImage());
	     String ht1 = finder1.find(win_g1_1_1);
	     double score1=20;                
	     System.out.println("the value of ht1"+" "+ht1);
		 if(finder1.hasNext())
		 {
		 Match m1=finder1.next();
		 System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		 score1=(m1.getScore())*100;
		 System.out.println("If the win amount is 2.40, gamble count should be 3.");
		 finder1.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Win amount comparision is successful and value equal to: "+" "+score1 +"%");
		 Assert.assertTrue(score1 > 92);
		 
		 screen.click(gamble);
		 Thread.sleep(5000);
		 
		  //comparing the gamble count based on the win amount
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(gambleCount1);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Gamble count comparision completed successfully. Gamble count should be 3.");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble count comparision after Win: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 90);
		  Thread.sleep(5000);
		  
		  //Arranging the symbols to generate gamble count as 4
		  screen.click(collect);
		  Thread.sleep(3000);	
		  screen.click(cherry);
		  Thread.sleep(1000);
		  screen.click(plum1);
		  Thread.sleep(1000);
		  screen.click(plum1);
		  Thread.sleep(1000);
		  
		  screen.click(lemon2);
		  Thread.sleep(1000);
		  screen.click(lemon2);
		  Thread.sleep(1000);
		  screen.click(lemon2);
		  Thread.sleep(1000);
		  
		  screen.click(cherry);
		  Thread.sleep(1000);
		  screen.click(cherry1);
		  Thread.sleep(1000);
		  screen.click(cherry2);
		  Thread.sleep(1000);
		  screen.click(cherry2);
		  Thread.sleep(2000);
		  
		  screen.click(spin);
		  Thread.sleep(6000);
		  
		 //comparing gamble count based on win amount
	     Finder finder11 =new Finder(screen.capture().getImage());
	     String ht11 = finder11.find(win_g1_1_2);
	     double score11=20;                
	     System.out.println("the value of ht1"+" "+ht11);
		 if(finder11.hasNext())
		 {
		 Match m11=finder11.next();
		 System.out.println("Match Found with: "+(m11.getScore())*100+"%");
		 score11=(m11.getScore())*100;
		 System.out.println("If the win amount is 4.80, gamble count should be 2.");
		 finder11.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Win amount comparision is successful and value equal to: "+" "+score11 +"%");
		 Assert.assertTrue(score11 > 90);
		 
		 screen.click(gamble);
		 Thread.sleep(5000);
		 
		  //comparing the gamble count based on the win amount
	      Finder finder22 =new Finder(screen.capture().getImage());
	      String ht22 = finder22.find(gambleCount2);
	      double score22=20;                
	      System.out.println("the value of ht2"+" "+ht22);
		  if(finder22.hasNext())
		  {
		  Match m22=finder22.next();
		  System.out.println("Match Found with: "+(m22.getScore())*100+"%");
		  score22=(m22.getScore())*100;
		  System.out.println("Gamble count comparision completed successfully. Gamble count should be 2.");
		  finder22.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble count comparision after Win: "+" "+score22 +"%");
		  Assert.assertTrue(score22 > 90);
		  Thread.sleep(5000);
		  
		  //Arranging the symbols to generate gamble count as 1
		  screen.click(collect);
		  Thread.sleep(3000);
		  screen.click(orange);
		  Thread.sleep(1000);
		  screen.click(orange2);
		  Thread.sleep(1000);		  

		  screen.click(spin);
		  Thread.sleep(6000);
		  
		 //comparing gamble count based on win amount
	     Finder finder12 =new Finder(screen.capture().getImage());
	     String ht12 = finder12.find(win_g1_1_3);
	     double score12=20;                
	     System.out.println("the value of ht1"+" "+ht12);
		 if(finder12.hasNext())
		 {
		 Match m12=finder12.next();
		 System.out.println("Match Found with: "+(m12.getScore())*100+"%");
		 score12=(m12.getScore())*100;
		 System.out.println("If the win amount is 7.20, gamble count should be 1.");
		 finder12.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Win amount comparision is successful and value equal to: "+" "+score12 +"%");
		 Assert.assertTrue(score12 > 90);
		 
		 screen.click(gamble);
		 Thread.sleep(5000);
		 
		  //comparing the gamble count based on the win amount
	      Finder finder21 =new Finder(screen.capture().getImage());
	      String ht21 = finder21.find(gambleCount3);
	      double score21=20;                
	      System.out.println("the value of ht2"+" "+ht21);
		  if(finder21.hasNext())
		  {
		  Match m21=finder21.next();
		  System.out.println("Match Found with: "+(m21.getScore())*100+"%");
		  score21=(m21.getScore())*100;
		  System.out.println("Gamble count comparision completed successfully. Gamble count should be 1.");
		  finder21.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble count comparision after Win: "+" "+score21 +"%");
		  Assert.assertTrue(score21 > 90);
		  Thread.sleep(5000);
		  
		  screen.click(collect);
		  Thread.sleep(3000);
		  screen.click(orange1);
		  Thread.sleep(1000);		  
		  screen.click(orange2);
		  Thread.sleep(1000);	
		  screen.click(spin);
		  Thread.sleep(6000);
		  
		  //comparing gamble count based on win amount
	     Finder finder1231 =new Finder(screen.capture().getImage());
	     String ht1231 = finder1231.find(win_g1_1_4);
	     double score1231=20;                
	     System.out.println("the value of ht1"+" "+ht1231);
		 if(finder1231.hasNext())
		 {
		 Match m1231=finder1231.next();
		 System.out.println("Match Found with: "+(m1231.getScore())*100+"%");
		 score1231=(m1231.getScore())*100;
		 System.out.println("If the win amount is exceeds 10.5 YSI, gamble link should be disabled. Now win is 12.00 YSI");
		 finder1231.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Win amount comparision is successful and value equal to: "+" "+score1231 +"%");
		 Assert.assertTrue(score1231 > 90);
		 Thread.sleep(2000);
		 
		  //gamble button should not be visible hence MaxBet button comparing
	      Finder finder26 =new Finder(screen.capture().getImage());
	      String ht26 = finder26.find(maxbet);
	      double score26=20;                
	      System.out.println("the value of ht2"+" "+ht26);
		  if(finder26.hasNext())
		  {
		  Match m26=finder26.next();
		  System.out.println("Match Found with: "+(m26.getScore())*100+"%");
		  score26=(m26.getScore())*100;
		  System.out.println("Gamble count comparision completed successfully. Gamble link is not visible.");
		  finder26.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble link comparision after Win: "+" "+score26 +"%");
		  Assert.assertTrue(score26 > 90);	 
		  
		  screen.click(take);
	}

	@Then("^Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type (\\d+)\\.(\\d+) & denomination (\\d+)\\.(\\d+) Ultra Hot game$")
	public void gamble_count_should_be_displayed_on_gamble_page_based_on_win_amount_and_gamble_max_amount_configured_on_the_game_info_page_for_bet_type_denomination_Ultra_Hot_game(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
