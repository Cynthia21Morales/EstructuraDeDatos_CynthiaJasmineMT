package com.jasminesystems.busquedafuncioneshash;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HashingController {

    @FXML
    private TextField txtNumero;

    @FXML
    private Button btnInsertar, btnBuscar, btnEliminar;

    @FXML
    private TextArea txtResultado;

    private HashTable hashTable = new HashTable(10); // Tabla hash con 10 posiciones

    @FXML
    public void initialize() {
        btnInsertar.setOnAction(e -> {
            try {
                int key = Integer.parseInt(txtNumero.getText());
                hashTable.insert(key);
                txtResultado.setText("Elemento " + key + " insertado.\n\n" + hashTable.display());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Ingrese un número válido.");
            }
        });

        btnBuscar.setOnAction(e -> {
            try {
                int key = Integer.parseInt(txtNumero.getText());
                boolean encontrado = hashTable.search(key);
                txtResultado.setText(encontrado ?
                        "Elemento " + key + " encontrado.\n\n" + hashTable.display() :
                        "Elemento " + key + " NO encontrado.\n\n" + hashTable.display());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Ingrese un número válido.");
            }
        });

        btnEliminar.setOnAction(e -> {
            try {
                int key = Integer.parseInt(txtNumero.getText());
                boolean eliminado = hashTable.delete(key);
                txtResultado.setText(eliminado ?
                        "Elemento " + key + " eliminado.\n\n" + hashTable.display() :
                        "Elemento " + key + " NO encontrado.\n\n" + hashTable.display());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Ingrese un número válido.");
            }
        });
    }
}


