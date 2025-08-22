import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGameTest {
    @Test
    void given_number_when_countOff_then_return_itself() {
        // Given normal number
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        // When countOff is called with 1
        String result = fizzBuzzGame.countOff(1);
        // Then it should return "1"
        assertEquals("1", result);
    }

    @Test
    void given_multiply_of_3_when_countOff_then_return_Fizz() {
        // Given a number that is a multiple of 3
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        // When countOff is called with 3
        String result = fizzBuzzGame.countOff(3);
        // Then it should return "Fizz"
        assertEquals("Fizz", result);
    }
    @Test
    void given_multiply_of_5_when_countOff_then_return_Buzz() {
        // Given a number that is a multiple of 5
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        // When countOff is called with 5
        String result = fizzBuzzGame.countOff(5);
        // Then it should return "Buzz"
        assertEquals("Buzz", result);
    }
}
