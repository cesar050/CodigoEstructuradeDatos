/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Cesarin
 */
public class NodoArbol extends Nodo{
    
    private NodoArbol nodoIzquierdo;
    private NodoArbol nodoDerecho;

    public NodoArbol(int valor) {
        super(valor);
    }

    public NodoArbol getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(NodoArbol nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(NodoArbol nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }

    public void insertarNodo(int _valor) {
        if(_valor < this.valor) {   //Se evalua el nodo raiz
            //Insertar en lado Izquierdo
            if(this.nodoIzquierdo == null){
                this.nodoIzquierdo = new NodoArbol(_valor); 
            } else {
                this.nodoIzquierdo.insertarNodo(_valor);    // recursividad
            }
        } else {
            //Insertar en lado Derecho
            if(this.nodoDerecho == null){   //Se evalua el nodo raiz
                this.nodoDerecho = new NodoArbol(_valor);  
            } else {
                this.nodoDerecho.insertarNodo(_valor);  // recursividad
            }

        }
    }
    
    public NodoArbol delete(NodoArbol root, int valor){
        
        if (root == null) {
            return root;
        }

        if (valor < root.getValor()) {
            root.setNodoIzquierdo(delete(root.getNodoIzquierdo(), valor));
        } else if (valor > root.getValor()) {
            root.setNodoDerecho(delete(root.getNodoDerecho(), valor));
        } else {
            return null;
            
        }

        return root;
    }

    
}
