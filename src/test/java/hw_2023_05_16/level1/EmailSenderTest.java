package hw_2023_05_16.level1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EmailSenderTest {
    @Mock
    private EmailSender sender;

    @Test
    void sendEmailTest() {
        String recipient = "Bob@gmail.com";
        String message = "Hello Bob!";
        sender.sendEmail(recipient, message);
        Mockito.verify(sender).sendEmail(recipient, message);
    }
}