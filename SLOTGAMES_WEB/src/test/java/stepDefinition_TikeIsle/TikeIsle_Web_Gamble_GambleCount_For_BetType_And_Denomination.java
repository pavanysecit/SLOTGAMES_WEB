package stepDefinition_TikeIsle;

import java.io.File;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TikeIsle_Web_Gamble_GambleCount_For_BetType_And_Denomination {
WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, bet type as (\\d+)\\.(\\d+), denomination as (\\d+), balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_bet_type_as_denomination_as_balance_spin_button_win_amount_gamble_button_gamble_amount_game_info_page_and_gamble_count(int arg1, int arg2, int arg3) throws Throwable {
		this.driver =  TikeIsle_Web_URL_Login.getDriver();
	}

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as (\\d+)\\.(\\d+) & denomination as (\\d+), click on spin button till player wins, click on gamble button and check the gamble count$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_select_bet_type_as_denomination_as_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_count(int arg1, int arg2, int arg3) throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(4000);
		balT.sendKeys("300");
		Thread.sleep(4000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(15000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		Screen screen=new Screen();
		Pattern spin=new Pattern("E:/Sikuli Images/Tiki Isle/spin.png");
		Pattern collect=new Pattern("E:/Sikuli Images/Tiki Isle/gamble_collect.png");
		Pattern scatter=new Pattern("E:/Sikuli Images/Tiki Isle/scatter.png");
		Pattern scatter1=new Pattern("E:/Sikuli Images/Tiki Isle/scatter1.png");
		Pattern jsyb=new Pattern("E:/Sikuli Images/Tiki Isle/J.png");
		Pattern tensyb=new Pattern("E:/Sikuli Images/Tiki Isle/10syb.png");
		Pattern guitar=new Pattern("E:/Sikuli Images/Tiki Isle/guitar.png");
		Pattern girl=new Pattern("E:/Sikuli Images/Tiki Isle/girl.png");
		Pattern tensyb1=new Pattern("E:/Sikuli Images/Tiki Isle/tensyb1.png");
		Pattern guitar1=new Pattern("E:/Sikuli Images/Tiki Isle/guitar1.png");
		Pattern K=new Pattern("E:/Sikuli Images/Tiki Isle/K.png");
		Pattern Q=new Pattern("E:/Sikuli Images/Tiki Isle/Q.png");
		Pattern wild=new Pattern("E:/Sikuli Images/Tiki Isle/wild.png");
		Pattern tabla=new Pattern("E:/Sikuli Images/Tiki Isle/tabla.png");
		Pattern tabla1=new Pattern("E:/Sikuli Images/Tiki Isle/tabla1.png");
		Pattern J1=new Pattern("E:/Sikuli Images/Tiki Isle/J1.png");
		Pattern A=new Pattern("E:/Sikuli Images/Tiki Isle/A.png");
		Pattern nine2=new Pattern("E:/Sikuli Images/Tiki Isle/nine2.png");
		Pattern girl2=new Pattern("E:/Sikuli Images/Tiki Isle/girl2.png");
		Pattern tabla2=new Pattern("E:/Sikuli Images/Tiki Isle/tabla2.png");
		Pattern guitar3=new Pattern("E:/Sikuli Images/Tiki Isle/guitar3.png");
		Pattern girl3=new Pattern("E:/Sikuli Images/Tiki Isle/girl3.png");
		Pattern scatter2=new Pattern("E:/Sikuli Images/Tiki Isle/scatter2.png");
		Pattern nine1=new Pattern("E:/Sikuli Images/Tiki Isle/nine1.png");
		Pattern nine=new Pattern("E:/Sikuli Images/Tiki Isle/nine.png");
		Pattern girl1=new Pattern("E:/Sikuli Images/Tiki Isle/girl1.png");
		Pattern guitar2=new Pattern("E:/Sikuli Images/Tiki Isle/guitar2.png");
		Pattern J2=new Pattern("E:/Sikuli Images/Tiki Isle/J2.png");
		Pattern Q1=new Pattern("E:/Sikuli Images/Tiki Isle/Q1.png");
		Pattern tensyb2=new Pattern("E:/Sikuli Images/Tiki Isle/tensyb2.png");
		Pattern winSyb=new Pattern("E:/Sikuli Images/Tiki Isle/betvalue_1_5.png");
		Pattern gamble=new Pattern("E:/Sikuli Images/Tiki Isle/gamble.png");
	
		//Selecting denomination as 8  
		screen.click(winSyb);
		Thread.sleep(2000);
		
		 //Arranging the symbols to generate gamble count as 5
		 screen.click(scatter);
		 Thread.sleep(1000);
		 screen.click(jsyb);
		 Thread.sleep(1000);
		 screen.click(jsyb);
		 Thread.sleep(1000);

		 screen.click(spin);
		 Thread.sleep(6000);

		 
		 //comparing gamble count based on win amount
	     Pattern balance=new Pattern("E:/Sikuli Images/Tiki Isle/Win_G.PNG");
	     Finder finder1 =new Finder(screen.capture().getImage());
	     String ht1 = finder1.find(balance);
	     double score1=20;                
	     System.out.println("the value of ht1"+" "+ht1);
		 if(finder1.hasNext())
		 {
		 Match m1=finder1.next();
		 System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		 score1=(m1.getScore())*100;
		 System.out.println("If the win amount is 12, gamble count should be 5.");
		 finder1.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Win amount comparision is successful and value equal to: "+" "+score1 +"%");
		 Assert.assertTrue(score1 > 97);
		 
		 screen.click(gamble);
		 Thread.sleep(3000);
		 
		  //comparing the gamble count based on the win amount
	      Pattern winA=new Pattern("E:/Sikuli Images/Tiki Isle/gamblecount1.png");
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
		  
		  //Arranging the symbols to generate gamble count as 4
		  screen.click(collect);
		  Thread.sleep(3000);	
		  screen.click(tensyb);
		  Thread.sleep(1000);
		  screen.click(scatter);
		  Thread.sleep(1000);
		  screen.click(guitar);
		  Thread.sleep(1000);
		  screen.click(spin);
		  Thread.sleep(6000);
		  
		 //comparing gamble count based on win amount
	     Pattern balance1=new Pattern("E:/Sikuli Images/Tiki Isle/Win_G1.PNG");
	     Finder finder11 =new Finder(screen.capture().getImage());
	     String ht11 = finder11.find(balance1);
	     double score11=20;                
	     System.out.println("the value of ht1"+" "+ht11);
		 if(finder11.hasNext())
		 {
		 Match m11=finder11.next();
		 System.out.println("Match Found with: "+(m11.getScore())*100+"%");
		 score11=(m11.getScore())*100;
		 System.out.println("If the win amount is 24.00, gamble count should be 4.");
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
	      Pattern winB=new Pattern("E:/Sikuli Images/Tiki Isle/gamblecount2.png");
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
		  screen.click(guitar1);
		  Thread.sleep(1000);
		  screen.click(tensyb1);
		  Thread.sleep(1000);
		  screen.click(girl);
		  Thread.sleep(1000);
		  screen.click(K);
		  Thread.sleep(1000);
		  screen.click(K);
		  Thread.sleep(1000);
		  screen.click(K);
		  Thread.sleep(1000);
		  screen.click(girl);
		  Thread.sleep(1000);
		  screen.click(tensyb1);
		  Thread.sleep(1000);
		  screen.click(tensyb1);
		  Thread.sleep(1000);
		  screen.click(tensyb1);
		  Thread.sleep(1000);
		  screen.click(tensyb1);
		  Thread.sleep(1000);
		  screen.click(J1);
		  Thread.sleep(1000);
		  screen.click(J1);
		  Thread.sleep(1000);
		  screen.click(Q);
		  Thread.sleep(1000);
		  screen.click(Q);
		  Thread.sleep(1000);
		  screen.click(wild);
		  Thread.sleep(1000);
		  screen.click(wild);
		  Thread.sleep(1000);
		  screen.click(wild);
		  Thread.sleep(2000);
		  screen.click(spin);
		  Thread.sleep(6000);
		  
		 //comparing gamble count based on win amount
	     Pattern Win3=new Pattern("E:/Sikuli Images/Tiki Isle/Win_G2.PNG");
	     Finder finder12 =new Finder(screen.capture().getImage());
	     String ht12 = finder12.find(Win3);
	     double score12=20;                
	     System.out.println("the value of ht1"+" "+ht12);
		 if(finder12.hasNext())
		 {
		 Match m12=finder12.next();
		 System.out.println("Match Found with: "+(m12.getScore())*100+"%");
		 score12=(m12.getScore())*100;
		 System.out.println("If the win amount is 52.00, gamble count should be 3.");
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
	      Pattern winBC=new Pattern("E:/Sikuli Images/Tiki Isle/gamblecount3.png");
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
		  screen.click(jsyb);
		  Thread.sleep(1000);
		  screen.click(guitar1);
		  Thread.sleep(1000);
		  screen.click(tensyb2);
		  Thread.sleep(1000);
		  screen.click(nine1);
		  Thread.sleep(1000);
		  screen.click(scatter1);
		  Thread.sleep(1000);
		  screen.click(tabla);
		  Thread.sleep(1000);
		  screen.click(tabla);
		  Thread.sleep(1000);
		  screen.click(A);
		  Thread.sleep(1000);
		  screen.click(A);
		  Thread.sleep(1000);
		  screen.click(girl1);
		  Thread.sleep(1000);
		  screen.click(tensyb2);
		  Thread.sleep(1000);
		  screen.click(Q1);
		  
		  Thread.sleep(1000);
		  screen.click(tabla);
		  Thread.sleep(1000);
		  screen.click(J2);
		  Thread.sleep(1000);
		  screen.click(J2);
		  Thread.sleep(1000);
		  screen.click(spin);
		  Thread.sleep(6000);
		  
		 //comparing gamble count based on win amount
	     Pattern Win4=new Pattern("E:/Sikuli Images/Tiki Isle/Win_G4.PNG");
	     Finder finder13 =new Finder(screen.capture().getImage());
	     String ht13 = finder13.find(Win4);
	     double score13=20;                
	     System.out.println("the value of ht1"+" "+ht13);
		 if(finder13.hasNext())
		 {
		 Match m13=finder13.next();
		 System.out.println("Match Found with: "+(m13.getScore())*100+"%");
		 score13=(m13.getScore())*100;
		 System.out.println("If the win amount is 100.00, gamble count should be 2.");
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
	      Pattern winBD=new Pattern("E:/Sikuli Images/Tiki Isle/gamblecount4.png");
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
		  screen.click(tabla1);
		  Thread.sleep(2000);
		  screen.click(spin);
		  Thread.sleep(6000);
		  
		  //comparing gamble count based on win amount
	     Pattern Win33=new Pattern("E:/Sikuli Images/Tiki Isle/Win_G4.PNG");
	     Finder finder123 =new Finder(screen.capture().getImage());
	     String ht123 = finder123.find(Win33);
	     double score123=20;                
	     System.out.println("the value of ht1"+" "+ht123);
		 if(finder123.hasNext())
		 {
		 Match m123=finder123.next();
		 System.out.println("Match Found with: "+(m123.getScore())*100+"%");
		 score123=(m123.getScore())*100;
		 System.out.println("If the win amount is 248.00, gamble count should be 1.");
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
	      Pattern winBDC=new Pattern("E:/Sikuli Images/Tiki Isle/gamblecount5.png");
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
		  
		  //Arranging the symbols to generate win amount more than 140 and checking gamble link should be disabled
		  screen.click(collect);
		  Thread.sleep(3000);
		  screen.click(nine2);
		  Thread.sleep(1000);
		  screen.click(girl2);
		  Thread.sleep(1000);
		  screen.click(nine2);
		  Thread.sleep(1000);
		  screen.click(tabla2);
		  Thread.sleep(1000);
		  screen.click(nine2);
		  Thread.sleep(1000);
		  screen.click(guitar3);
		  Thread.sleep(1000);
		  screen.click(guitar3);
		  Thread.sleep(1000);
		  screen.click(girl3);
		  Thread.sleep(1000);
		  screen.click(scatter2);
		  Thread.sleep(1000);
		  
		  screen.click(spin);
		  Thread.sleep(6000);
		  
		  //comparing gamble count based on win amount
	     Pattern Win331=new Pattern("E:/Sikuli Images/Tiki Isle/Win_G5.PNG");
	     Finder finder1231 =new Finder(screen.capture().getImage());
	     String ht1231 = finder1231.find(Win331);
	     double score1231=20;                
	     System.out.println("the value of ht1"+" "+ht1231);
		 if(finder1231.hasNext())
		 {
		 Match m1231=finder1231.next();
		 System.out.println("Match Found with: "+(m1231.getScore())*100+"%");
		 score1231=(m1231.getScore())*100;
		 System.out.println("If the win amount is exceeds 332.00 YSI, gamble link should be disabled.");
		 finder1231.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Win amount comparision is successful and value equal to: "+" "+score1231 +"%");
		 Assert.assertTrue(score1231 > 90);
		 
		 
		  //comparing the gamble count based on the win amount
	      Pattern winBF=new Pattern("E:/Sikuli Images/Tiki Isle/gamble_disabled.png");
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
		  Assert.assertTrue(score26 > 90);
	}

	@Then("^Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type (\\d+)\\.(\\d+) & denomination (\\d+) in Tike Isle game$")
	public void gamble_count_should_be_displayed_based_on_win_amount_and_gamble_max_amount_configured_on_the_game_info_page_for_bet_type_denomination_in_Tike_Isle_game(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}