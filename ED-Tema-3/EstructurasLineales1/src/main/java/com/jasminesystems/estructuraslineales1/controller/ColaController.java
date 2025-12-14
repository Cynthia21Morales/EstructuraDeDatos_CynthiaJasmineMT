package com.jasminesystems.estructuraslineales1.controller;

import com.jasminesystems.estructuraslineales1.MainApplication;
import com.jasminesystems.estructuraslineales1.entity.Cola;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ColaController {

    private Cola cola = new Cola();

    @FXML
    private TextField txtDato;

    @FXML
    private Label lblResultado;

    @FXML
    private void encolar() {
        cola.encolar(txtDato.getText());
        lblResultado.setText("Cola: " + cola.mostrar());
        txtDato.clear();
    }

    @FXML
    private void desencolar() {
        lblResultado.setText("Elemento: " + cola.desencolar());
    }

    @FXML
    private void regresarMenu() throws Exception {
        MainApplication.cargarVista("menu-view.fxml");
    }
}
