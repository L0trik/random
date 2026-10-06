package inlämning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class maintest {

    @Test
    public void testisStop() {
        Logic logic = new Logic();
        String text = "stop";

        assertTrue(logic.isStop(text));
    }
    @Test
    public void testisStop2() {
        Logic logic = new Logic();
        String text = "Hej";

        assertFalse(logic.isStop(text));
    }
    @Test
    public void testwordCount() {
        Logic logic = new Logic();
        String text = "hej på dig";
        int expected = 3;

        assertEquals(3,logic.wordCount(text));
    }
    @Test
    public void testwordCount2() {
        Logic logic = new Logic();
        String text = "hej på dig igen";
        int expected = 4;


        assertEquals(4, logic.wordCount(text));
    }

    @Test
    public void testletterCount() {
        Logic logic = new Logic();
        String text = "hej på dig";
        int expected = 8;

        assertEquals(8, logic.letterCount(text));
    }
    @Test
    public void testletterCount2() {
        Logic logic = new Logic();
        String text = "hej på dig igen";
        int expected = 12;

        assertEquals(12, logic.letterCount(text));
    }
    @Test
    public void testcountLine() {
        Logic logic = new Logic();
        String text = "hej\n jag\n heter\n christoffer";
        int expected = 4;

        assertEquals(4,logic.countLines(text));
    }
}
