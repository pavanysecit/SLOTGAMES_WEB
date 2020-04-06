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

public class SkinfiriLotto_Web_Balance_Check_WinAmount_AddedToBalance {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Lotto slot game, balance, transfer button, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Lotto_slot_game_balance_transfer_button_spin_button_and_win_amount() throws Throwable {
		this.driver =  SkinfiriLotto_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win in Skinfiri Lotto slot game$")
	public void open_the_Skinfiri_Lotto_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_amount_click_on_spin_button_till_user_win_and_check_the_balance_after_win_in_Skinfiri_Lotto_slot_game() throws Throwable {
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

		Pattern betvalue_1_3=new Pattern("E:/Sikuli Images/SkinfiriLotto/betvalue_1_3.png");
		Pattern spin=new Pattern("E:/Sikuli Images/SkinfiriLotto/spin.png");
		Pattern Win_s_1=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_1.png");
		Pattern Win_s_2=new Pattern("E:/Sikuli Images/SkinfiriLotto/Win_s_2.png");
		Pattern take=new Pattern("E:/Sikuli Images/SkinfiriLotto/take.png");

		//comparing the credit value should be 0.01
	      Pattern credit1=new Pattern("E:/Sikuli Images/SkinfiriLotto/creditvalue_1.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Credit value comparision happened successfully.");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Credit comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 97);
		  
		  //comparing the balance before spin
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
		  System.out.println("Balance comparision before spin completed successfully. Balance is 300.");
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
		  System.out.println("Win amount comparision after spin completed successfully. Win amount is 4.00.");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 97);
		  Thread.sleep(2000);
		  
		  //clicking on collect button
		  screen.click(take);
		  Thread.sleep(2000);
		  
		  //comparing the balance amount after win
	      Pattern balanceA=new Pattern("E:/Sikuli Images/SkinfiriLotto/Balance_win_1_1.PNG");
	      Finder finder3 =new Finder(screen.capture().getImage());
	      String ht3 = finder3.find(balanceA);
	      double score3=20;                
	      System.out.println("the value of ht3"+" "+ht3);
		  if(finder3.hasNext())
		  {
		  Match m3=finder3.next();
		  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		  score3=(m3.getScore())*100;
		  System.out.println("Balance comparision after spin & win completed successfully.");
		  finder3.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance amount comparision after spin & win: "+" "+score3 +"%");
		  Assert.assertTrue(score3 > 97);
	}

	@Then("^Win amount should get added to the balance after win and balance should get increased with win amount in Skinfiri Lotto slot game$")
	public void win_amount_should_get_added_to_the_balance_after_win_and_balance_should_get_increased_with_win_amount_in_Skinfiri_Lotto_slot_game() throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
