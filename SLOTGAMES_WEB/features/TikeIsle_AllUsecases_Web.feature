Feature: Test all the functionalities of Tike Isle Slot Game in Web

	

		Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Tike Isle slot game
    Given Chrome browser, valid URL, valid login details, Tike Isle slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
    When Open the Tike Isle slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Tike Isle slot game