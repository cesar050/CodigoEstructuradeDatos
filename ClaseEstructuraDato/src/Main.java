import estructura.*;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso de ArbolAVL
        Estructura arbol = new ArbolAVL(10);
        arbol.agregar(5);
        arbol.agregar(6);
        arbol.agregar(15);
        arbol.agregar(12);
        arbol.agregar(20);
        arbol.agregar(8);
        arbol.agregar(3);
        System.out.println("Recorrido inOrden del Árbol AVL:");
        ((ArbolAVL) arbol).inOrden();
        System.out.println("\nEstructura del Árbol AVL:");
        ((ArbolAVL) arbol).imprimirArbol();

        // Ejemplo de uso de ListaEnlazada
        Lista lista = new ListaEnlazada();
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        System.out.println("\nElementos de la Lista Enlazada:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Elemento en índice " + i + ": " + lista.obtener(i));
        }

        lista.eliminar(2);
        System.out.println("\nElementos de la Lista Enlazada después de eliminar el índice 2:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento en índice " + i + ": " + lista.obtener(i));
        }

        // Ejemplo de uso de ListaDobleEnlazada
        Lista listaDoble = new ListaDobleEnlazada();
        listaDoble.agregar(10);
        listaDoble.agregar(20);
        listaDoble.agregar(30);
        listaDoble.agregar(40);
        System.out.println("\nElementos de la Lista Doble Enlazada:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Elemento en índice " + i + ": " + listaDoble.obtener(i));
        }

        listaDoble.eliminar(2);
        System.out.println("\nElementos de la Lista Doble Enlazada después de eliminar el índice 2:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento en índice " + i + ": " + listaDoble.obtener(i));
        }

        // Ejemplo de uso de ListaCircular
        Lista listaCircular = new ListaCircular();
        listaCircular.agregar(10);
        listaCircular.agregar(20);
        listaCircular.agregar(30);
        listaCircular.agregar(40);
        System.out.println("\nElementos de la Lista Circular:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Elemento en índice " + i + ": " + listaCircular.obtener(i));
        }

        listaCircular.eliminar(2);
        System.out.println("\nElementos de la Lista Circular después de eliminar el índice 2:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento en índice " + i + ": " + listaCircular.obtener(i));
        }

        // Ejemplo de uso de ListaCircularDoble
        Lista listaCircularDoble = new ListaCircularDoble();
        listaCircularDoble.agregar(10);
        listaCircularDoble.agregar(20);
        listaCircularDoble.agregar(30);
        listaCircularDoble.agregar(40);
        System.out.println("\nElementos de la Lista Circular Doble:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Elemento en índice " + i + ": " + listaCircularDoble.obtener(i));
        }

        listaCircularDoble.eliminar(2);
        System.out.println("\nElementos de la Lista Circular Doble después de eliminar el índice 2:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento en índice " + i + ": " + listaCircularDoble.obtener(i));
        }

        // Ejemplo de uso de GrafoSimpleNoDirigido
        GrafoSimpleNoDirigido grafo = new GrafoSimpleNoDirigido();

        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);

        grafo.agregarArista(1, 2);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(3, 4);
        grafo.agregarArista(4, 1);

        System.out.println("Vértices del grafo:");
        for (int vertice : grafo.obtenerVertices()) {
            System.out.println(vertice);
        }

        System.out.println("\nAristas del grafo:");
        for (Arista arista : grafo.obtenerAristas()) {
            System.out.println("Origen: " + arista.getOrigen() + ", Destino: " + arista.getDestino());
        }

        grafo.eliminarArista(2, 3);
        System.out.println("\nAristas del grafo después de eliminar la arista (2, 3):");
        for (Arista arista : grafo.obtenerAristas()) {
            System.out.println("Origen: " + arista.getOrigen() + ", Destino: " + arista.getDestino());
        }

        grafo.eliminarVertice(4);
        System.out.println("\nVértices del grafo después de eliminar el vértice 4:");
        for (int vertice : grafo.obtenerVertices()) {
            System.out.println(vertice);
        }

        System.out.println("\nAristas del grafo después de eliminar el vértice 4:");
        for (Arista arista : grafo.obtenerAristas()) {
            System.out.println("Origen: " + arista.getOrigen() + ", Destino: " + arista.getDestino());
        }
    }
}

