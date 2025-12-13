module com.jasminesystems.metodosordenamientoburbujas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.metodosordenamientoburbujas to javafx.fxml;
    exports com.jasminesystems.metodosordenamientoburbujas;
}