package com.example.eventsystem.observer;
import com.example.eventsystem.decorator.Notification;
public interface Observer {
    void update(Notification notification);
}
