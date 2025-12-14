module com.jasminesystems.estructuraslineales1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.estructuraslineales1 to javafx.fxml;
    exports com.jasminesystems.estructuraslineales1;
    exports com.jasminesystems.estructuraslineales1.controller;
    opens com.jasminesystems.estructuraslineales1.controller to javafx.fxml;
}