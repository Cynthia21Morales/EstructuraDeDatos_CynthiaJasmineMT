package com.jasminesystems.factorialrecursivo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField inputNumber;

    @FXML
    private Label resultLabel;

    @FXML
    private void calculateFactorial() {
        try {
            int n = Integer.parseInt(inputNumber.getText());
            if (n < 0) {
                resultLabel.setText("Ingrese un número no negativo");
            } else {
                long result = factorial(n);
                resultLabel.setText("Factorial: " + result);
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Ingrese un número válido");
        }
    }

    // Método recursivo
    private long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
