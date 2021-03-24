package com.company.Lab4.Assignment1;

public class SavingAccounts extends BankAccount {
    private boolean status;

    public SavingAccounts(double balance, double interestRate) {
        super(balance, interestRate);
    }

    public boolean statusSpecified() {
        if (super.getBalance() < 25) {
            status = false;
        } else {
            status = true;

        }
        return status;
    }

    @Override
    public void withdraw(double amount) {
        if (statusSpecified()) {
            super.withdraw(amount);
            System.out.println("Your withdraw was sucesefull");
        } else {
            System.out.println("Your withdraw canot be procedet because your balance is under 25");
        }
    }

    @Override
    public void deposit(double deposit) {
        super.deposit(deposit);
        System.out.println("Your deposit was sucesefull");
        statusSpecified();
    }

    public void monthlyProces() {
        if (super.getNumberOfWithdraws() > 4) {
            int var = super.getNumberOfWithdraws() - 4;
            monthlyServiceCharges +=var;
            super.addBalance(-var);
            statusSpecified();
        }
    }

    @Override
    public String toString() {
        return super.toString()+"SavingAccounts{" +
                "status=" + status +
                '}';
    }
}
