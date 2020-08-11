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

public class GoldenCrown_Web_AutoSpin_Validations_ButtonsBehavior {
	WebDriver driver;
	Screen screen=new Screen();

	@Given("^Chrome browser, valid URL, valid login details, Golden Crown slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_check_for_buttons_behavior_functionality() throws Throwable {
		this.driver =  GoldenCrown_Web_URL_Login.getDriver();
	}

	@When("^Open the Golden Crown slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons in different scenarios$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_behavior_of_different_buttons_in_different_scenarios() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(2000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\AutoSpins.PNG";
		Pattern play=new Pattern("E:/Sikuli Images/GoldenCrown/autoplay.png");
		Pattern spin=new Pattern("E:/Sikuli Images/GoldenCrown/spin.png");
		Pattern pat1=new Pattern("E:/Sikuli Images/GoldenCrown/autospin.png");
		Pattern auto=new Pattern("E:/Sikuli Images/GoldenCrown/auto.png");
		Pattern ahome=new Pattern("E:/Sikuli Images/GoldenCrown/autoplay_home.png");
		Pattern ainfo=new Pattern("E:/Sikuli Images/GoldenCrown/autoplay_info.png");
		Pattern acreditvalue=new Pattern("E:/Sikuli Images/GoldenCrown/autoplay_credit.png");
		Pattern abetvalue=new Pattern("E:/Sikuli Images/GoldenCrown/autoplay_betvalue.png");
		Pattern astop=new Pattern("E:/Sikuli Images/GoldenCrown/autoplay_stop.png");
		Pattern betvalue=new Pattern("E:/Sikuli Images/GoldenCrown/autoplay_betvalue_click.PNG");
		Pattern credit=new Pattern("E:/Sikuli Images/GoldenCrown/autoplay_creditvalue_click.PNG");
		Pattern bet1_1=new Pattern("E:/Sikuli Images/GoldenCrown/bet1_1.png");
		Pattern credit1=new Pattern("E:/Sikuli Images/GoldenCrown/credit1.png");
		Pattern payout1_1=new Pattern("E:/Sikuli Images/GoldenCrown/payout1_1.png");
		Pattern goodluck=new Pattern("E:/Sikuli Images/GoldenCrown/goodluck.png");
		Pattern placebet=new Pattern("E:/Sikuli Images/GoldenCrown/placebet.png");
		
		//selecting auto spins by clicking auto spin icon
		screen.wait(spin, 30);
		screen.click(play);
		Thread.sleep(2000);
		screen.click(auto);
		Thread.sleep(2000);

		//Checking "Good Luck" message is displaying
		  Finder finder22 =new Finder(screen.capture().getImage());
		  screen.wait(goodluck, 20);
		  String ht22 = finder22.find(goodluck);
		  double score22=20;                
		  System.out.println("the value of ht"+" "+ht22);
		  if(finder22.hasNext())
		  {
		  Match m22=finder22.next();
		  System.out.println("Match Found with: "+(m22.getScore())*100+"%");
		  score22=(m22.getScore())*100;
		  System.out.println("Testcase1: Good luck message is displayed during automplay. Test case passed");
		  finder22.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Testcase1 Comparision value equals to: "+" "+score22 +"%");
		  Assert.assertTrue(score22 > 90);
		  
		  //comparing home disabled button and not clickable
		  Finder finder =new Finder(screen.capture().getImage());
		  screen.wait(ahome, 20);
		  String ht = finder.find(pat1);
		  double score=20;                
		  System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Testcase2: Disabled home is visible and not clickable during autoplay. Test case passed");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Testcase2 Comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 90);
		  
		 screen.click(ahome);
		 Thread.sleep(1000);
		 screen.click(ahome);
		 Thread.sleep(2000);
		 
		 //Comparing stop button is visible 
		 //Comparing if the home button is clicked then stop button is not visible
		 Finder finder1 =new Finder(screen.capture().getImage());
		 String ht1 = finder1.find(astop);
		 double score1=20;                
		 System.out.println("the value of ht"+" "+ht1);
		 if(finder1.hasNext())
		 {
		 Match m1=finder1.next();
		 System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		 score1=(m1.getScore())*100;
		 System.out.println("TC2:Stop button is visible hence home button click is not working during autoplay. Test case1 passed successfully");
		 System.out.println("Testcase3: Stop button is visible during autoplay. Test case passed");
		 finder1.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failes. Test case failed");         
		 }
		 System.out.println("Testcase 2 & 3 Comparision value equals to: "+" "+score1 +"%");
		 //Assert.assertEquals(100.0,score );
		 Assert.assertTrue(score1 > 90);
		 
		 
		 //comparing the Credit value button should be disabled and not clickable
         screen.wait(acreditvalue, 20);
         Finder finder2 =new Finder(screen.capture().getImage());
         String ht2 = finder2.find(acreditvalue);
         double score2=20;                
         System.out.println("the value of ht"+" "+ht2);
         if(finder2.hasNext())
		 {
		 Match m2=finder2.next();
		 System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		 score2=(m2.getScore())*100;
		 System.out.println("Testcase4: Disabled credit value button is visible");
		 finder2.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Tedst case failed");         
		 }
		 System.out.println("Testcase4 comparision value equals to: "+" "+score2 +"%");
		 Assert.assertTrue(score2 > 80);
		 
		 screen.click(credit);
		 Thread.sleep(1000);
		 screen.click(credit);
		 Thread.sleep(1000);
		 
		 //Comparing the credit value after clicking on disbled credit value button and it should be 0.01
         screen.wait(credit1, 20);
         Finder finder3 =new Finder(screen.capture().getImage());
         String ht3 = finder3.find(credit1);
         double score3=20;                
         System.out.println("the value of ht"+" "+ht3);
         if(finder3.hasNext())
		 {
		 Match m3=finder3.next();
		 System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		 score3=(m3.getScore())*100;
		 System.out.println("After clicking on credit button, credit value selected is 0.01. Test case3 passed");
		 finder3.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Test case: 3 comparision value equals to: "+" "+score3 +"%");
		 Assert.assertTrue(score3 > 90);
		 

		//comparing the Bet value button should be disabled and not clickable
         screen.wait(abetvalue, 20);
         Finder finder4 =new Finder(screen.capture().getImage());
         String ht4 = finder4.find(abetvalue);
         double score4=20;                
         System.out.println("the value of ht"+" "+ht4);
         if(finder4.hasNext())
		 {
		 Match m4=finder4.next();
		 System.out.println("Match Found with: "+(m4.getScore())*100+"%");
		 score4=(m4.getScore())*100;
		 System.out.println("Testcase5: Disabled Bet value button is visible");
		 finder4.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Testcase5 comparision failed. Test case failed");         
		 }
		 System.out.println("Comparision value equals to: "+" "+score4 +"%");
		 Assert.assertTrue(score4 > 90);
		 
		 screen.click(betvalue);
		 Thread.sleep(1000);
		 screen.click(betvalue);
		 Thread.sleep(1000);
		
		 //Comparing the Bet value after clicking on disbled Bet value button and it should be 0.2
         screen.wait(bet1_1, 20);
         Finder finder5 =new Finder(screen.capture().getImage());
         String ht5 = finder5.find(bet1_1);
         double score5=20;                
         System.out.println("the value of ht"+" "+ht5);
         if(finder5.hasNext())
		 {
		 Match m5=finder5.next();
		 System.out.println("Match Found with: "+(m5.getScore())*100+"%");
		 score5=(m5.getScore())*100;
		 System.out.println("After clicking on Bet button, credit value selected is 0.2. Test case4 passed");
		 finder5.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Testcase: 6 comparision value equals to: "+" "+score5 +"%");
		 Assert.assertTrue(score5 > 90);
		 
		 //comparing info disabled button and not clickable
         screen.wait(ainfo, 20);
         Finder finder6 =new Finder(screen.capture().getImage());
         String ht6 = finder6.find(ainfo);
         double score6=20;                
         System.out.println("the value of ht"+" "+ht6);
         if(finder6.hasNext())
		 {
		 Match m6=finder6.next();
		 System.out.println("Match Found with: "+(m6.getScore())*100+"%");
		 score6=(m6.getScore())*100;
		 System.out.println("Testcase6: Disabled INFO button is visible and not clickable during autoplay. Test case passed");
		 finder6.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Testcase6 comparision value equals to: "+" "+score6 +"%");
		 Assert.assertTrue(score6 > 90);
		 
		screen.click(ainfo);
		Thread.sleep(1000);
		screen.click(ainfo);
		Thread.sleep(2000);
		 
		//comparing if the info button click is working
         Finder finder7 =new Finder(screen.capture().getImage());
         String ht7 = finder7.find(payout1_1);
         double score7=20;                
         System.out.println("the value of ht"+" "+ht7);
         if(finder7.hasNext())
		 {
		 Match m7=finder7.next();
		 System.out.println("Match Found with: "+(m7.getScore())*100+"%");
		 score7=(m7.getScore())*100;
		 System.out.println("Testcase7:Payout screen for betvalue 0.2 is not visible after clicking on info button . Test case passed");
		 finder7.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Testcase7 comparision value equals to: "+" "+score7 +"%");
		 Assert.assertFalse(score7 > 90);
		 
		 screen.click(pat1);
		 Thread.sleep(6000);
		 
		 //Checking the functionality of stop button
         Finder finder8 =new Finder(screen.capture().getImage());
         String ht8 = finder8.find(spin);
         double score8=20;                
         System.out.println("the value of ht"+" "+ht8);
         if(finder8.hasNext())
		 {
		 Match m8=finder8.next();
		 System.out.println("Match Found with: "+(m8.getScore())*100+"%");
		 score8=(m8.getScore())*100;
		 System.out.println("Test case 8: Spin button is visible after clicking on stop button. Hence stop button functionality wokring.  Test case passed");
		 finder8.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Test case 8 comparision value equals to: "+" "+score8 +"%");
		 Assert.assertTrue(score8 > 90);
		 
	 	 //Check message 'Please place your bet' after clicking on stop button
	 	 Finder finder9 =new Finder(screen.capture().getImage());
         String ht9 = finder9.find(placebet);
         double score9=20;                
         System.out.println("the value of ht"+" "+ht9);
         if(finder9.hasNext())
		 {
		 Match m9=finder9.next();
		 System.out.println("Match Found with: "+(m9.getScore())*100+"%");
		 score9=(m9.getScore())*100;
		 System.out.println("Test case 9: 'Please place your bet' message should be displayed after clicking on stop button. Test case passed");
		 finder9.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Test case 9 comparision value equals to: "+" "+score9 +"%");
		 Assert.assertTrue(score9 > 90);
	}

	@Then("^Bet value & Credit value buttons should not be clickable$")
	public void bet_value_Credit_value_buttons_should_not_be_clickable() throws Throwable {
	    Thread.sleep(1000);
	}

	@Then("^Home & Info buttons should not be clickable$")
	public void home_Info_buttons_should_not_be_clickable() throws Throwable {
		Thread.sleep(1000);
	}

	@Then("^Spin button should not visible & Stop button should be visible and clickable$")
	public void spin_button_should_not_visible_Stop_button_should_be_visible_and_clickable() throws Throwable {
		Thread.sleep(1000);
	}
	
	@Then("^Spin button should be visble after clicking on stop button$")
	public void spin_button_should_be_visble_after_clicking_on_stop_button() throws Throwable {
		driver.quit();
	}
}