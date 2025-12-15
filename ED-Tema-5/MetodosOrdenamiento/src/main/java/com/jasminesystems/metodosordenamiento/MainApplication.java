package com.jasminesystems.metodosordenamiento;

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
        stage.setTitle("Métodos de Ordenamiento");
        stage.show();
    }

    public static void cargarVista(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApplication.class.getResource("/com/jasminesystems/metodosordenamiento/" + fxml));
        stage.setScene(new Scene(loader.load(), 500, 450));
    }

    public static void main(String[] args) {
        launch();
    }
}
