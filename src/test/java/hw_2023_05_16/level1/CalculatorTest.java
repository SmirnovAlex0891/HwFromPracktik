package hw_2023_05_16.level1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculatorTest {
    @Mock
    private Calculator calc;

    @Test
    void addTest() {
        Mockito.when(calc.add(Mockito.anyInt(), Mockito.anyInt())).thenReturn(99);
        int var1 = 5, var2 = 10;
        int expected = calc.add(var1, var2);
        assertEquals(expected, 99);
        Mockito.verify(calc).add(var1, var2);

    }
}