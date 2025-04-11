import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationController {

    private final MessageService messageService;

    @Autowired
    public NotificationController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String msg) {
        messageService.sendMessage(msg);
    }
}