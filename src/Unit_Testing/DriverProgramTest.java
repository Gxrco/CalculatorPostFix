package Unit_Testing;

import Controller.Calculator;
import Model.PostfixCalculator;
import Model.Stack;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DriverProgramTest {

    @Test
    void main() {
        String operation = "6 2 3 + *";
        Calculator calc = new Calculator();
        assertEquals(calc.mainOperation(operation), 30);
    }
}