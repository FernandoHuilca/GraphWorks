package com.example.laberinto;

import Logic.GrafoNoDirigido;
import Logic.GraphWorks;
import Logic.Nodo;

// Author:
public class Main {
    public static void main(String[] args) {

        GraphWorks graphWorks = GraphWorks.getInstance();
        GrafoNoDirigido grafoNoDirigido = new GrafoNoDirigido();
        graphWorks.agregarGrafoNoDirigido(grafoNoDirigido);


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

        //System.out.println("CASO3: AgregarArista (dirigir las aristas) a los nodos de un grafo específico_______________");
        grafoNoDirigido.agregarAristaANodo(0,1);
        grafoNoDirigido.agregarAristaANodo(1,2);
        grafoNoDirigido.agregarAristaANodo(2,3);
        grafoNoDirigido.agregarAristaANodo(3,4);
        grafoNoDirigido.agregarAristaANodo(4,5);
        grafoNoDirigido.agregarAristaANodo(5,6);
        grafoNoDirigido.agregarAristaANodo(6,7);
        grafoNoDirigido.agregarAristaANodo(7,8);
        grafoNoDirigido.agregarAristaANodo(8,9);
        grafoNoDirigido.agregarAristaANodo(9,10);
        grafoNoDirigido.agregarAristaANodo(10,11);
        grafoNoDirigido.agregarAristaANodo(11,12);
        grafoNoDirigido.agregarAristaANodo(9,13);
        grafoNoDirigido.agregarAristaANodo(13,14);
        grafoNoDirigido.agregarAristaANodo(14,15);
        grafoNoDirigido.agregarAristaANodo(15,16);
        grafoNoDirigido.agregarAristaANodo(16,17);
        grafoNoDirigido.agregarAristaANodo(15,18);
        grafoNoDirigido.agregarAristaANodo(18,19);
        grafoNoDirigido.agregarAristaANodo(18,20);
        grafoNoDirigido.agregarAristaANodo(0,21);
        grafoNoDirigido.agregarAristaANodo(21,22);
        grafoNoDirigido.agregarAristaANodo(22,23);
        grafoNoDirigido.agregarAristaANodo(23,24);
        grafoNoDirigido.agregarAristaANodo(24,25);



        System.out.println("Número de nodos: " + grafoNoDirigido.getContadorDeNodos()+ "\n" + "Número de arístas: " + grafoNoDirigido.getContadorDeAristas());

       // System.out.println("CASO4: Hacer el recorrido a profundidad en un grafo existente en GraphWorks ________________");
        System.out.println("_______________________ LA TRAZA DE LA PILA ES _______________________");
        graphWorks.aplicarRecorridoEnLaberinto(grafoNoDirigido.getNodosDelGrafo().get(0),grafoNoDirigido.getNodosDelGrafo().get(17), grafoNoDirigido);



    }
}