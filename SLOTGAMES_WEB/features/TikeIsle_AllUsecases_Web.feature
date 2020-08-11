Feature: Test all the functionalities of Tike Isle Slot Game in Web
   
   

 	Scenario: To check the transferred amount is added to Tike Isle game
    Given Chrome browser, valid URL, valid login details, Tike Isle game, balance, text field to transfer balance and Ok button
    When Open the Tike Isle slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
    Then The exact amount entered in the transfer page should transfer to Tike Isle game and same amount should get displayed on the balance section