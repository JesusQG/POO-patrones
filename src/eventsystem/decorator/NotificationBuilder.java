package eventsystem.decorator;
public class NotificationBuilder {
    private final String base;
    public NotificationBuilder(String b){ base = b; }
    public Notification build(){ return new BasicNotification(base); }
}
