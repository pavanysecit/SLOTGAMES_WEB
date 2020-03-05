package stepDefinition_GoldenCrown;

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

public class GoldenCrown_Web_Balance_Deduction_AccordingToBetType2_3 {
WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Crown game, bet type as (\\d+)\\.(\\d+), bet value as TWO, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_game_bet_type_as_bet_value_as_TWO_balance_and_spin_button(int arg1, int arg2) throws Throwable {
		this.driver =  GoldenCrown_Web_URL_Login.getDriver();
	}

	@When("^Open the Golden Crownslot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value as TWO, click on spin button and check the balance$")
	public void open_the_Golden_Crownslot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_as_TWO_click_on_spin_button_and_check_the_balance(int arg1, int arg2) throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(15000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\betValue2_3.PNG";
		Screen screen=new Screen();
		Pattern pat1=new Pattern("E:/Sikuli Images/Bet Values/betValue2_3.png");
		Pattern spin=new Pattern("E:/Sikuli Images/Bet Values/spin.png");
		Pattern pat2=new Pattern("E:/Sikuli Images/Bet Values/creditvalue.png");

		//selecting credit by clicking + icon
		screen.click(pat2);
		Thread.sleep(3000);
		//clicking on Bet VALUE
		screen.click(pat1);
		Thread.sleep(3000);
		//CLICKING ON Spin button
		screen.click(spin);
		Thread.sleep(4000);


	      //comparing the credit value should be 0.02
	      Pattern credit1=new Pattern("E:/Sikuli Images/Bet Values/creditvalue2.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Credit value comparision happened successfully. Test case passed");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Credit comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 97);
		  
		 //comparing the balance after spinning should be deducted by 2 value 
         Pattern pat=new Pattern("E:/Sikuli Images/Bet Values/balance2_3.png");
         Finder finder1 =new Finder(screen.capture().getImage());
         String ht1 = finder1.find(pat);
         double score1=20;                
         System.out.println("the value of ht"+" "+ht1);
         if(finder1.hasNext())
		 {
		 Match m1=finder1.next();
		 System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		 score1=(m1.getScore())*100;
		 System.out.println("Comparision happened successfully. Test case passed");
		 finder1.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failes. Test case failed");         
		 }
		 System.out.println("Comparision value equals to: "+" "+score1 +"%");
		 //Assert.assertEquals(100.0,score );
		 Assert.assertTrue(score1 > 97);
	}

	@Then("^Current Balance should get deducted by TWO as bet type is selected as (\\d+)\\.(\\d+) & bet value as TWO in Golden Crown game$")
	public void current_Balance_should_get_deducted_by_TWO_as_bet_type_is_selected_as_bet_value_as_TWO_in_Golden_Crown_game(int arg1, int arg2) throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
