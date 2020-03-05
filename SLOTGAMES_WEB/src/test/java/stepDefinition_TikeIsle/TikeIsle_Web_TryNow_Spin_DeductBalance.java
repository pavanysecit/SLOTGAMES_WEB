package stepDefinition_TikeIsle;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TikeIsle_Web_TryNow_Spin_DeductBalance {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Tike Isle slot game, try now button, balance to play and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Tike_Isle_slot_game_try_now_button_balance_to_play_and_spin_button() throws Throwable {
		this.driver =  TikeIsle_Web_URL_Login.getDriver();
	}

	@When("^Open the Tike Isle slot game by entering the valid URL in browser, click on try now button and click on spin button$")
	public void open_the_Tike_Isle_slot_game_by_entering_the_valid_URL_in_browser_click_on_try_now_button_and_click_on_spin_button() throws Throwable {
	    
	}

	@Then("^Amount should get deducted from balance on click on spin button in try now page of Tike Isleslot game$")
	public void amount_should_get_deducted_from_balance_on_click_on_spin_button_in_try_now_page_of_Tike_Isleslot_game() throws Throwable {
	    Thread.sleep(3000);
	    driver.quit();
	}
}
