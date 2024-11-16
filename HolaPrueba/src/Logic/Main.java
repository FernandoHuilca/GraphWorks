package Logic;

import java.util.ArrayList;

// Author:
public class Main {
    public static void main(String[] args) {

        GraphWorks graphWorks = GraphWorks.getInstance();

        System.out.println("CASO1: Agregar grafo NO Dirigido a la app: _________________________________________________ ");
        //Crear grafo
        GrafoNoDirigido grafoNoDirigido = new GrafoNoDirigido();
        if (graphWorks.agregarGrafoNoDirigido(grafoNoDirigido)){
            System.out.println("Se agregó con éxito. ");
        }


        System.out.println("CASO2: Agregar algunos nodos al grafo 0 de la app___________________________________________");
        Nodo<String> nodo00 = new Nodo<>("A");
        if (graphWorks.agregarNodoAlGrafo(0,nodo00)){
            System.out.println("Se agregó con éxito");
        }
        Nodo<String> nodo01 = new Nodo<>("B");
        Nodo<String> nodo02 = new Nodo<>("C");
        grafoNoDirigido.agregarNodo(nodo01);
        grafoNoDirigido.agregarNodo(nodo02);

        System.out.println("CASO3: AgregarArista (dirigir las aristas) a los nodos de un grafo específico_______________");
        if (grafoNoDirigido.agregarAristaANodo(0,2)){
            System.out.println("Se apuntó con éxito.");
        }
        grafoNoDirigido.agregarAristaANodo(0,1); // Dado que es un grafo no dirigido las aristas tendrán ese doble camino ida y vuelta

        System.out.println("Número de nodos: " + grafoNoDirigido.getContadorDeNodos()+ "\n" + "Número de arístas: " + grafoNoDirigido.getContadorDeAristas());

        System.out.println("CASO4: Hacer el recorrido a profundidad en un grafo existente en GraphWorks ________________");
        graphWorks.recorridoEnProfundidadGrafoNoDirigido(nodo00, grafoNoDirigido);

    }
}