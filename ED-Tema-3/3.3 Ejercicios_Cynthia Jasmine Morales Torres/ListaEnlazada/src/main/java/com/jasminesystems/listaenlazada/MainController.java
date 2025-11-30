package com.jasminesystems.listaenlazada;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.LinkedList;

public class MainController {

    @FXML private TextField inputField;
    @FXML private TextField positionField;
    @FXML private TextArea outputArea;

    private LinkedList<String> lista = new LinkedList<>();

    @FXML
    private void addFirst() {
        String value = inputField.getText();
        if(!value.isEmpty()) {
            lista.addFirst(value);
            outputArea.appendText("Agregado al inicio: " + value + "\n");
            inputField.clear();
        }
    }

    @FXML
    private void addLast() {
        String value = inputField.getText();
        if(!value.isEmpty()) {
            lista.addLast(value);
            outputArea.appendText("Agregado al final: " + value + "\n");
            inputField.clear();
        }
    }

    @FXML
    private void addAtPosition() {
        try {
            int pos = Integer.parseInt(positionField.getText());
            String value = inputField.getText();
            if(pos >= 0 && pos <= lista.size()) {
                lista.add(pos, value);
                outputArea.appendText("Agregado en posición " + pos + ": " + value + "\n");
            } else {
                outputArea.appendText("Posición inválida\n");
            }
            inputField.clear();
            positionField.clear();
        } catch(NumberFormatException e) {
            outputArea.appendText("Ingrese un número válido para la posición\n");
        }
    }

    @FXML
    private void removeByValue() {
        String value = inputField.getText();
        if(lista.remove(value)) {
            outputArea.appendText("Eliminado por valor: " + value + "\n");
        } else {
            outputArea.appendText("Valor no encontrado en la lista\n");
        }
        inputField.clear();
    }

    @FXML
    private void removeByPosition() {
        try {
            int pos = Integer.parseInt(positionField.getText());
            if(pos >= 0 && pos < lista.size()) {
                String removed = lista.remove(pos);
                outputArea.appendText("Eliminado en posición " + pos + ": " + removed + "\n");
            } else {
                outputArea.appendText("Posición inválida\n");
            }
            positionField.clear();
        } catch(NumberFormatException e) {
            outputArea.appendText("Ingrese un número válido para la posición\n");
        }
    }

    @FXML
    private void searchElement() {
        String value = inputField.getText();
        int index = lista.indexOf(value);
        if(index != -1) {
            outputArea.appendText("Elemento encontrado en posición: " + index + "\n");
        } else {
            outputArea.appendText("Elemento no encontrado\n");
        }
        inputField.clear();
    }


    @FXML
    private void showElements() {
        outputArea.appendText("Lista actual: " + lista + "\n");
    }
}
