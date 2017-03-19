package com.lumere;

import java.util.Stack;

public class Player {
    private enum PLAYER_COLOR {
        BLACK, WHITE
    }

    private boolean isServer;
    private PLAYER_COLOR playerColor;
    private int score;
    Stack<Move> moveHistory;


    public boolean isServer() {
        return isServer;
    }

    public void setServer(boolean server) {
        isServer = server;
    }

    public PLAYER_COLOR getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(PLAYER_COLOR playerColor) {
        this.playerColor = playerColor;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Stack<Move> getMoveHistory() {
        return moveHistory;
    }

    public void setMoveHistory(Stack<Move> moveHistory) {
        this.moveHistory = moveHistory;
    }
}
