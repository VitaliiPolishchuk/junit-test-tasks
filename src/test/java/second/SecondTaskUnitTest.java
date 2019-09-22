package second;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import second.Main;

public class SecondTaskUnitTest {

    Main instance;

    @Before
    public void setUp() throws Exception {
        instance = new Main();
    }

    @Test
    public void shouldReturn4When2And2MethodAddNumbers() {
        int result = instance.addNumbers(2,2);

        assertEquals(4, result);
    }

    @Test
    public void shoudReturnNegative2WhenAddTwoMAXIntegerMethodAddNumbers() {
        int result = instance.addNumbers(Integer.MAX_VALUE, Integer.MAX_VALUE);

        assertEquals(Integer.MAX_VALUE + Integer.MAX_VALUE, result);
    }

    @Test
    public void shouldReturn10WhenNegative10MethodConvertNegativeToPositive() {
        int result = instance.convertNegativeToPositive(-10);

        assertEquals(10, result);
    }
}