package com.jasminesystems.metodosbusqueda;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BusquedaController {

    @FXML
    private TextField txtNumero;

    @FXML
    private Button btnSecuencial, btnBinaria, btnHashInsert, btnHashBuscar, btnHashEliminar;

    @FXML
    private TextArea txtResultado;

    // Arreglos de ejemplo
    private int[] arrSecuencial = {5, 2, 9, 1, 7, 6};
    private int[] arrBinaria = {1, 2, 5, 6, 7, 9}; // Debe estar ordenado
    private HashTable hashTable = new HashTable(10);

    @FXML
    public void initialize() {
        btnSecuencial.setOnAction(e -> {
            try {
                int clave = Integer.parseInt(txtNumero.getText());
                int res = BusquedaSecuencial.buscar(arrSecuencial, clave);
                txtResultado.setText("Búsqueda Secuencial\nArreglo: " + BusquedaSecuencial.arregloToString(arrSecuencial) + "\n");
                txtResultado.appendText(res != -1 ? "Elemento " + clave + " encontrado en posición " + res
                        : "Elemento " + clave + " no encontrado.");
            } catch (NumberFormatException ex) {
                txtResultado.setText("Ingrese un número válido.");
            }
        });

        btnBinaria.setOnAction(e -> {
            try {
                int clave = Integer.parseInt(txtNumero.getText());
                int res = BusquedaBinaria.buscar(arrBinaria, clave);
                txtResultado.setText("Búsqueda Binaria\nArreglo: " + BusquedaBinaria.arregloToString(arrBinaria) + "\n");
                txtResultado.appendText(res != -1 ? "Elemento " + clave + " encontrado en posición " + res
                        : "Elemento " + clave + " no encontrado.");
            } catch (NumberFormatException ex) {
                txtResultado.setText("Ingrese un número válido.");
            }
        });

        btnHashInsert.setOnAction(e -> {
            try {
                int clave = Integer.parseInt(txtNumero.getText());
                hashTable.insert(clave);
                txtResultado.setText("Elemento " + clave + " insertado en la tabla hash.\n\n" + hashTable.display());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Ingrese un número válido.");
            }
        });

        btnHashBuscar.setOnAction(e -> {
            try {
                int clave = Integer.parseInt(txtNumero.getText());
                boolean encontrado = hashTable.search(clave);
                txtResultado.setText(encontrado ? "Elemento " + clave + " encontrado.\n\n" + hashTable.display()
                        : "Elemento " + clave + " no encontrado.\n\n" + hashTable.display());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Ingrese un número válido.");
            }
        });

        btnHashEliminar.setOnAction(e -> {
            try {
                int clave = Integer.parseInt(txtNumero.getText());
                boolean eliminado = hashTable.delete(clave);
                txtResultado.setText(eliminado ? "Elemento " + clave + " eliminado.\n\n" + hashTable.display()
                        : "Elemento " + clave + " no encontrado.\n\n" + hashTable.display());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Ingrese un número válido.");
            }
        });
    }
}


