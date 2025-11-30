package com.jasminesystems.listasimple;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class MainController {

    @FXML private TextField inputField;
    @FXML private TextArea outputArea;

    private ArrayList<String> lista = new ArrayList<>();

    @FXML
    private void addElement() {
        String value = inputField.getText();
        if(!value.isEmpty()){
            lista.add(value);
            outputArea.appendText("Agregado: " + value + "\n");
            inputField.clear();
        }
    }

    @FXML
    private void removeElement() {
        if(!lista.isEmpty()){
            String removed = lista.remove(lista.size() - 1);
            outputArea.appendText("Eliminado: " + removed + "\n");
        } else {
            outputArea.appendText("La lista está vacía\n");
        }
    }

    @FXML
    private void showElements() {
        outputArea.appendText("Lista actual: " + lista + "\n");
    }
}
