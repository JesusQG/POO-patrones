package com.example.eventsystem.decorator;
public abstract class NotificationDecorator implements Notification {
    protected final Notification inner;
    public NotificationDecorator(Notification i){ inner = i; }
    public String getMessage(){ return inner.getMessage(); }
}
