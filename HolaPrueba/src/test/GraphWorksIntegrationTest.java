package test;

import Logic.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraphWorksIntegrationTest {
    private GraphWorks graphWorks;
    private GrafoNoDirigido grafoNoDirigido;

    @BeforeEach
    public void setUp() {
        graphWorks = GraphWorks.getInstance();
        grafoNoDirigido = new GrafoNoDirigido();
    }
    @Test
    public void deberiaAgregarNodosAlGrafoExistenteDeGraphWorks() {
        // Given: un grafo no dirigido y tres nodos
        Nodo<String> nodoA = new Nodo<>("A");
        Nodo<String> nodoB = new Nodo<>("B");
        Nodo<String> nodoC = new Nodo<>("C");
        graphWorks.agregarGrafoNoDirigido(grafoNoDirigido);

        // When: se agregan nodos al grafo no dirigido
        boolean resultado = graphWorks.agregarNodoAlGrafo(0, nodoA)
                && grafoNoDirigido.agregarNodo(nodoB)
                && grafoNoDirigido.agregarNodo(nodoC);

        // Then: los nodos deberían haberse agregado correctamente
        assertTrue(resultado, "Los nodos deberían haberse agregado correctamente al grafo no dirigido.");
        assertEquals(3, grafoNoDirigido.getContadorDeNodos(), "El grafo debería tener 3 nodos.");
    }
    @Test
    public void deberiaAgregarGrafoNoDirigidoAGraphWorks() {
        // Given: un grafo no dirigido
        // Already created as 'grafoNoDirigido' and 'graphWorks'

        // When: se agrega el grafo no dirigido a graphWorks
        boolean resultado = graphWorks.agregarGrafoNoDirigido(grafoNoDirigido);

        // Then: el grafo debería haberse agregado correctamente
        assertTrue(resultado, "El grafo no dirigido debería haberse agregado exitosamente a graphWorks.");
    }



    @Test
    public void deberiaAgregarAristasEntreNodosDeGrafoNoDirigido() {
        // Given: un grafo no dirigido con tres nodos
        Nodo<String> nodoA = new Nodo<>("A");
        Nodo<String> nodoB = new Nodo<>("B");
        Nodo<String> nodoC = new Nodo<>("C");
        graphWorks.agregarGrafoNoDirigido(grafoNoDirigido);
        graphWorks.agregarNodoAlGrafo(0, nodoA);
        grafoNoDirigido.agregarNodo(nodoB);
        grafoNoDirigido.agregarNodo(nodoC);

        // When: se agregan aristas entre los nodos
        boolean resultado = grafoNoDirigido.agregarAristaANodo(0, 2)
                && grafoNoDirigido.agregarAristaANodo(0, 1);

        // Then: las aristas deberían haberse agregado correctamente
        assertTrue(resultado, "Las aristas deberían haberse agregado correctamente entre los nodos.");
        assertTrue(nodoA.getNodosAdyacentes().contains(nodoB), "El nodo B debería estar conectado con el nodo A.");
        assertTrue(nodoA.getNodosAdyacentes().contains(nodoC), "El nodo C debería estar conectado con el nodo A.");
        assertTrue(nodoB.getNodosAdyacentes().contains(nodoA), "El nodo A debería estar conectado con el nodo B.");
        assertTrue(nodoC.getNodosAdyacentes().contains(nodoA), "El nodo A debería estar conectado con el nodo C.");

        // Verifica el contador de nodos y aristas
        assertEquals(3, grafoNoDirigido.getContadorDeNodos(), "El grafo debería tener 3 nodos.");
        assertEquals(2, grafoNoDirigido.getContadorDeAristas(), "El grafo debería tener 2 aristas.");
    }
}
