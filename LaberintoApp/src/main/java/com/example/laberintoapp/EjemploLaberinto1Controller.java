package com.example.laberintoapp;


import Logic.GraphWorks;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.layout.HBox;

public class EjemploLaberinto1Controller {

    GraphWorks graphWorks = GraphWorks.getInstance();

    @FXML
    private HBox hbox;

    @FXML
    private Label numeroNodos;

    @FXML
    private Label numeroAristas;

    @FXML
    private Label tiempoEjecucion;

    @FXML
    private ListView<String> trazaPila;

    //@FXML
    //private ListView<String> caminoSalida;

    @FXML
    private Button btnRegresarMenuPrincipal;

    public void initialize() {

        // Inicializar datos del resumen
        numeroNodos.setText("Número de Nodos: " + graphWorks.getNumNodos(0));
        numeroAristas.setText("Número de Aristas: " + graphWorks.getNumAristas(0));

        ArrayList<String> auxTrazaPilaDFS = graphWorks.getTrazaRecorridoAProfundidad(0, 0);

        trazaPila.getItems().addAll(auxTrazaPilaDFS);


        long inicio = System.nanoTime(); // Marca el inicio del tiempo
        String caminoDeSalida = graphWorks.getCaminoDeSalida(0, 0, 18);
        long fin = System.nanoTime(); // Marca el fin del tiempo

        // Calcula el tiempo transcurrido en nanosegundos
        long tiempoEjecucion = fin - inicio;

       /* if (caminoDeSalida != null && !caminoDeSalida.isEmpty()) {
            // Elimina espacios al principio y final, y divide por uno o más espacios
            String[] numeros = caminoDeSalida.trim().split("\\s+");
            caminoSalida.getItems().clear(); // Limpia el ListView
            caminoSalida.getItems().addAll(numeros); // Agrega números al ListView
        }
        */

        if (caminoDeSalida != null && !caminoDeSalida.isEmpty()) {
            // Elimina espacios al principio y final, y divide por uno o más espacios
            String[] numeros = caminoDeSalida.trim().split("\\s+");

            // Limpia el HBox para eliminar elementos previos
            hbox.getChildren().clear();

            // Itera sobre los números y agrega etiquetas al HBox
            for (String numero : numeros) {
                Label label = new Label(numero);
                label.setStyle("-fx-font-size: 18px;");
                hbox.getChildren().add(label); // Agrega cada etiqueta al HBox
            }
        } else {
            // Si no hay camino disponible, puedes mostrar un mensaje alternativo
            hbox.getChildren().clear();  // Limpiar cualquier elemento previo
            Label noCamino = new Label("No hay camino disponible");
            hbox.getChildren().add(noCamino);  // Mostrar mensaje alternativo
        }


        this.tiempoEjecucion.setText("Tiempo de ejecución: " + tiempoEjecucion + " ns o "
                                    + (tiempoEjecucion / 1_000_000.0) + " ms");

    }


    @FXML
    private void regresarInterfazMenuPrincipal(ActionEvent event) {
        try {
            // Cargar el archivo FXML de la nueva interfaz
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Laberinto.fxml"));
            Scene newScene = new Scene(fxmlLoader.load());

            // Obtener el Stage actual (ventana actual)
            Stage currentStage = (Stage) (btnRegresarMenuPrincipal.getScene().getWindow());

            // Establecer la nueva escena en el Stage actual
            currentStage.setScene(newScene);
            currentStage.setTitle("Inicio");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Laberinto.fxml");
        }
    }

}
