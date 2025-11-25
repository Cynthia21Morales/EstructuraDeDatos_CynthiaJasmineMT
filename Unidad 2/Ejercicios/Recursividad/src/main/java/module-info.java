module com.jasminesystems.recursividad {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.recursividad to javafx.fxml;
    exports com.jasminesystems.recursividad;
    exports com.jasminesystems.recursividad.controller;
    opens com.jasminesystems.recursividad.controller to javafx.fxml;
}