package com.company.Lab4.Assignment1;


public class Main {

    public static void main(String[] args) {
        SavingAccounts savingAccounts=new SavingAccounts(200,0.02);
        savingAccounts.withdraw(47);
        savingAccounts.deposit(28);
        savingAccounts.withdraw(47);
        savingAccounts.deposit(28);
        savingAccounts.withdraw(47);
        savingAccounts.withdraw(47);
        savingAccounts.deposit(28);
        savingAccounts.withdraw(47);
        savingAccounts.deposit(28);
        savingAccounts.withdraw(47);
        savingAccounts.withdraw(47);
        savingAccounts.deposit(28);
        savingAccounts.deposit(28);
        savingAccounts.deposit(28);

        savingAccounts.monthlyProces();
        System.out.println(savingAccounts.toString());

    }
}
