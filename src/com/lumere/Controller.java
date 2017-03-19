package com.lumere;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.IntStream;

public class Controller implements Initializable {
    private static int BOARD_SIZE = 8;

    private Game game;

    @FXML
    private GridPane board;

    @FXML
    private TextArea logOutput;

    private BoardCell[][] cells;
    private Logger logger;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        preInitGui();
        initGui();
        startGame();
    }

    private BoardCell getCellAt(int row, int col) {
        return cells[row][col];
    }

    private void preInitGui() {
        this.logger = Logger.getInstance();
        logger.addObserver(new LogOutputViewer(logOutput));
    }

    private void initGui() {
        cells = new BoardCell[BOARD_SIZE][BOARD_SIZE];

        // init board
        IntStream.range(0, BOARD_SIZE).forEachOrdered((int x) -> {
            IntStream.range(0, BOARD_SIZE).forEachOrdered(y -> {
                BoardCell boardCell = new BoardCell();

                board.add(boardCell, x, y);
                cells[y][x] = boardCell;

                boardCell.setOnMouseClicked(event -> {
                    boardCell.setState(BoardCell.CELL_STATE.EMPTY);
                    logger.log("ok");
                });
            });
        });
    }

    private void startGame() {
        game = new Game();

        // Get up game
        // Get player's names

        Player player1 = new Player();
        Player player2 = new Player();


        while (game.getState() == Game.STATE.IN_PROGRESS) {

        }

    }
}