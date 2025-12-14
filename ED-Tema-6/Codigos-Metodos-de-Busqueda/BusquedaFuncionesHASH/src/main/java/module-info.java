module com.jasminesystems.busquedafuncioneshash {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.busquedafuncioneshash to javafx.fxml;
    exports com.jasminesystems.busquedafuncioneshash;
}