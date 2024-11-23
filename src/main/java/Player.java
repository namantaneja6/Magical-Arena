package main.java;

/**
 * Represents a player in the magical arena.
 * Each player has a name, health, strength, and attack attributes.
 */
public class Player {
    private final String name;
    private int health;
    private final int strength;
    private final int attack;

    /**
     * Constructor to initialize a player with given attributes.
     * 
     * @param name     the name of the player, must be non-empty.
     * @param health   initial health of the player, must be a positive integer.
     * @param strength strength of the player, must be a positive integer.
     * @param attack   attack power of the player, must be a positive integer.
     * @throws IllegalArgumentException if any attribute is invalid.
     */
    public Player(String name, int health, int strength, int attack) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must be non-empty.");
        }
        if (health <= 0 || strength <= 0 || attack <= 0) {
            throw new IllegalArgumentException("Attributes must be positive integers.");
        }
        this.name = name.trim();
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    /**
     * Retrieves the name of the player.
     * 
     * @return the player's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the current health of the player.
     * 
     * @return the player's current health.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Retrieves the strength of the player.
     * 
     * @return the player's strength.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Retrieves the attack power of the player.
     * 
     * @return the player's attack power.
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Reduces the player's health by a specified damage amount.
     * 
     * @param damage the amount of health to reduce, must be non-negative.
     */
    public void reduceHealth(int damage) {
        if (damage < 0) {
            throw new IllegalArgumentException("Damage must be non-negative.");
        }
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