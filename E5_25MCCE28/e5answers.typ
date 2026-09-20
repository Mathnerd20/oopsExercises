#set page(
  paper: "a4",
  margin: (x: 1.8cm, y: 1.5cm),
)
#set text(
  size: 13pt,
  font: "New Computer Modern"
)
#show title: set text(size: 20pt)
#show title: set align(center)
*Name*: Akshay Galipalli \
*Roll no*: 25MCCE28
#title[
  OOPS Assignment 5 \
]

1. Try out all the code demonstrated in the lectures.
#image("one.png")
2. We have discussed the following example as part of lecture on Generalization. Write a java program to implement the respective classes and have the inheritance among these classes.(4 points)
a. In your test class demonstrate attributes of Employee being displayed by an object of PermanentEmployee \
b. Override the display method in the subclasses. (1 point) \
c. Epf is 25% of the salary. Implement calculateEPF for PermanentEmployee. (1 point) \
d. Use Super for creating the constructors. (1 point) \
e. Put daily wages for the TemporayEmployee and calculate his salary for the month of August 2026. (1 point) \
#image("two.png")
#pagebreak()
3. You already have designed a BankAccount class as part of Exercise 3 – Question 7 (6 points)
a. Have proper credit() withdraw() and displayBalance() methods. \
b. Have a method to transfer some amount to a different BankAccount. (1 point) \
Create classes SavingsAccount and CheckingAccount as subclasses of BankAccount. \
c. Have interestRate as an attribute in SavingsAccount. \
d. alculate the interest and add it to the balance of the account (1 point) \
e. Checking account charges transaction fees. \
f. Have some number of free transactions (e.g. 3) for the checking account as an attribute.
This number should be a constant. (1 point)\
g. Update the credit() withdraw() methods of CheckingAccount accordingly. Take
advantage of the credit() and withdraw() implementations of the BankAccount. (2
points)
Hint: use super \
h. Have a method to deduct fees in CheckingAccount. (1 point) \
i. In your test class demonstrate respective features to get the relevant points
#image("three.png", width: 80%)
#image("thee.png")
