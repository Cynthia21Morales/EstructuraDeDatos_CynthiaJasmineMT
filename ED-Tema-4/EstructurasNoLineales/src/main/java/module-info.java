module com.jasminesystems.estructurasnolineales {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.estructurasnolineales to javafx.fxml;
    exports com.jasminesystems.estructurasnolineales;
    exports com.jasminesystems.estructurasnolineales.controller;
    opens com.jasminesystems.estructurasnolineales.controller to javafx.fxml;
}