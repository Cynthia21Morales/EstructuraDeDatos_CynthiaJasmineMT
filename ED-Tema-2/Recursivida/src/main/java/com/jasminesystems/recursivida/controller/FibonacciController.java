package com.jasminesystems.recursivida.controller;

import com.jasminesystems.recursivida.MainApplication;
import com.jasminesystems.recursivida.entity.Fibonacci;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FibonacciController {

    @FXML
    private TextField txtNumero;

    @FXML
    private Label lblResultado;

    @FXML
    private void calcular() {
        int numero = Integer.parseInt(txtNumero.getText());
        int resultado = Fibonacci.calcularFibonacci(numero);
        lblResultado.setText("Resultado: " + resultado);
    }

    @FXML
    private void regresarMenu() throws Exception {
        MainApplication.cargarVista("/com/jasminesystems/recursivida/menu-view.fxml");
    }
}
