module com.jasminesystems.busquedabinaria {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.busquedabinaria to javafx.fxml;
    exports com.jasminesystems.busquedabinaria;
}