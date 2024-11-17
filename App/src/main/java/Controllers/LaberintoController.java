package com.example.laberinto.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

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
    }

    @FXML
    public void handleVerEjemplo2() {
        // Acción al hacer clic en el botón "Ver" de Ejemplo 2
        System.out.println("Se presionó el botón 'Ver' de Ejemplo 2");
    }
}
