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

public class GoldenCrown_Web_AutoSpin_AutoSpinOption {
WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Crown slot game, balance, spin button, auto spin button, auto spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_number_of_spins_left_message() throws Throwable {
		this.driver =  GoldenCrown_Web_URL_Login.getDriver();
	}

	@When("^Open the Golden Crown slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_the_player_instruction_message() throws Throwable {
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(15000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\AutoSpins.PNG";
		Screen screen=new Screen();
		Pattern autospin=new Pattern("E:/Sikuli Images/others/autospin.png");
		Pattern spin=new Pattern("E:/Sikuli Images/others/auto.png");
		Pattern pat2=new Pattern("E:/Sikuli Images/others/goodluck.png");

		//selecting credit by clicking + icon
		screen.click(autospin);
		Thread.sleep(2000);
		screen.click(spin);
		Thread.sleep(1000);

	      //comparing the credit value should be 0.5
	      Pattern credit1=new Pattern("E:/Sikuli Images/others/goodluck.png");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Good Luck message is displayed after clicking on auto button. Test case passed");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 97);
		  
		 
         Pattern pat=new Pattern("E:/Sikuli Images/others/goodluck.png");
         Finder finder1 =new Finder(screen.capture().getImage());
         String ht1 = finder1.find(pat);
         double score1=20;                
         System.out.println("the value of ht"+" "+ht1);
         if(finder1.hasNext())
		 {
		 Match m1=finder1.next();
		 System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		 score1=(m1.getScore())*100;
		 System.out.println("Good Luck message is displayed after clicking on auto button. Test case passed");
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

	@Then("^System should keep performing the spins in Golden Crown slot game$")
	public void system_should_keep_performing_the_spins_in_Golden_Crown_slot_game() throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}