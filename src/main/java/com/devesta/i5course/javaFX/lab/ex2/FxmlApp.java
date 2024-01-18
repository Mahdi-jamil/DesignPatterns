package com.devesta.i5course.javaFX.lab.ex2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class FxmlApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent loader = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("test.fxml")));
            Scene scene = new Scene(loader);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Your Title");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
