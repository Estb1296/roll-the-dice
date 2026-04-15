package com.pluralsight;


public class DiceRollApp {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        //int roll = dice.roll(6, 1);
        dice1.setRandomNumber(Dice.roll(6,1));
        System.out.println(dice1.getRandomNumber());
        dice2.setRandomNumber(Dice.roll(6,1));
        System.out.println(dice2.getRandomNumber());
        //int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;
//        for (int i = 0; i < 100; i++) {
//
//            int sum = roll1 + roll2;
//
//            System.out.println("Roll " + i + ": " + " " + roll1 + " - " + roll2 + " Sum: " + sum);
//            if (sum == 2) {
//                //twoCounter++;
//            }
//            if (sum == 4) {
//                //fourCounter++;
//            }
//            if (sum == 6) {
//                //sixCounter++;
//            }
//            if (sum == 7) {
//                //sevenCounter++;
//            }
//        }
//        System.out.println("This is the two-counter: " + twoCounter);
//        System.out.println("This is the four-counter: " + fourCounter);
//        System.out.println("This is the six-counter: " + sixCounter);
//        System.out.println("This is the seventh-counter" + sevenCounter);

    }
}
