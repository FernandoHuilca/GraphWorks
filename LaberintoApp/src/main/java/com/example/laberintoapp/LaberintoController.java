package com.example.laberintoapp;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class LaberintoController {

    @FXML
    private ImageView imagenEjemplo1;

    @FXML
    private ImageView imagenEjemplo2;

    @FXML
    private Label labelEjemplo1;

    @FXML
    private Label labelEjemplo2;

    @FXML
    private Button botonVerEjemplo1;

    @FXML
    private Button botonVerEjemplo2;

    @FXML
    private Button btnSalir;

    @FXML
    public void initialize() {
        // Método que se ejecuta automáticamente al cargar la vista
        labelEjemplo1.setText("Ejemplo 1");
        labelEjemplo2.setText("Ejemplo 2");
    }

    @FXML
    public void handleVerEjemplo1() {
        // Acción al hacer clic en el botón "Ver" de Ejemplo 1
        System.out.println("Se presionó el botón 'Ver' de Ejemplo 1");

        try {
            // Cargar el archivo FXML de la nueva interfaz
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EjemploLaberinto1.fxml"));
            Scene newScene = new Scene(fxmlLoader.load());

            // Obtener el Stage actual (ventana actual)
            Stage currentStage = (Stage) (botonVerEjemplo1.getScene().getWindow());

            // Establecer la nueva escena en el Stage actual
            currentStage.setScene(newScene);
            currentStage.setTitle("Ejemplo Laberinto 1");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se pudo cargar la ventana EjemploLaberinto1.fxml");
        }
    }

    @FXML
    public void handleVerEjemplo2() {
        // Acción al hacer clic en el botón "Ver" de Ejemplo 2
        System.out.println("Se presionó el botón 'Ver' de Ejemplo 2");
        // Aquí puedes implementar la lógica para abrir otra ventana si es necesario

        try {
            // Cargar el archivo FXML de la nueva interfaz
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EjemploLaberinto2.fxml"));
            Scene newScene = new Scene(fxmlLoader.load());

            // Obtener el Stage actual (ventana actual)
            Stage currentStage = (Stage) (botonVerEjemplo2.getScene().getWindow());

            // Establecer la nueva escena en el Stage actual
            currentStage.setScene(newScene);
            currentStage.setTitle("Ejemplo Laberinto 2");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se pudo cargar la ventana EjemploLaberinto2.fxml");
        }
    }

    @FXML
    public void SalirLaberintoApp(ActionEvent event) {
        Platform.exit();
    }
}