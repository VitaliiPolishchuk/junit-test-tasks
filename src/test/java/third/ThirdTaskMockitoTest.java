package third;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import third.Main;

@RunWith(MockitoJUnitRunner.class)
public class ThirdTaskMockitoTest {

    @InjectMocks
    Main instance = new Main();

    @Mock
    BinaryAlgebraService binaryAlgebraService;


    @Test
    public void shouldReturn3When4MethodGetCountBitSpace() {
        when(binaryAlgebraService.getCountBitSpace(4)).thenReturn(3);

        int result = instance.getCountBitSpace(4);

        assertEquals(3, result);
    }
}