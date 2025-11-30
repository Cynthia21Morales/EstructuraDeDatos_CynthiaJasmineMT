package com.jasminesystems.recursividad.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField inputNumber;

    @FXML
    private Label resultLabel;

    public long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    @FXML
    protected void onCalculateClick() {
        try {
            int num = Integer.parseInt(inputNumber.getText());
            long result = factorial(num);
            resultLabel.setText("Factorial: " + result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Ingresa un número válido.");
        }
    }
}
