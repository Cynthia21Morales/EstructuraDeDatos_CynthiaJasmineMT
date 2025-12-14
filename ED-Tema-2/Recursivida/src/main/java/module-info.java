module com.jasminesystems.recursivida {

    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;


    opens com.jasminesystems.recursivida.controller to javafx.fxml;

    exports com.jasminesystems.recursivida;
}
