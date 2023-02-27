package org.example;

public class Timer {
    private ClockHand seconds;
    private ClockHand subseconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.subseconds = new ClockHand(100);
    }

    public void advance() {
        this.subseconds.advance();

        if (this.subseconds.getValue() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.subseconds;
    }
}
