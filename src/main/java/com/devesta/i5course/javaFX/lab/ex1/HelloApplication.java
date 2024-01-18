package com.devesta.i5course.javaFX.lab.ex1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    TemperatureController controller;
    @Override
    public void start(Stage stage)  {
        FlowPane pane = new FlowPane();
        pane.setOrientation(Orientation.VERTICAL);
        pane.setVgap(10);
        pane.setPadding(new Insets(10,10,10,10));
        controller = new TemperatureController();

        TextField textField = new TextField();
        textField.setPrefWidth(100);

        Button toFahrenheit = new Button("Convect to Fahrenheit");
        Button toCelsius = new Button("Convect to Celsius");
        Text result = new Text();
        pane.getChildren().addAll(textField,toFahrenheit,toCelsius,result);

        toFahrenheit.setOnMouseClicked(mouseEvent -> {
            try {
                String input = textField.getText();
                float enteredNumber = Float.parseFloat(input);
                float fahrenheit = controller.toFahrenheit(enteredNumber);
                result.setText("result : " + fahrenheit);
            } catch (Exception e) {
                result.setText("invalid input");
            }
        });

        toCelsius.setOnMouseClicked(mouseEvent -> {
            try {
                result.setText("result : " + controller
                        .toCelsius
                                (Float.parseFloat
                                        (textField.getText())));
            } catch (Exception e) {
                result.setText("invalid input");
            }
        });


        Scene scene = new Scene(pane,320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}