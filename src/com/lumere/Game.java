package com.lumere;


public class Game implements Runnable {


    @Override
    public void run() {

    }

    public enum STATE {
        SETTING_UP, IN_PROGRESS, DONE
    }

    private STATE state;
    private Player player1;
    private Player player2;

    public Game() {
        this.setState(STATE.SETTING_UP);
    }


    public void sendMove(Move move) {
        // update local game


        // update remote game
        if (move.getPlayer().isServer()) {

        } else {

        }
    }

    public void receiveMove(Move move) {
        // update local game
        if (move.getPlayer().isServer()) {

        } else {

        }

    }

    public STATE getState() {
        return state;
    }

    public void setState(STATE state) {
        this.state = state;
    }


}
