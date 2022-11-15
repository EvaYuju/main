package com.main.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CuentaBater extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CuentaBater.class.getResource("ViewVisor.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Aplicación Cuentas Bancarias");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}