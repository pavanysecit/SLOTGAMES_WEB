package stepDefinition_TreasureBonanza;

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

public class TreasureBonanza_Web_PayOut_BetType_3_And_Denomination_All {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, icon to open payout table, all symbols, max amount on each symbol like Q, K, (\\d+) n etc, back button, bet type (\\d+)\\.(\\d+) and all denomination values  on web$")
	public void chrome_browser_valid_URL_valid_login_details_Treasure_Bonanza_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_Q_K_n_etc_back_button_bet_type_and_all_denomination_values_on_web(int arg1, int arg2, int arg3) throws Throwable {
		this.driver =  TreasureBonanza_URL_Login.getDriver();
	}

	@When("^Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like Q, K, (\\d+) n etc, click on back button, select bet type as (\\d+)\\.(\\d+) & all denomination  values and check payout amount on web$")
	public void open_the_Treasure_Bonanza_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_Q_K_n_etc_click_on_back_button_select_bet_type_as_all_denomination_values_and_check_payout_amount_on_web(int arg1, int arg2, int arg3) throws Throwable {
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
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\AutoSpins.PNG";

		Pattern settings=new Pattern("E:/Sikuli Images/TreasureBonanza/settings.png");
		Pattern info=new Pattern("E:/Sikuli Images/TreasureBonanza/info.png");
		Pattern plus=new Pattern("E:/Sikuli Images/TreasureBonanza/plus.png");
		Pattern arrow=new Pattern("E:/Sikuli Images/TreasureBonanza/arrow.png");
		Pattern denomination1=new Pattern("E:/Sikuli Images/TreasureBonanza/betvalue_3_1.png");
		Pattern denomination2=new Pattern("E:/Sikuli Images/TreasureBonanza/betvalue_3_2.png");
		Pattern denomination3=new Pattern("E:/Sikuli Images/TreasureBonanza/betvalue_3_3.png");
		Pattern denomination4=new Pattern("E:/Sikuli Images/TreasureBonanza/betvalue_3_4.png");
		Pattern denomination5=new Pattern("E:/Sikuli Images/TreasureBonanza/betvalue_3_5.png");
	     
		//comparing the credit value should be 1
		screen.click(plus);
		Thread.sleep(1000);
		screen.click(plus);
		Thread.sleep(2000);
	    Pattern credit1=new Pattern("E:/Sikuli Images/TreasureBonanza/creditvalue_3.png");
	    Finder finder =new Finder(screen.capture().getImage());
	    String ht = finder.find(credit1);
	    double score=20;                
	    System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
		Match m=finder.next();
		System.out.println("Match Found with: "+(m.getScore())*100+"%");
		score=(m.getScore())*100;
		System.out.println("Comparing the credit value should be 0.05. Test case passed");
		finder.destroy();  
		}         
		else    
		{ 
		System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 95);
		  	  
		//Clicking on settings link and navigating to payout screen
		screen.click(settings);
		Thread.sleep(2000);
		screen.click(info);
		Thread.sleep(2000);
		screen.click(arrow);
		Thread.sleep(2000);
	    //Selecting the denomination as 1
		screen.click(denomination1);
		Thread.sleep(2000);
		 
		 //Comparing the max payout value for denomination 1
         Pattern pat1=new Pattern("E:/Sikuli Images/TreasureBonanza/payout3_1.png");
         Finder finder1 =new Finder(screen.capture().getImage());
         String ht1 = finder1.find(pat1);
         double score1=20;                
         System.out.println("the value of ht"+" "+ht1);
         if(finder1.hasNext())
		 {
		 Match m1=finder1.next();
		 System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		 score1=(m1.getScore())*100;
		 System.out.println("Comparing the max payout value for 1 denomination. Test case passed");
		 finder1.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failes. Test case failed");         
		 }
		 System.out.println("Comparing the max payout value for 1 denomination and comparision value equals to: "+" "+score1 +"%");
		 Assert.assertTrue(score1 > 95);
		 Thread.sleep(2000);

