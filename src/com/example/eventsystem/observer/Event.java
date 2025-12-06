package com.example.eventsystem.observer;

import com.example.eventsystem.decorator.NotificationBuilder;
import java.util.*;

public class Event implements Subject, Cloneable {
    private String name;
    private String description;
    private final List<Observer> observers = new ArrayList<>();

    public Event(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void setName(String n){
        name = n;
        notifyObservers(new NotificationBuilder("El nombre del evento cambió a: " + n));
    }

    public void setDescription(String d){
        description = d;
        notifyObservers(new NotificationBuilder("La descripción del evento cambió: " + d));
    }

    public void addObserver(Observer o){
        if(!observers.contains(o)) observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(NotificationBuilder b){
        observers.forEach(o -> o.update(b.build()));
    }

    public Event clone(){
        return new Event(name, description);
    }

    public String toString(){
        return "Event{name='" + name + "', description='" + description + "'}";
    }
}
