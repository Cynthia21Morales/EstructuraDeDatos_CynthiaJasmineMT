package com.jasminesystems.metodoordenamientoquicksort;

import com.jasminesystems.metodoordenamientoquicksort.funciones.QuickSort;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class QuickSortController {

    @FXML
    private TextField txtNumeros;

    @FXML
    private TextArea areaResultado;

    private QuickSort quicksort = new QuickSort();

    @FXML
    public void ordenar() {
        String texto = txtNumeros.getText();

        String[] partes = texto.split(",");
        int[] numeros = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i].trim());
        }

        areaResultado.setText(quicksort.ordenar(numeros));
    }

}
