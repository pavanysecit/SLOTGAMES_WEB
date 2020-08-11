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

public class GoldenCrown_Web_AutoSpin_TenSpins {
	WebDriver driver;
	Screen screen=new Screen();
	
	@Given("^Chrome browser, valid URL, valid login details, Golden Crown  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_Golden_Crown_slot_game_balance_spin_button_auto_spin_button_ten_spins_option_and_number_of_spins_left_message() throws Throwable {
		this.driver =  GoldenCrown_Web_URL_Login.getDriver();
	}

	@When("^Open the Golden Crown  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message$")
	public void open_the_Golden_Crown_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_ten_spin_option_under_auto_spin_drop_down_and_check_the_number_of_spins_left_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		WebElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(3000);
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File sct = driver.findElement(By.xpath("//*[@id='iframeSlotGame']")).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"E:\\Sikuli Images\\autoplay.PNG";
		Pattern autoplay=new Pattern("E:/Sikuli Images/GoldenCrown/autoplay.png");
		Pattern tenspin=new Pattern("E:/Sikuli Images/GoldenCrown/ten.png");
		Pattern pat2=new Pattern("E:/Sikuli Images/GoldenCrown/9spins.png");
		Pattern pat3=new Pattern("E:/Sikuli Images/GoldenCrown/8spins.png");
		Pattern pat4=new Pattern("E:/Sikuli Images/GoldenCrown/7spins.png");
		Pattern pat5=new Pattern("E:/Sikuli Images/GoldenCrown/6spins.png");
		Pattern pat6=new Pattern("E:/Sikuli Images/GoldenCrown/5spins.png");
		Pattern pat7=new Pattern("E:/Sikuli Images/GoldenCrown/4spins.png");
		Pattern pat8=new Pattern("E:/Sikuli Images/GoldenCrown/3spins.png");
		Pattern pat9=new Pattern("E:/Sikuli Images/GoldenCrown/2spins.png");
		Pattern pat10=new Pattern("E:/Sikuli Images/GoldenCrown/1spins.png");
		Pattern pat11=new Pattern("E:/Sikuli Images/GoldenCrown/0spins.png");
		
		//selecting 10 spins by clicking auto spin icon
		screen.wait(autoplay, 30);
		screen.click(autoplay);
		Thread.sleep(2000);
		screen.click(tenspin);
		
	      //comparing the number of 9spins left message
	      screen.wait(pat2,20);
	      Finder finder =new Finder(screen.capture().getImage());
	      String ht = finder.find(pat2);
	      double score=20;                
	      System.out.println("the value of ht"+" "+ht);
		  if(finder.hasNext())
		  {
		  Match m=finder.next();
		  System.out.println("Match Found with: "+(m.getScore())*100+"%");
		  score=(m.getScore())*100;
		  System.out.println("9 Spins left. Test case passed");
		  finder.destroy();  
		  }         
		  else    
		  { 
		  System.out.println("Comparision failed. Test case failed");         
		  }
		  System.out.println("Comparision value equals to: "+" "+score +"%");
		  Assert.assertTrue(score > 90);
		  
		 //comparing the number of 8spins left message

