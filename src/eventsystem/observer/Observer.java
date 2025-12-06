package eventsystem.observer;
import eventsystem.decorator.Notification;
public interface Observer {
    void update(Notification notification);
}
