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

public class UltraHot_Web_Balance_Credits_Calculations_Value3 {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Ultra Hot slot game window, balance, credits, denomination drop down and denomination as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Ultra_Hot_slot_game_window_balance_credits_denomination_drop_down_and_denomination_as(int arg1, int arg2) throws Throwable {
		this.driver =  UltraHot_Web_URL_Login.getDriver();
	}

	@When("^Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by (\\d+)\\.(\\d+) and compare the balance$")
	public void open_the_Ultra_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_balance_multiply_credit_by_and_compare_the_balance(int arg1, int arg2) throws Throwable {
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
		Screen screen=new Screen();
		Pattern balance=new Pattern("E:/Sikuli Images/UltraHot/balance.PNG");
		Pattern credit3_CR=new Pattern("E:/Sikuli Images/UltraHot/credit3_CR.png");
		Pattern spin=new Pattern("E:/Sikuli Images/UltraHot/spin.png");
		Pattern credit=new Pattern("E:/Sikuli Images/UltraHot/credit.png");
		Pattern credit3=new Pattern("E:/Sikuli Images/UltraHot/credit3.png");
		
		//selecting credit type as 0.1
		  screen.wait(spin, 30);
		  screen.click(credit);
		  Thread.sleep(1000);
		  screen.click(credit);
		  Thread.sleep(2000);
		  
		  //comparing the balance before converting into credits
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(balance);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Balance before converting into credits is 300 YSI");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance before converting into credits comparision is equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 95);

		  
		  //comparing the credit value
	      Finder finder1 =new Finder(screen.capture().getImage());
	      String ht1 = finder1.find(credit3);
	      double score1=20;                
	      System.out.println("the value of ht1"+" "+ht1);
		  if(finder1.hasNext())
		  {
		  Match m1=finder1.next();
		  System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		  score1=(m1.getScore())*100;
		  System.out.println("Credit value comparision successful. Its 0.1");
		  finder1.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Credit value comparision: "+" "+score1 +"%");
		  Assert.assertTrue(score1 > 94);
		  
		 // Clicking on amount to convert credits into amount
		 screen.click(balance);
		 Thread.sleep(1000);

		 
		 //comparing the balance in credit
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(credit3_CR);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Balance in credits is 3,000.");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance in credits comparision after spin: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 92);
		  Thread.sleep(2000);
		  
		  // Clicking on credit button to convert credits into amount
		  screen.click(credit3_CR);
		  Thread.sleep(1000);
		  
		  //comparing the credits in currency
	      Finder finder4 =new Finder(screen.capture().getImage());
	      String ht4 = finder4.find(balance);
	      double score4=20;                
	      System.out.println("the value of ht4"+" "+ht4);
		  if(finder4.hasNext())
		  {
		  Match m4=finder4.next();
		  System.out.println("Match Found with: "+(m4.getScore())*100+"%");
		  score4=(m4.getScore())*100;
		  System.out.println("Balance after converting credit into currency is 300.00. Test case passed.");
		  finder4.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance in currency comparision: "+" "+score4 +"%");
		  Assert.assertTrue(score4 > 95);
	}

	@Then("^Balance amound should be same as denomination (\\d+)\\.(\\d+) multiplies by credit balance in Ultra Hot slot game$")
	public void balance_amound_should_be_same_as_denomination_multiplies_by_credit_balance_in_Ultra_Hot_slot_game(int arg1, int arg2) throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}
}
