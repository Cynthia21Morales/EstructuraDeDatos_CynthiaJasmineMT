package com.jasminesystems.estructurasarbolbinario.funciones;

public class ArbolBinario {

    private Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.izquierdo = insertarRec(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRec(actual.derecho, valor);
        }
        return actual;
    }

    // ===== INORDEN =====
    public String inorden() {
        StringBuilder sb = new StringBuilder();
        inordenRec(raiz, sb);
        return sb.toString();
    }

    private void inordenRec(Nodo nodo, StringBuilder sb) {
        if (nodo != null) {
            inordenRec(nodo.izquierdo, sb);
            sb.append(nodo.valor).append(" ");
            inordenRec(nodo.derecho, sb);
        }
    }

    // ===== PREORDEN =====
    public String preorden() {
        StringBuilder sb = new StringBuilder();
        preordenRec(raiz, sb);
        return sb.toString();
    }

    private void preordenRec(Nodo nodo, StringBuilder sb) {
        if (nodo != null) {
            sb.append(nodo.valor).append(" ");
            preordenRec(nodo.izquierdo, sb);
            preordenRec(nodo.derecho, sb);
        }
    }

    // ===== POSTORDEN =====
    public String postorden() {
        StringBuilder sb = new StringBuilder();
        postordenRec(raiz, sb);
        return sb.toString();
    }

    private void postordenRec(Nodo nodo, StringBuilder sb) {
        if (nodo != null) {
            postordenRec(nodo.izquierdo, sb);
            postordenRec(nodo.derecho, sb);
            sb.append(nodo.valor).append(" ");
        }
    }
}


