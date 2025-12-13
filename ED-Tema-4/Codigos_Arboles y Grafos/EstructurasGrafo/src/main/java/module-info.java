module com.jasminesystems.estructurasgrafo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.estructurasgrafo to javafx.fxml;
    exports com.jasminesystems.estructurasgrafo;
}