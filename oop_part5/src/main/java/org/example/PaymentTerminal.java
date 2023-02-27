package org.example;

public class PaymentTerminal {
    // cash reserve
    private double money;
    // number sold
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this(10);
    }

    public PaymentTerminal(int money) {
        this.money = money;
    }

    public double eatAffordably(double payment) {
        if (payment < 2.5) return payment;
        this.affordableMeals++;
        this.money += 2.5;
        return (payment - 2.5);
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() < 2.5) return false;
        card.takeMoney(2.5);
        return true;
    }

    public double eatHeartily(double payment) {
        if (payment < 4.3) return payment;
        this.heartyMeals++;
        this.money += 4.3;
        return (payment - 4.3);
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() < 4.5) return false;
        card.takeMoney(4.5);
        return true;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
