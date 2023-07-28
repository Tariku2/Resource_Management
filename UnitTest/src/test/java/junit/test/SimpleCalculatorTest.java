package junit.test;

import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
@Test
    void twoPlusTwoResultFour(){
    var simplcalc= new SimpleCalculator();
    Assertions.assertEquals(6,simplcalc.add(2,4));



}

}