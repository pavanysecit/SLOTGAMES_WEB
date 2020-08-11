package stepDefinition_GoldenCrown;

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

public class GoldenCrown_Web_Credit_Betvalues_Increase_Decrease {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Crown slot game, balance, credit values, bet values and plus & minus icon$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_balance_credit_values_bet_values_and_plus_minus_icon() throws Throwable {
		this.driver =  GoldenCrown_Web_URL_Login.getDriver();
	}

	@When("^Open the Golden Crown slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on plus & minus icon to change the credit values, check values are changed and repeat the same scenarios for bet values$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_plus_minus_icon_to_change_the_credit_values_check_values_are_changed_and_repeat_the_same_scenarios_for_bet_values() throws Throwable {
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
		Pattern spin=new Pattern("E:/Sikuli Images/GoldenCrown/spin.png");
		Pattern credit=new Pattern("E:/Sikuli Images/GoldenCrown/credit.png");	
		Pattern betvalue=new Pattern("E:/Sikuli Images/GoldenCrown/betvalue.png");
		Pattern betvalue_d=new Pattern("E:/Sikuli Images/GoldenCrown/betvalue_d.png");
		Pattern credit_d=new Pattern("E:/Sikuli Images/GoldenCrown/credit_d.png");
		Pattern credit4=new Pattern("E:/Sikuli Images/GoldenCrown/credit4.png");
		Pattern bet4_1=new Pattern("E:/Sikuli Images/GoldenCrown/bet4_1.png");
		Pattern bet4_5=new Pattern("E:/Sikuli Images/GoldenCrown/bet4_5.png");
		Pattern credit1=new Pattern("E:/Sikuli Images/GoldenCrown/credit1.png");
		
		//Increasing the credit value from 0.01 to 0.5 
		screen.wait(spin, 30);
		Thread.sleep(2000);
		screen.click(credit);
		Thread.sleep(1000);
		screen.click(credit);
		Thread.sleep(1000);
		screen.click(credit);
		Thread.sleep(2000);
		
	    //After clicking on plus icon for 4 times on credit section, credit value will be 0.5
        Finder finder1 =new Finder(screen.capture().getImage());
        String ht1 = finder1.find(credit4);
        double score1=20;                
        System.out.println("the value of ht1"+" "+ht1);
	    if(finder1.hasNext())
	    {
	    Match m1=finder1.next();
	    System.out.println("Match Found with: "+(m1.getScore())*100+"%");
	    score1=(m1.getScore())*100;
	    System.out.println("TC1:Credit value got increased on click on + icon and final credit value is 0.5 & comparision completed successfully.");
	    finder1.destroy();  
	    }         
	    else    
	    { 
	    System.out.println("Comparision failed. Test case failed");         
	    }
	    System.out.println("Credit value is increased & comparision value equal to: "+" "+score1 +"%");
	    Assert.assertTrue(score1 > 90);
	    Thread.sleep(2000);
	    
		//Increasing the bet values from 10 to 200 
	    //Checking default value of credit 0.5
        Finder finder2 =new Finder(screen.capture().getImage());
        String ht2 = finder2.find(bet4_1);
        double score2=20;                
        System.out.println("the value of ht"+" "+ht2);
        if(finder2.hasNext())
		{
		Match m2=finder2.next();
		System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		score2=(m2.getScore())*100;
		System.out.println("Default bet value of credit type 0.5 is 10. Test case passed");
		finder2.destroy();  
		}         
		else    
		{ 
		System.out.println("Comparision failed. Test case failed");         
		}
		System.out.println("Test case comparision value equals to: "+" "+score2 +"%");
		Assert.assertTrue(score2 > 90);
		
		// Increase bet value
		screen.click(betvalue);
		Thread.sleep(1000);
		screen.click(betvalue);
		Thread.sleep(1000);
		screen.click(betvalue);
		Thread.sleep(1000);
		screen.click(betvalue);
		Thread.sleep(2000);
		
	    //Checking current bet value after clicking on + icon
        Finder finder3 =new Finder(screen.capture().getImage());
        String ht3 = finder3.find(bet4_5);
        double score3=20;                
        System.out.println("the value of ht3"+" "+ht3);
	    if(finder3.hasNext())
	    {
	    Match m3=finder3.next();
	    System.out.println("Match Found with: "+(m3.getScore())*100+"%");
	    score3=(m3.getScore())*100;
	    System.out.println("Increase bet value from 10 to 200. Current bet value is 200 & comparision completed successfully.");
	    finder3.destroy();  
	    }         
	    else    
	    { 
	    System.out.println("Comparision failed. Test case failed");         
	    }
	    System.out.println("Increase bet value & comparision value equal to: "+" "+score3 +"%");
	    Assert.assertTrue(score3 > 90);
	    Thread.sleep(2000);
	    
		//Decrease bet value
		screen.click(betvalue_d);
		Thread.sleep(1000);
		screen.click(betvalue_d);
		Thread.sleep(1000);
		screen.click(betvalue_d);
		Thread.sleep(1000);
		screen.click(betvalue_d);
		Thread.sleep(2000);
		
	    //Checking current bet value after clicking on - icon
        Finder finder4 =new Finder(screen.capture().getImage());
        String ht4 = finder4.find(bet4_1);
        double score4=20;                
        System.out.println("the value of ht"+" "+ht4);
        if(finder4.hasNext())
        {
        Match m4=finder4.next();
        System.out.println("Match Found with: "+(m4.getScore())*100+"%");
		score4=(m4.getScore())*100;
		System.out.println("Clicked on - icon to decrease the bet value and current bet value is 10.  ");
		finder4.destroy();  
		}         
		else    
		{ 
		System.out.println(" comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score4 +"%");
		Assert.assertTrue(score4 > 90);
		
		//Decrease credit value
		screen.click(credit_d);
		Thread.sleep(1000);
		screen.click(credit_d);
		Thread.sleep(1000);
		screen.click(credit_d);
		Thread.sleep(2000);
		
	    //Checking current credit value after clicking on - icon
        Finder finder5 =new Finder(screen.capture().getImage());
        String ht5 = finder5.find(credit1);
        double score5=20;                
        System.out.println("the value of ht"+" "+ht5);
        if(finder5.hasNext())
        {
        Match m5=finder5.next();
		System.out.println("Match Found with: "+(m5.getScore())*100+"%");
		score5=(m5.getScore())*100;
		System.out.println("Clicked on - icon to decrease the credit value and current credit value is 0.01. ");
		finder5.destroy();  
		}         
		else    
		{ 
		System.out.println(" comparision failed. Test case failed");         
		}
		System.out.println("Comparision value equals to: "+" "+score5 +"%");
		Assert.assertTrue(score5 > 90);
	}

	@Then("^Credit value get changed whenever plus icon is clicked or whenever credit values are increased$")
	public void credit_value_get_changed_whenever_plus_icon_is_clicked_or_whenever_credit_values_are_increased() throws Throwable {
	    Thread.sleep(1000);
	}

	@Then("^Bet value get changed whenever plus icon is clicked or whenever Bet values are increased$")
	public void bet_value_get_changed_whenever_plus_icon_is_clicked_or_whenever_Bet_values_are_increased() throws Throwable {
	    Thread.sleep(1000);
	}

	@Then("^Credit value get changed whenever plus icon is clicked or whenever credit values are decreased$")
	public void credit_value_get_changed_whenever_plus_icon_is_clicked_or_whenever_credit_values_are_decreased() throws Throwable {
	    Thread.sleep(1000);
	}

	@Then("^Bet value get changed whenever plus icon is clicked or whenever Bet values are decreased$")
	public void bet_value_get_changed_whenever_plus_icon_is_clicked_or_whenever_Bet_values_are_decreased() throws Throwable {
	    Thread.sleep(1000);
	    driver.quit();
	}
}
