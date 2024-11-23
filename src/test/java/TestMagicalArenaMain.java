package test.java;

import main.java.MagicalArenaMain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TestMagicalArenaMain {

    @Test
    public void testMain() {
        // Simulate user input
        String input = "John\n100\n50\n30\nJane\n80\n40\n35\n";
        InputStream systemInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Run the main method
        try {
            MagicalArenaMain.main(new String[] {});
        } catch (Exception e) {
            fail("Exception should not have been thrown");
        } finally {
            System.setIn(systemInBackup); // Restore original System.in
        }
    }
}