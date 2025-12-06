package eventsystem.decorator;

public class ImportantTagDecorator extends NotificationDecorator {
    public ImportantTagDecorator(Notification i){ super(i); }
    public String getMessage(){ return "[IMPORTANT] " + inner.getMessage(); }
}
