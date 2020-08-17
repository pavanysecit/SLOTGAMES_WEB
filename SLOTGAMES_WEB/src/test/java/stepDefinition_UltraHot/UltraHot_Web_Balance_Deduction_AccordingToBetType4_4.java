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

public class UltraHot_Web_Balance_Deduction_AccordingToBetType4_4 {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Ultra Hot slot game, bet type as ONE, bet value as fifty, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Ultra_Hot_slot_game_bet_type_as_ONE_bet_value_as_fifty_balance_and_spin_button() throws Throwable {
		this.driver =  UltraHot_Web_URL_Login.getDriver();
	}

	@When("^Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as fifty, click on spin button and check the balance$")
	public void open_the_Ultra_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_ONE_bet_value_as_fifty_click_on_spin_button_and_check_the_balance() throws Throwable {
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
		Pattern credit4=new Pattern("E:/Sikuli Images/UltraHot/credit4.png");
	    Pattern balance4_1=new Pattern("E:/Sikuli Images/UltraHot/balance4_4.png");
		
	    //selecting credit type as 1
		screen.wait(spin, 30);
		screen.click(credit);
		Thread.sleep(1000);
		screen.click(credit);
		Thread.sleep(1000);
		screen.click(credit);
		Thread.sleep(2000);
		
	    //selecting bet value as 50
		screen.click(betvalue);
		Thread.sleep(1000);
		screen.click(betvalue);
		Thread.sleep(1000);
		screen.click(betvalue);
		Thread.sleep(2000);
		
	     //comparing the credit value should be 1  
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit4);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Credit value is 1 & comparision happened successfully. Test case passed");
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
          
		  //comparing the balance after spinning should be deducted by 50 value

	      Finder finder1 =new Finder(screen.capture().getImage());
	      String ht1 = finder1.find(balance4_1);
	      double score1=20;                
	      System.out.println("the value of ht"+" "+ht1);
	 	  if(finder1.hasNext())
	 	  {
	 	  Match m1=finder1.next();
	 	  System.out.println("Match Found with: "+(m1.getScore())*100+"%");
	 	  score1=(m1.getScore())*100;
	 	  System.out.println("After spin, balance is 250.00 & Comparision happened successfully. Test case passed");
	 	  finder1.destroy();  
	 	  }         
	 	  else    
	 	  { 
	 	  System.out.println("Comparision failed. Test case failed");         
	 	  }
	 	  System.out.println("Balance comparision for 250.00 is equals to: "+" "+score1 +"%");
	 	  //Assert.assertEquals(100.0,score );
	 	  Assert.assertTrue(score1 > 93);
	 	}

	@Then("^Balance should get deducted by fifty as bet type is selected as ONE in Ultra Hot game$")
	public void balance_should_get_deducted_by_fifty_as_bet_type_is_selected_as_ONE_in_Ultra_Hot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
