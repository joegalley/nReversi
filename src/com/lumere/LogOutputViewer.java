package com.lumere;


import javafx.scene.control.TextArea;

import java.util.Observable;
import java.util.Observer;

public class LogOutputViewer implements Observer {
    private TextArea textArea;

    public LogOutputViewer(TextArea textArea) {
        this.textArea = textArea;
        this.textArea.setEditable(false);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.textArea.appendText((String) arg);
    }
}
