package com.jasminesystems.metodosordenamiento.controller;

import com.jasminesystems.metodosordenamiento.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuController {

    @FXML
    private void irBurbuja(ActionEvent event) throws Exception {
        MainApplication.cargarVista("burbuja-view.fxml");
    }

    @FXML
    private void irQuickSort(ActionEvent event) throws Exception {
        MainApplication.cargarVista("quicksort-view.fxml");
    }

    @FXML
    private void irShellSort(ActionEvent event) throws Exception {
        MainApplication.cargarVista("shellsort-view.fxml");
    }

    @FXML
    private void irRadix(ActionEvent event) throws Exception {
        MainApplication.cargarVista("radix-view.fxml");
    }

    @FXML
    private void irIntercalacion(ActionEvent event) throws Exception {
        MainApplication.cargarVista("intercalacion-view.fxml");
    }

    @FXML
    private void irMezclaDirecta(ActionEvent event) throws Exception {
        MainApplication.cargarVista("mezcladirecta-view.fxml");
    }

    @FXML
    private void irMezclaNatural(ActionEvent event) throws Exception {
        MainApplication.cargarVista("mezclanatural-view.fxml");
    }

}
