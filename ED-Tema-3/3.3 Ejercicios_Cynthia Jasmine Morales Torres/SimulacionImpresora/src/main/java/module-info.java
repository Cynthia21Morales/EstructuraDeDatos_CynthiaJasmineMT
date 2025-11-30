module com.jasminesystems.simulacionimpresora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.simulacionimpresora to javafx.fxml;
    exports com.jasminesystems.simulacionimpresora;
}