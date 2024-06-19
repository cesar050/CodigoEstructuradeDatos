package estructura;

public class ListaDobleEnlazada implements Lista {
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;

    public ListaDobleEnlazada() {
        this.primerNodo = null;
        this.ultimoNodo = null;
    }

    @Override
    public void agregar(int valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            ultimoNodo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimoNodo);
            ultimoNodo = nuevoNodo;
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
        throw new IndexOutOfBoundsException("Inidice fuera del limite");
    }

    @Override
    public boolean eliminar(int index) {
        if (index == 0) {
            if (primerNodo != null) {
                primerNodo = primerNodo.getSiguiente();
                if (primerNodo != null) {
                    primerNodo.setAnterior(null);
                }
                return true;
            } else {
                return false;
            }
        }
        NodoLista actual = primerNodo;
        int contador = 0;
        while (actual != null) {
            if (contador == index) {
                if (actual.getAnterior() != null) {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                }
                if (actual.getSiguiente() != null) {
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                return true;
            }
            actual = actual.getSiguiente();
            contador++;
        }
        return false;
    }

    private class NodoLista {
        private int valor;
        private NodoLista siguiente;
        private NodoLista anterior;

        // Constructor
        public NodoLista(int valor) {
            this.valor = valor;
            this.siguiente = null;
            this.anterior = null;
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

        public NodoLista getAnterior() {
            return anterior;
        }

        public void setAnterior(NodoLista anterior) {
            this.anterior = anterior;
        }
    }
}

