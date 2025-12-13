package com.jasminesystems.estructuras2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GrafoController {

    @FXML private TextField txtNodo;
    @FXML private TextField txtOrigen;
    @FXML private TextField txtDestino;
    @FXML private TextArea txtResultado;

    private Grafo grafo = new Grafo();

    @FXML
    private void agregarNodo() {
        String nodo = txtNodo.getText();
        if (!nodo.isEmpty()) {
            grafo.agregarNodo(nodo);
            txtNodo.clear();
            txtResultado.setText("Nodo agregado: " + nodo);
        }
    }

    @FXML
    private void agregarArista() {
        String origen = txtOrigen.getText();
        String destino = txtDestino.getText();

        if (!origen.isEmpty() && !destino.isEmpty()) {
            grafo.agregarArista(origen, destino);
            txtOrigen.clear();
            txtDestino.clear();
            txtResultado.setText("Arista agregada: " + origen + " → " + destino);
        }
    }

    @FXML
    private void recorridoBFS() {
        String resultado = grafo.recorridoBFS("A");
        txtResultado.setText(resultado);
    }
}
