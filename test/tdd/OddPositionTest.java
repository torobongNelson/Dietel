package tdd;

import PersonalPractice.OddNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class OddPositionTest {


    @Test
    public void testNumbers() {

            int[] myNumbers = {1, 2, 3, 4, 5};
            int[] expected = {1, 3, 3, 5, 5};

            int[] result = OddNumbers.numbers(myNumbers);

            assertArrayEquals(expected, result);
        }
    }


