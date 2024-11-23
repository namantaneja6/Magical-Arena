package test.java;

import main.java.Player;
import main.java.Match;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMatch {

    @Test
    public void testMatchCreation() {
        Player playerOne = new Player("John", 100, 50, 30);
        Player playerTwo = new Player("Jane", 80, 40, 35);
        Match match = new Match(playerOne, playerTwo);

        assertNotNull(match);
    }

    @Test
    public void testStartMatch() {
        Player playerOne = new Player("John", 100, 50, 30);
        Player playerTwo = new Player("Jane", 80, 40, 35);
        Match match = new Match(playerOne, playerTwo);

        Player winner = match.start();
        assertTrue(winner.getHealth() > 0);
    }
}