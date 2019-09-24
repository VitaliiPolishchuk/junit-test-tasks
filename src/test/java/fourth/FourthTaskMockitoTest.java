package fourth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import fourth.Main;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FourthTaskMockitoTest {
    @InjectMocks
    Main instance = new Main();

    @Mock
    MathService mathService;

    @Test
    public void shouldReturn3When6And9MethodGCD() {
        when(mathService.mod(6,9)).thenReturn(3);
        when(mathService.mod(9,3)).thenReturn(0);

        int result = instance.gcd(6,9);

        assertEquals(3, result);

    }
}