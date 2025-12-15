package com.jasminesystems.metodosordenamiento.controller;

import com.jasminesystems.metodosordenamiento.entity.Burbuja;
import com.jasminesystems.metodosordenamiento.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BurbujaController {
    @FXML
    private TextField txtDatos;
    @FXML
    private Label lblResultado;

    @FXML
    private void ordenar(ActionEvent event) {
        try {
            String[] parts = txtDatos.getText().split(",");
            int[] array = new int[parts.length];
            for (int i = 0; i < parts.length; i++) array[i] = Integer.parseInt(parts[i].trim());

            Burbuja b = new Burbuja();
            array = b.ordenar(array);

            StringBuilder res = new StringBuilder();
            for (int n : array) res.append(n).append(" ");
            lblResultado.setText("Resultado: " + res.toString());
        } catch (Exception e) {
            lblResultado.setText("Error: ingresar números separados por comas");
        }
    }

    @FXML
    private void regresar(ActionEvent event) throws Exception {
        MainApplication.cargarVista("menu-view.fxml");
    }
}
