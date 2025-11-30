package com.jasminesystems.arearectangulo.Controller;

import com.jasminesystems.arearectangulo.Controller.Base;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField txtBase;

    @FXML
    private TextField txtAltura;

    @FXML
    private Label lblResultado;

    // Usar la clase Base con B mayúscula
    private Base calculadora = new Base();

    @FXML
    protected void onCalcularClick() {
        try {
            double base = Double.parseDouble(txtBase.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            double area = calculadora.calcularArea(base, altura);
            lblResultado.setText("Área: " + area);
        } catch (NumberFormatException e) {
            lblResultado.setText("Por favor ingresa valores numéricos válidos.");
        } catch (NullPointerException e) {
            lblResultado.setText("Campos vacíos. Ingresa base y altura.");
        }
    }
}
