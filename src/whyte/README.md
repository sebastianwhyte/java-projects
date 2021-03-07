# Java Bank Application

A simple bank application made with Java. The program has a login screen, which then loads to the main menu, which includes the options of viewing your balance, depositing money, withdrawing money, and exiting the application.


## Login

The user will have to make an account in order to have access to the application. If the username and password match (characters are case sensitive), then the user is granted access. If they don't match, then the user is denied access. 

Below is an example, in which I make a username (my name) and a password (name of my cat):

<img width="700" alt="Screen Shot 2021-03-06 at 11 25 33 PM" src="https://user-images.githubusercontent.com/62267311/110228964-81741600-7ed3-11eb-8718-13c8373fd9c6.png">

<img width="700" alt="Screen Shot 2021-03-06 at 11 26 10 PM" src="https://user-images.githubusercontent.com/62267311/110229021-1a0a9600-7ed4-11eb-95ac-2fed347e3b81.png">


## Main Menu

After given access, the user will be shown the main menu. They are given 4 options: View Balance, Deposit, Withdraw, and Quit.

<img width="700" alt="Screen Shot 2021-03-06 at 11 34 30 PM" src="https://user-images.githubusercontent.com/62267311/110229053-85546800-7ed4-11eb-8765-fe45df9db535.png">


## View Balance

This option will show the user the current balance in their account. If they deposit money, then it will be added to the current balance and this will reflect that. The same will happen if the user withdraws money.

<img width="700" alt="Screen Shot 2021-03-06 at 11 43 15 PM" src="https://user-images.githubusercontent.com/62267311/110229217-bf723980-7ed5-11eb-960f-e07b1456c7db.png">


## Deposit

The Deposit option will allow the user to deposit money into their account. If the user tries to enter a negative number, the program will reject that amount and prompts the user to enter a valid amount.. If the user tries to enter "$0", then the program will tell the user that they didn't deposit anything. 

Finally, if the user enters a positve number that is greater than zero, the program will add that deposit amount to their account balance.

With each unsuccessful entry, the program will continue to prompt the user and ask for input.

<img width="700" alt="Screen Shot 2021-03-07 at 12 02 35 AM" src="https://user-images.githubusercontent.com/62267311/110229564-753e8780-7ed8-11eb-96a7-b49ba2bcdb80.png">


## Withdraw

Withdraw will allow the user to take money out of their account. If the user tries to enter "$0", then the program will alert the user that they haven't withdrawn anything. Additionally, if the user attempts to enter a negative number, then they will be told that that is an invalid option. If the user tries to withdraw more money than they have in the account, the program will tell them that they do not have enough funds. 

Once the user enters a positive number that is within their account balance, that amount of money will be taken out of their account. 

With each unsuccessful entry, the program will continue to prompt the user and ask for input.

<img width="700" alt="Screen Shot 2021-03-07 at 12 23 55 AM" src="https://user-images.githubusercontent.com/62267311/110229984-6dccad80-7edb-11eb-9722-bd11bb690466.png">


## Quit

Selecting this option will exit the program.

<img width="700" alt="Screen Shot 2021-03-07 at 12 32 21 AM" src="https://user-images.githubusercontent.com/62267311/110230102-9dc88080-7edc-11eb-9249-62f51792b00a.png">

