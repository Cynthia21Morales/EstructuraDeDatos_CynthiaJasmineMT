package com.jasminesystems.metodoordenamientoshellsort;

import com.jasminesystems.metodoordenamientoshellsort.funciones.ShellSort;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ShellSortController {

    @FXML
    private TextField txtNumeros;

    @FXML
    private TextArea areaResultado;

    private ShellSort shellSort = new ShellSort();

    @FXML
    public void ordenar() {
        String texto = txtNumeros.getText();
        String[] partes = texto.split(",");

        int[] numeros = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i].trim());
        }

        areaResultado.setText(shellSort.ordenar(numeros));
    }
}


