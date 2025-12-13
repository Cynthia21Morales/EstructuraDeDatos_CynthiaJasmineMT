module com.jasminesystems.estructurasarbolbinario {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jasminesystems.estructurasarbolbinario to javafx.fxml;
    exports com.jasminesystems.estructurasarbolbinario;
    exports com.jasminesystems.estructurasarbolbinario.funciones;
    opens com.jasminesystems.estructurasarbolbinario.funciones to javafx.fxml;
}