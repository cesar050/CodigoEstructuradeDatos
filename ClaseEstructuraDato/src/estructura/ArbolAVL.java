package estructura;

public class ArbolAVL extends Arbol {

    public ArbolAVL(int valor) {
        super(valor);
    }

    @Override
    public boolean agregar(int valor) {
        boolean agregado = super.agregar(valor);
        if (agregado) {
            raiz = balancear(raiz);
        }
        return agregado;
    }

    private Nodo balancear(Nodo nodo) {
        if (nodo == null) {
            return null;
        }
        nodo.setIzquierda(balancear(nodo.getIzquierda()));
        nodo.setDerecha(balancear(nodo.getDerecha()));
        nodo = balancearNodo(nodo);
        return nodo;
    }

    private Nodo balancearNodo(Nodo nodo) {
        int balanceFactor = obtenerBalanceFactor(nodo);
        if (balanceFactor > 1) {
            if (obtenerBalanceFactor(nodo.getIzquierda()) < 0) {
                nodo.setIzquierda(rotacionIzquierda(nodo.getIzquierda()));
            }
            nodo = rotacionDerecha(nodo);
        } else if (balanceFactor < -1) {
            if (obtenerBalanceFactor(nodo.getDerecha()) > 0) {
                nodo.setDerecha(rotacionDerecha(nodo.getDerecha()));
            }
            nodo = rotacionIzquierda(nodo);
        }
        return nodo;
    }

    private int obtenerAltura(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return Math.max(obtenerAltura(nodo.getIzquierda()), obtenerAltura(nodo.getDerecha())) + 1;
    }

    private int obtenerBalanceFactor(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return obtenerAltura(nodo.getIzquierda()) - obtenerAltura(nodo.getDerecha());
    }

    private Nodo rotacionDerecha(Nodo nodo) {
        Nodo nuevaRaiz = nodo.getIzquierda();
        nodo.setIzquierda(nuevaRaiz.getDerecha());
        nuevaRaiz.setDerecha(nodo);
        return nuevaRaiz;
    }

    private Nodo rotacionIzquierda(Nodo nodo) {
        Nodo nuevaRaiz = nodo.getDerecha();
        nodo.setDerecha(nuevaRaiz.getIzquierda());
        nuevaRaiz.setIzquierda(nodo);
        return nuevaRaiz;
    }

    public void imprimirArbol() {
        imprimirArbol(raiz, "", true);
    }

    private void imprimirArbol(Nodo nodo, String indent, boolean esDerecha) {
        if (nodo != null) {
            System.out.print(indent);
            if (esDerecha) {
                System.out.print("Derecha---- ");
                indent += "   ";
            } else {
                System.out.print("Izquierda--- ");
                indent += "|  ";
            }
            System.out.println(nodo.getValor() + " (BF: " + obtenerBalanceFactor(nodo) + ")");
            imprimirArbol(nodo.getIzquierda(), indent, false);
            imprimirArbol(nodo.getDerecha(), indent, true);
        }
    }
}
