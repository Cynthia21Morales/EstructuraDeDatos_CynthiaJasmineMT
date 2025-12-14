module com.jasminesystems.metodosbusqueda {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.metodosbusqueda to javafx.fxml;
    exports com.jasminesystems.metodosbusqueda;
}