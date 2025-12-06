package com.example.eventsystem.observer;

import com.example.eventsystem.decorator.Notification;

public class User implements Observer {
    private final String username;

    public User(String username){
        this.username = username;
    }

    public void update(Notification n){
        System.out.println("[Notificación para " + username + "] " + n.getMessage());
    }
}
