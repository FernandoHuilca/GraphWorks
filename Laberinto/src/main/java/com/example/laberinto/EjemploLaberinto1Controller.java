package com.example.laberinto;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class EjemploLaberinto1Controller {

    @FXML
    private Label numeroNodos;

    @FXML
    private Label numeroAristas;

    @FXML
    private Label tiempoEjecucion;

    @FXML
    private ListView<String> trazaPila;

    @FXML
    private ListView<String> caminoSalida;

    public void initialize() {
        // Inicializar datos del resumen
        numeroNodos.setText("Número de Nodos: 26");
        numeroAristas.setText("Número de Aristas: 25");
        tiempoEjecucion.setText("Tiempo de Ejecución: 6 ms");

        // Inicializar la traza de la pila
        trazaPila.getItems().addAll(
                "1", "1 2", "1 2 3", "1 2 3 4", "1 2 3 4 5",
                "1 2 3 4 5 6", "1 2 3 4 5 6 7", "1 2 3 4 5 6 7 8",
                "1 2 3 4 5 6 7 8 9", "1 2 3 4 5 6 7 8 9 10",
                "1 2 3 4 5 6 7 8 9 10 14", "1 2 3 4 5 6 7 8 9 10 15"
        );

        // Inicializar el camino de salida
        caminoSalida.getItems().addAll(
                "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "14", "15", "16", "17", "18"
        );
    }
}
