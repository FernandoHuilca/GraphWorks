package Logic;

public class GrafoNoDirigido extends Grafo {

    public GrafoNoDirigido(){
        super();
    }

    @Override
    public boolean agregarAristaANodo(int nodoOrigen, int nodoDestino) {
        if (apuntarNodo(nodoOrigen, nodoDestino) && apuntarNodo(nodoDestino,nodoOrigen)){
            contadorDeAristas++;
            return true;
        }
        return false;
    }


    private boolean apuntarNodo(int nodoOrigen, int nodoDestino) {
        return nodosDelGrafo.get(nodoOrigen).agregarAdyacente(nodosDelGrafo.get(nodoDestino));
    }

    public Nodo<String> getNoVisitado() {
        // Devuelve el primer nodo que no ha sido visitado
        for (Nodo<String> nodo : nodosDelGrafo) {
            if (nodo != null && !nodo.estaVisitado()) {
                return nodo;
            }
        }
        return null; // Si todos los nodos han sido visitados, retorna null
    }
}
