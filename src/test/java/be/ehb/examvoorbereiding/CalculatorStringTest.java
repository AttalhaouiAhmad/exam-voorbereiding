package be.ehb.examvoorbereiding;

import be.ehb.examvoorbereiding.tests.CalculatorString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorStringTest {

    CalculatorString calculatorString;
    @BeforeEach
    void setUp(){
        calculatorString = new CalculatorString("cedric");
    }

    @Test
    void add(){
        double getal1 = 12;
        double getal2 = -3;

        double result = calculatorString.Ahmad(getal1,getal2);
        assertEquals(9,result);
    }
}
