Feature: Test all the functionalities of Skinfiri Jungle Slot Game
   
	
		Scenario: Checking whether suit win amount is getting added to balance if it is win else it should not get added in Skinfiri Jungle slot game 
    Given Chrome browser, valid URL, valid login details, Skinfiri Jungle slot game, balance, spin button, win amount, gamble button, card to click for suit win and suit win amount
    When Open the Skinfiri Jungle slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and click on suit win card in gamble page
    Then Suit Win amount(4x) should get added to the main balance after win else it should not get added to main balance in the Skinfiri Jungle slot game