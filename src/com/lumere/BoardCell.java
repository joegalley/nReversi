package com.lumere;


import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BoardCell extends StackPane {

    private CELL_STATE currentState;


    public enum CELL_STATE {
        EMPTY,
        WHITE,
        BLACK,
        POTENTIAL_MOVE
    }

    public BoardCell() {
        super();
        GridPane.setVgrow(this, Priority.ALWAYS);
        GridPane.setHgrow(this, Priority.ALWAYS);
        this.currentState = CELL_STATE.EMPTY;
    }

    public void setState(CELL_STATE newState) {
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

    public CELL_STATE getCurrentState() {
        return currentState;
    }

    public void setCurrentState(CELL_STATE currentState) {
        this.currentState = currentState;
    }
}
