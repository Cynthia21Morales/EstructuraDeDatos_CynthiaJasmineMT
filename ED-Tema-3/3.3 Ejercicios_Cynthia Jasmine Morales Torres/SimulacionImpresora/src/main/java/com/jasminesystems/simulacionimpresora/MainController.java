package com.jasminesystems.simulacionimpresora;

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

    private Queue<String> trabajos = new LinkedList<>();

    @FXML
    private void addElement() {
        String trabajo = inputField.getText();
        if(!trabajo.isEmpty()){
            trabajos.add(trabajo);
            outputArea.appendText("Trabajo agregado: " + trabajo + "\n");
            inputField.clear();
        }
    }

    @FXML
    private void removeElement() {
        if(!trabajos.isEmpty()){
            String trabajo = trabajos.poll();
            outputArea.appendText("Trabajo procesado: " + trabajo + "\n");
        } else {
            outputArea.appendText("No hay trabajos en la cola\n");
        }
    }

    @FXML
    private void showElements() {
        outputArea.appendText("Cola de trabajos: " + trabajos + "\n");
    }
}
