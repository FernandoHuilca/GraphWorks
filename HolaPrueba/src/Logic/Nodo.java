package Logic;

import java.util.ArrayList;

public class Nodo<T> {
    private T infoNodo;
    private ArrayList<Nodo<T>> nodosAdyacentes;
    private boolean visitado;


    public Nodo(T infoNodo) {
        this.infoNodo = infoNodo;
        nodosAdyacentes = new ArrayList<>();
        visitado = false;
    }

    public Nodo() {
        this.infoNodo = null;
        nodosAdyacentes = new ArrayList<>();
        visitado = false;
    }

    public T getInfoNodo() {
        return infoNodo;
    }

    public void setInfoNodo(T infoNodo) {
        this.infoNodo = infoNodo;
    }

    public ArrayList<Nodo<T>> getNodosAdyacentes() {
        return nodosAdyacentes;
    }

    public void setNodosAdyacentes(ArrayList<Nodo<T>> nodosAdyacentes) {
        this.nodosAdyacentes = nodosAdyacentes;
    }

    public boolean agregarAdyacente(Nodo<T> nodoDestino) {
        nodosAdyacentes.add(nodoDestino);
        return true;
    }

    public void setNodoAdyacente(int numNodoDeLaLista, Nodo<T> nuevoNodo) {
    nodosAdyacentes.set(numNodoDeLaLista,nuevoNodo);
    }

    public Nodo<T> getNodoAdyacente(int numLisNodosAdyacentes) {
        return nodosAdyacentes.get(numLisNodosAdyacentes);
    }

    public void setEstadoVisitado(boolean valor) {
        visitado =valor;
    }

    public boolean estaVisitado() {
        return visitado;
    }
    //TODO: cambiar de ArrayList a mi propia list, no es que sea mejor, pero yo la hice así que quiero ocupar jeje
}
