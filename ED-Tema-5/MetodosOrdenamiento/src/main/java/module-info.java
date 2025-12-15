module com.jasminesystems.metodosordenamiento {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.metodosordenamiento to javafx.fxml;
    opens com.jasminesystems.metodosordenamiento.controller to javafx.fxml;

    exports com.jasminesystems.metodosordenamiento;
}
