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

public class UltraHot_Web_Balance_Deduction_AccordingToBetType3_5 {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as (\\d+)\\.(\\d+) from drop down, bet value as TEN, balance, spin button and balance after spin$")
	public void chrome_browser_valid_URL_valid_login_details_Ultra_Hot_slot_game_bet_type_as_from_drop_down_bet_value_as_TEN_balance_spin_button_and_balance_after_spin(int arg1, int arg2) throws Throwable {
		this.driver =  UltraHot_Web_URL_Login.getDriver();
	}

	@When("^Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as TEN from bet type drop down, click on spin button and check the balance after spin$")
	public void open_the_Ultra_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_TEN_from_bet_type_drop_down_click_on_spin_button_and_check_the_balance_after_spin() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(5000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\firstBetvalue.PNG";
		Pattern betvalue=new Pattern("E:/Sikuli Images/UltraHot/betvalue.png");
		Pattern spin=new Pattern("E:/Sikuli Images/UltraHot/spin.png");
		Pattern credit=new Pattern("E:/Sikuli Images/UltraHot/credit.png");
		Pattern credit1=new Pattern("E:/Sikuli Images/UltraHot/credit3.png");
	    Pattern balance3_1=new Pattern("E:/Sikuli Images/UltraHot/balance3_4.png");
		
	    //selecting credit type as 0.1
		screen.wait(spin, 30);
		screen.click(credit);
		Thread.sleep(1000);
		screen.click(credit);
		Thread.sleep(2000);
		
		//selecting bet value as 10
		screen.click(betvalue);
		Thread.sleep(1000);
		screen.click(betvalue);
		Thread.sleep(1000);
		screen.click(betvalue);
		Thread.sleep(1000);
		screen.click(betvalue);
		Thread.sleep(2000);
		
	     //comparing the credit value should be 0.1  
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Credit value is 0.1 & comparision happened successfully. Test case passed");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Credit comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 95); 
		  
          //CLICKING ON Spin button
          screen.click(spin);
          Thread.sleep(5000);
          
		  //comparing the balance after spinning should be deducted by 10 value

	      Finder finder1 =new Finder(screen.capture().getImage());
	      String ht1 = finder1.find(balance3_1);
	      double score1=20;                
	      System.out.println("the value of ht"+" "+ht1);
	 	  if(finder1.hasNext())
	 	  {
	 	  Match m1=finder1.next();
	 	  System.out.println("Match Found with: "+(m1.getScore())*100+"%");
	 	  score1=(m1.getScore())*100;
	 	  System.out.println("After spin, balance is 290.00 & Comparision happened successfully. Test case passed");
	 	  finder1.destroy();  
	 	  }         
	 	  else    
	 	  { 
	 	  System.out.println("Comparision failed. Test case failed");         
	 	  }
	 	  System.out.println("Balance comparision for 290.00 is equals to: "+" "+score1 +"%");
	 	  //Assert.assertEquals(100.0,score );
	 	  Assert.assertTrue(score1 > 93);
	 	}

	@Then("^Balance should get deducted by TEN if bet type is selected as (\\d+)\\.(\\d+) & bet value as TEN in Ultra Hot slot game$")
	public void balance_should_get_deducted_by_TEN_if_bet_type_is_selected_as_bet_value_as_TEN_in_Ultra_Hot_slot_game(int arg1, int arg2) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
