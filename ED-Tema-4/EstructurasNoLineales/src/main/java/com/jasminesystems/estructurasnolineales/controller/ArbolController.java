package com.jasminesystems.estructurasnolineales.controller;

import com.jasminesystems.estructurasnolineales.MainApplication;
import com.jasminesystems.estructurasnolineales.entity.ArbolBinario;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class ArbolController {

    private ArbolBinario arbol = new ArbolBinario();

    @FXML private TextField txtDato;
    @FXML private Label lblResultado;

    @FXML
    private void insertar(ActionEvent event) {
        int valor = Integer.parseInt(txtDato.getText());
        arbol.insertar(valor);
        lblResultado.setText("Insertado: " + valor);
        txtDato.clear();
    }

    @FXML
    private void mostrar(ActionEvent event) {
        lblResultado.setText("InOrden: " + arbol.inOrden());
    }

    @FXML
    private void regresar(ActionEvent event) throws Exception {
        MainApplication.cargarVista("menu-view.fxml");
    }
}
