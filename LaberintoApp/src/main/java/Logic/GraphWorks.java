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

    public ArrayList<String> getTrazaRecorridoAProfundidad(int numGrafoGuardado, int nodoInicio) {
            return listGrafosNoDirigidos.get(numGrafoGuardado).getTrazaRecorridoAProfundidad(nodoInicio);
    }

    public int getNumAristas(int numGrafoGuardado) {
        return listGrafosNoDirigidos.get(numGrafoGuardado).getContadorDeAristas();
    }

    public int getNumNodos(int numGrafoGuardado) {
        return listGrafosNoDirigidos.get(numGrafoGuardado).getContadorDeNodos();
    }

    public String getCaminoDeSalida(int numGrafoGuardado, int numNodoEntrada, int numNodoSalida) {
        return listGrafosNoDirigidos.get(numGrafoGuardado).getCaminoDeSalida(numNodoEntrada, numNodoSalida);
    }
}

