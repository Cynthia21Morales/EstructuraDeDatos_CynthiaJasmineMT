module com.jasminesystems.animal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.animal to javafx.fxml;
    exports com.jasminesystems.animal;
    exports com.jasminesystems.animal.controller;
    opens com.jasminesystems.animal.controller to javafx.fxml;
}