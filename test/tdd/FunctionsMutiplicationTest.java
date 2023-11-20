package tdd;

import Assignments.FunctionsInMultiplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionsMutiplicationTest {
    @Test
    public void TestThatNumbersCanBeMultiplied() {
        int result =  FunctionsInMultiplication.multiplyNumbers(4, 5);
        assertEquals(20, result);


    }
}



