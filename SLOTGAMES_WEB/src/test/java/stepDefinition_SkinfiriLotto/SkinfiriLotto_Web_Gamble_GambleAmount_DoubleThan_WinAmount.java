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

public class SkinfiriLotto_Web_Gamble_GambleAmount_DoubleThan_WinAmount {
WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Lotto slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Lotto_slot_game_balance_spin_button_win_amount_gamble_button_gamble_amount_and_gamble_to_win_amount() throws Throwable {
		this.driver =  SkinfiriLotto_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount$")
	public void open_the_Skinfiri_Lotto_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_to_win_amount() throws Throwable {
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
		screen.wait(spin1, 60);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		Pattern pat1=new Pattern("E:/Sikuli Images/SkinfiriLotto/balance.PNG");
		Pattern betvalue_1_3=new Pattern("E:/Sikuli Images/SkinfiriLotto/betvalue_1_3.png");
		Pattern collect=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_collect.png");
		Pattern spin=new Pattern("E:/Sikuli Images/SkinfiriLotto/spin.png");
		Pattern Win_s_1=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_1.png");
		Pattern Win_s_2=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_2.png");
		Pattern win=new Pattern("E:/Sikuli Images/SkinfiriLotto/win_amount4.png");
		Pattern gamble=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble.png");
		Pattern status=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_win_amount.png");
		  
		  //comparing the balance before Win
	      Pattern balance=new Pattern("E:/Sikuli Images/SkinfiriLotto/balance.PNG");
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
		 screen.click(Win_s_2);
		 Thread.sleep(1000);
		 screen.click(Win_s_2);
		 Thread.sleep(1000);
		 screen.click(Win_s_2);
		 Thread.sleep(1000);
		 screen.click(Win_s_2);
		 Thread.sleep(2000);

		 screen.click(betvalue_1_3);
		 Thread.sleep(2000);
		 screen.click(spin);
		 Thread.sleep(5000);
		 
		 //comparing the win amount should exists after spin
	      Pattern winA=new Pattern("E:/Sikuli Images/SkinfiriLotto/win_amount4.PNG");
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(winA);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Win amount comparision completed successfully. Win amount is 4.00 YSI");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 97);
		  Thread.sleep(5000);
		  
		  screen.click(gamble);
		  Thread.sleep(3000);
		  
		  //comparing the gamble color win amount should be double than as win amount
	      Pattern winB=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_colorwin.PNG");
	      Finder finder3 =new Finder(screen.capture().getImage());
	      String ht3 = finder3.find(winB);
	      double score3=20;                
	      System.out.println("the value of ht2"+" "+ht3);
		  if(finder3.hasNext())
		  {
		  Match m3=finder3.next();
		  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		  score3=(m3.getScore())*100;
		  System.out.println("Color Win amount comparision completed successfully. Gamble Win amount is 8.00 YSI");
		  finder3.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Color Win amount comparision value equals to: "+" "+score3 +"%");
		  Assert.assertTrue(score3 > 97);
		  Thread.sleep(2000);
		  
		  //comparing the gamble suit win amount should be 4x double than as win amount
	      Pattern winBB=new Pattern("E:/Sikuli Images/SkinfiriLotto/gamble_suitwin.PNG");
	      Finder finder33 =new Finder(screen.capture().getImage());
	      String ht33 = finder33.find(winBB);
	      double score33=20;                
	      System.out.println("the value of ht2"+" "+ht33);
		  if(finder33.hasNext())
		  {
		  Match m33=finder33.next();
		  System.out.println("Match Found with: "+(m33.getScore())*100+"%");
		  score33=(m33.getScore())*100;
		  System.out.println("Gamble 4x Win amount comparision completed successfully. Gamble Win amount is 16.00 YSI");
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

	@Then("^Gamble To Win amount should be double than Gamble amount in the gamble page of the Skinfiri Lotto slot game$")
	public void gamble_To_Win_amount_should_be_double_than_Gamble_amount_in_the_gamble_page_of_the_Skinfiri_Lotto_slot_game() throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
