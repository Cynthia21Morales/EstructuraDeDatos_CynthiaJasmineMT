module com.jasminesystems.colasimplefifo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.colasimplefifo to javafx.fxml;
    exports com.jasminesystems.colasimplefifo;
}