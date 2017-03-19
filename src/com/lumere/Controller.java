package com.lumere;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.IntStream;

public class Controller implements Initializable {
    private static int BOARD_SIZE = 8;

    @FXML
    private GridPane board;

    private BoardCell[][] cells;


    private BoardCell getCellAt(int row, int col) {
        return cells[row][col];
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cells = new BoardCell[BOARD_SIZE][BOARD_SIZE];

        // init board
        IntStream.range(0, BOARD_SIZE).forEachOrdered((int x) -> {
            IntStream.range(0, BOARD_SIZE).forEachOrdered(y -> {
                BoardCell boardCell = new BoardCell();
                GridPane.setVgrow(boardCell, Priority.ALWAYS);
                GridPane.setHgrow(boardCell, Priority.ALWAYS);

                board.add(boardCell, x, y);
                cells[y][x] = boardCell;

                boardCell.setOnMouseClicked((MouseEvent event) -> {
                    boardCell.setState(BoardCell.STATE.BLACK);
                });
            });
        });
    }
}