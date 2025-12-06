package eventsystem.decorator;

import java.util.Base64;

public class EncryptDecorator extends NotificationDecorator {
    public EncryptDecorator(Notification i){ super(i); }
    public String getMessage(){
        return "ENC(" + Base64.getEncoder().encodeToString(inner.getMessage().getBytes()) + ")";
    }
}
