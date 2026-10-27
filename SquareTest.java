package lab01;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

    @Test
    public void test() {
        Calculator obj = new Calculator();
        int output = obj.square(5);
        assertEquals(25, output);
    }
}
