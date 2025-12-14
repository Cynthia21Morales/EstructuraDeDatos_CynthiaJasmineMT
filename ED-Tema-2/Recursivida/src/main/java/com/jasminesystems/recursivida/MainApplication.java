package com.jasminesystems.recursivida;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        cargarVista("/com/jasminesystems/recursivida/menu-view.fxml");
        stage.setTitle("Menú Recursividad");
        stage.show();
    }

    public static void cargarVista(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApplication.class.getResource(fxml));
        Scene scene = new Scene(loader.load(), 400, 400);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
