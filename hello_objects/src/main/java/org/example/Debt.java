package org.example;

public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double balance, double rate) {
        this.balance = balance;
        this.interestRate = rate;
    }

    public void waitOneYear() {
        this.balance = this.balance + (this.balance * (this.interestRate / 100));
    }

    public void printBalance() {
        System.out.println("Balance: " + this.balance);
    }
}
