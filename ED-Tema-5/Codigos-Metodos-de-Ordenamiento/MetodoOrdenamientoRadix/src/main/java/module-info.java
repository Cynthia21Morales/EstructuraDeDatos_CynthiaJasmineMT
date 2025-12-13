module com.jasminesystems.metodoordenamientoradix {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.metodoordenamientoradix to javafx.fxml;
    exports com.jasminesystems.metodoordenamientoradix;
}