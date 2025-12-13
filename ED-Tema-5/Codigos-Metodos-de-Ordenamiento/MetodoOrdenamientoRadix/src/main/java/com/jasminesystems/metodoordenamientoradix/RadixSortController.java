package com.jasminesystems.metodoordenamientoradix;

import com.jasminesystems.metodoordenamientoradix.funciones.RadixSort;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RadixSortController {

    @FXML
    private TextField txtNumeros;

    @FXML
    private TextArea areaResultado;

    private RadixSort radixSort = new RadixSort();

    @FXML
    public void ordenar() {
        String texto = txtNumeros.getText();
        String[] partes = texto.split(",");

        int[] numeros = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i].trim());
        }

        areaResultado.setText(radixSort.ordenar(numeros));
    }
}


