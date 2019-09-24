package fifth;

import fifth.Main;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FifthTaskMockitoTest {

    @InjectMocks
    Main instance = new Main();

    @Mock
    EqualsService equalsService;

    @Test
    public void shouldReturn9WhenNum8Pos0Target1MethodChangeBit() {
        when(equalsService.equals(1, 1)).thenReturn(true);

        int result = instance.changeBit(8,0,1);

        assertEquals(9, result);
    }
}