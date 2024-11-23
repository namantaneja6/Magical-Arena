package test.java;

import main.java.Dice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDice {

    @Test
    public void testRoll() {
        Dice dice = new Dice();
        int result = dice.roll();
        assertTrue(result >= 1 && result <= 6, "Dice roll should return a value between 1 and 6");
    }
}