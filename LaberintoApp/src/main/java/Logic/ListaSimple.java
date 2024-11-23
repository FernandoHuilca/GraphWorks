package Logic;

public class ListaSimple<T> {
    private Nodo<T> nodoInicio;
    private int contadorNodos;

    public ListaSimple() {
        this.nodoInicio = null;
        this.contadorNodos = 0;
    }

    public boolean agregarALaIzquierda(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (nodoInicio == null){
            nodoInicio = nuevoNodo;
        }else {
            nuevoNodo.agregarAdyacente(nodoInicio); // Apunta al antiguo inicio
            nodoInicio = nuevoNodo; // Se convierte en el nuevo inicio
        }
        contadorNodos++;
        return true;
    }

    public boolean agregarALaDerecha(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (nodoInicio == null) {
            nodoInicio = nuevoNodo;
        } else {
            Nodo<T> actual = nodoInicio;
            while (!actual.getNodosAdyacentes().isEmpty()) {
                actual = actual.getNodoAdyacente(0); // Avanza al último nodo
            }
            actual.agregarAdyacente(nuevoNodo); // Apunta al nuevo nodo
        }
        contadorNodos++;
        return true;
    }

    public int getNumeroDeDatos() {
        return contadorNodos;
    }

    public T getDato(int indice) {
        if (indice < 0 || indice >= contadorNodos) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        Nodo<T> actual = nodoInicio;
        for (int i = 0; i < indice; i++) {
            actual = actual.getNodoAdyacente(0);
        }

        return actual.getInfoNodo();
    }

    public boolean eliminarALaIzquierda() {
        if (nodoInicio == null) {
            return false; // La lista está vacía
        }
        if (nodoInicio.getNodosAdyacentes().isEmpty()) {
            nodoInicio = null; //caso en el que el nodo inicio sea solo uno
        } else {
            nodoInicio = nodoInicio.getNodoAdyacente(0); // Actualiza el inicio
        }
        contadorNodos--;
        return true;
    }

    public boolean eliminarALaDerecha() {
        if (nodoInicio == null) {
            return false; // La lista está vacía
        }

        if (nodoInicio.getNodosAdyacentes().isEmpty()) {
            nodoInicio = null; // Solo había un nodo
        } else {
            Nodo<T> actual = nodoInicio;
            while (!(actual.getNodoAdyacente(0).getNodosAdyacentes().isEmpty())) {
                actual = actual.getNodoAdyacente(0); // Avanza al penúltimo nodo
            }
            actual.getNodosAdyacentes().remove(0);; // Elimina el último nodo

        }
        contadorNodos--;
        return true;
    }

    public boolean eliminarEnIndice(int indice) {
        if (indice < 0 || indice >= contadorNodos) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        if (indice == 0) {
            return eliminarALaIzquierda();
        }

        Nodo<T> actual = nodoInicio;
        for (int i = 0; i < indice - 1; i++) {
            actual = actual.getNodoAdyacente(0);
        }
        actual.setNodoAdyacente(0, actual.getNodoAdyacente(0).getNodoAdyacente(0));
        contadorNodos--;
        return true;
    }

    public T buscarDato(T dato) {
        Nodo<T> actual = nodoInicio;
        while (!actual.getNodosAdyacentes().isEmpty()) {
            if (actual.getInfoNodo().equals(dato)) {
                return actual.getInfoNodo();
            }
            actual = actual.getNodoAdyacente(0);
        }
        return null; // No se encontró el dato
    }

    public boolean eliminarDato(T dato) {
        if (nodoInicio == null) {
            return false; // La lista está vacía
        }

        if (nodoInicio.getInfoNodo().equals(dato)) {
            eliminarALaIzquierda();
            contadorNodos--;
            return true;
        }

        Nodo<T> actual = nodoInicio;
        while (!actual.getNodosAdyacentes().isEmpty()) {
            if (actual.getNodoAdyacente(0).getInfoNodo().equals(dato)) {
                actual.setNodoAdyacente(0, actual.getNodoAdyacente(0).getNodoAdyacente(0));
                contadorNodos--;
                return true;
            }
            actual = actual.getNodoAdyacente(0);
        }
        return false; // No se encontró el dato
    }

    public boolean modificarDato(T datoActual, T nuevoDato) {
        Nodo<T> actual = nodoInicio;

        while (actual != null) {
            if (actual.getInfoNodo().equals(datoActual)) {
                actual.setInfoNodo(nuevoDato);
                return true;
            }
            actual = actual.getNodoAdyacente(0);
        }

        return false; // No se encontró el dato a modificar
    }

    public void clearAll() {
        nodoInicio = null;
        contadorNodos = 0;
    }

    // TODO: arreglar el error de que nodo tiene una lista de nodos y una lista da error si pones un índice que no existe no puedes igualar a null
}
