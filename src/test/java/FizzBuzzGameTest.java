import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGameTest {
    @Test
    void given_number_when_countOff_then_return_itself() {
        // Given normal number
        String result = getReturnResult(1);
        // When countOff
        // Then it should return "1"
        assertEquals("1", result);
    }

    @Test
    void given_multiply_of_3_when_countOff_then_return_Fizz() {
        // Given
        String result = getReturnResult(3);
        // When countOff
        // Then it should return "Fizz"
        assertEquals("Fizz", result);
    }

    @Test
    void given_multiply_of_5_when_countOff_then_return_Buzz() {
        // Given
        String result = getReturnResult(5);
        // When countOff
        // Then it should return "Buzz"
        assertEquals("Buzz", result);
    }

    @Test
    void given_multiply_of_3_and_5_when_countOff_then_return_FizzBuzz() {
        // Given
        String result = getReturnResult(15);
        // When countOff
        // Then it should return "FizzBuzz"
        assertEquals("FizzBuzz", result);
    }

    private String getReturnResult(int i) {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        return fizzBuzzGame.countOff(i);
    }
}
