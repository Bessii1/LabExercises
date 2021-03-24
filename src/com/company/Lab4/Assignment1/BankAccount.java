package com.company.Lab4.Assignment1;

public abstract class BankAccount {

    private double balance;
    private int numberOfDepostitsInMonth;
    private int numberOfWithdraws;
    private double interestRate;
    protected int monthlyServiceCharges;


    public BankAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double addBalance(double amount) {
        return balance += amount;
    }

    public int getNumberOfWithdraws() {
        return numberOfWithdraws;
    }

    public void deposit(double deposit) {
        balance += deposit;
        numberOfDepostitsInMonth++;
    }

    public void withdraw(double amount) {
        balance -= amount;
        numberOfWithdraws++;
    }

    public double calcInterest() {
        double monthlyInterestRate = interestRate / 12;
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
        return balance;
    }

    public void monthlyProces() {
        balance -= monthlyServiceCharges;
        calcInterest();
        numberOfWithdraws = 0;
        numberOfDepostitsInMonth = 0;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", numberOfDepostitsInMonth=" + numberOfDepostitsInMonth +
                ", numberOfWithdraws=" + numberOfWithdraws +
                ", interestRate=" + interestRate +
                ", monthlyServiceCharges=" + monthlyServiceCharges +
                '}';
    }
}
