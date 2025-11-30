package com.jasminesystems.fibonaccirecursiva;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField inputNumber;

    @FXML
    private Label resultLabel;

    @FXML
    private void calculateFibonacci() {
        try {
            int n = Integer.parseInt(inputNumber.getText());
            if (n < 0) {
                resultLabel.setText("Ingrese un número no negativo");
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    sb.append(fibonacci(i)).append(" ");
                }
                resultLabel.setText("Serie Fibonacci: " + sb.toString());
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Ingrese un número válido");
        }
    }

    // Método recursivo
    private int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
