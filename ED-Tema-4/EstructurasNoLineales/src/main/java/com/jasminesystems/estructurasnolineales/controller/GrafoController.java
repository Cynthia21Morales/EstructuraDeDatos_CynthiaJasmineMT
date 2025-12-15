package com.jasminesystems.estructurasnolineales.controller;

import com.jasminesystems.estructurasnolineales.MainApplication;
import com.jasminesystems.estructurasnolineales.entity.Grafo;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class GrafoController {

    private Grafo grafo = new Grafo();

    @FXML private TextField txtV1; // Primer vértice
    @FXML private TextField txtV2; // Segundo vértice
    @FXML private Label lblResultado;

    @FXML
    private void agregarVertice(ActionEvent event) {
        String vertice = txtV1.getText();
        grafo.agregarVertice(vertice);
        lblResultado.setText("Vértice agregado: " + vertice);
        txtV1.clear();
    }

    @FXML
    private void agregarArista(ActionEvent event) {
        String v1 = txtV1.getText();
        String v2 = txtV2.getText();
        if (v1.isEmpty() || v2.isEmpty()) {
            lblResultado.setText("Debe ingresar ambos vértices");
            return;
        }
        grafo.agregarVertice(v1);
        grafo.agregarVertice(v2);
        grafo.agregarArista(v1, v2);
        lblResultado.setText("Arista agregada: " + v1 + " - " + v2);
        txtV1.clear();
        txtV2.clear();
    }

    @FXML
    private void mostrar(ActionEvent event) {
        lblResultado.setText("Grafo: " + grafo.mostrar());
    }

    @FXML
    private void regresar(ActionEvent event) throws Exception {
        MainApplication.cargarVista("menu-view.fxml");
    }
}
