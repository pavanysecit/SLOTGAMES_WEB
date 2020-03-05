Feature: Test all the functionalities of Soccer Mania Slot Game
   
  	
	Scenario: Check whether gamble No Goal 2x amount is getting added to the main balance
    Given Chrome browser, valid URL, valid login details, godlen hot slot game, bet type, denomination, balance, spin button, win amount, gamble button and no goal button in gamble page
    When Open the Soccer Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Soccer Mania slot game, select bet type & denomination, click on spin button till player wins, click on gamble button and click on No goal button in gamble page
    Then Win amount multipled by 2x should get added to the main balance after clicking on No Goal button and after player wins in gamble in Soccer Mania game