# Task 2

Create a bank account management system where each account has its own number, owner
and balance.

It must have:

- Account, includes:
    - account number
    - owner's name
    - balance
- Accounts, inherited from the account, includes:
    - savings
    - credit
- Main is the class that will be the account management system.

Implement methods:

- `deposit(amount)` - method for adding funds to the account. Accepts one argument -
  the deposit amount.
- `withdraw(amount)` - method for withdrawing funds from an account. Accepts one
  argument - the withdrawal amount.

For a savings account:

- `addInterest()` - method for adding interest to the balance. Calculates the interest
  rate from the current balance and adds the amount received to the balance.

For a credit account:

- `calculateInterest()` - method for calculating interest on a loan. Must calculate
  the interest rate from the current balance and deduct the amount received from
  the balance. If the balance is negative, then interest is accrued on the negative
  balance.
