package be.ehb.examvoorbereiding;

import be.ehb.examvoorbereiding.tests.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    @Test
    void add() {
        assertEquals(9,  Calculator.add(5,4));

    }

    @Test
    void power(){
        assertEquals(9, Calculator.power(3,2));
    }

    @Test
    void minus(){
        assertEquals(-4,Calculator.minus(-2,2));
    }

    @Test
    void deeling() throws Exception {
        assertEquals(4,Calculator.deeling(8,2));
    }

    @Test
    void sqrt(){
        assertEquals(3,Calculator.sqrt(9));
    }
}
