package stepDefinition_TikeIsle;

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

public class TikeIsle_Web_Balance_Check_WinAmount_AddedToBalance {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, godlen hot slot game, balance, transfer button, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_godlen_hot_slot_game_balance_transfer_button_spin_button_and_win_amount() throws Throwable {
		this.driver =  TikeIsle_Web_URL_Login.getDriver();
	}

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_amount_click_on_spin_button_till_user_win_and_check_the_balance_after_win() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(2000);
		balT.sendKeys("300");
		Thread.sleep(5000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(15000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		Screen screen=new Screen();
		Pattern spin=new Pattern("E:/Sikuli Images/Tiki Isle/spin.png");
		Pattern collect=new Pattern("E:/Sikuli Images/Tiki Isle/collect.png");
		Pattern scatter=new Pattern("E:/Sikuli Images/Tiki Isle/scatter.png");
		Pattern jsyb=new Pattern("E:/Sikuli Images/Tiki Isle/j.png");
		
		//comparing the credit value should be 0.02
	      Pattern credit1=new Pattern("E:/Sikuli Images/Tiki Isle/creditvalue1.png");
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
		  Assert.assertTrue(score > 95);
		  
		  //comparing the balance before spin
	      Pattern balance=new Pattern("E:/Sikuli Images/Tiki Isle/balance_before_win.PNG");
	      Finder finder1 =new Finder(screen.capture().getImage());
	      String ht1 = finder1.find(balance);
	      double score1=20;                
	      System.out.println("the value of ht1"+" "+ht1);
		  if(finder1.hasNext())
		  {
		  Match m1=finder1.next();
		  System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		  score1=(m1.getScore())*100;
		  System.out.println("Balance comparision before spin completed successfully.");
		  finder1.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance comparision before spin: "+" "+score1 +"%");
		  Assert.assertTrue(score1 > 95);
		  
		 //Clicking on orange symbol
		 screen.click(scatter);
		 Thread.sleep(1000);
		 screen.click(jsyb);
		 Thread.sleep(1000);
		 screen.click(jsyb);
		 Thread.sleep(1000);

		 //Clicking on Spin button
		 screen.click(spin);
		 Thread.sleep(5000);
		 
		 //comparing the win amount should exists after spin
	      Pattern winA=new Pattern("E:/Sikuli Images/Tiki Isle/win_1_1.PNG");
	      Finder finder2 =new Finder(screen.capture().getImage());
	      String ht2 = finder2.find(winA);
	      double score2=20;                
	      System.out.println("the value of ht2"+" "+ht2);
		  if(finder2.hasNext())
		  {
		  Match m2=finder2.next();
		  System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		  score2=(m2.getScore())*100;
		  System.out.println("Win amount comparision after spin completed successfully.");
		  finder2.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Win amount comparision after spin: "+" "+score2 +"%");
		  Assert.assertTrue(score2 > 95);
		  Thread.sleep(2000);
		  
		  //clicking on collect button
		  screen.click(collect);
		  Thread.sleep(2000);
		  
		  //comparing the balance amount after spin
	      Pattern balanceA=new Pattern("E:/Sikuli Images/Tiki Isle/Balance_After_win_1_1.PNG");
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
		  Assert.assertTrue(score3 > 95);
	}

	@Then("^Win amount should get added to the balance after win and balance should get increased with win amount$")
	public void win_amount_should_get_added_to_the_balance_after_win_and_balance_should_get_increased_with_win_amount() throws Throwable {
	    Thread.sleep(3000);
	    driver.quit();
	}
}
