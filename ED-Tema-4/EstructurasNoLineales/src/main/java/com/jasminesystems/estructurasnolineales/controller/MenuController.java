package com.jasminesystems.estructurasnolineales.controller;

import com.jasminesystems.estructurasnolineales.MainApplication;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;

public class MenuController {

    @FXML
    private void irArboles(ActionEvent event) throws Exception {
        MainApplication.cargarVista("arbol-view.fxml");
    }

    @FXML
    private void irGrafo(ActionEvent event) throws Exception {
        MainApplication.cargarVista("grafo-view.fxml");
    }
}
