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

public class UltraHot_Web_AutoSpin_AutoSpinOption {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button, auto spin button, auto spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_Ultra_Hot_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_number_of_spins_left_message() throws Throwable {
		this.driver =  UltraHot_Web_URL_Login.getDriver();
	}

	@When("^Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message$")
	public void open_the_Ultra_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_the_player_instruction_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(2000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\AutoSpins.PNG";
		Pattern play=new Pattern("E:/Sikuli Images/UltraHot/autoplay.png");
		Pattern spin=new Pattern("E:/Sikuli Images/UltraHot/spin.png");
		Pattern pat1=new Pattern("E:/Sikuli Images/UltraHot/autospin.png");
		Pattern auto=new Pattern("E:/Sikuli Images/UltraHot/auto.png");
		
		//selecting auto spins by clicking auto spin icon
		screen.wait(spin, 30);
		screen.click(play);
		Thread.sleep(2000);
		screen.click(auto);
		Thread.sleep(2000);

		  //auto infinity image comparision
		  Finder finder =new Finder(screen.capture().getImage());
		  screen.wait(pat1, 20);
		  String ht = finder.find(pat1);
		  double score=20;                
		  System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Infiity image is displayed after clicking on auto button. Test case passed");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 80);
		  
		 Thread.sleep(6000);
		 
		 Finder finder1 =new Finder(screen.capture().getImage());
		 String ht1 = finder1.find(pat1);
		 double score1=20;                
		 System.out.println("the value of ht"+" "+ht1);
		 if(finder1.hasNext())
		 {
		 Match m1=finder1.next();
		 System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		 score1=(m1.getScore())*100;
		 System.out.println("Infinity image should be shown continuously till balance get over. Test case passed");
		 finder1.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failes. Test case failed");         
		 }
		 System.out.println("Infinity image is shown=ing & Comparision value equals to: "+" "+score1 +"%");
		 //Assert.assertEquals(100.0,score );
		 Assert.assertTrue(score1 > 80);
		
	}

	@Then("^System should keep performing the spins in Ultra Hot slot game$")
	public void system_should_keep_performing_the_spins_in_Ultra_Hot_slot_game() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
