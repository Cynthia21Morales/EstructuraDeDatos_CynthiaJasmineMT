module com.jasminesystems.conversorgrados {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.conversorgrados to javafx.fxml;
    exports com.jasminesystems.conversorgrados;
    exports com.jasminesystems.conversorgrados.Controller;
    opens com.jasminesystems.conversorgrados.Controller to javafx.fxml;
}