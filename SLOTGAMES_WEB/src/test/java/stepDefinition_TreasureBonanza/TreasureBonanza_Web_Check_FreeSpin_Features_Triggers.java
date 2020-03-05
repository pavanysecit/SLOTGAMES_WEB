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

public class TreasureBonanza_Web_Check_FreeSpin_Features_Triggers {
WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type, denomination, balance, scatter symbols, spin button, free spin screen and reveal all button$")
	public void chrome_browser_valid_URL_valid_login_details_Treasure_Bonanza_slot_game_bet_type_denomination_balance_scatter_symbols_spin_button_free_spin_screen_and_reveal_all_button() throws Throwable {
		this.driver =  TreasureBonanza_URL_Login.getDriver();
	}

	@When("^Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till (\\d+) scatter symbols appears on the screen wins and click on Reveal all button$")
	public void open_the_Treasure_Bonanza_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_select_bet_type_denomination_click_on_spin_button_till_scatter_symbols_appears_on_the_screen_wins_and_click_on_Reveal_all_button(int arg1) throws Throwable {
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
		Pattern congracts_msg1=new Pattern("E:/Sikuli Images/TreasureBonanza/congracts_msg1.png");
		Pattern Win_s_58=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_58.png");
		Pattern revealall=new Pattern("E:/Sikuli Images/TreasureBonanza/revealall.png");
		Pattern Win_s_11=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_11.png");
		Pattern Win_s_12=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_12.png");
		Pattern Win_s_13=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_13.png");
		Pattern Win_s_21=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_21.png");
		Pattern Win_s_22=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_22.png");
		Pattern Win_s_23=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_23.png");
		Pattern Win_s_24=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_24.png");
		Pattern Win_s_25=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_25.png");
		Pattern Win_s_26=new Pattern("E:/Sikuli Images/TreasureBonanza/Win_s_26.png");
		Pattern collect=new Pattern("E:/Sikuli Images/TreasureBonanza/collect.png");
		  
		  
		 //Clicking on symbol to make the player win
		 screen.click(betvalue_1_5);
		 Thread.sleep(2000);
		 
		 screen.click(Win_s_58);
		 Thread.sleep(1000);
		 screen.click(spin);
		 Thread.sleep(3000);
	
		 screen.wait(congracts_msg1, 10);
		 
//		  //comparing the balance amount after win
//	      Pattern balanceAA=new Pattern("E:/Sikuli Images/TreasureBonanza/congracts_msg1.PNG");
//	      Finder finder31 =new Finder(screen.capture().getImage());
//	      String ht31 = finder31.find(balanceAA);
//	      double score31=20;                
//	      System.out.println("the value of ht31"+" "+ht31);
//		  if(finder31.hasNext())
//		  {
//		  Match m31=finder31.next();
//		  System.out.println("Match Found with: "+(m31.getScore())*100+"%");
//		  score31=(m31.getScore())*100;
//		  System.out.println("'Congradulations. You won Bonus Game' message should be displayed.");
//		  finder31.destroy();  
//		  }         
//		  else    
//		  { 
//		  System.out.println("Comparision failed. Test case failed");         
//		  }
//		  System.out.println("'Congradulations. You won Bonus Game' message comparision: "+" "+score31 +"%");
//		  Assert.assertTrue(score31 > 85);
		  
		  //comparing the free spin attempts
	      Pattern balance=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
	      Finder finder1 =new Finder(screen.capture().getImage());
	      String ht1 = finder1.find(balance);
	      double score1=20;                
	      System.out.println("the value of ht1"+" "+ht1);
		  if(finder1.hasNext())
		  {
		  Match m1=finder1.next();
		  System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		  score1=(m1.getScore())*100;
		  System.out.println("On appearance of 3 scatters, bonus game should be triggered and Free spin attempts should be 15.");
		  finder1.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Free spin attempts comparision: "+" "+score1 +"%");
		  Assert.assertTrue(score1 > 97);
		  
	     //clicking on reveal all button
	     screen.click(revealall);
		 screen.wait(collect, 60);
		 screen.click(collect);
		 Thread.sleep(2000);
		 

		 screen.click(Win_s_11);
		 Thread.sleep(1000);
		 screen.click(Win_s_11);
		 Thread.sleep(1000);
		 screen.click(Win_s_12);
		 Thread.sleep(1000);
		 screen.click(Win_s_13);
		 Thread.sleep(2000);
		 screen.click(spin);
		 Thread.sleep(10000);
		 
		  //comparing bonus game is triggered on appearance of 4 scatters
	      Pattern balanceA=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
	      Finder finder3 =new Finder(screen.capture().getImage());
	      String ht3 = finder3.find(balanceA);
	      double score3=20;                
	      System.out.println("the value of ht3"+" "+ht3);
		  if(finder3.hasNext())
		  {
		  Match m3=finder3.next();
		  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		  score3=(m3.getScore())*100;
		  System.out.println("On appearance of 4 scatters, bonus game should be triggered and Free spin attempts should be 15..");
		  finder3.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Free spin attempts comparision: "+" "+score3 +"%");
		  Assert.assertTrue(score3 > 97);
		  
	     //clicking on reveal all button
	     screen.click(revealall);
		 screen.wait(collect, 60);
		 screen.click(collect);
		 Thread.sleep(2000);
	
		 screen.click(Win_s_21);
		 Thread.sleep(1000);
		 screen.click(Win_s_21);
		 Thread.sleep(1000);
		 screen.click(Win_s_22);
		 Thread.sleep(1000);
		 screen.click(Win_s_22);
		 Thread.sleep(1000);
		 screen.click(Win_s_23);
		 Thread.sleep(1000);
		 screen.click(Win_s_24);
		 Thread.sleep(1000);
		 screen.click(Win_s_24);
		 Thread.sleep(1000);
		 screen.click(Win_s_25);
		 Thread.sleep(1000);
		 screen.click(Win_s_22);
		 Thread.sleep(1000);
		 screen.click(Win_s_22);
		 Thread.sleep(1000);
		 screen.click(Win_s_26);
		 Thread.sleep(1000);
		 screen.click(Win_s_21);
		 Thread.sleep(1000);
		 screen.click(Win_s_24);
		 Thread.sleep(1000);
		 screen.click(spin);
		 Thread.sleep(10000);
		 
		 
		 //comparing bonus game is triggered on appearance of 5 scatters
	      Pattern winAB=new Pattern("E:/Sikuli Images/TreasureBonanza/attempts_freespin.PNG");
	      Finder finder21 =new Finder(screen.capture().getImage());
	      String ht21 = finder21.find(winAB);
	      double score21=20;                
	      System.out.println("the value of ht21"+" "+ht21);
		  if(finder21.hasNext())
		  {
		  Match m21=finder21.next();
		  System.out.println("Match Found with: "+(m21.getScore())*100+"%");
		  score21=(m21.getScore())*100;
		  System.out.println("On appearance of 5 scatters, bonus game should be triggered and Free spin attempts should be 15..");
		  finder21.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Free spin attempts comparision: "+" "+score21 +"%");
		  Assert.assertTrue(score21 > 97);
		  Thread.sleep(2000);

	      //clicking on reveal all button
	      screen.click(revealall);
		  screen.wait(collect, 60);
		  screen.click(collect);
		  Thread.sleep(2000);
	}


	@Then("^Free Spin screen should appear when (\\d+) or more than (\\d+) scatter symbols appears on the screen in Treasure Bonanza game$")
	public void free_Spin_screen_should_appear_when_or_more_than_scatter_symbols_appears_on_the_screen_in_Treasure_Bonanza_game(int arg1, int arg2) throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
