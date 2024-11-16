package Logic;

import java.util.ArrayList;

public class GraphWorks {
    // atributo único para el patron singleton
    private static GraphWorks instance;
    //Otros atributos
    private ArrayList<GrafoNoDirigido> listGrafosNoDirigidos;


    //constructor privado
    private GraphWorks() {
        this.listGrafosNoDirigidos = new ArrayList<>();
    }

    //Devolver la única instancia de la app
    public static GraphWorks getInstance() {
        if (instance == null) {
            instance = new GraphWorks();
        }
        return instance;
    }

    // Agregar un Logic.Grafo a la lista de grafos de la app
    public boolean agregarGrafoNoDirigido(GrafoNoDirigido nuevoGrafoNoDirigido) {
        if (listGrafosNoDirigidos.add(nuevoGrafoNoDirigido)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean agregarNodoAlGrafo(int numeroDeLaListDeGrafos, Nodo<String> nuevoNodo) {
        if (listGrafosNoDirigidos.get(numeroDeLaListDeGrafos).agregarNodo(nuevoNodo)) {
            return true;
        }
        return false;
    }


    // Declara la lista 'salida' fuera del método que acumule el recorrido
    private ArrayList<String> salida = new ArrayList<>();
    Pila<Nodo> pila = new Pila<>();


    public void recorridoEnProfundidadGrafoNoDirigido(Nodo<String> nodoInicial, GrafoNoDirigido grafoAlQuePertenece) {
        if (nodoInicial == null) return;  // Verifica que el nodo no sea nulo

        pila.add(nodoInicial); // Agregar el nodo a la pila
        salida.add(nodoInicial.getInfoNodo());
        nodoInicial.setEstadoVisitado(true); // Marcar como visitado

        // Imprimir el estado actual de la pila
        imprimirEstadoPila();

        // Recorrer los nodos adyacentes (nodos apuntados)
        for (int i = 0; i < nodoInicial.getNodosAdyacentes().size(); i++) {
            Nodo<String> nodoApuntado = nodoInicial.getNodosAdyacentes().get(i);

            // Si el nodo no ha sido visitado, se realiza la llamada recursiva
            if (!nodoApuntado.estaVisitado()) {
                recorridoEnProfundidadGrafoNoDirigido(nodoApuntado, grafoAlQuePertenece);
            }
        }

        // Al terminar de visitar todos los nodos adyacentes, eliminamos el nodo de la pila y lo agregamos a 'salida'
        Nodo<String> nodoEliminado = pila.eliminarDato();

        // Imprimir el estado actual de la pila
        imprimirEstadoPila();

        // Verificar si quedan nodos no visitados en el grafo
        if (pila.estaVacia() && !yaRecorriTodosLosNodos(grafoAlQuePertenece)) {
            Nodo<String> siguienteNodoNoVisitado = grafoAlQuePertenece.getNoVisitado();
            if (siguienteNodoNoVisitado != null) {
                recorridoEnProfundidadGrafoNoDirigido(siguienteNodoNoVisitado, grafoAlQuePertenece);
            }
        }

        // Mostrar la salida solo al final del recorrido completo
        if (yaRecorriTodosLosNodos(grafoAlQuePertenece) && pila.estaVacia()) {
            System.out.println("La salida del recorrido es la siguiente: " + salida);
        }
    }

    private boolean yaRecorriTodosLosNodos(GrafoNoDirigido grafoAlQuePertenece) {
        // Verifica si todos los nodos del grafo han sido visitados
        for (Nodo<String> nodo : grafoAlQuePertenece.getNodosDelGrafo()) {
            if (nodo != null && !nodo.estaVisitado()) {
                return false; // Si encontramos un nodo no visitado, retornamos false
            }
        }
        return true; // Si todos los nodos han sido visitados, retornamos true
    }


    private void imprimirEstadoPila() {
        for (int i = 0; i < pila.getNumDeDatos(); i++) {
            System.out.print(" " + pila.getDato(i).getInfoNodo());
        }
        System.out.println(" ");
    }
}

