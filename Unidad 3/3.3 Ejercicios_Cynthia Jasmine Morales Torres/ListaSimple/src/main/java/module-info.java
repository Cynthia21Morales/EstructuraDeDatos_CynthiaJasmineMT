module com.jasminesystems.listasimple {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.listasimple to javafx.fxml;
    exports com.jasminesystems.listasimple;
}