package stepDefinition_TikeIsle;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TikeIsle_Web_TryNow_Check_WinAmount_AddedToBalance {
	WebDriver driver;
	
	@Given("^Chrome browser, valid URL, valid login details, Tike Isle slot game, try now button, balance to play, spin button and win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Tike_Isle_slot_game_try_now_button_balance_to_play_spin_button_and_win_amount() throws Throwable {
		this.driver =  TikeIsle_Web_URL_Login.getDriver();
	}

	@When("^Open the Tike Isle slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win$")
	public void open_the_Tike_Isle_slot_game_by_entering_the_valid_URL_in_browser_click_on_try_now_button_click_on_spin_button_till_player_win_and_check_the_balance_after_win() throws Throwable {
	    
	}

	@Then("^Win amount should get added to the balance when the player wins in try now page of Tike Isle slot game$")
	public void win_amount_should_get_added_to_the_balance_when_the_player_wins_in_try_now_page_of_Tike_Isle_slot_game() throws Throwable {
	    Thread.sleep(3000);
	    driver.quit();
	}
}
