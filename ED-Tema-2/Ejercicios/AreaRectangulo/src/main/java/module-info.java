module com.jasminesystems.arearectangulo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.arearectangulo to javafx.fxml;
    exports com.jasminesystems.arearectangulo;
    exports com.jasminesystems.arearectangulo.Controller;
    opens com.jasminesystems.arearectangulo.Controller to javafx.fxml;
}