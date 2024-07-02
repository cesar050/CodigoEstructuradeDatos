/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesarin
 */
public class ArbolBinario extends EstructuraDeDato {

    private int altura;
    private NodoArbol nodoRaiz;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public NodoArbol getNodoRaiz() {
        return nodoRaiz;
    }

    public void setNodoRaiz(NodoArbol nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }

    @Override
    public void agregarNodo(int valor) {
        if (this.nodoRaiz == null) {
            this.nodoRaiz = new NodoArbol(valor);
        } else {
            this.nodoRaiz.insertarNodo(valor);
        }
    }

    @Override
    public void insertarNodo(int dato, int posicion) {
    }

    @Override
    public void recorrer() {
    }

    @Override
    public void borrarNodo(int posicion) {
        if (nodoRaiz == null) {
            return;
        }

        nodoRaiz = nodoRaiz.delete(nodoRaiz, posicion);
        recorrerInOrden();
    }

    @Override
    public void limpiar() {
        this.nodoRaiz = null;
    }

    @Override
    public void modificarNodo(int posicion) {
    }

    @Override
    public void ordenar() {
    }

    @Override
    public void buscarPorDato(int dato) {
    }

    // PreOrden: Raiz, Izquierdo, Derecho
    public List<Integer> recorrerPreOrden() {
        List<Integer> result = new ArrayList<>();
        preOrden(this.nodoRaiz, result);
        return result;
    }

    private void preOrden(NodoArbol nodo, List<Integer> result) {
        if (nodo == null) {
            return;
        } else {
            result.add(nodo.getValor());
            preOrden(nodo.getNodoIzquierdo(), result);
            preOrden(nodo.getNodoDerecho(), result);
        }
    }

    // InOrden: Izquierdo, Raiz, Derecho
    public List<Integer> recorrerInOrden() {
        List<Integer> result = new ArrayList<>();
        inOrden(this.nodoRaiz, result);
        return result;
    }

    private void inOrden(NodoArbol nodo, List<Integer> result) {
        if (nodo == null) {
            return;
        } else {
            inOrden(nodo.getNodoIzquierdo(), result);
            result.add(nodo.getValor());
            inOrden(nodo.getNodoDerecho(), result);
        }
    }

    // PostOrden: Izquierdo, Derecho, Raiz
    public List<Integer> recorrerPostOrden() {
        List<Integer> result = new ArrayList<>();
        postOrden(this.nodoRaiz, result);
        return result;
    }

    private void postOrden(NodoArbol nodo, List<Integer> result) {
        if (nodo == null) {
            return;
        } else {
            postOrden(nodo.getNodoIzquierdo(), result);
            postOrden(nodo.getNodoDerecho(), result);
            result.add(nodo.getValor());
        }
    }

    // Método para reconstruir el árbol balanceado
    public void reconstruirBalanceado(List<Integer> valores) {
        limpiar();
        nodoRaiz = construirBalanceado(valores, 0, valores.size() - 1);
    }

    private NodoArbol construirBalanceado(List<Integer> valores, int inicio, int fin) {
        if (inicio > fin) {
            return null;
        }

        int medio = (inicio + fin) / 2;
        NodoArbol nodo = new NodoArbol(valores.get(medio));

        nodo.setNodoIzquierdo(construirBalanceado(valores, inicio, medio - 1));
        nodo.setNodoDerecho(construirBalanceado(valores, medio + 1, fin));

        return nodo;
    }
}