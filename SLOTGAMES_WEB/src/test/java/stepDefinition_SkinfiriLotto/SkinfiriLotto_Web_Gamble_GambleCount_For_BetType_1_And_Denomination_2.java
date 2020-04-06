package stepDefinition_SkinfiriLotto;

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

public class SkinfiriLotto_Web_Gamble_GambleCount_For_BetType_1_And_Denomination_2 {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Lotto slot game, bet type as (\\d+)\\.(\\d+), denomination as (\\d+)\\.(\\d+), balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Lotto_slot_game_bet_type_as_denomination_as_balance_spin_button_win_amount_gamble_button_gamble_amount_game_info_page_and_gamble_count_in_gamble_page(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		this.driver =  SkinfiriLotto_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as (\\d+)\\.(\\d+) & denomination as (\\d+)\\.(\\d+), click on spin button till player wins, click on gamble button and check the gamble count in gamble page$")
	public void open_the_Skinfiri_Lotto_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_select_bet_type_as_denomination_as_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_count_in_gamble_page(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput"))); 
		
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Screen screen=new Screen();
		Pattern spin1=new Pattern("E:/Sikuli Images/SkinfiriLotto/spin.png");
		screen.wait(spin1, 90);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		Pattern spin=new Pattern("E:/Sikuli Images/SkinfiriLotto/spin.png");
		Pattern betvalue_1_2=new Pattern("E:/Sikuli Images/SkinfiriLotto/betvalue_1_2.png");
		Pattern collect=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_collect.png");
		Pattern Win_s_1=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_1.png");
		Pattern Win_s_2=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_2.png");
		Pattern Win_s_8=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_8.png");
		Pattern Win_s_9=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_9.png");
		Pattern Win_s_10=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_10.png");
		Pattern Win_s_11=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_11.png");
		Pattern Win_s_12=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_12.png");
		Pattern Win_s_14=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_14.png");
		Pattern Win_s_15=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_15.png");
		Pattern Win_s_20=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_20.png");
		Pattern Win_s_21=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_21.png");
		Pattern Win_s_22=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_22.png");
		Pattern Win_s_23=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_23.png");
		Pattern Win_s_24=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_24.png");
		Pattern Win_s_25=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_25.png");
		Pattern Win_s_26=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_26.png");
		Pattern Win_s_27=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_27.png");
		Pattern Win_s_28=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_28.png");
		Pattern Win_s_29=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_29.png");
		Pattern Win_s_30=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_30.png");
		Pattern Win_s_31=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_31.png");
		Pattern Win_s_32=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_32.png");
		Pattern Win_s_33=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_33.png");
		Pattern Win_s_34=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_34.png");
		Pattern Win_s_35=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_35.png");
		Pattern Win_s_36=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_36.png");
		Pattern Win_s_37=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_37.png");
		Pattern Win_s_38=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_38.png");
		Pattern Win_s_40=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_40.png");
		Pattern Win_s_41=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_41.png");
		Pattern gamble=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble.png");
		Pattern take=new Pattern("E:/Sikuli Images/SkinfiriLotto/take.png");
		
		 screen.click(betvalue_1_2);
		 Thread.sleep(2000);
		 
		 //Arranging the symbols to generate gamble count as 5
		 screen.click(Win_s_1);
		 Thread.sleep(1000);
		 screen.click(Win_s_2);
		 Thread.sleep(1000);
		 screen.click(Win_s_2);
		 Thread.sleep(2000);
		 
		 screen.click(spin);
		 Thread.sleep(6000);

		 
		 //comparing gamble count based on win amount
	     Pattern balance=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_win11.PNG");
	     Finder finder1 =new Finder(screen.capture().getImage());
	     String ht1 = finder1.find(balance);
	     double score1=20;                
	     System.out.println("the value of ht1"+" "+ht1);
		 if(finder1.hasNext())
		 {
		 Match m1=finder1.next();
		 System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		 score1=(m1.getScore())*100;
		 System.out.println("If the win amount is 0.60, gamble count should be 5.");
		 finder1.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Win amount comparision is successful and value equal to: "+" "+score1 +"%");
		 Assert.assertTrue(score1 > 97);
		 
		 screen.click(gamble);
		 Thread.sleep(5000);
		 
		  //comparing the gamble count based on the win amount
	      Pattern winA=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamblecount1.png");
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(winA);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Gamble count comparision completed successfully. Gamble count should be 5.");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble count comparision after Win: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 95);
		  Thread.sleep(5000);
		  
		 //Arranging the symbols to generate gamble count as 2
		 screen.click(collect);
		 Thread.sleep(3000);	
		 screen.click(Win_s_2);
		 Thread.sleep(1000);
		 screen.click(Win_s_2);
		 Thread.sleep(1000);
		 screen.click(Win_s_2);
		 Thread.sleep(1000);
		 screen.click(Win_s_2);
		 Thread.sleep(2000);
		  screen.click(spin);
		  Thread.sleep(6000);
		  
		 //comparing gamble count based on win amount
	     Pattern balance1=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_win22.PNG");
	     Finder finder11 =new Finder(screen.capture().getImage());
	     String ht11 = finder11.find(balance1);
	     double score11=20;                
	     System.out.println("the value of ht1"+" "+ht11);
		 if(finder11.hasNext())
		 {
		 Match m11=finder11.next();
		 System.out.println("Match Found with: "+(m11.getScore())*100+"%");
		 score11=(m11.getScore())*100;
		 System.out.println("If the win amount is 1.60, gamble count should be 4.");
		 finder11.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Win amount comparision is successful and value equal to: "+" "+score11 +"%");
		 Assert.assertTrue(score11 > 90);
		 
		 screen.click(gamble);
		 Thread.sleep(3000);
		 
		  //comparing the gamble count based on the win amount
	      Pattern winB=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamblecount2.PNG");
	      Finder finder22 =new Finder(screen.capture().getImage());
	      String ht22 = finder22.find(winB);
	      double score22=20;                
	      System.out.println("the value of ht2"+" "+ht22);
		  if(finder22.hasNext())
		  {
		  Match m22=finder22.next();
		  System.out.println("Match Found with: "+(m22.getScore())*100+"%");
		  score22=(m22.getScore())*100;
		  System.out.println("Gamble count comparision completed successfully. Gamble count should be 4.");
		  finder22.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble count comparision after Win: "+" "+score22 +"%");
		  Assert.assertTrue(score22 > 95);
		  Thread.sleep(5000);
		  
		  //Arranging the symbols to generate gamble count as 3
		  screen.click(collect);
		  Thread.sleep(3000);
		  screen.click(Win_s_8);
		  Thread.sleep(1000);
		  screen.click(Win_s_9);
		  Thread.sleep(1000);
		  screen.click(Win_s_10);
		  Thread.sleep(1000);
		  screen.click(Win_s_2);
		  Thread.sleep(1000);
		  screen.click(Win_s_2);
		  Thread.sleep(1000);
		  screen.click(Win_s_11);
		  Thread.sleep(1000);
		  
		  screen.click(Win_s_12);
		  Thread.sleep(1000);
		  screen.click(Win_s_1);
		  Thread.sleep(1000);
		  screen.click(Win_s_1);
		  Thread.sleep(1000);
		  
		  screen.click(Win_s_20);
		  Thread.sleep(1000);
		  screen.click(Win_s_20);
		  Thread.sleep(1000);
		  screen.click(Win_s_21);
		  Thread.sleep(1000);
		  screen.click(Win_s_21);
		  Thread.sleep(1000);
		  screen.click(Win_s_22);
		  Thread.sleep(1000);
		
		  screen.click(spin);
		  Thread.sleep(6000);
		  
		 //comparing gamble count based on win amount
	     Pattern Win3=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_win33.PNG");
	     Finder finder12 =new Finder(screen.capture().getImage());
	     String ht12 = finder12.find(Win3);
	     double score12=20;                
	     System.out.println("the value of ht1"+" "+ht12);
		 if(finder12.hasNext())
		 {
		 Match m12=finder12.next();
		 System.out.println("Match Found with: "+(m12.getScore())*100+"%");
		 score12=(m12.getScore())*100;
		 System.out.println("If the win amount is 3.20, gamble count should be 3.");
		 finder12.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Win amount comparision is successful and value equal to: "+" "+score12 +"%");
		 Assert.assertTrue(score12 > 90);
		 
		 screen.click(gamble);
		 Thread.sleep(3000);
		 
		  //comparing the gamble count based on the win amount
	      Pattern winBC=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamblecount3.png");
	      Finder finder21 =new Finder(screen.capture().getImage());
	      String ht21 = finder21.find(winBC);
	      double score21=20;                
	      System.out.println("the value of ht2"+" "+ht21);
		  if(finder21.hasNext())
		  {
		  Match m21=finder21.next();
		  System.out.println("Match Found with: "+(m21.getScore())*100+"%");
		  score21=(m21.getScore())*100;
		  System.out.println("Gamble count comparision completed successfully. Gamble count should be 3.");
		  finder21.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble count comparision after Win: "+" "+score21 +"%");
		  Assert.assertTrue(score21 > 95);
		  Thread.sleep(5000);
		  
		  
		  //Arranging the symbols to generate gamble count as 2
		  screen.click(collect);
		  Thread.sleep(3000);
		  screen.click(Win_s_23);
		  Thread.sleep(1000);
		  screen.click(Win_s_23);
		  Thread.sleep(1000);
		  screen.click(Win_s_23);
		  Thread.sleep(1000);
		  screen.click(Win_s_14);
		  Thread.sleep(1000);
		  screen.click(Win_s_14);
		  Thread.sleep(1000);
		  screen.click(Win_s_15);
		  Thread.sleep(1000);
		  screen.click(Win_s_15);
		  Thread.sleep(1000);

		  screen.click(spin);
		  Thread.sleep(6000);
		  
		 //comparing gamble count based on win amount
	     Pattern Win4=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_win44.PNG");
	     Finder finder13 =new Finder(screen.capture().getImage());
	     String ht13 = finder13.find(Win4);
	     double score13=20;                
	     System.out.println("the value of ht1"+" "+ht13);
		 if(finder13.hasNext())
		 {
		 Match m13=finder13.next();
		 System.out.println("Match Found with: "+(m13.getScore())*100+"%");
		 score13=(m13.getScore())*100;
		 System.out.println("If the win amount is 4.40, gamble count should be 2.");
		 finder13.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Win amount comparision is successful and value equal to: "+" "+score13 +"%");
		 Assert.assertTrue(score13 > 90);
		 
		 screen.click(gamble);
		 Thread.sleep(3000);
		 
		  //comparing the gamble count based on the win amount
	      Pattern winBD=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamblecount4.png");
	      Finder finder23 =new Finder(screen.capture().getImage());
	      String ht23 = finder23.find(winBD);
	      double score23=20;                
	      System.out.println("the value of ht2"+" "+ht23);
		  if(finder23.hasNext())
		  {
		  Match m23=finder23.next();
		  System.out.println("Match Found with: "+(m23.getScore())*100+"%");
		  score23=(m23.getScore())*100;
		  System.out.println("Gamble count comparision completed successfully. Gamble count should be 2.");
		  finder23.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble count comparision after Win: "+" "+score23 +"%");
		  Assert.assertTrue(score23 > 95);
		  Thread.sleep(5000);
		  
		  //Arranging the symbols to generate gamble count as 1
		  screen.click(collect);
		  Thread.sleep(3000);
		  screen.click(Win_s_11);
		  Thread.sleep(1000);
		  screen.click(Win_s_24);
		  Thread.sleep(1000);
		  screen.click(Win_s_24);
		  Thread.sleep(1000);
		  
		  screen.click(Win_s_25);
		  Thread.sleep(1000);
		  screen.click(Win_s_26);
		  Thread.sleep(1000);
		  screen.click(Win_s_26);
		  Thread.sleep(1000);
		  screen.click(Win_s_27);
		  Thread.sleep(1000);
		  screen.click(Win_s_27);
		  Thread.sleep(1000);
		  screen.click(Win_s_28);
		  Thread.sleep(1000);
		  screen.click(Win_s_29);
		  Thread.sleep(1000);
		  screen.click(Win_s_29);
		  Thread.sleep(1000);
		  screen.click(Win_s_27);
		  Thread.sleep(1000);
		  screen.click(Win_s_26);
		  Thread.sleep(1000);
		  screen.click(Win_s_30);
		  Thread.sleep(1000);

		  screen.click(Win_s_22);
		  Thread.sleep(1000);
		  screen.click(Win_s_31);
		  Thread.sleep(1000);
		  screen.click(Win_s_31);
		  Thread.sleep(1000);
		  screen.click(Win_s_32);
		  Thread.sleep(1000);
		  screen.click(Win_s_32);
		  Thread.sleep(1000);
		  screen.click(Win_s_33);
		  Thread.sleep(1000);
		  screen.click(Win_s_22);
		  Thread.sleep(1000);
		  screen.click(Win_s_34);
		  Thread.sleep(1000);
		  screen.click(Win_s_34);
		  Thread.sleep(1000);
		  screen.click(Win_s_22);
		  Thread.sleep(1000);
		  screen.click(Win_s_33);
		  Thread.sleep(1000);
		  screen.click(Win_s_33);
		  Thread.sleep(1000);
		  screen.click(Win_s_32);
		  Thread.sleep(1000);
		  screen.click(Win_s_21);
		  Thread.sleep(1000);
		  screen.click(Win_s_33);
		  Thread.sleep(1000);
		  screen.click(Win_s_33);
		  Thread.sleep(1000);
		  screen.click(Win_s_31);
		  Thread.sleep(1000);
		  screen.click(Win_s_31);
		  Thread.sleep(1000);
		  screen.click(Win_s_31);
		  Thread.sleep(1000);
		  
		  
		  screen.click(Win_s_15);
		  Thread.sleep(1000);
		  screen.click(Win_s_35);
		  Thread.sleep(1000);
		  screen.click(Win_s_35);
		  Thread.sleep(1000);
		  screen.click(Win_s_35);
		  Thread.sleep(1000);
		  screen.click(Win_s_36);
		  Thread.sleep(1000);
		  screen.click(Win_s_36);
		  Thread.sleep(1000);
		  screen.click(Win_s_14);
		  Thread.sleep(1000);
		  screen.click(Win_s_23);
		  Thread.sleep(1000);
		  screen.click(Win_s_37);
		  Thread.sleep(1000);
		  screen.click(Win_s_36);
		  Thread.sleep(1000);
		  screen.click(Win_s_14);
		  Thread.sleep(1000);
		  screen.click(Win_s_14);
		  Thread.sleep(1000);
		  screen.click(Win_s_14);
		  Thread.sleep(1000);
		  screen.click(Win_s_15);
		  Thread.sleep(1000);
		  screen.click(Win_s_15);
		  Thread.sleep(1000);
		  screen.click(Win_s_23);
		  Thread.sleep(1000);
		  screen.click(Win_s_37);
		  Thread.sleep(1000);
		  screen.click(Win_s_37);
		  Thread.sleep(1000);
		  screen.click(Win_s_35);
		  Thread.sleep(1000);
		  screen.click(Win_s_35);
		  Thread.sleep(1000);
		  screen.click(Win_s_15);
		  Thread.sleep(1000);
		  screen.click(Win_s_15);
		  Thread.sleep(1000);
		  screen.click(Win_s_15);
		  Thread.sleep(1000);  
		  screen.click(Win_s_38);
		  Thread.sleep(1000);
		  screen.click(Win_s_36);
		  Thread.sleep(1000);
		  screen.click(Win_s_36);
		  Thread.sleep(1000);
		  screen.click(spin);
		  Thread.sleep(6000);
		  
		  //comparing gamble count based on win amount
	     Pattern Win33=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_win55.PNG");
	     Finder finder123 =new Finder(screen.capture().getImage());
	     String ht123 = finder123.find(Win33);
	     double score123=20;                
	     System.out.println("the value of ht1"+" "+ht123);
		 if(finder123.hasNext())
		 {
		 Match m123=finder123.next();
		 System.out.println("Match Found with: "+(m123.getScore())*100+"%");
		 score123=(m123.getScore())*100;
		 System.out.println("If the win amount is 11.00, gamble count should be 1.");
		 finder123.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Win amount comparision is successful and value equal to: "+" "+score123 +"%");
		 Assert.assertTrue(score123 > 90);
		 
		 screen.click(gamble);
		 Thread.sleep(3000);
		 
		  //comparing the gamble count based on the win amount
	      Pattern winBDC=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamblecount5.png");
	      Finder finder25 =new Finder(screen.capture().getImage());
	      String ht25 = finder25.find(winBDC);
	      double score25=20;                
	      System.out.println("the value of ht2"+" "+ht25);
		  if(finder25.hasNext())
		  {
		  Match m25=finder25.next();
		  System.out.println("Match Found with: "+(m25.getScore())*100+"%");
		  score25=(m25.getScore())*100;
		  System.out.println("Gamble count comparision completed successfully. Gamble count should be 1.");
		  finder25.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble count comparision after Win: "+" "+score25 +"%");
		  Assert.assertTrue(score25 > 95);
		  Thread.sleep(5000);
		  
		  //Arranging the symbols to generate win amount more than 7 and checking gamble link should be disabled
		  screen.click(collect);
		  Thread.sleep(3000);
		  screen.click(Win_s_12);
		  Thread.sleep(1000);
		  screen.click(Win_s_40);
		  Thread.sleep(1000);
		  screen.click(Win_s_41);
		  Thread.sleep(1000);
		  screen.click(spin);
		  Pattern dis=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_disabled.png");
		  screen.wait(dis, 15);
		  
		  //comparing gamble count based on win amount
	     Pattern Win331=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_win6.PNG");
	     Finder finder1231 =new Finder(screen.capture().getImage());
	     String ht1231 = finder1231.find(Win331);
	     double score1231=20;                
	     System.out.println("the value of ht1"+" "+ht1231);
		 if(finder1231.hasNext())
		 {
		 Match m1231=finder1231.next();
		 System.out.println("Match Found with: "+(m1231.getScore())*100+"%");
		 score1231=(m1231.getScore())*100;
		 System.out.println("If the win amount is exceeds 101.00 YSI, gamble link should be disabled.");
		 finder1231.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Win amount comparision is successful and value equal to: "+" "+score1231 +"%");
		 Assert.assertTrue(score1231 > 90);
		 
		 
		  //comparing the gamble count based on the win amount
	      Pattern winBF=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_disabled.png");
	      Finder finder26 =new Finder(screen.capture().getImage());
	      String ht26 = finder26.find(winBF);
	      double score26=20;                
	      System.out.println("the value of ht2"+" "+ht26);
		  if(finder26.hasNext())
		  {
		  Match m26=finder26.next();
		  System.out.println("Match Found with: "+(m26.getScore())*100+"%");
		  score26=(m26.getScore())*100;
		  System.out.println("Gamble count comparision completed successfully. Gamble link is disabled.");
		  finder26.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble link comparision after Win: "+" "+score26 +"%");
		  Assert.assertTrue(score26 > 95);	
		  
		  screen.click(take);
	}

	@Then("^Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type (\\d+)\\.(\\d+) & denomination (\\d+)\\.(\\d+) Skinfiri Lotto game$")
	public void gamble_count_should_be_displayed_on_gamble_page_based_on_win_amount_and_gamble_max_amount_configured_on_the_game_info_page_for_bet_type_denomination_Skinfiri_Lotto_game(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
