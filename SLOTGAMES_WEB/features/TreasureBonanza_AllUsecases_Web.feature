Feature: Test all the functionalities of Treasure Bonanza Slot Game
   
	
	
		Scenario: Check whether win amount getting added to the balance when wild symbold appears in Treasure Bonanza game
    Given Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, bet type, denomination, balance, wild symbols, ring symbols, spin button, win amount and collect button
    When Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till wild symbols appears on the screen, check win amount and click on collect button
    Then Win amount occurs when wild symbols appears should get added to the balance after clicking collect button in Treasure Bonanza game