package com.jasminesystems.colasimplefifo;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.LinkedList;
import java.util.Queue;

public class MainController {

    @FXML
    private TextField inputField;
    @FXML
    private TextArea outputArea;

    private Queue<String> cola = new LinkedList<>();

    @FXML
    private void addElement() {
        String value = inputField.getText();
        if(!value.isEmpty()) {
            cola.add(value);
            outputArea.appendText("Agregado a la cola: " + value + "\n");
            inputField.clear();
        }
    }

    @FXML
    private void removeElement() {
        if(!cola.isEmpty()) {
            String removed = cola.poll();
            outputArea.appendText("Eliminado de la cola: " + removed + "\n");
        } else {
            outputArea.appendText("La cola está vacía\n");
        }
    }

    @FXML
    private void showElements() {
        outputArea.appendText("Cola actual: " + cola + "\n");
    }
}
