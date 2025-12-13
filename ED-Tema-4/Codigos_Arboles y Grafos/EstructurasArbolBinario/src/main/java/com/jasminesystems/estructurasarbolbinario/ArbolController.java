package com.jasminesystems.estructurasarbolbinario;

import com.jasminesystems.estructurasarbolbinario.funciones.ArbolBinario;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ArbolController {

    private final ArbolBinario arbol = new ArbolBinario();

    @FXML
    private TextField txtValor;

    @FXML
    private TextArea areaResultado;

    @FXML
    public void insertar() {
        int valor = Integer.parseInt(txtValor.getText());
        arbol.insertar(valor);
        txtValor.clear();
    }

    @FXML
    public void mostrarInorden() {

        areaResultado.setText("Inorden: " + arbol.inorden());
    }

    @FXML
    public void mostrarPreorden() {
        areaResultado.setText("Preorden: " + arbol.preorden());
    }

    @FXML
    public void mostrarPostorden() {
        areaResultado.setText("Postorden: " + arbol.postorden());
    }
}
