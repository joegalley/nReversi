package com.lumere;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Logger extends Observable {

    private List<Observer> observers = new ArrayList<Observer>();

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void log(String message) {
        this.notifyObservers(message);
    }

    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(this, message + "\n"));
    }
}
