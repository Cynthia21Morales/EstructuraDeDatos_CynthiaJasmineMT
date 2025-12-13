package com.jasminesystems.estructurasgrafo;

import com.jasminesystems.estructurasgrafo.funciones.NodoGrafoDFS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GrafoDFS {

    private Map<String, NodoGrafoDFS> nodos;

    public GrafoDFS() {
        nodos = new HashMap<>();
    }

    public void agregarNodo(String valor) {
        nodos.putIfAbsent(valor, new NodoGrafoDFS(valor));
    }

    // Grafo NO dirigido
    public void agregarArista(String a, String b) {
        NodoGrafoDFS nodoA = nodos.get(a);
        NodoGrafoDFS nodoB = nodos.get(b);

        if (nodoA != null && nodoB != null) {
            nodoA.agregarVecino(nodoB);
            nodoB.agregarVecino(nodoA);
        }
    }

    public String recorridoDFS(String inicio) {
        StringBuilder resultado = new StringBuilder();
        Set<NodoGrafoDFS> visitados = new HashSet<>();
        dfs(nodos.get(inicio), visitados, resultado);
        return resultado.toString();
    }

    private void dfs(NodoGrafoDFS nodo,
                     Set<NodoGrafoDFS> visitados,
                     StringBuilder resultado) {

        if (nodo == null || visitados.contains(nodo)) return;

        visitados.add(nodo);
        resultado.append(nodo.getValor()).append(" ");

        for (NodoGrafoDFS vecino : nodo.getVecinos()) {
            dfs(vecino, visitados, resultado);
        }
    }
}


