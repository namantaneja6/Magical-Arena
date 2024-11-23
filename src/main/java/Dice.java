package main.java;

import java.util.Random;

/**
 * Simulates a standard six-sided dice roll.
 */
public class Dice {
    private static final int SIDES = 6; // Fixed number of sides for a six-sided dice
    private final Random random;

    /**
     * Constructor to initialize the dice.
     */
    public Dice() {
        this.random = new Random();
    }

    /**
     * Rolls the dice to generate a random number.
     * 
     * @return a random integer between 1 and 6.
     */
    public int roll() {
        return random.nextInt(SIDES) + 1; // Generates a random number between 1 and 6.
    }
}