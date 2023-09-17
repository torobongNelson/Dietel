package tdd;

import Assignments.MathematicalOperators;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathematicalOperatorsTest {
    @Test
    public void testThatIntegerIsEven(){
        //given differernt numbers
      MathematicalOperators calculation = new MathematicalOperators();

      boolean evenNumbers = MathematicalOperators.isEven(6);
      assertTrue( evenNumbers);

   }@Test
    public void testThatIntegerIsPrimeNumber(){

      boolean primeNumbers = MathematicalOperators.isPrimeNumber(6);

      assertTrue(primeNumbers);

    }


}
