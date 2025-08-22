import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BracketTest {
    @Test
    void TestCase1(){
        String brackets = "{{)(}}";
        assertFalse(getReturnResult(brackets));
    }

    @Test
    void TestCase2(){
        String brackets = "({)}";
        assertFalse(getReturnResult(brackets));
    }

    @Test
    void TestCase3(){
        String brackets = "[({})]";
        assertTrue(getReturnResult(brackets));
    }

    @Test
    void TestCase4(){
        String brackets = "{}([])";
        assertTrue(getReturnResult(brackets));
    }

    @Test
    void TestCase5(){
        String brackets = "{()}[[{}]]";
        assertTrue(getReturnResult(brackets));
    }
    boolean getReturnResult(String brackets) {
        BracketsSolve bracketsSolve = new BracketsSolve();
        return bracketsSolve.isValid(brackets);
    }
}
