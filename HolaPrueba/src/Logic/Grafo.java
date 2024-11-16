package Logic;

import java.util.ArrayList;

public abstract class Grafo {
    protected ArrayList<Nodo<String>> nodosDelGrafo;
    protected int contadorDeNodos;
    protected int contadorDeAristas;

    public Grafo() {
        nodosDelGrafo = new ArrayList<>();
        contadorDeNodos = 0;
    }


    public boolean agregarNodo(Nodo<String> nuevoNodo) {
        nodosDelGrafo.add(nuevoNodo);
        contadorDeNodos++;
        return true;
    }

    public int getContadorDeNodos() {
        return contadorDeNodos;
    }

    public int getContadorDeAristas() {
        return contadorDeAristas;
    }

    public abstract boolean agregarAristaANodo(int nodoOrigen, int nodoDestino);

    public ArrayList<Nodo<String>> getNodosDelGrafo() {
        return nodosDelGrafo;
    }

    //TODO: Cambiar por mi propia ArrayList
    // TODO: Todo grafo va a tener nodos de tipo String?

}
