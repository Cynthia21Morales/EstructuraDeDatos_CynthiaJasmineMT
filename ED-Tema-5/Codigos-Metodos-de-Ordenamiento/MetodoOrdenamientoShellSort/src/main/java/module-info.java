module com.jasminesystems.metodoordenamientoshellsort {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.metodoordenamientoshellsort to javafx.fxml;
    exports com.jasminesystems.metodoordenamientoshellsort;
}