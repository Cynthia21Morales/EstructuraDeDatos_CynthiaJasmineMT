package com.jasminesystems.estructuras1.funciones;

public class ArbolBinario {

    private Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }
        return actual;
    }

    public String inorden() {
        StringBuilder sb = new StringBuilder();
        inordenRecursivo(raiz, sb);
        return sb.toString();
    }

    private void inordenRecursivo(Nodo nodo, StringBuilder sb) {
        if (nodo != null) {
            inordenRecursivo(nodo.izquierdo, sb);
            sb.append(nodo.valor).append(" ");
            inordenRecursivo(nodo.derecho, sb);
        }
    }
}


