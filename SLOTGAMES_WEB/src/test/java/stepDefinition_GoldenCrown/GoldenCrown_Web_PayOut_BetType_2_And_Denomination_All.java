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

public class GoldenCrown_Web_PayOut_BetType_2_And_Denomination_All {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Crown slot game, icon to open payout table, all symbols, max amount on each symbol, back button, bet type (\\d+)\\.(\\d+) and  denomination values like (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+), (\\d+) & (\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_back_button_bet_type_and_denomination_values_like(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		this.driver =  GoldenCrown_Web_URL_Login.getDriver();
	}

	@When("^Open the Golden Crown slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  values like (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+), (\\d+) & (\\d+) and check payout amount$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_click_on_back_button_select_bet_type_as_denomination_values_like_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(3000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\AutoSpins.PNG";
		Pattern info=new Pattern("E:/Sikuli Images/GoldenCrown/info.png");
		Pattern betvalue=new Pattern("E:/Sikuli Images/GoldenCrown/betvalue.png");
		Pattern credit=new Pattern("E:/Sikuli Images/GoldenCrown/credit.png");
		Pattern pat1=new Pattern("E:/Sikuli Images/GoldenCrown/payout2_1.png");
		Pattern pat2=new Pattern("E:/Sikuli Images/GoldenCrown/payout2_2.png");
		Pattern pat3=new Pattern("E:/Sikuli Images/GoldenCrown/payout2_3.png");
		Pattern pat4=new Pattern("E:/Sikuli Images/GoldenCrown/payout2_4.png");
		Pattern pat5=new Pattern("E:/Sikuli Images/GoldenCrown/payout2_5.png");
		Pattern spin=new Pattern("E:/Sikuli Images/GoldenCrown/spin.png");
		
		//selecting credit as 0.02
		screen.wait(spin, 30);
		screen.click(credit);
		Thread.sleep(2000);
		
		//comparing the credit value should be 0.02
	    Pattern credit1=new Pattern("E:/Sikuli Images/GoldenCrown/credit2.png");
	    Finder finder =new Finder(screen.capture().getImage());
	    String ht = finder.find(credit1);
	    double score=20;                
	    System.out.println("the value of ht"+" "+ht);
		if(finder.hasNext())
		{
		Match m=finder.next();
		System.out.println("Match Found with: "+(m.getScore())*100+"%");
		score=(m.getScore())*100;
		System.out.println("Selected credit value is 0.02 & Comparision is successful. Test case passed");
		finder.destroy();  
		}         
		else    
		{ 
		System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score +"%");
		Assert.assertTrue(score > 94);

		 
		//comparing the bet value should be 0.4
	    Pattern credit11=new Pattern("E:/Sikuli Images/GoldenCrown/bet2_1.png");
	    Finder finder11 =new Finder(screen.capture().getImage());
	    String ht11 = finder11.find(credit11);
	    double score11=20;                
	    System.out.println("the value of ht"+" "+ht11);
		if(finder11.hasNext())
		{
		Match m11=finder11.next();
		System.out.println("Match Found with: "+(m11.getScore())*100+"%");
		score11=(m11.getScore())*100;
		System.out.println("Selected bet value is 0.4 & Comparision is successful. Test case passed");
		finder11.destroy();  
		}         
		else    
		{ 
		System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score11 +"%");
		Assert.assertTrue(score11 > 94);
		 
		
	  	  
		//Clicking on info link and navigating to payout screen
		screen.click(info);
		Thread.sleep(2000);
	
		 //Comparing the max payout value for denomination 0.4
         screen.wait(pat1, 5);
		 Finder finder1 =new Finder(screen.capture().getImage());
         String ht1 = finder1.find(pat1);
         double score1=20;                
         System.out.println("the value of ht"+" "+ht1);
         if(finder1.hasNext())
		 {
		 Match m1=finder1.next();
		 System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		 score1=(m1.getScore())*100;
		 System.out.println("Comparing the max payout value for 0.4 denomination. Test case passed");
		 finder1.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failes. Test case failed");         
		 }
		 System.out.println("Comparing the max payout value for 0.4 denomination and comparision value equals to: "+" "+score1 +"%");
		 Assert.assertTrue(score1 > 94);
		 Thread.sleep(2000);

	     //Selecting the denomination as 0.8
		 screen.click(betvalue);
		 Thread.sleep(2000);
		 
		 //Comparing the max payout value for denomination 0.8
         screen.wait(pat2, 5);
         Finder finder2 =new Finder(screen.capture().getImage());
         String ht2 = finder2.find(pat2);
         double score2=20;                
         System.out.println("the value of ht"+" "+ht2);
         if(finder2.hasNext())
		 {
		 Match m2=finder2.next();
		 System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		 score2=(m2.getScore())*100;
		 System.out.println("Comparing the max payout value for 0.8 denomination. Test case passed");
		 finder2.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failes. Test case failed");         
		 }
		 System.out.println("Comparing the max payout value for 0.8 denomination and comparision value equals to: "+" "+score2 +"%");
		 Assert.assertTrue(score2 > 94);
		 Thread.sleep(2000);
		 
	     //Selecting the denomination as 2
		 screen.click(betvalue);
		 Thread.sleep(2000);
		 
		 //Comparing the max payout value for denomination 2
         screen.wait(pat3, 5);
         Finder finder3 =new Finder(screen.capture().getImage());
         String ht3 = finder3.find(pat3);
         double score3=20;                
         System.out.println("the value of ht"+" "+ht3);
         if(finder3.hasNext())
		 {
		 Match m3=finder3.next();
		 System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		 score3=(m3.getScore())*100;
		 System.out.println("Comparing the max payout value for 2 denomination. Test case passed");
		 finder3.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failes. Test case failed");         
		 }
		 System.out.println("Comparing the max payout value for 2 denomination and comparision value equals to: "+" "+score3 +"%");
		 Assert.assertTrue(score3 > 94);
		 Thread.sleep(2000);
		 
	    //Selecting the denomination as 4
		 screen.click(betvalue);
		 Thread.sleep(2000);
		
		//Comparing the max payout value for denomination 4
		screen.wait(pat4, 5);
        Finder finder4 =new Finder(screen.capture().getImage());
        String ht4 = finder4.find(pat4);
        double score4=20;                
        System.out.println("the value of ht"+" "+ht4);
        if(finder4.hasNext())
		{
		Match m4=finder4.next();
		System.out.println("Match Found with: "+(m4.getScore())*100+"%");
		score4=(m4.getScore())*100;
		System.out.println("Comparing the max payout value for 4 denomination. Test case passed");
		finder4.destroy();  
		}         
		else    
		{ 
		System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 4 denomination and comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 94);
		Thread.sleep(2000);
		
	    //Selecting the denomination as 8
		 screen.click(betvalue);
		 Thread.sleep(2000);
		
		//Comparing the max payout value for denomination 8
        screen.wait(pat5, 5);
        Finder finder5 =new Finder(screen.capture().getImage());
        String ht5 = finder5.find(pat5);
        double score5=20;                
        System.out.println("the value of ht"+" "+ht5);
        if(finder5.hasNext())
		{
		Match m5=finder5.next();
		System.out.println("Match Found with: "+(m5.getScore())*100+"%");
		score5=(m5.getScore())*100;
		System.out.println("Comparing the max payout value for 8 denomination. Test case passed");
		finder5.destroy();  
		}         
		else    
		{ 
		System.out.println("Comparision failes. Test case failed");         
		}
		System.out.println("Comparing the max payout value for 8 denomination and comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 94);
		Thread.sleep(2000);
	}

	@Then("^System should display the Payout max amount on each symbol and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination values like (\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+), (\\d+) & (\\d+) in Golden Crown slot game on Web$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_values_like_in_Golden_Crown_slot_game_on_Web(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}