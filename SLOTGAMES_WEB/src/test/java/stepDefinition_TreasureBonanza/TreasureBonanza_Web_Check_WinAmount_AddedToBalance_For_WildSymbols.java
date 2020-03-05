package stepDefinition_TreasureBonanza;

import java.io.File;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

public class TreasureBonanza_Web_Check_WinAmount_AddedToBalance_For_WildSymbols {
WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type, denomination, balance, wild symbols, ring symbols, spin button, win amount and collect button$")
	public void chrome_browser_valid_URL_valid_login_details_Treasure_Bonanza_slot_game_bet_type_denomination_balance_wild_symbols_ring_symbols_spin_button_win_amount_and_collect_button() throws Throwable {
		this.driver =  TreasureBonanza_URL_Login.getDriver();
	}

	@When("^Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till wild symbols appears on the screen, check win amount and click on collect button$")
	public void open_the_Treasure_Bonanza_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_wild_symbols_appears_on_the_screen_check_win_amount_and_click_on_collect_button() throws Throwable {
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
		Pattern betvalue_1_5=new Pattern("E:/Sikuli Images/TreasureBonanza/betvalue_1_5.png");
		Pattern spin=new Pattern("E:/Sikuli Images/TreasureBonanza/spin.png");
		Pattern Win_s_21=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_21.png");
		Pattern Win_s_55=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_55.png");
		Pattern Win_s_60=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_60.png");
		Pattern Win_s_36=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_36.png");
		Pattern Win_s_4=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_4.png");
		Pattern Win_s_61=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_61.png");
		Pattern Win_s_9=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_9.png");
		Pattern Win_s_62=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_62.png");
		Pattern Win_s_11=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_11.png");
		Pattern Win_s_12=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_12.png");
		Pattern Win_s_13=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_13.png");
		Pattern Win_s_33=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_33.png");
		Pattern collect=new Pattern("E:/Sikuli Images/TreasureBonanza/collect.png");

		
		 //comparing the balance
	      Pattern credit1=new Pattern("E:/Sikuli Images/TreasureBonanza/balance.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Current balance in the acoount is 300.");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 97);
		  
		  
		 //Clicking on symbol to make the 2 wild symbol appear with ring symbols and player win
		 screen.click(betvalue_1_5);
		 Thread.sleep(2000);
		 screen.click(Win_s_21);
		 Thread.sleep(1000);
		 screen.click(Win_s_55);
		 Thread.sleep(1000);
		 screen.click(Win_s_60);
		 Thread.sleep(1000);
		 screen.click(Win_s_36);
		 Thread.sleep(1000);
		 screen.click(Win_s_36);
		 Thread.sleep(1000);
		 screen.click(Win_s_36);
		 Thread.sleep(1000);
		 screen.click(Win_s_4);
		 Thread.sleep(1000);
		 screen.click(Win_s_4);
		 Thread.sleep(1000);
		 screen.click(Win_s_4);
		 Thread.sleep(1000);
		 screen.click(Win_s_61);
		 Thread.sleep(1000);
		 screen.click(Win_s_9);
		 Thread.sleep(1000);
 	     screen.click(Win_s_33);
		  Thread.sleep(1000);
		  screen.click(Win_s_62);
		  Thread.sleep(1000);
		  screen.click(Win_s_62);
		  Thread.sleep(1000);
		  screen.click(Win_s_11);
		  Thread.sleep(1000);
		  screen.click(Win_s_11);
		  Thread.sleep(1000);
		  screen.click(Win_s_12);
		  Thread.sleep(1000);
		  screen.click(Win_s_13);
		  Thread.sleep(1000);
		  screen.click(Win_s_13);
		  Thread.sleep(1000);
		  screen.click(spin);
		  Thread.sleep(6000);
		  
		  //comparing the win amount when wild symbols appears
	      Pattern balanceA=new Pattern("E:/Sikuli Images/TreasureBonanza/wild_win1.PNG");
	      Finder finder3 =new Finder(screen.capture().getImage());
	      String ht3 = finder3.find(balanceA);
	      double score3=20;                
	      System.out.println("the value of ht3"+" "+ht3);
		  if(finder3.hasNext())
		  {
		  Match m3=finder3.next();
		  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		  score3=(m3.getScore())*100;
		  System.out.println("If 2 wild symbol appears with ring symbol, win amount should be 32.00.");
		  finder3.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("2 Wild symbol win amount comparision after spin: "+" "+score3 +"%");
		  Assert.assertTrue(score3 > 97);
		  Thread.sleep(2000);

		  //Clicking on collect button 
		  screen.click(collect);
		  Thread.sleep(3000);
		  
		  //comparing the win amount is added to the balance
	      Pattern balanceAT=new Pattern("E:/Sikuli Images/TreasureBonanza/wild_balance.PNG");
	      Finder finder31 =new Finder(screen.capture().getImage());
	      String ht31 = finder31.find(balanceAT);
	      double score31=20;                
	      System.out.println("the value of ht31"+" "+ht31);
		  if(finder31.hasNext())
		  {
		  Match m31=finder31.next();
		  System.out.println("Match Found with: "+(m31.getScore())*100+"%");
		  score31=(m31.getScore())*100;
		  System.out.println("Balance after adding wild win amount is ");
		  finder31.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance comparision after adding wild win amount: "+" "+score31 +"%");
		  Assert.assertTrue(score31 > 97);
	}

	@Then("^Win amount occurs when wild symbols appears should get added to the balance after clicking collect button in Treasure Bonanza game$")
	public void win_amount_occurs_when_wild_symbols_appears_should_get_added_to_the_balance_after_clicking_collect_button_in_Treasure_Bonanza_game() throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
