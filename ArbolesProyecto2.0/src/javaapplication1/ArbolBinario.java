/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinario {

    private NodoArbol nodoRaiz;
    private NodoArbol nodoMarcado;  // Nodo actualmente marcado para animación

    public ArbolBinario() {
        this.nodoRaiz = null;
        this.nodoMarcado = null;
    }

    public NodoArbol getNodoRaiz() {
        return nodoRaiz;
    }

    public NodoArbol getNodoMarcado() {
        return nodoMarcado;
    }

    public void setNodoMarcado(NodoArbol nodoMarcado) {
        this.nodoMarcado = nodoMarcado;
    }

    public void agregarNodo(int valor) {
        nodoRaiz = agregarNodoRec(nodoRaiz, valor);
    }

    private NodoArbol agregarNodoRec(NodoArbol nodoActual, int valor) {
        if (nodoActual == null) {
            return new NodoArbol(valor);
        }

        if (valor < nodoActual.getValor()) {
            nodoActual.setNodoIzquierdo(agregarNodoRec(nodoActual.getNodoIzquierdo(), valor));
        } else if (valor > nodoActual.getValor()) {
            nodoActual.setNodoDerecho(agregarNodoRec(nodoActual.getNodoDerecho(), valor));
        }

        return nodoActual;
    }

    public void borrarNodo(int valor) {
        nodoRaiz = borrarNodoRec(nodoRaiz, valor);
    }

    private NodoArbol borrarNodoRec(NodoArbol nodoActual, int valor) {
        if (nodoActual == null) {
            return null;
        }

        if (valor < nodoActual.getValor()) {
            nodoActual.setNodoIzquierdo(borrarNodoRec(nodoActual.getNodoIzquierdo(), valor));
        } else if (valor > nodoActual.getValor()) {
            nodoActual.setNodoDerecho(borrarNodoRec(nodoActual.getNodoDerecho(), valor));
        } else {
            // Nodo a eliminar encontrado
            if (nodoActual.getNodoIzquierdo() == null) {
                return nodoActual.getNodoDerecho();
            } else if (nodoActual.getNodoDerecho() == null) {
                return nodoActual.getNodoIzquierdo();
            }

            // Nodo con dos hijos: obtener sucesor
            nodoActual.setValor(encontrarMinimoValor(nodoActual.getNodoDerecho()));
            nodoActual.setNodoDerecho(borrarNodoRec(nodoActual.getNodoDerecho(), nodoActual.getValor()));
        }

        return nodoActual;
    }

    private int encontrarMinimoValor(NodoArbol nodo) {
        int minValor = nodo.getValor();
        while (nodo.getNodoIzquierdo() != null) {
            minValor = nodo.getNodoIzquierdo().getValor();
            nodo = nodo.getNodoIzquierdo();
        }
        return minValor;
    }

    public NodoArbol buscarNodo(int valor) {
        return buscarNodoRec(nodoRaiz, valor);
    }

    private NodoArbol buscarNodoRec(NodoArbol nodoActual, int valor) {
        if (nodoActual == null || nodoActual.getValor() == valor) {
            return nodoActual;
        }

        if (valor < nodoActual.getValor()) {
            return buscarNodoRec(nodoActual.getNodoIzquierdo(), valor);
        } else {
            return buscarNodoRec(nodoActual.getNodoDerecho(), valor);
        }
    }

    public List<Integer> recorrerPreOrden() {
        List<Integer> recorrido = new ArrayList<>();
        recorrerPreOrdenRec(nodoRaiz, recorrido);
        return recorrido;
    }

    private void recorrerPreOrdenRec(NodoArbol nodo, List<Integer> recorrido) {
        if (nodo != null) {
            recorrido.add(nodo.getValor());
            recorrerPreOrdenRec(nodo.getNodoIzquierdo(), recorrido);
            recorrerPreOrdenRec(nodo.getNodoDerecho(), recorrido);
        }
    }

    public List<Integer> recorrerInOrden() {
        List<Integer> recorrido = new ArrayList<>();
        recorrerInOrdenRec(nodoRaiz, recorrido);
        return recorrido;
    }

    private void recorrerInOrdenRec(NodoArbol nodo, List<Integer> recorrido) {
        if (nodo != null) {
            recorrerInOrdenRec(nodo.getNodoIzquierdo(), recorrido);
            recorrido.add(nodo.getValor());
            recorrerInOrdenRec(nodo.getNodoDerecho(), recorrido);
        }
    }

    public List<Integer> recorrerPostOrden() {
        List<Integer> recorrido = new ArrayList<>();
        recorrerPostOrdenRec(nodoRaiz, recorrido);
        return recorrido;
    }

    private void recorrerPostOrdenRec(NodoArbol nodo, List<Integer> recorrido) {
        if (nodo != null) {
            recorrerPostOrdenRec(nodo.getNodoIzquierdo(), recorrido);
            recorrerPostOrdenRec(nodo.getNodoDerecho(), recorrido);
            recorrido.add(nodo.getValor());
        }
    }
}
