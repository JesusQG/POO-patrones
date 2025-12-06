package eventsystem.observer;
import eventsystem.decorator.NotificationBuilder;
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(NotificationBuilder builder);
}
