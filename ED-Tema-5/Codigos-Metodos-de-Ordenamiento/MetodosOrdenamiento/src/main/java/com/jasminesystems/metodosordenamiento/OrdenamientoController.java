package com.jasminesystems.metodosordenamiento;

import com.jasminesystems.metodosordenamiento.funciones.OrdenamientoExterno;
import com.jasminesystems.metodosordenamiento.funciones.OrdenamientoInterno;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.scene.control.*;

import java.io.File;
import java.io.IOException;

public class OrdenamientoController {

        @FXML
        private Button btnInterno;

        @FXML
        private Button btnExterno;

        @FXML
        private TextArea txtResultado;

        @FXML
        public void initialize() {
            // Acción botón Ordenamiento Interno
            btnInterno.setOnAction(e -> {
                int[] datos = {8, 3, 7, 1, 9, 2};
                txtResultado.clear();
                txtResultado.appendText("Arreglo original:\n");
                txtResultado.appendText(OrdenamientoInterno.arregloToString(datos) + "\n");

                OrdenamientoInterno.burbuja(datos);

                txtResultado.appendText("Arreglo ordenado:\n");
                txtResultado.appendText(OrdenamientoInterno.arregloToString(datos));
            });

            // Acción botón Ordenamiento Externo
            btnExterno.setOnAction(e -> {
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Seleccionar archivo de entrada");
                File archivoEntrada = fileChooser.showOpenDialog(btnExterno.getScene().getWindow());
                if (archivoEntrada == null) return;

                fileChooser.setTitle("Guardar archivo ordenado");
                File archivoSalida = fileChooser.showSaveDialog(btnExterno.getScene().getWindow());
                if (archivoSalida == null) return;

                try {
                    OrdenamientoExterno.ordenarArchivo(archivoEntrada.getAbsolutePath(), archivoSalida.getAbsolutePath());
                    txtResultado.clear();
                    txtResultado.appendText("Archivo ordenado correctamente y guardado en:\n");
                    txtResultado.appendText(archivoSalida.getAbsolutePath());
                } catch (IOException ex) {
                    txtResultado.clear();
                    txtResultado.appendText("Error: " + ex.getMessage());
                }
            });
        }
    }


