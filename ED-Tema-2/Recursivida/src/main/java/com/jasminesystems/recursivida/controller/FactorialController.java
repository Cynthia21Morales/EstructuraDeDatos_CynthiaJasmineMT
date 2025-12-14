package com.jasminesystems.recursivida.controller;

import com.jasminesystems.recursivida.MainApplication;
import com.jasminesystems.recursivida.entity.Factorial;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FactorialController {
    @FXML
    private TextField txtNumero;


    @FXML
    private Label lblResultado;


    @FXML
    private void calcular() {
        int numero = Integer.parseInt(txtNumero.getText());
        int resultado = Factorial.calcularFactorial(numero);
        lblResultado.setText("Resultado: " + resultado);
    }

    @FXML
    private void regresarMenu() throws Exception {
        MainApplication.cargarVista("/com/jasminesystems/recursivida/menu-view.fxml");
    }
}
