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

public class TikeIsle_Web_Gamble_WinAmount_SameAs_GambleAmount {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Tike Isle slot game, balance, spin button, win amount, gamble button and gamble amount$")
	public void chrome_browser_valid_URL_valid_login_details_Tike_Isle_slot_game_balance_spin_button_win_amount_gamble_button_and_gamble_amount() throws Throwable {
		this.driver =  TikeIsle_Web_URL_Login.getDriver();
	}

	@When("^Open the Tike Isle slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web$")
	public void open_the_Tike_Isle_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_amount_on_web() throws Throwable {
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
		Pattern jsyb=new Pattern("E:/Sikuli Images/Tiki Isle/J.png");
		Pattern win=new Pattern("E:/Sikuli Images/Tiki Isle/Balance_win_1_1.png");
		Pattern betV=new Pattern("E:/Sikuli Images/Tiki Isle/betvalue_1_5.png");
		Pattern gamble=new Pattern("E:/Sikuli Images/Tiki Isle/gamble.png");
		Pattern red=new Pattern("E:/Sikuli Images/Tiki Isle/red.png");
		Pattern status=new Pattern("E:/Sikuli Images/Tiki Isle/win_gamble.png");
		
		//comparing the balance before Win
	      Pattern balance=new Pattern("E:/Sikuli Images/Tiki Isle/balance_before_win.PNG");
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
		  Assert.assertTrue(score1 > 95);
		  
		  
		 //Selecting denominations as 8
		 screen.click(betV);
		 Thread.sleep(2000);
		 //Clicking on orange symbol
		 screen.click(scatter);
		 Thread.sleep(1000);
		 screen.click(jsyb);
		 Thread.sleep(1000);
		 screen.click(jsyb);
		 Thread.sleep(1000);


		 //Clicking on Spin button
		 screen.click(spin);
		 Thread.sleep(5000);
		 		 
		 //comparing the win amount should exists after spin
	      Pattern winA=new Pattern("E:/Sikuli Images/Tiki Isle/Win_G.PNG");
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(winA);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Color Win amount comparision completed successfully. Win amount is 12.00 YSI");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Color Win amount comparision after Win: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 95);
		  Thread.sleep(5000);
		  
		  screen.click(gamble);
		  Thread.sleep(3000);
		  
		 //comparing the Color win amount should be same as win amount
	      Pattern winB=new Pattern("E:/Sikuli Images/Tiki Isle/gamble_amount.PNG");
	      Finder finder3 =new Finder(screen.capture().getImage());
	      String ht3 = finder3.find(winB);
	      double score3=20;                
	      System.out.println("the value of ht2"+" "+ht3);
		  if(finder3.hasNext())
		  {
		  Match m3=finder3.next();
		  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		  score3=(m3.getScore())*100;
		  System.out.println("Gamble Win amount is same as Win amount & comparision completed successfully. Gamble Win amount is 12.00 YSI");
		  finder3.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Gamble Win amount comparision value equals to: "+" "+score3 +"%");
		  Assert.assertTrue(score3 > 95);
		  Thread.sleep(3000);
		  
		  screen.click(collect);	    
	}

	@Then("^Win amount should be displayed as Gamble amount in the gamble page of the Tike Isle slot game on web$")
	public void win_amount_should_be_displayed_as_Gamble_amount_in_the_gamble_page_of_the_Tike_Isle_slot_game_on_web() throws Throwable {
		Thread.sleep(3000);
	    driver.quit();
	}
}