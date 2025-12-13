module com.jasminesystems.estructuras1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.estructuras1 to javafx.fxml;
    exports com.jasminesystems.estructuras1;
    exports com.jasminesystems.estructuras1.funciones;
    opens com.jasminesystems.estructuras1.funciones to javafx.fxml;
}