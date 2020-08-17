Feature: Test all the functionalities of Ultra Hot Slot Game
   
	
	Scenario: Check whether user able to play the game when there is insufficiant balance in account in Ultra Hot slot game
    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button and validation message
    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message
    Then Player should be blocked from playing the game when there is no balance in the account in Ultra Hot game
	

	Scenario: Check user instruction messages before and after spin in Ultra Hot slot game
    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, balance, spin button and user instruction message
    When Open the Ultra Hot hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
    Then User instruction message 'Please place your bet' should be displayed before spin button is clicked 
	And User instruction message 'Good Luck' should be displayed after spin button is clicked in Ultra Hot slot game

	
	Scenario: Navigate to home screen from Ultra Hot slot game
    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game and home button
    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
    Then System should take the player to Home page after clicking on home button from Ultra Hot game
	
	
	Scenario: Check the functionality of maximize and minimize button in Ultra Hot slot game
    Given Chrome browser, valid URL, valid login details, Ultra Hot slot game, maximize button and minimize button
    When Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Ultra Hot slot game 