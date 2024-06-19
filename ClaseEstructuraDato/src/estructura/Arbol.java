package estructura;

public class Arbol implements Estructura {
    protected Nodo raiz;

    public Arbol(int valor) {
        this.raiz = new Nodo(valor);
    }

    @Override
    public boolean agregar(int valor) {
        return raiz.agregar(valor);
    }

    public void inOrden() {
        this.raiz.inOrden();
    }

    public void postOrden(){
        this.raiz.postOrden();
    }

    public void preOrden(){
        this.raiz.preOrden();
    }
}