         screen.wait(pat3, 20);
         Finder finder1 =new Finder(screen.capture().getImage());
         String ht1 = finder1.find(pat3);
         double score1=20;                
         System.out.println("the value of ht"+" "+ht1);
         if(finder1.hasNext())
		 {
		 Match m1=finder1.next();
		 System.out.println("Match Found with: "+(m1.getScore())*100+"%");
		 score1=(m1.getScore())*100;
		 System.out.println("8 Spins left. Test case passed");
		 finder1.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Comparision value equals to: "+" "+score1 +"%");
		 //Assert.assertEquals(100.0,score );
		 Assert.assertTrue(score1 > 80);
		 

		//comparing the number of 7spins left message
         screen.wait(pat4, 20);
         Finder finder2 =new Finder(screen.capture().getImage());
         String ht2 = finder2.find(pat4);
         double score2=20;                
         System.out.println("the value of ht"+" "+ht2);
         if(finder2.hasNext())
		 {
		 Match m2=finder2.next();
		 System.out.println("Match Found with: "+(m2.getScore())*100+"%");
		 score2=(m2.getScore())*100;
		 System.out.println("7 Spins left. Test case passed");
		 finder2.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Comparision value equals to: "+" "+score2 +"%");
		 Assert.assertTrue(score2 > 80);
		 

		 //comparing the number of 6spins left message
         screen.wait(pat5, 20);
         Finder finder3 =new Finder(screen.capture().getImage());
         String ht3 = finder3.find(pat5);
         double score3=20;                
         System.out.println("the value of ht"+" "+ht3);
         if(finder3.hasNext())
		 {
		 Match m3=finder3.next();
		 System.out.println("Match Found with: "+(m3.getScore())*100+"%");
		 score3=(m3.getScore())*100;
		 System.out.println("6 Spins left. Test case passed");
		 finder3.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Comparision value equals to: "+" "+score3 +"%");
		 Assert.assertTrue(score3 > 80);
		 

		 //comparing the number of 5spins left message
         screen.wait(pat6, 20);
         Finder finder4 =new Finder(screen.capture().getImage());
         String ht4 = finder4.find(pat6);
         double score4=20;                
         System.out.println("the value of ht"+" "+ht4);
         if(finder4.hasNext())
		 {
		 Match m4=finder4.next();
		 System.out.println("Match Found with: "+(m4.getScore())*100+"%");
		 score4=(m4.getScore())*100;
		 System.out.println("5 Spins left. Test case passed");
		 finder4.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Comparision value equals to: "+" "+score4 +"%");
		 Assert.assertTrue(score4 > 80);
		 

		 //comparing the number of 4spins left message
         screen.wait(pat7, 20);
         Finder finder5 =new Finder(screen.capture().getImage());
         String ht5 = finder5.find(pat7);
         double score5=20;                
         System.out.println("the value of ht"+" "+ht5);
         if(finder5.hasNext())
		 {
		 Match m5=finder5.next();
		 System.out.println("Match Found with: "+(m5.getScore())*100+"%");
		 score5=(m5.getScore())*100;
		 System.out.println("4 Spins left. Test case passed");
		 finder5.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Comparision value equals to: "+" "+score5 +"%");
		 Assert.assertTrue(score5 > 80);
		 

		 //comparing the number of 3spins left message
         screen.wait(pat8, 20);
         Finder finder6 =new Finder(screen.capture().getImage());
         String ht6 = finder6.find(pat8);
         double score6=20;                
         System.out.println("the value of ht"+" "+ht6);
         if(finder6.hasNext())
		 {
		 Match m6=finder6.next();
		 System.out.println("Match Found with: "+(m6.getScore())*100+"%");
		 score6=(m6.getScore())*100;
		 System.out.println("3 Spins left. Test case passed");
		 finder6.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Comparision value equals to: "+" "+score6 +"%");
		 Assert.assertTrue(score6 > 80);
		 

		 //comparing the number of 2spins left message
         screen.wait(pat9, 20);
         Finder finder7 =new Finder(screen.capture().getImage());
         String ht7 = finder7.find(pat9);
         double score7=20;                
         System.out.println("the value of ht"+" "+ht7);
         if(finder7.hasNext())
		 {
		 Match m7=finder7.next();
		 System.out.println("Match Found with: "+(m7.getScore())*100+"%");
		 score7=(m7.getScore())*100;
		 System.out.println("2 Spins left. Test case passed");
		 finder7.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Comparision value equals to: "+" "+score7 +"%");
		 Assert.assertTrue(score7 > 80);
		 

		 //comparing the number of 1spins left message
         screen.wait(pat10, 20);
         Finder finder8 =new Finder(screen.capture().getImage());
         String ht8 = finder8.find(pat10);
         double score8=20;                
         System.out.println("the value of ht"+" "+ht8);
         if(finder8.hasNext())
		 {
		 Match m8=finder8.next();
		 System.out.println("Match Found with: "+(m8.getScore())*100+"%");
		 score8=(m8.getScore())*100;
		 System.out.println("1 Spins left. Test case passed");
		 finder8.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Comparision value equals to: "+" "+score8 +"%");
		 Assert.assertTrue(score8 > 80);

		 //comparing the number of 0 spins left message
         screen.wait(pat11, 20);
         Finder finder9 =new Finder(screen.capture().getImage());
         String ht9 = finder9.find(pat11);
         double score9=20;                
         System.out.println("the value of ht"+" "+ht9);
         if(finder9.hasNext())
		 {
		 Match m9=finder9.next();
		 System.out.println("Match Found with: "+(m9.getScore())*100+"%");
		 score9=(m9.getScore())*100;
		 System.out.println("0 Spins left. Test case passed");
		 finder9.destroy();  
		 }         
		 else    
		 { 
		 System.out.println("Comparision failed. Test case failed");         
		 }
		 System.out.println("Comparision value equals to: "+" "+score9 +"%");
		 Assert.assertTrue(score9 > 80);
	}

	@Then("^Number of spin left should start from (\\d+) to (\\d+) after clicking ten spins option and should perform (\\d+) spins from (\\d+) to (\\d+) in Golden Crown slot game$")
	public void number_of_spin_left_should_start_from_to_after_clicking_ten_spins_option_and_should_perform_spins_from_to_in_Golden_Crown_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
		 Thread.sleep(3000);
		 driver.quit();
	}
}
