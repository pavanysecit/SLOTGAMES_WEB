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

public class SkinfiriLotto_Web_Balance_Credits_Calculations_Value1 {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Skinfiri Lotto slot game, balance, credits and denomination as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Skinfiri_Lotto_slot_game_balance_credits_and_denomination_as(int arg1, int arg2) throws Throwable {
		this.driver =  SkinfiriLotto_URL_Login.getDriver();
	}

	@When("^Open the Skinfiri Lotto slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by (\\d+)\\.(\\d+) and check the balance$")
	public void open_the_Skinfiri_Lotto_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_balance_multiply_credit_by_and_check_the_balance(int arg1, int arg2) throws Throwable {
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
		Pattern balanceCr=new Pattern("E:/Sikuli Images/SkinfiriLotto/balance_credits.png");
		Pattern wincr=new Pattern("E:/Sikuli Images/SkinfiriLotto/balance1_3.png");

		
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
		  
		  
		 //Clicking on symbol to make the player win
		 screen.click(Win_s_1);
		 Thread.sleep(1000);
		 screen.click(Win_s_2);
		 Thread.sleep(1000);
		 screen.click(Win_s_2);
		 Thread.sleep(2000);
		 screen.click(betvalue_1_3);
		 Thread.sleep(2000);
		 screen.click(spin);
		 Thread.sleep(6000);
		 
		  //comparing the win amount should exists after spin
	      Pattern winA=new Pattern("E:/Sikuli Images/SkinfiriLotto/win_amount.PNG");
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(winA);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Win amount comparision after spin completed successfully. Win amount is 1.50");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 97);
		  Thread.sleep(2000);
		  
		  //clicking on balance button to convert amount into to credits
		  screen.click(wincr);
		  Thread.sleep(2000);
		  
		  //comparing the win amount in credits
	      Pattern balanceA=new Pattern("E:/Sikuli Images/SkinfiriLotto/winamount_credits.PNG");
	      Finder finder3 =new Finder(screen.capture().getImage());
	      String ht3 = finder3.find(balanceA);
	      double score3=20;                
	      System.out.println("the value of ht3"+" "+ht3);
		  if(finder3.hasNext())
		  {
		  Match m3=finder3.next();
		  System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		  score3=(m3.getScore())*100;
		  System.out.println("Win amount in credits comparision successfull.");
		  finder3.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount in credits comparision value equal to: "+" "+score3 +"%");
		  Assert.assertTrue(score3 > 97);
		  Thread.sleep(2000);
		  
		  
		  //Balance in credits 
	      Pattern symbol=new Pattern("E:/Sikuli Images/SkinfiriLotto/balance_credits.PNG");
	      Finder finder4 =new Finder(screen.capture().getImage());
	      String ht4 = finder4.find(symbol);
	      double score4=20;                
	      System.out.println("the value of ht4"+" "+ht4);
		  if(finder4.hasNext())
		  {
		  Match m4=finder4.next();
		  System.out.println("Match Found with: "+(m4.getScore())*100+"%");
		  score4=(m4.getScore())*100;
		  System.out.println("Balance in credits comparision successfull. ");
		  finder4.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance in credits comparision value equal to	: "+" "+score4 +"%");
		  Assert.assertTrue(score4 > 97);
		  
		  //clicking on balance button to convert credits into to amount in currency
		  screen.click(balanceCr);
		  Thread.sleep(2000);
		  
		  //comparing the win amount in currency
	      Pattern winB=new Pattern("E:/Sikuli Images/SkinfiriLotto/win_amount.PNG");
	      Finder finder6 =new Finder(screen.capture().getImage());
	      String ht6 = finder6.find(winB);
	      double score6=20;                
	      System.out.println("the value of ht6"+" "+ht6);
		  if(finder6.hasNext())
		  {
		  Match m6=finder6.next();
		  System.out.println("Match Found with: "+(m6.getScore())*100+"%");
		  score6=(m6.getScore())*100;
		  System.out.println("Win amount in currnecy comparision successfull.");
		  finder6.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount comparision in currency value equal to: "+" "+score6 +"%");
		  Assert.assertTrue(score6 > 95);
		  Thread.sleep(2000);
	}

	@Then("^Balance amound should be same as denomination (\\d+)\\.(\\d+) multiplies by credit in Skinfiri Lotto slot game$")
	public void balance_amound_should_be_same_as_denomination_multiplies_by_credit_in_Skinfiri_Lotto_slot_game(int arg1, int arg2) throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
