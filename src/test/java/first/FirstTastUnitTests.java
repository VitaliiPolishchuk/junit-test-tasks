package first;

import org.junit.Before;

import first.Main;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstTastUnitTests {

    Main instance;

    @Before
    public void setUp() throws Exception {
        instance = new Main();
    }

    @Test
    public void shouldReturnTrueWhenInputIsValidBinaryNumberMethodIsValidBinaryNumber() {
        boolean result = instance.isValidBinaryNumber("10001");
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenInputIsEmptyStringMethodIsValidBinatyNumber() {
        boolean result = instance.isValidBinaryNumber("");
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenInputGreaterThen32InLengthMethodIsValidBinaryNumber() {
        boolean result = instance.isValidBinaryNumber("10000000000000000000000000000000000000000000000000000");
        assertFalse(result);
    }

    @Test
    public void shoudReturnFalseWhenBinaryStringConsistNotOnlyZerosAndOnesMethodIsValidBinaryNumber() {
        boolean result = instance.isValidBinaryNumber("300002");
        assertFalse(result);
    }

    @Test
    public void shouldReturn8WhenBinaryString1000MethodConvertBinaryToDecimal() {
        int result = instance.convertBinaryToDecimal("1000");
        assertEquals(8, result);
    }
}