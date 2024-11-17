package com.example.laberinto;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

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
            // Cargar el archivo FXML de la nueva ventana
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EjemploLaberinto1.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            // Crear una nueva ventana (Stage)
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Ejemplo Laberinto 1");
            stage.show();
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
    }
}
