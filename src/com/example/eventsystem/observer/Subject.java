package com.example.eventsystem.observer;
import com.example.eventsystem.decorator.NotificationBuilder;
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(NotificationBuilder builder);
}
