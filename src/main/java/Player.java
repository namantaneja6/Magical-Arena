package main.java;

/**
 * Represents a player in the magical arena.
 * Each player has health, strength, and attack attributes.
 */
public class Player {
    private int health;
    private final int strength;
    private final int attack;

    /**
     * Constructor to initialize a player with given attributes.
     * 
     * @param health   initial health of the player, must be a positive integer.
     * @param strength strength of the player, must be a positive integer.
     * @param attack   attack power of the player, must be a positive integer.
     * @throws IllegalArgumentException if any attribute is not positive.
     */
    public Player(int health, int strength, int attack) {
        if (health <= 0 || strength <= 0 || attack <= 0) {
            throw new IllegalArgumentException("Attributes must be positive integers.");
        }
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    /**
     * Reduces the player's health by a specified damage amount.
     * 
     * @param damage the amount of health to reduce.
     */
    public void reduceHealth(int damage) {
        this.health = Math.max(0, this.health - damage); // Ensure health doesn't drop below zero.
    }

    /**
     * Checks if the player is still alive.
     * 
     * @return true if the player's health is greater than zero, false otherwise.
     */
    public boolean isAlive() {
        return this.health > 0;
    }
}