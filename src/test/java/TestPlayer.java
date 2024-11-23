package test.java;

import main.java.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPlayer {

    @Test
    public void testPlayerCreation() {
        Player player = new Player("John", 100, 50, 30);
        assertEquals("John", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(50, player.getStrength());
        assertEquals(30, player.getAttack());
    }

    @Test
    public void testReduceHealth() {
        Player player = new Player("John", 100, 50, 30);
        player.reduceHealth(20);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        Player player = new Player("John", 100, 50, 30);
        assertTrue(player.isAlive());
        player.reduceHealth(100);
        assertFalse(player.isAlive());
    }

    @Test
    public void testInvalidHealth() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Player("John", -10, 50, 30);
        });
        assertEquals("Attributes must be positive integers.", exception.getMessage());
    }

    @Test
    public void testInvalidName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Player("", 100, 50, 30);
        });
        assertEquals("Name must be non-empty.", exception.getMessage());
    }
}