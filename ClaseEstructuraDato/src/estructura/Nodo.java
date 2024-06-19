package estructura;

public class Nodo implements INodo {
    private int valor;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public boolean agregar(int valor) {
        if (this.valor > valor) {
            if (this.izquierda == null) {
                this.izquierda = new Nodo(valor);
                return true;
            } else {
                return this.izquierda.agregar(valor);
            }
        } else if (this.valor < valor) {
            if (this.derecha == null) {
                this.derecha = new Nodo(valor);
                return true;
            } else {
                return this.derecha.agregar(valor);
            }
        }
        return false;
    }

    public void inOrden() {
        if (this.izquierda != null) {
            this.izquierda.inOrden();
        }
        System.out.println(this.valor);
        if (this.derecha != null) {
            this.derecha.inOrden();
        }
    }

    public void preOrden() {
        System.out.println(this.valor);
        if (this.izquierda != null) {
            this.izquierda.preOrden();
        }
        if (this.derecha != null) {
            this.derecha.preOrden();
        }
    }

    public void postOrden() {
        if (this.izquierda != null) {
            this.izquierda.postOrden();
        }
        if (this.derecha != null) {
            this.derecha.postOrden();
        }
        System.out.println(this.valor);
    }
}
