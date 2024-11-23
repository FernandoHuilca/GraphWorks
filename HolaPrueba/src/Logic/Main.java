package Logic;

import java.util.ArrayList;

// Author:
public class Main {
    public static void main(String[] args) {

        GraphWorks graphWorks = GraphWorks.getInstance();
        GrafoNoDirigido grafoNoDirigido = new GrafoNoDirigido();
        GrafoNoDirigido grafoNoDirigido1 = new GrafoNoDirigido();
        graphWorks.agregarGrafoNoDirigido(grafoNoDirigido);
        graphWorks.agregarGrafoNoDirigido(grafoNoDirigido1);


        //System.out.println("CASO2: Agregar algunos nodos al grafo 0 de la app___________________________________________");
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


        grafoNoDirigido1.agregarNodo(new Nodo<>("A"));
        grafoNoDirigido1.agregarNodo(new Nodo<>("B"));
        grafoNoDirigido1.agregarNodo(new Nodo<>("C"));
        grafoNoDirigido1.agregarNodo(new Nodo<>("D"));
        grafoNoDirigido1.agregarNodo(new Nodo<>("E"));
        grafoNoDirigido1.agregarNodo(new Nodo<>("F"));
        grafoNoDirigido1.agregarNodo(new Nodo<>("G"));
        grafoNoDirigido1.agregarNodo(new Nodo<>("H"));
        grafoNoDirigido1.agregarNodo(new Nodo<>("I"));

        grafoNoDirigido1.agregarAristaANodo(0, 1);
        grafoNoDirigido1.agregarAristaANodo(1, 2);
        grafoNoDirigido1.agregarAristaANodo(2, 3);
        grafoNoDirigido1.agregarAristaANodo(2, 4);
        grafoNoDirigido1.agregarAristaANodo(0, 5);
        grafoNoDirigido1.agregarAristaANodo(5, 6);
        grafoNoDirigido1.agregarAristaANodo(5, 7);
        grafoNoDirigido1.agregarAristaANodo(7, 8);


        //System.out.println("CASO3: AgregarArista (dirigir las aristas) a los nodos de un grafo específico_______________");
        grafoNoDirigido.agregarAristaANodo(0, 1);
        grafoNoDirigido.agregarAristaANodo(1, 2);
        grafoNoDirigido.agregarAristaANodo(2, 3);
        grafoNoDirigido.agregarAristaANodo(3, 4);
        grafoNoDirigido.agregarAristaANodo(4, 5);
        grafoNoDirigido.agregarAristaANodo(5, 6);
        grafoNoDirigido.agregarAristaANodo(6, 7);
        grafoNoDirigido.agregarAristaANodo(7, 8);
        grafoNoDirigido.agregarAristaANodo(8, 9);
        grafoNoDirigido.agregarAristaANodo(9, 10);
        grafoNoDirigido.agregarAristaANodo(10, 11);
        grafoNoDirigido.agregarAristaANodo(11, 12);
        grafoNoDirigido.agregarAristaANodo(9, 13);
        grafoNoDirigido.agregarAristaANodo(13, 14);
        grafoNoDirigido.agregarAristaANodo(14, 15);
        grafoNoDirigido.agregarAristaANodo(15, 16);
        grafoNoDirigido.agregarAristaANodo(16, 17);
        grafoNoDirigido.agregarAristaANodo(15, 18);
        grafoNoDirigido.agregarAristaANodo(18, 19);
        grafoNoDirigido.agregarAristaANodo(18, 20);
        grafoNoDirigido.agregarAristaANodo(0, 21);
        grafoNoDirigido.agregarAristaANodo(21, 22);
        grafoNoDirigido.agregarAristaANodo(22, 23);
        grafoNoDirigido.agregarAristaANodo(23, 24);
        grafoNoDirigido.agregarAristaANodo(24, 25);

        System.out.println("Caso 1: Imprimir cantidad de nodos, aristas y traza del recorrido DFS de un grafo guardado en app");
        System.out.println("Numero de aristas del grafo : " + graphWorks.getNumAristas(0));
        System.out.println("Numero de Nodos del grafo : " + graphWorks.getNumNodos(0));

        // el método " graphWorks.getTrazaRecorridoAProfundidad(0, 0) " devuelve un arrayList de tipo String donde
        // contiene cada iteración de la pila por lo cual si se quiere ver todos se tiene que recorrer
        // todo el arraylist que te devuleva

        ArrayList<String> auxTrazaPilaDFS = graphWorks.getTrazaRecorridoAProfundidad(0, 0);
        for (int i = 0; i < auxTrazaPilaDFS.size(); i++) {
            System.out.println(auxTrazaPilaDFS.get(i));
        }



        System.out.println("___________________________________________________________________________________________\n");


        System.out.println("Numero de aristas del grafo : " + graphWorks.getNumAristas(1));
        System.out.println("Numero de Nodos del grafo : " + graphWorks.getNumNodos(1));
        ArrayList<String> auxTrazaPilaDFS1 = graphWorks.getTrazaRecorridoAProfundidad(1, 0);

        for (int i = 0; i < auxTrazaPilaDFS1.size(); i++) {
            System.out.println(auxTrazaPilaDFS1.get(i));

        }


        System.out.println("CASO 2: Imprimir la salida de un grafo NO dirigido asumiendo que este es un laberinto");
        String caminoDeSalida = graphWorks.getCaminoDeSalida(0, 0,17);
        System.out.println("camino de salida: \n" + caminoDeSalida );
        String caminoDeSalida2 = graphWorks.getCaminoDeSalida(1, 0,5);
        System.out.println("camino de salida: \n" + caminoDeSalida2 );
    }
}