package com.jasminesystems.animal.controller;

import com.jasminesystems.polimorfismo01.entity.*;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class InstrumentosController {
    @FXML
    private ListView<String> lvSonidos;

    @FXML
    void onTocarInstrumentos() {
        lvSonidos.getItems().clear();

        Instrumento[] instrumentos = {
                new Guitarra(),
                new Piano(),
                new Tambor()
        };

        for (Instrumento inst : instrumentos) {
            lvSonidos.getItems().add(inst.toString() + ": " + inst.tocar());
        }
    }
}
