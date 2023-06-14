package hw_2023_05_16.level2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PaymentGatewayTest {

    @Mock
    PaymentService paymentService;

    @Test
    void processPaymentTest() {
        Mockito.when(paymentService.processPayment(Mockito.anyDouble())).thenReturn(true);
        boolean expected = paymentService.processPayment(Mockito.anyDouble());
        assertEquals(expected, true);
        Mockito.verify(paymentService).processPayment(Mockito.anyDouble());
    }
}