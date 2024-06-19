package estructura;

public class ListaEnlazada implements Lista {
    private NodoLista primerNodo;

    // Constructor
    public ListaEnlazada() {
        this.primerNodo = null;
    }

    @Override
    public void agregar(int valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            NodoLista actual = primerNodo;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    @Override
    public int obtener(int index) {
        NodoLista actual = primerNodo;
        int contador = 0;
        while (actual != null) {
            if (contador == index) {
                return actual.getValor();
            }
            actual = actual.getSiguiente();
            contador++;
        }
        throw new IndexOutOfBoundsException("Índice fuera de los límites");
    }

    @Override
    public boolean eliminar(int index) {
        if (index == 0) {
            if (primerNodo != null) {
                primerNodo = primerNodo.getSiguiente();
                return true;
            } else {
                return false;
            }
        }
        NodoLista actual = primerNodo;
        NodoLista previo = null;
        int contador = 0;
        while (actual != null) {
            if (contador == index) {
                if (previo != null) {
                    previo.setSiguiente(actual.getSiguiente());
                    return true;
                }
            }
            previo = actual;
            actual = actual.getSiguiente();
            contador++;
        }
        return false;
    }

    private class NodoLista {
        private int valor;
        private NodoLista siguiente;

        // Constructor
        public NodoLista(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }

        public int getValor() {
            return valor;
        }

        public NodoLista getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(NodoLista siguiente) {
            this.siguiente = siguiente;
        }
    }
}
