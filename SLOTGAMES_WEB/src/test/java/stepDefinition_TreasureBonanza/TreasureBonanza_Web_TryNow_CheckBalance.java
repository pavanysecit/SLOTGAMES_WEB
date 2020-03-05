package stepDefinition_TreasureBonanza;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TreasureBonanza_Web_TryNow_CheckBalance {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, try now button and balance to play$")
	public void chrome_browser_valid_URL_valid_login_details_Treasure_Bonanza_slot_game_try_now_button_and_balance_to_play() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:/New_Selenium/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://demo.ysecit.in:82/slotgames/slotsgame");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Thread.sleep(15000);
	}

	@When("^Open the Treasure Bonanza slot game by entering the valid URL in browser, click on try now button$")
	public void open_the_Treasure_Bonanza_slot_game_by_entering_the_valid_URL_in_browser_click_on_try_now_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/div/div/div[2]/div[3]/ul/li[3]/div[2]/div[2]")).click();
		Screen screen=new Screen();
		Pattern title=new Pattern("E:/Sikuli Images/TreasureBonanza/trybalance.PNG");
		screen.wait(title, 60); 
		
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\Win\\balance_beforeSpin_1_1.PNG";
		 
		  Thread.sleep(3000);
		  //Comparing the amount which is transferring to the slot game
	      Pattern credit1=new Pattern("E:/Sikuli Images/TreasureBonanza/trybalance.PNG");
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(credit1);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("Balance should be 5000 in try now screen and comparision successfull");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Balance should be 5000 in try now screen and comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 95);
	}

	@Then("^System should provide five thousand as balance on click on try now button in Treasure Bonanza slot game$")
	public void system_should_provide_five_thousand_as_balance_on_click_on_try_now_button_in_Treasure_Bonanza_slot_game() throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
