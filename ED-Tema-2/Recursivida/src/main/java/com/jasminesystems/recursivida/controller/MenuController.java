package com.jasminesystems.recursivida.controller;

import com.jasminesystems.recursivida.MainApplication;
import javafx.fxml.FXML;

public class MenuController {

    @FXML
    private void irFactorial() throws Exception {
        MainApplication.cargarVista(
                "/com/jasminesystems/recursivida/factorial-view.fxml"
        );
    }

    @FXML
    private void irFibonacci() throws Exception {
        MainApplication.cargarVista(
                "/com/jasminesystems/recursivida/fibonacci-view.fxml"
        );
    }

    @FXML
    private void irSuma() throws Exception {
        MainApplication.cargarVista(
                "/com/jasminesystems/recursivida/suma-view.fxml"
        );
    }
}
