package eventsystem.decorator;
public class BasicNotification implements Notification {
    private final String msg;
    public BasicNotification(String m){ msg = m; }
    public String getMessage(){ return msg; }
}
