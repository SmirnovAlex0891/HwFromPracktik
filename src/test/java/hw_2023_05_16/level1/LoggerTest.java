package hw_2023_05_16.level1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LoggerTest {
    @Mock
    private Logger logger;
    @Test
    void logTest() {
        String message = "Hello from test";
        logger.log(message);
        Mockito.verify(logger, Mockito.atLeastOnce()).log(message);
    }
}