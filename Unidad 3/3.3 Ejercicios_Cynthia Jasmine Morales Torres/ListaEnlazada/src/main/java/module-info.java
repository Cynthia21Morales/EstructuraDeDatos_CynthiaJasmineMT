module com.jasminesystems.listaenlazada {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.listaenlazada to javafx.fxml;
    exports com.jasminesystems.listaenlazada;
}