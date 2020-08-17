package stepDefinition_UltraHot;

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

public class UltraHot_Web_Balance_Check_WinAmount_AddedToBalance {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, transfer button, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Ultra_Hot_slot_game_balance_transfer_button_spin_button_and_win_amount() throws Throwable {
		this.driver =  UltraHot_Web_URL_Login.getDriver();
	}

	@When("^Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win in Ultra Hot slot game$")
	public void open_the_Ultra_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_amount_click_on_spin_button_till_user_win_and_check_the_balance_after_win_in_Ultra_Hot_slot_game() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		balT.sendKeys("300");
		Thread.sleep(1000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(3000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		Screen screen=new Screen();
		//Pattern balance=new Pattern("E:/Sikuli Images/Win/balance.PNG");
		Pattern spin=new Pattern("E:/Sikuli Images/UltraHot/spin.png");
		Pattern take=new Pattern("E:/Sikuli Images/UltraHot/take.png");
		Pattern credit=new Pattern("E:/Sikuli Images/UltraHot/credit.png");
		Pattern plum=new Pattern("E:/Sikuli Images/UltraHot/plum.png");
		Pattern orange=new Pattern("E:/Sikuli Images/UltraHot/orange.png");
		Pattern gamble=new Pattern("E:/Sikuli Images/UltraHot/gamble.png");
		Pattern lemon=new Pattern("E:/Sikuli Images/UltraHot/lemon.png");
		Pattern lemon1=new Pattern("E:/Sikuli Images/UltraHot/lemon1.png");
		Pattern wm=new Pattern("E:/Sikuli Images/UltraHot/wm.png");
		Pattern balance=new Pattern("E:/Sikuli Images/UltraHot/balance.png");
		Pattern bell=new Pattern("E:/Sikuli Images/UltraHot/bell.png");
		Pattern balance_win=new Pattern("E:/Sikuli Images/UltraHot/balance_afterSpin.png");	
		Pattern win_4=new Pattern("E:/Sikuli Images/UltraHot/win_4.png");

		//selecting credit value as 1
		screen.wait(spin, 30);
		screen.click(credit);
		Thread.sleep(1000);
		screen.click(credit);
		Thread.sleep(1000);
		screen.click(credit);
		Thread.sleep(2000);
		
		//arranging the symbols to get a win
		screen.click(plum);
		Thread.sleep(1000);
		screen.click(bell);
		Thread.sleep(1000);
		screen.click(wm);
		Thread.sleep(1000);
		screen.click(orange);
		Thread.sleep(1000);
	    screen.click(bell);
		Thread.sleep(1000);
	    screen.click(lemon);
		Thread.sleep(1000);
		screen.click(orange);
		Thread.sleep(1000);
		screen.click(orange);
		Thread.sleep(1000);
	    screen.click(lemon1);
		Thread.sleep(1000);
		
	  //Checking win amount getting added to the balance: Check balance before and check win amount
	  //comparing the balance before spin
      Finder finder1 =new Finder(screen.capture().getImage());
      String ht1 = finder1.find(balance);
      double score1=20;                
      System.out.println("the value of ht1"+" "+ht1);
	  if(finder1.hasNext())
	  {
	  Match m1=finder1.next();
	  System.out.println("Match Found with: "+(m1.getScore())*100+"%");
	  score1=(m1.getScore())*100;
	  System.out.println("Balance is 300 before autoplay & comparision completed successfully.");
	  finder1.destroy();  
	  }         
	  else    
	  { 
	  System.out.println("Comparision failed. Test case failed");         
	  }
	  System.out.println("Balance is 300 before autoplay & comparision value equal to: "+" "+score1 +"%");
	  Assert.assertTrue(score1 > 94);
	
	 //Clicking on Spin button
	 screen.click(spin);
	 Thread.sleep(7000);
	 
	 screen.wait(win_4, 20);
	 
	 //comparing the win amount should exists after spin
      Finder finder2 =new Finder(screen.capture().getImage());
      String ht2 = finder2.find(win_4);
      double score2=20;                
      System.out.println("the value of ht2"+" "+ht2);
	  if(finder2.hasNext())
	  {
	  Match m2=finder2.next();
	  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
	  score2=(m2.getScore())*100;
	  System.out.println("Win amount is 40.00 after spin and comparision completed successfully.");
	  finder2.destroy();  
	  }         
	  else    
	  { 
	  System.out.println("Comparision failed. Test case failed");         
	  }
	  System.out.println("Win amount is 40.00 after spin and comparision value is equal to: "+" "+score2 +"%");
	  Assert.assertTrue(score2 > 89);
	  Thread.sleep(2000);
		  
	  //clicking on take button
	  screen.click(take);
	  Thread.sleep(3000);
		  
	  //comparing the balance amount after spin
      Finder finder3 =new Finder(screen.capture().getImage());
      String ht3 = finder3.find(balance_win);
      double score3=20;                
      System.out.println("the value of ht3"+" "+ht3);
	  if(finder3.hasNext())
	  {
	  Match m3=finder3.next();
	  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
	  score3=(m3.getScore())*100;
	  System.out.println("Balance after win should be 335.00 & balance comparision completed successfully.");
	  finder3.destroy();  
	  }         
	  else    
	  { 
	  System.out.println("Comparision failed. Test case failed");         
	  }
	  System.out.println("Balance is 335.00 YSI after win & comparision value equal to: "+" "+score3 +"%");
	  Assert.assertTrue(score3 > 92);
	  Thread.sleep(2000);
	}

	@Then("^Win amount should get added to the balance after win and balance should get increased with win amount in Ultra Hot slot game$")
	public void win_amount_should_get_added_to_the_balance_after_win_and_balance_should_get_increased_with_win_amount_in_Ultra_Hot_slot_game() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
