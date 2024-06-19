package estructura;

public class ListaCircular implements Lista {
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;

    // Constructor
    public ListaCircular() {
        this.primerNodo = null;
        this.ultimoNodo = null;
    }

    @Override
    public void agregar(int valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
            ultimoNodo.setSiguiente(primerNodo);
        } else {
            ultimoNodo.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(primerNodo);
            ultimoNodo = nuevoNodo;
        }
    }

    @Override
    public int obtener(int index) {
        NodoLista actual = primerNodo;
        int contador = 0;
        do {
            if (contador == index) {
                return actual.getValor();
            }
            actual = actual.getSiguiente();
            contador++;
        } while (actual != primerNodo);
        throw new IndexOutOfBoundsException("Indice fuera del limite");
    }

    @Override
    public boolean eliminar(int index) {
        if (primerNodo == null) {
            return false;
        }
        if (index == 0) {
            if (primerNodo == ultimoNodo) {
                primerNodo = null;
                ultimoNodo = null;
            } else {
                primerNodo = primerNodo.getSiguiente();
                ultimoNodo.setSiguiente(primerNodo);
            }
            return true;
        }
        NodoLista actual = primerNodo;
        NodoLista previo = null;
        int contador = 0;
        do {
            if (contador == index) {
                if (previo != null) {
                    previo.setSiguiente(actual.getSiguiente());
                    if (actual == ultimoNodo) {
                        ultimoNodo = previo;
                    }
                    return true;
                }
            }
            previo = actual;
            actual = actual.getSiguiente();
            contador++;
        } while (actual != primerNodo);
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

