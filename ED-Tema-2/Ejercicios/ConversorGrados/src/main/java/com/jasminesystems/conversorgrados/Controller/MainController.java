package com.jasminesystems.conversorgrados.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField txtCelsius;
    @FXML
    private Label lblResultado;


    Base conversor = new Base();

    @FXML
    private void onConvertirClick() {
        double c = Double.parseDouble(txtCelsius.getText());
        double f = conversor.convertir(c);
        lblResultado.setText("Fahrenheit: " + f);
    }
}

