package com.jasminesystems.busquedasecuencial;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BusquedaController {

    @FXML
    private TextField txtNumero;

    @FXML
    private Button btnBuscar;

    @FXML
    private TextArea txtResultado;

    // Arreglo de ejemplo
    private int[] datos = {5, 2, 9, 1, 7, 6};

    @FXML
    public void initialize() {
        btnBuscar.setOnAction(e -> {
            txtResultado.clear();
            txtResultado.appendText("Arreglo: " + BusquedaSecuencial.arregloToString(datos) + "\n");

            try {
                int clave = Integer.parseInt(txtNumero.getText());
                int resultado = BusquedaSecuencial.busquedaSecuencial(datos, clave);
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


