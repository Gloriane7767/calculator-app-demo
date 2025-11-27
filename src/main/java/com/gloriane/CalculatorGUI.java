package com.gloriane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorGUI extends Application {
    private TextField display;
    private double num1 = 0, num2 = 0, result = 0;
    private String operator = "";
    private boolean operatorPressed = false;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        // Display
        display = new TextField("0");
        display.setEditable(false);
        display.setStyle("-fx-font-size: 20px; -fx-alignment: center-right;");
        display.setPrefHeight(50);

        // Button grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(5);
        grid.setVgap(5);

        String[][] buttonLayout = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"0", "C", "=", "+"}
        };

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                Button button = new Button(buttonLayout[row][col]);
                button.setPrefSize(60, 60);
                button.setStyle("-fx-font-size: 16px;");

                button.setOnAction(e -> handleButtonClick(button.getText()));
                grid.add(button, col, row);
            }
        }

        VBox root = new VBox(10, display, grid);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 280, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick(String command) {
        if (command.matches("[0-9]")) {
            if (operatorPressed) {
                display.setText(command);
                operatorPressed = false;
            } else {
                display.setText(display.getText().equals("0") ? command : display.getText() + command);
            }
        } else if (command.equals("C")) {
            display.setText("0");
            num1 = num2 = result = 0;
            operator = "";
        } else if (command.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(display.getText());
            operator = command;
            operatorPressed = true;
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/":
                    if (num2 != 0) result = num1 / num2;
                    else { display.setText("Error"); return; }
                    break;
            }
            display.setText(String.valueOf(result));
            operatorPressed = true;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}