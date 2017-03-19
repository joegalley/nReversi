package com.lumere;

import static com.lumere.BoardCell.CELL_STATE;

public class Move extends Action {
    private Player player;
    private BoardCell xCell;
    private BoardCell yCell;
    private CELL_STATE fromState;
    private CELL_STATE toState;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public BoardCell getxCell() {
        return xCell;
    }

    public void setxCell(BoardCell xCell) {
        this.xCell = xCell;
    }

    public BoardCell getyCell() {
        return yCell;
    }

    public void setyCell(BoardCell yCell) {
        this.yCell = yCell;
    }

    public CELL_STATE getFromState() {
        return fromState;
    }

    public void setFromState(CELL_STATE fromState) {
        this.fromState = fromState;
    }

    public CELL_STATE getToState() {
        return toState;
    }

    public void setToState(CELL_STATE toState) {
        this.toState = toState;
    }
}
