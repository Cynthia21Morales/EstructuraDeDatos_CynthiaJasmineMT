package com.jasminesystems.estructuraslineales1.controller;

import com.jasminesystems.estructuraslineales1.MainApplication;
import com.jasminesystems.estructuraslineales1.entity.Lista;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ListaController {

    private Lista lista = new Lista();

    @FXML
    private TextField txtDato;

    @FXML
    private Label lblResultado;

    @FXML
    private void agregar() {
        lista.agregar(txtDato.getText());
        lblResultado.setText("Lista: " + lista.mostrar());
        txtDato.clear();
    }

    @FXML
    private void eliminar() {
        lista.eliminar();
        lblResultado.setText("Lista: " + lista.mostrar());
    }

    @FXML
    private void regresarMenu() throws Exception {
        MainApplication.cargarVista("menu-view.fxml");
    }
}
