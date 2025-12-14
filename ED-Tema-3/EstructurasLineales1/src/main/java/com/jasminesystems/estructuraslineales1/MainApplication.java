package com.jasminesystems.estructuraslineales1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        cargarVista("menu-view.fxml");
        stage.setTitle("Estructuras Lineales");
        stage.show();
    }

    public static void cargarVista(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                MainApplication.class.getResource("/com/jasminesystems/estructuraslineales1/" +fxml )
        );
        Scene scene = new Scene(loader.load(), 450, 450);
        stage.setScene(scene);
    }
}
