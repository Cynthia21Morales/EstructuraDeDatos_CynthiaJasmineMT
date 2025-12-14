package com.jasminesystems.estructuraslineales1.controller;

import com.jasminesystems.estructuraslineales1.MainApplication;
import javafx.fxml.FXML;

public class MenuController {

    @FXML
    private void irPila() throws Exception {
        MainApplication.cargarVista("pila-view.fxml");
    }

    @FXML
    private void irCola() throws Exception {
        MainApplication.cargarVista("cola-view.fxml");
    }

    @FXML
    private void irLista() throws Exception {
        MainApplication.cargarVista("lista-view.fxml");
    }
}
