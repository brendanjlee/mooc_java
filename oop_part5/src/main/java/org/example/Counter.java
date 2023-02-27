package org.example;

public class Counter {
    private int value;

    public Counter() {
        this(0);
    }

    public Counter(int startValue) {
        this.value = startValue;
    }

    public int getValue() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int increaseBy) {
        this.value += increaseBy;
    }

    public void decrease() {
        this.value--;
    }

    public void decrease(int decreaseBy) {
        this.value -= decreaseBy;
    }
}
