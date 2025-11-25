module com.jasminesystems.factorialrecursivo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.factorialrecursivo to javafx.fxml;
    exports com.jasminesystems.factorialrecursivo;
}