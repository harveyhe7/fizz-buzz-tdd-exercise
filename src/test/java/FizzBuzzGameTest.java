import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGameTest {
    @Test
    void given_number_when_countOff_then_return_itself() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        String result = fizzBuzzGame.countOff(1);
        assertEquals("1", result);
    }
}
