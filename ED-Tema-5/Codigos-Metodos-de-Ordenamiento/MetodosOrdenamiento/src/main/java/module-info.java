module com.jasminesystems.metodosordenamiento {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.metodosordenamiento to javafx.fxml;
    exports com.jasminesystems.metodosordenamiento;
    exports com.jasminesystems.metodosordenamiento.funciones;
    opens com.jasminesystems.metodosordenamiento.funciones to javafx.fxml;
}