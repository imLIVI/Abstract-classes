# Bank accounts
## Description
Often, when designing programs, it is convenient for us to rely on concepts that are not represented in the real world, but serve as a convenient "support" for combining several classes.

For example, there is no abstract concept of "Account" in banking. Each bank account has a clear purpose: savings, credit, settlement. But the banking program works with operations common to accounts as with the same objects, and executes them by referring to the general type "Account", although it is impossible to explicitly instantiate it in the program.

## The functionality of the program
1. Created several classes — different accounts based on a common interface:
  * Savings account
  * Credit account
  * Payment account
2. Made a transfer from one account to another.
