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

public class GoldenCrown_Web_Gamble_WinAmount_SameAs_GambleAmount {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Crown slot game, balance, spin button, win amount, gamble button and gamble amount$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_balance_spin_button_win_amount_gamble_button_and_gamble_amount() throws Throwable {
		this.driver =  GoldenCrown_Web_URL_Login.getDriver();
	}

	@When("^Open the Golden Crown slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount on web$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_amount_on_web() throws Throwable {
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
		  
		  screen.click(gamble);
		  Thread.sleep(3000);
		  
		 //comparing the Gamble win amount should be same as win amount
	      Pattern winB=new Pattern("E:/Sikuli Images/GoldenCrown/Gamblewin.PNG");
	      Finder finder3 =new Finder(screen.capture().getImage());
	      String ht3 = finder3.find(winB);
	      double score3=20;                
	      System.out.println("the value of ht2"+" "+ht3);
		  if(finder3.hasNext())
		  {
		  Match m3=finder3.next();
		  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		  score3=(m3.getScore())*100;
		  System.out.println("Gamble Win amount comparision completed successfully. Gamble Win amount is 40.00 YSI");
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

	@Then("^Win amount should be displayed as Gamble amount in the gamble page of the Golden Crown slot game on web$")
	public void win_amount_should_be_displayed_as_Gamble_amount_in_the_gamble_page_of_the_Golden_Crown_slot_game_on_web() throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}