package com.lumere;


import java.util.Observable;

public class Logger extends Observable {
    private static Logger ourInstance = new Logger();

    public static Logger getInstance() {
        return ourInstance;
    }

    private Logger() {
    }

    public void log(){

    }
}
