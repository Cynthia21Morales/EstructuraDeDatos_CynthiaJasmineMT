package com.jasminesystems.busquedabinaria;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BusquedaBinariaController {

    @FXML
    private TextField txtNumero;

    @FXML
    private Button btnBuscar;

    @FXML
    private TextArea txtResultado;

    // Arreglo de ejemplo **ordenado** para búsqueda binaria
    private int[] datos = {1, 2, 5, 6, 7, 9};

    @FXML
    public void initialize() {
        btnBuscar.setOnAction(e -> {
            txtResultado.clear();
            txtResultado.appendText("Arreglo: " + BusquedaBinaria.arregloToString(datos) + "\n");

            try {
                int clave = Integer.parseInt(txtNumero.getText());
                int resultado = BusquedaBinaria.busquedaBinaria(datos, clave);
                if (resultado != -1) {
                    txtResultado.appendText("Elemento " + clave + " encontrado en la posición: " + resultado);
                } else {
                    txtResultado.appendText("Elemento " + clave + " no encontrado en el arreglo.");
                }
            } catch (NumberFormatException ex) {
                txtResultado.appendText("Ingrese un número válido.");
            }
        });
    }
}


