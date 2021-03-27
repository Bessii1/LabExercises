package com.company.Lab5.Assignment2;

public class PersonalLoan extends Loan{

    PersonalLoan(String loanNum, String lastName,
                 double loanAmt, int term, double primeIntRate) {
        super(loanNum, lastName, loanAmt, term);
        super.interestRate = 0.02 / (primeIntRate / 100);
    }
}
