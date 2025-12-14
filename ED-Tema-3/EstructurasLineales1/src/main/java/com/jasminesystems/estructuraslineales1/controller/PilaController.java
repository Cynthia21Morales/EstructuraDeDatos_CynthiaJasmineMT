package com.jasminesystems.estructuraslineales1.controller;

import com.jasminesystems.estructuraslineales1.MainApplication;
import com.jasminesystems.estructuraslineales1.entity.Pila;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PilaController {

    private Pila pila = new Pila();

    @FXML
    private TextField txtDato;

    @FXML
    private Label lblResultado;

    @FXML
    private void apilar() {
        pila.push(txtDato.getText());
        lblResultado.setText("Pila: " + pila.mostrar());
        txtDato.clear();
    }

    @FXML
    private void desapilar() {
        lblResultado.setText("Elemento: " + pila.pop());
    }

    @FXML
    private void regresarMenu() throws Exception {
        MainApplication.cargarVista("menu-view.fxml");
    }
}
