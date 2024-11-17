package Logic;
public class Pila<T> {

    private ListaSimple<T> datos;

    public Pila() {
        this.datos = new ListaSimple<>();
    }

    public void add(T dato) {
        this.datos.agregarALaDerecha(dato); // Agregar a la derecha para cumplir LIFO
    }

    public T getDato(int numDato) {
        return datos.getDato(numDato);
    }

    public int getNumDeDatos() {
        return datos.getNumeroDeDatos();
    }

    public T eliminarDato() {
        if (datos.getNumeroDeDatos() == 0) {
            return null; // La pila está vacía
        }
        T dato = datos.getDato(0); // Obtener el dato en el inicio
        datos.eliminarALaDerecha(); // Eliminar desde la derecha para cumplir LIFO
        return dato;
    }

    public boolean estaVacia() {
        return datos.getNumeroDeDatos() == 0;
    }
}
