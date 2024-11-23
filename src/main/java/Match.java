package main.java;

/**
 * Represents a match between two players in the magical arena.
 */
public class Match {
    private final Player playerOne;
    private final Player playerTwo;
    private final Dice dice;
    private Player currentAttacker;
    private Player currentDefender;

    /**
     * Constructor to initialize a match with two players.
     * 
     * @param playerOne the first player.
     * @param playerTwo the second player.
     */
    public Match(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.dice = new Dice(); // Fixed six-sided dice.
        // Set the first attacker and defender based on health.
        if (playerOne.getHealth() <= playerTwo.getHealth()) {
            this.currentAttacker = playerOne;
            this.currentDefender = playerTwo;
        } else {
            this.currentAttacker = playerTwo;
            this.currentDefender = playerOne;
        }
    }

    /**
     * Starts the match and continues until one player's health reaches zero.
     * 
     * @return the winner of the match.
     */
    public Player start() {
        System.out.println("Match started between " + playerOne.getName() + " and " + playerTwo.getName());
        System.out.println("------------------------------------------------");
        while (playerOne.getHealth() > 0 && playerTwo.getHealth() > 0) {
            takeTurn();
            swapRoles(); // Swap attacker and defender for the next turn.
        }
        Player winner = playerOne.getHealth() > 0 ? playerOne : playerTwo;
        System.out.println("Winner: " + winner.getName());
        return winner;
    }

    /**
     * Manages a single turn in the match.
     */
    private void takeTurn() {
        int attackRoll = dice.roll();
        int defenseRoll = dice.roll();

        int attackDamage = currentAttacker.getAttack() * attackRoll;
        int defenseValue = currentDefender.getStrength() * defenseRoll;

        int damageDealt = Math.max(0, attackDamage - defenseValue);
        currentDefender.reduceHealth(damageDealt);

        System.out.println(currentAttacker.getName() + " attacks " + currentDefender.getName() + ":");
        System.out.println("Attack Roll: " + attackRoll + " | Attack Damage: " + attackDamage);
        System.out.println("Defense Roll: " + defenseRoll + " | Defense Value: " + defenseValue);
        System.out.println(currentDefender.getName() + " takes " + damageDealt + " damage. Remaining Health: "
                + currentDefender.getHealth());
        System.out.println("------------------------------------------------");
    }

    /**
     * Swaps the roles of attacker and defender for the next turn.
     */
    private void swapRoles() {
        Player temp = currentAttacker;
        currentAttacker = currentDefender;
        currentDefender = temp;
    }
}