	     //Selecting the denomination as 2
		 screen.click(denomination2);
		 Thread.sleep(2000);
		 
		 //Comparing the max payout value for denomination 2
         Pattern pat2=new Pattern("E:/Sikuli Images/TreasureBonanza/payout3_2.png");
         Finder finder2 =new Finder(screen.capture().getImage());
         String ht2 = finder2.find(pat2);
         double score2=20;                
         System.out.println("the value of ht"+" "+ht2);
         if(finder2.hasNext())
		 {
		 Match m2=finder2.next();
		 System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		 score2=(m2.getScore())*100;
		 System.out.println("Comparing the max payout value for 2 denomination. Test case passed");
		 finder2.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failes. Test case failed");         
		 }
		 System.out.println("Comparing the max payout value for 2 denomination and comparision value equals to: "+" "+score2 +"%");
		 Assert.assertTrue(score2 > 95);
		 Thread.sleep(2000);
		 
	     //Selecting the denomination as 5
		 screen.click(denomination3);
		 Thread.sleep(2000);
		 
		 //Comparing the max payout value for denomination 5
         Pattern pat3=new Pattern("E:/Sikuli Images/TreasureBonanza/payout3_3.png");
         Finder finder3 =new Finder(screen.capture().getImage());
         String ht3 = finder3.find(pat3);
         double score3=20;                
         System.out.println("the value of ht"+" "+ht3);
         if(finder3.hasNext())
		 {
		 Match m3=finder3.next();
		 System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		 score3=(m3.getScore())*100;
		 System.out.println("Comparing the max payout value for 5 denomination. Test case passed");
		 finder3.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failes. Test case failed");         
		 }
		 System.out.println("Comparing the max payout value for 5 denomination and comparision value equals to: "+" "+score3 +"%");
		 Assert.assertTrue(score3 > 95);
		 Thread.sleep(2000);
		 
	    //Selecting the denomination as 10
		screen.click(denomination4);
		Thread.sleep(2000);
		
		//Comparing the max payout value for denomination 10
        Pattern pat4=new Pattern("E:/Sikuli Images/TreasureBonanza/payout3_4.png");
        Finder finder4 =new Finder(screen.capture().getImage());
        String ht4 = finder4.find(pat4);
        double score4=20;                
        System.out.println("the value of ht"+" "+ht4);
        if(finder4.hasNext())
		{
		Match m4=finder4.next();
		System.out.println("Match Found with: "+(m4.getScore())*100+"%");
		score4=(m4.getScore())*100;
		System.out.println("Comparing the max payout value for 10 denomination. Test case passed");
		finder4.destroy();  
		}         
		else    
		{ 
		System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 10 denomination and comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 95);
		Thread.sleep(2000);
		
	    //Selecting the denomination as 20
		screen.click(denomination5);
		Thread.sleep(2000);
		
		//Comparing the max payout value for denomination 20
        Pattern pat5=new Pattern("E:/Sikuli Images/TreasureBonanza/payout3_5.png");
        Finder finder5 =new Finder(screen.capture().getImage());
        String ht5 = finder5.find(pat5);
        double score5=20;                
        System.out.println("the value of ht"+" "+ht5);
        if(finder5.hasNext())
		{
		Match m5=finder5.next();
		System.out.println("Match Found with: "+(m5.getScore())*100+"%");
		score5=(m5.getScore())*100;
		System.out.println("Comparing the max payout value for 20 denomination. Test case passed");
		finder5.destroy();  
		}         
		else    
		{ 
		System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 20 denomination and comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 95);
		Thread.sleep(2000);
	}

	@Then("^System should display the Payout max amount on each symbol like Q, K, (\\d+) n etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and all denomination values in Treasure Bonanza slot game on web$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_Q_K_n_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_all_denomination_values_in_Treasure_Bonanza_slot_game_on_web(int arg1, int arg2, int arg3) throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
