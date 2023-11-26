package tdd;

import ClassTask.NumbersShuffling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersShufflingTest {

    @Test
    public void numbersShuffleTest(){
        int[] myNumbers = {42,18,41,22,15,12};
        int[] myNumbers2 = {18,42,22,41,12,15};
        assertArrayEquals(myNumbers2, NumbersShuffling.shufflingNumbers(myNumbers));
    }


}