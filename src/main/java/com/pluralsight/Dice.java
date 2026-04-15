package com.pluralsight;

public class Dice {

    public Dice() {

    }

    public int roll(int maxValue, int minValue) {
        return (int) (Math.random() * maxValue) + minValue;
    }
}