package Logic;

import javax.swing.undo.CannotUndoException;
import java.util.ArrayList;

public abstract class Grafo {
    protected ArrayList<Nodo<String>> nodosDelGrafo;
    protected int contadorDeNodos;
    protected int contadorDeAristas;
    private String salida1 = null;

    public Grafo() {
        nodosDelGrafo = new ArrayList<>();
        contadorDeNodos = 0;
        contadorDeAristas = 0;
    }


    public boolean agregarNodo(Nodo<String> nuevoNodo) {
        nodosDelGrafo.add(nuevoNodo);
        contadorDeNodos++;
        return true;
    }


    public abstract boolean agregarAristaANodo(int nodoOrigen, int nodoDestino);

    public ArrayList<Nodo<String>> getNodosDelGrafo() {
        return nodosDelGrafo;
    }


    //---------------------------------------------------------------------------------
    public ArrayList<String> getTrazaRecorridoAProfundidad(int numNodoInicial) {
        Nodo<String> nodoInicial = this.getNodo(numNodoInicial);
        ArrayList<Nodo<String>> visitados = new ArrayList<>();
        Pila<Nodo> pila = new Pila<>();
        ArrayList<String> trazaRecorridoAProfundidad = new ArrayList<>();
        recorridoDFS(nodoInicial, visitados, pila, trazaRecorridoAProfundidad);
        return trazaRecorridoAProfundidad;
    }

    private void recorridoDFS(Nodo<String> nodoInicial, ArrayList<Nodo<String>> visitados, Pila<Nodo> pila, ArrayList<String> trazaRecorridoAProfundidad) {
        if (nodoInicial == null) return;  // Verifica que el nodo no sea nulo
        pila.add(nodoInicial);
        visitados.add(nodoInicial);


        String aux = " ";
        for (int i = 0; i < pila.getNumDeDatos(); i++) {
            aux = aux + " " + pila.getDato(i).getInfoNodo();
        }
        trazaRecorridoAProfundidad.add(aux);

        // Recorrer los nodos adyacentes (nodos apuntados)
        for (Nodo<String> nodoApuntado : nodoInicial.getNodosAdyacentes()) {
            // Si el nodo no ha sido visitado, se realiza la llamada recursiva
            if (!visitados.contains(nodoApuntado)) {
                recorridoDFS(nodoApuntado, visitados, pila, trazaRecorridoAProfundidad);
            }
        }

        pila.eliminarDato();

        String aux1 = " ";
        for (int i = 0; i < pila.getNumDeDatos(); i++) {
            aux1 = aux1 + " " + pila.getDato(i).getInfoNodo();
        }
        trazaRecorridoAProfundidad.add(aux1);

        // Verificar si quedan nodos no visitados en el grafo
        if (pila.estaVacia() && !yaRecorriTodosLosNodos()) {
            Nodo<String> siguienteNodoNoVisitado = this.getNoVisitado();
            if (siguienteNodoNoVisitado != null) {
                recorridoDFS(siguienteNodoNoVisitado, visitados, pila, trazaRecorridoAProfundidad);
            }
        }

    }

    // Método para verificar si todos los nodos fueron recorridos
    private boolean yaRecorriTodosLosNodos() {
        // Verifica si todos los nodos del grafo han sido visitados
        for (Nodo<String> nodo : nodosDelGrafo) {
            if (!nodoHaSidoVisitado(nodo)) {
                return false;  // Si algún nodo no ha sido visitado, retornamos false
            }
        }
        return true;  // Si todos los nodos han sido visitados, retornamos true
    }

    // Método para verificar si un nodo ha sido visitado
    private boolean nodoHaSidoVisitado(Nodo<String> nodo) {
        for (Nodo<String> visitado : nodosDelGrafo) {
            if (visitado.equals(nodo)) {
                return true;
            }
        }
        return false;
    }

    // Método que devuelve el primer nodo no visitado
    public Nodo<String> getNoVisitado() {
        for (Nodo<String> nodo : nodosDelGrafo) {
            if (!nodoHaSidoVisitado(nodo)) {
                return nodo;  // Retorna el primer nodo no visitado
            }
        }
        return null;  // Si todos los nodos han sido visitados, retorna null
    }


    //___________________________________________________________________________________


    private Nodo<String> getNodo(int numNodo) {
        return nodosDelGrafo.get(numNodo);
    }

    public int getContadorDeNodos() {
        return contadorDeNodos;
    }

    public int getContadorDeAristas() {
        return contadorDeAristas;
    }

    public String getCaminoDeSalida(int numNodoEntrada, int numNodoSalida) {
        Nodo<String> nodoEntrada = this.getNodo(numNodoEntrada);
        Nodo<String> nodoSalida = this.getNodo(numNodoSalida);
        ArrayList<Nodo<String>> visitados = new ArrayList<>();
        Pila<Nodo> pila = new Pila<>();
        caminoDeSalida(nodoEntrada, nodoSalida, visitados, pila);
        return salida1;
    }

    private void caminoDeSalida(Nodo<String> nodoEntrada, Nodo<String> nodoSalida, ArrayList<Nodo<String>> visitados, Pila<Nodo> pila) {
        if (nodoEntrada == nodoSalida) {
            salida1 = nodoEntrada.getInfoNodo();
            return;
        }
        pila.add(nodoEntrada);
        visitados.add(nodoEntrada);


        // Recorrer los nodos adyacentes (nodos apuntados)
        for (Nodo<String> nodoApuntado : nodoEntrada.getNodosAdyacentes()) {

            if (nodoApuntado == nodoSalida) {
                String aux = " ";
                for (int i = 0; i < pila.getNumDeDatos(); i++) {
                    aux = aux + " " + pila.getDato(i).getInfoNodo();
                    System.out.println(aux);
                }
                salida1 = aux + " " + nodoSalida.getInfoNodo();
                return;

            }
            // Si el nodo no ha sido visitado, se realiza la llamada recursiva
            if (!visitados.contains(nodoApuntado)) {
                caminoDeSalida(nodoApuntado, nodoSalida, visitados, pila);
            }
        }

        pila.eliminarDato();


        // Verificar si quedan nodos no visitados en el grafo
        if (pila.estaVacia() && !yaRecorriTodosLosNodos()) {
            Nodo<String> siguienteNodoNoVisitado = this.getNoVisitado();
            if (siguienteNodoNoVisitado != null) {
                caminoDeSalida(siguienteNodoNoVisitado, nodoSalida, visitados, pila);
            }
        }
    }


    //TODO: Cambiar por mi propia ArrayList
    // TODO: Todo grafo va a tener nodos de tipo String?
    //TODO: arreglar lo de tener un String como salida como atributo de la clase general

}
