module com.jasminesystems.busquedasecuencial {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.busquedasecuencial to javafx.fxml;
    exports com.jasminesystems.busquedasecuencial;
}