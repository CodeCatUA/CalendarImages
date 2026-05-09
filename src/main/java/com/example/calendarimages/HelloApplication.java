package com.example.calendarimages;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMinWidth(500);
        stage.setMinHeight(350);
        stage.setMaxWidth(1000);
        stage.setMaxHeight(800);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}