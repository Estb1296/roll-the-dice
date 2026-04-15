package com.pluralsight;

public class Dice {
    private int maxValue;
    private int minValue;
    private static int randomNumber;


    public Dice() {
    this.maxValue=6;
    this.minValue=1;
    randomNumber=0;

    }

    public static int roll(int maxValue, int minValue) {
        randomNumber= (int) (Math.random() * maxValue) + minValue;
        return randomNumber;
    }
    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }
    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }



}