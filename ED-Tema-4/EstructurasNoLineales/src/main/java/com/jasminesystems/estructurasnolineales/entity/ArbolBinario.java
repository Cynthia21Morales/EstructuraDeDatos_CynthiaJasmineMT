package com.jasminesystems.estructurasnolineales.entity;

public class ArbolBinario {

    private NodoArbol raiz;

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoArbol insertarRec(NodoArbol nodo, int valor) {
        if (nodo == null) return new NodoArbol(valor);
        if (valor < nodo.valor)
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        else
            nodo.derecho = insertarRec(nodo.derecho, valor);
        return nodo;
    }

    public String inOrden() {
        return inOrdenRec(raiz);
    }

    private String inOrdenRec(NodoArbol nodo) {
        if (nodo == null) return "";
        return inOrdenRec(nodo.izquierdo) + nodo.valor + " " + inOrdenRec(nodo.derecho);
    }
}
