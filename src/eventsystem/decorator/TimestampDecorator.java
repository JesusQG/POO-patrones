package eventsystem.decorator;

import java.time.Instant;

public class TimestampDecorator extends NotificationDecorator {
    public TimestampDecorator(Notification i){ super(i); }
    public String getMessage(){ return "[" + Instant.now() + "] " + inner.getMessage(); }
}
