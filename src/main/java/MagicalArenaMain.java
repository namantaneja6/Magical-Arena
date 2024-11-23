package main.java;

import java.util.Scanner;

/**
 * The main class to simulate the Magical Arena.
 */
public class MagicalArenaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Welcome to the Magical Arena!");

            // Create Player One
            System.out.println("Enter details for player One:");
            Player playerOne = createPlayer(scanner);

            // Create Player Two
            System.out.println("Enter details for player Two:");
            Player playerTwo = createPlayer(scanner);

            // Start the Match
            Match match = new Match(playerOne, playerTwo);
            match.start();

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /**
     * Creates a player by accepting input from the user.
     * 
     * @param scanner the Scanner to read user input.
     * @return a new Player object.
     */
    private static Player createPlayer(Scanner scanner) {
        System.out.print("Enter player name: ");
        String name = scanner.nextLine().trim();

        int health = getPositiveInt(scanner, "Enter health (positive integer): ");
        int strength = getPositiveInt(scanner, "Enter strength (positive integer): ");
        int attack = getPositiveInt(scanner, "Enter attack (positive integer): ");

        return new Player(name, health, strength, attack);
    }

    /**
     * Validates and retrieves a positive integer from the user.
     * 
     * @param scanner the Scanner to read user input.
     * @param prompt  the prompt to display to the user.
     * @return a positive integer.
     */
    private static int getPositiveInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0) {
                    scanner.nextLine(); // Clear buffer
                    return value;
                }
            }
            scanner.nextLine(); // Clear buffer
            System.out.println("Invalid input. Please enter a positive integer.");
        }
    }
}
