package stepDefinition_GoldenCrown;

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

public class GoldenCrown_Web_Gamble_WinAmount_AddedTo_Balance {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Crown slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_balance_spin_button_win_amount_gamble_button_gamble_amount_red_button_black_button_and_gamble_status() throws Throwable {
		this.driver =  GoldenCrown_Web_URL_Login.getDriver();
	}

	@When("^Open the Golden Crown slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_spin_button_till_player_wins_click_on_gamble_button_click_on_red_or_black_button_and_check_the_balance_after_win() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
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
		Pattern credit=new Pattern("E:/Sikuli Images/GoldenCrown/credit.PNG");
		Pattern spin=new Pattern("E:/Sikuli Images/GoldenCrown/spin.png");
		Pattern collect=new Pattern("E:/Sikuli Images/GoldenCrown/collect.png");
		Pattern plum=new Pattern("E:/Sikuli Images/GoldenCrown/plum.png");
		Pattern orange=new Pattern("E:/Sikuli Images/GoldenCrown/orange.png");
		Pattern gamble=new Pattern("E:/Sikuli Images/GoldenCrown/gamble.png");
		Pattern red=new Pattern("E:/Sikuli Images/GoldenCrown/red.png");

		 screen.wait(spin, 30);
		 
		  //comparing the balance before Win
	      Pattern balance=new Pattern("E:/Sikuli Images/GoldenCrown/balance.PNG");
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
		  
		 //Clicking on orange symbol
		 screen.click(orange);
		 Thread.sleep(1000);
		 screen.click(orange);
		 Thread.sleep(1000);
		 //Clicking on plum symbol
		 screen.click(plum);
		 Thread.sleep(1000);
		 screen.click(plum);
		 Thread.sleep(1000);
		 screen.click(plum);
		 Thread.sleep(1000);
		 
		 //Selecting denominations as 10 by selecting credit value 0.5
		 screen.click(credit);
		 Thread.sleep(1000);
		 screen.click(credit);
		 Thread.sleep(1000);
		 screen.click(credit);
		 Thread.sleep(1000);

		 //Clicking on Spin button
		 screen.click(spin);
		 Thread.sleep(5000);
		  
		 //comparing the win amount should exists after spin
	      Pattern winA=new Pattern("E:/Sikuli Images/GoldenCrown/win_4.PNG");
	      screen.wait(winA, 10);
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(winA);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Win amount comparision completed successfully. Win amount is 40.00 YSI");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 89);
		  Thread.sleep(5000);
		  
		  //Clicking on gamble button

		  //screen.click("gamble");
		 // Thread.sleep(2000);
		  try{
			    String path1 = "E:/Sikuli Images/GoldenCrown/gamble.png";
			    Pattern target = new Pattern(path1);
			    Screen scr = new Screen();
			    scr.click(target);
			    }
			    catch(Exception e)
			    {
			        e.printStackTrace();
			    }
		  Thread.sleep(2000);
		  //Clicking on Red button
		  screen.click(red);
		  
		  //comparing the balance amount after spin
		  if  (screen.exists("E:/Sikuli Images/GoldenCrown/win.png") != null)
	      {
	    	  Pattern gambleStatus=new Pattern("E:/Sikuli Images/GoldenCrown/win.PNG");
	    	  screen.wait(gambleStatus, 5);
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
			  Assert.assertTrue(score3 > 95);			  
			  Thread.sleep(3000);
			  screen.click(collect);
			  Thread.sleep(4000);

			  Pattern bal=new Pattern("E:/Sikuli Images/GoldenCrown/balance_afterGambleWin.PNG");
		      Finder finder6 =new Finder(screen.capture().getImage());
		      String ht6 = finder6.find(bal);
		      double score6=20;                
		      System.out.println("the value of ht3"+" "+ht6);
			  if(finder6.hasNext())
			  {
			  Match m6=finder6.next();
			  System.out.println("Match Found with: "+(m6.getScore())*100+"%");
			  score6=(m6.getScore())*100;
			  System.out.println("Gamable Win amount added to the balance");
			  finder6.destroy();  
			  }         
			  else    
			  { 
			  System.out.println("Comparision failed. Test case failed");         
			  }
			  System.out.println("Gamble win added to the balance comparision: "+" "+score6 +"%");
			  Assert.assertTrue(score6 > 92);
	      }
	      else
	      {
	    	  Pattern gambleStatus=new Pattern("E:/Sikuli Images/GoldenCrown/lose.PNG");
		      screen.wait(gambleStatus, 15);
	    	  Finder finder3 =new Finder(screen.capture().getImage());
		      String ht3 = finder3.find(gambleStatus);
		      double score3=20;                
		      System.out.println("the value of ht3"+" "+ht3);
			  if(finder3.hasNext())
			  {
			  Match m3=finder3.next();
			  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
			  score3=(m3.getScore())*100;
			  System.out.println("Gamble Lose.");
			  finder3.destroy();  
			  }         
			  else    
			  { 
			  System.out.println("Comparision failed. Test case failed");         
			  }
			  System.out.println("Gamble lose comparision: "+" "+score3 +"%");
			  Assert.assertTrue(score3 > 95);
			  Thread.sleep(4000);
			  
			  Pattern Abalance=new Pattern("E:/Sikuli Images/GoldenCrown/balance_afterGambleLose.PNG");
		      Finder finder11 =new Finder(screen.capture().getImage());
		      String ht11 = finder11.find(Abalance);
		      double score11=20;                
		      System.out.println("the value of ht1"+" "+ht11);
			  if(finder11.hasNext())
			  {
			  Match m11=finder11.next();
			  System.out.println("Match Found with: "+(m11.getScore())*100+"%");
			  score11=(m11.getScore())*100;
			  System.out.println("Balance After losing in gamble. Balance is 290 YSI");
			  finder11.destroy();  
			  }         
			  else    
			  { 
			  System.out.println("Comparision failed. Test case failed");         
			  }
			  System.out.println("Balance comparision after lose: "+" "+score1 +"%");
			  Assert.assertTrue(score1 > 95);
	      }
	}

	@Then("^Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Golden Crown slot game$")
	public void gamble_Win_amount_should_get_added_to_main_balance_after_status_displayed_as_WIN_and_gamble_page_should_get_closed_in_Golden_Crown_slot_game() throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}

}
