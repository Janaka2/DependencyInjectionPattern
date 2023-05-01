import org.example.MessageService;
import org.example.NotificationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class NotificationServiceTest {
    private MessageService messageService;
    private NotificationService notificationService;

    @BeforeEach
    public void setUp() {
        messageService = mock(MessageService.class);
        notificationService = new NotificationService(messageService);
    }

    @Test
    public void testNotifyUser() {
        String message = "Test message";
        String recipient = "test@example.com";

        notificationService.notifyUser(message, recipient);

        verify(messageService).sendMessage(message, recipient);
    }
}
