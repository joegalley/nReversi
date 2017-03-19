package com.lumere;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @FXML
    public TilePane board;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)  {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("window.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("nReversi");
        stage.setScene(new Scene(root));
        stage.setResizable(false);



        stage.show();

        int x = 2;
    }

    private void initGui() {
    }

    private void initEventListeners() {

    }

}
