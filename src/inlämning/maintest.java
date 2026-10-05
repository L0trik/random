package inlämning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class maintest {

    @Test
    public void testisStop() {
        inlämning.Logic logic = new inlämning.Logic();
        String text = "stop";

        assertTrue(logic.isStop(text));
    }
    @Test
    public void testisStop2() {
        inlämning.Logic logic = new inlämning.Logic();
        String text = "Hej";

        assertFalse(logic.isStop(text));
    }
    @Test
    public void testwordCount() {
        inlämning.Logic logic = new inlämning.Logic();
        String text = "hej på dig";

        assertTrue(logic.wordCount(text) == 3);
    }
    @Test
    public void testwordCount2() {
        inlämning.Logic logic = new inlämning.Logic();
        String text = "hej på dig igen";

        assertFalse(logic.wordCount(text) == 3);
    }

    @Test
    public void testletterCount() {
        inlämning.Logic logic = new inlämning.Logic();
        String text = "hej på dig";

        assertTrue(logic.letterCount(text) == 8);
    }
    @Test
    public void testletterCount2() {
        inlämning.Logic logic = new inlämning.Logic();
        String text = "hej på dig igen";

        assertFalse(logic.letterCount(text) == 8);
    }
}
