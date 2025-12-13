package com.jasminesystems.metodosordenamientoburbujas;

import com.jasminesystems.metodosordenamientoburbujas.funciones.Burbuja;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BurbujaController {

    @FXML
    private TextField txtNumeros;

    @FXML
    private TextArea areaResultado;

    private Burbuja burbuja = new Burbuja();

    @FXML
    public void ordenar() {
        String texto = txtNumeros.getText();

        String[] partes = texto.split(",");
        int[] numeros = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i].trim());
        }

        areaResultado.setText(burbuja.ordenar(numeros));
    }
}


