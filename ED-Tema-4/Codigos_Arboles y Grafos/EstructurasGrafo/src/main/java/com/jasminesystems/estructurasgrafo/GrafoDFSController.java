package com.jasminesystems.estructurasgrafo;

import com.jasminesystems.estructurasgrafo.GrafoDFS;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GrafoDFSController {

    @FXML
    private TextField txtNodo, txtA, txtB;

    @FXML
    private TextArea areaResultado;

    private GrafoDFS grafo = new GrafoDFS();

    @FXML
    public void agregarNodo() {
        grafo.agregarNodo(txtNodo.getText());
        areaResultado.setText("Nodo agregado");
        txtNodo.clear();
    }

    @FXML
    public void agregarArista() {
        grafo.agregarArista(txtA.getText(), txtB.getText());
        areaResultado.setText("Arista agregada (No dirigida)");
        txtA.clear();
        txtB.clear();
    }

    @FXML
    public void recorrerDFS() {
        areaResultado.setText(grafo.recorridoDFS("A"));
    }
}
