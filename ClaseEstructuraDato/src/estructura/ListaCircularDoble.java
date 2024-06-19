package estructura;

public class ListaCircularDoble implements Lista {
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;

    public ListaCircularDoble() {
        this.primerNodo = null;
        this.ultimoNodo = null;
    }

    @Override
    public void agregar(int valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
            primerNodo.setSiguiente(primerNodo);
            primerNodo.setAnterior(primerNodo);
        } else {
            ultimoNodo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimoNodo);
            nuevoNodo.setSiguiente(primerNodo);
            primerNodo.setAnterior(nuevoNodo);
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
                primerNodo.setAnterior(ultimoNodo);
            }
            return true;
        }
        NodoLista actual = primerNodo;
        int contador = 0;
        do {
            if (contador == index) {
                if (actual.getAnterior() != null) {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                }
                if (actual.getSiguiente() != null) {
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                if (actual == ultimoNodo) {
                    ultimoNodo = actual.getAnterior();
                }
                return true;
            }
            actual = actual.getSiguiente();
            contador++;
        } while (actual != primerNodo);
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

