package com.lumere;


import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BoardCell extends StackPane {

    private STATE currentState;


    public enum STATE {
        EMPTY,
        WHITE,
        BLACK,
        POTENTIAL_MOVE
    }

    public BoardCell() {
        super();
        this.currentState = STATE.EMPTY;
    }

    public void setState(STATE newState) {
        this.setManaged(false);

        Circle circle = new Circle(this.getWidth() / 2, this.getHeight() / 2, this.getHeight() / 2);

        switch (this.getCurrentState()) {
            case EMPTY:
                break;
            case WHITE:
                circle.setFill(Color.WHITE);
                break;
            case BLACK:
                circle.setFill(Color.BLACK);
                break;
            case POTENTIAL_MOVE:
                break;
        }

        switch (newState) {
            case EMPTY:
                break;
            case WHITE:
                circle.setFill(Color.WHITE);
                break;
            case BLACK:
                circle.setFill(Color.BLACK);
                break;
            case POTENTIAL_MOVE:
                break;
        }

        this.getChildren().add(circle);
    }

    public STATE getCurrentState() {
        return currentState;
    }

    public void setCurrentState(STATE currentState) {
        this.currentState = currentState;
    }
}
