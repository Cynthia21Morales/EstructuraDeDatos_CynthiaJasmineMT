module com.jasminesystems.estructuraslineales {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.estructuraslineales to javafx.fxml;
    exports com.jasminesystems.estructuraslineales;
}