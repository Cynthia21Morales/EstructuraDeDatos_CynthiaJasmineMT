package com.jasminesystems.estructuras2;

import com.jasminesystems.estructuras2.funciones.NodoGrafo;
import java.util.*;

public class Grafo {

    private Map<String, NodoGrafo> nodos;
    public Grafo() {
        nodos = new HashMap<>();
    }

    public void agregarNodo(String valor) {
        nodos.putIfAbsent(valor, new NodoGrafo(valor));
    }

    public void agregarArista(String origen, String destino) {
        NodoGrafo nodoOrigen = nodos.get(origen);
        NodoGrafo nodoDestino = nodos.get(destino);

        if (nodoOrigen != null && nodoDestino != null) {
            nodoOrigen.agregarAdyacente(nodoDestino);
        }
    }

    public String recorridoBFS(String inicio) {
        StringBuilder resultado = new StringBuilder();
        Set<NodoGrafo> visitados = new HashSet<>();
        Queue<NodoGrafo> cola = new LinkedList<>();

        NodoGrafo nodoInicio = nodos.get(inicio);
        if (nodoInicio == null) return "Nodo no existe";

        cola.add(nodoInicio);
        visitados.add(nodoInicio);

        while (!cola.isEmpty()) {
            NodoGrafo actual = cola.poll();
            resultado.append(actual.getValor()).append(" ");

            for (NodoGrafo vecino : actual.getAdyacentes()) {
                if (!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    cola.add(vecino);
                }
            }
        }
        return resultado.toString();
    }
}






