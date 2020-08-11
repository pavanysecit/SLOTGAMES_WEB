package stepDefinition_TikeIsle;

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

public class TikeIsle_Web_Check_BetType_BetValue_DropDown3 {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Tike Isle slot game, bet type as (\\d+)\\.(\\d+) from down (\\d+) and bet value as (\\d+),(\\d+),(\\d+),(\\d+),(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Tike_Isle_slot_game_bet_type_as_from_down_and_bet_value_as(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Throwable {
		this.driver =  TikeIsle_Web_URL_Login.getDriver();
	}

	@When("^Open the Tike Isle slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+) from down  and check the bet value should be (\\d+),(\\d+),(\\d+),(\\d+),(\\d+)$")
	public void open_the_Tike_Isle_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_from_down_and_check_the_bet_value_should_be(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput"))); 
		WebElement balT = driver.findElement(By.id("transferInput"));
		  balT.clear();
		  Thread.sleep(1000);
		  balT.sendKeys("300");
		  Thread.sleep(2000);
		  driver.findElement(By.className("Transfer_Ok_but")).click();
		  Thread.sleep(2000);
		  
		  Pattern spin=new Pattern("E:/Sikuli Images/Tiki Isle/spin.png");
		  Pattern betvalues3=new Pattern("E:/Sikuli Images/Tiki Isle/betvalues3.png");
		  Pattern creditvalue=new Pattern("E:/Sikuli Images/Tiki Isle/creditvalue.png");
		  Pattern creditvalue3=new Pattern("E:/Sikuli Images/Tiki Isle/creditvalue3.png");
		  Pattern creditvalue3_1=new Pattern("E:/Sikuli Images/Tiki Isle/creditvalue3_1.png");
		  screen.wait(spin, 30);
		  
		  screen.click(creditvalue);
	      Thread.sleep(2000);
		  screen.click(creditvalue3);
	      Thread.sleep(2000);
	      
		  //comparing the credit value should be 0.1
	      Pattern credit1=new Pattern("E:/Sikuli Images/Tiki Isle/creditvalue3_1.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Credit value comparision happened successfully and value is 0.1. Test case passed");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Credit comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 95);
	   
		  //clicking on 1 bet value link to open the bet values
		  screen.click(betvalues3);
		  Thread.sleep(2000);
		  
		 //comparing the available denomination values
		 Pattern pat=new Pattern("E:/Sikuli Images/Tiki Isle/betvalues_3.PNG");
	     Finder finder1 =new Finder(screen.capture().getImage());
	     String ht1 = finder1.find(pat);
	     double score1=20;                
	     System.out.println("the value of ht"+" "+ht1);
	     if(finder1.hasNext())
		 {
		 Match m1=finder1.next();
		 System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		 score1=(m1.getScore())*100;
		 System.out.println("Comparision happened successfully. Available denominations are: 2,4,10,20 & 40. Test case passed");
		 finder1.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failes. Test case failed");         
		 }
		 System.out.println("Comparision value equals to: "+" "+score1 +"%");
		 Assert.assertTrue(score1 > 95);
	}

	@Then("^Bet value should get changed to (\\d+),(\\d+),(\\d+),(\\d+),(\\d+) if the bet type selected as (\\d+)\\.(\\d+) from the drop down two in Tike Isle slot game$")
	public void bet_value_should_get_changed_to_if_the_bet_type_selected_as_from_the_drop_down_two_in_Tike_Isle_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}