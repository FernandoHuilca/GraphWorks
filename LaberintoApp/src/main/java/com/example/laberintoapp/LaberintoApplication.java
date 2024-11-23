package com.example.laberintoapp;

import Logic.GrafoNoDirigido;
import Logic.GraphWorks;
import Logic.Nodo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LaberintoApplication extends Application {

    GraphWorks graphWorks = GraphWorks.getInstance();

    @Override
    public void start(Stage stage) throws IOException {

        cargarGrafo();

        FXMLLoader fxmlLoader = new FXMLLoader(LaberintoApplication.class.getResource("Laberinto.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1020, 665);
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void cargarGrafo() {

        GrafoNoDirigido grafoNoDirigido = new GrafoNoDirigido();
        GrafoNoDirigido grafoNoDirigido2 = new GrafoNoDirigido();

        graphWorks.agregarGrafoNoDirigido(grafoNoDirigido);
        graphWorks.agregarGrafoNoDirigido(grafoNoDirigido2);

        //System.out.println("CASO2: Agregar algunos nodos al grafo 0 de la app___________________________________________");
        grafoNoDirigido.agregarNodo(new Nodo<>("0"));
        grafoNoDirigido.agregarNodo(new Nodo<>("1"));
        grafoNoDirigido.agregarNodo(new Nodo<>("2"));
        grafoNoDirigido.agregarNodo(new Nodo<>("3"));
        grafoNoDirigido.agregarNodo(new Nodo<>("4"));
        grafoNoDirigido.agregarNodo(new Nodo<>("5"));
        grafoNoDirigido.agregarNodo(new Nodo<>("6"));
        grafoNoDirigido.agregarNodo(new Nodo<>("7"));
        grafoNoDirigido.agregarNodo(new Nodo<>("8"));
        grafoNoDirigido.agregarNodo(new Nodo<>("9"));
        grafoNoDirigido.agregarNodo(new Nodo<>("10"));
        grafoNoDirigido.agregarNodo(new Nodo<>("11"));
        grafoNoDirigido.agregarNodo(new Nodo<>("12"));
        grafoNoDirigido.agregarNodo(new Nodo<>("13"));
        grafoNoDirigido.agregarNodo(new Nodo<>("14"));
        grafoNoDirigido.agregarNodo(new Nodo<>("15"));
        grafoNoDirigido.agregarNodo(new Nodo<>("16"));
        grafoNoDirigido.agregarNodo(new Nodo<>("17"));
        grafoNoDirigido.agregarNodo(new Nodo<>("18"));
        grafoNoDirigido.agregarNodo(new Nodo<>("19"));
        grafoNoDirigido.agregarNodo(new Nodo<>("20"));
        grafoNoDirigido.agregarNodo(new Nodo<>("21"));
        grafoNoDirigido.agregarNodo(new Nodo<>("22"));
        grafoNoDirigido.agregarNodo(new Nodo<>("23"));
        grafoNoDirigido.agregarNodo(new Nodo<>("24"));
        grafoNoDirigido.agregarNodo(new Nodo<>("25"));
        grafoNoDirigido.agregarNodo(new Nodo<>("26"));

        //System.out.println("CASO3: AgregarArista (dirigir las aristas) a los nodos de un grafo específico_______________");
        grafoNoDirigido.agregarAristaANodo(0,1);
        grafoNoDirigido.agregarAristaANodo(0,22);
        grafoNoDirigido.agregarAristaANodo(1,2);
        grafoNoDirigido.agregarAristaANodo(2,3);
        grafoNoDirigido.agregarAristaANodo(3,4);
        grafoNoDirigido.agregarAristaANodo(4,5);
        grafoNoDirigido.agregarAristaANodo(5,6);
        grafoNoDirigido.agregarAristaANodo(6,7);
        grafoNoDirigido.agregarAristaANodo(7,8);
        grafoNoDirigido.agregarAristaANodo(8,9);
        grafoNoDirigido.agregarAristaANodo(9,10);
        grafoNoDirigido.agregarAristaANodo(9,14);
        grafoNoDirigido.agregarAristaANodo(10,11);
        grafoNoDirigido.agregarAristaANodo(11,12);
        grafoNoDirigido.agregarAristaANodo(12,13);
        grafoNoDirigido.agregarAristaANodo(14,15);
        grafoNoDirigido.agregarAristaANodo(15,16);
        grafoNoDirigido.agregarAristaANodo(16,17);
        grafoNoDirigido.agregarAristaANodo(16,19);
        grafoNoDirigido.agregarAristaANodo(17,18);
        grafoNoDirigido.agregarAristaANodo(19,20);
        grafoNoDirigido.agregarAristaANodo(20,21);
        grafoNoDirigido.agregarAristaANodo(22,23);
        grafoNoDirigido.agregarAristaANodo(23,24);
        grafoNoDirigido.agregarAristaANodo(24,25);
        grafoNoDirigido.agregarAristaANodo(25,26);


        grafoNoDirigido2.agregarNodo(new Nodo<>("0"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("1"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("2"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("3"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("4"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("5"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("6"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("7"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("8"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("9"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("10"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("11"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("12"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("13"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("14"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("15"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("16"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("17"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("18"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("19"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("20"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("21"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("22"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("23"));
        grafoNoDirigido2.agregarNodo(new Nodo<>("24"));

        grafoNoDirigido2.agregarAristaANodo(0,1);
        grafoNoDirigido2.agregarAristaANodo(1,2);
        grafoNoDirigido2.agregarAristaANodo(1,14);
        grafoNoDirigido2.agregarAristaANodo(2,3);
        grafoNoDirigido2.agregarAristaANodo(3,4);
        grafoNoDirigido2.agregarAristaANodo(4,5);
        grafoNoDirigido2.agregarAristaANodo(5,6);
        grafoNoDirigido2.agregarAristaANodo(6,7);
        grafoNoDirigido2.agregarAristaANodo(6,8);
        grafoNoDirigido2.agregarAristaANodo(8,9);
        grafoNoDirigido2.agregarAristaANodo(9,10);
        grafoNoDirigido2.agregarAristaANodo(10,11);
        grafoNoDirigido2.agregarAristaANodo(10,13);
        grafoNoDirigido2.agregarAristaANodo(11,12);
        grafoNoDirigido2.agregarAristaANodo(14,15);
        grafoNoDirigido2.agregarAristaANodo(15,16);
        grafoNoDirigido2.agregarAristaANodo(16,17);
        grafoNoDirigido2.agregarAristaANodo(17,18);
        grafoNoDirigido2.agregarAristaANodo(18,24);
        grafoNoDirigido2.agregarAristaANodo(18,19);
        grafoNoDirigido2.agregarAristaANodo(19,20);
        grafoNoDirigido2.agregarAristaANodo(20,21);
        grafoNoDirigido2.agregarAristaANodo(21,22);
        grafoNoDirigido2.agregarAristaANodo(22,23);

    }
}