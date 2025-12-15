package com.jasminesystems.estructurasnolineales.entity;

import java.util.*;

public class Grafo {

    private Map<String, List<String>> grafo = new HashMap<>();

    public void agregarVertice(String v) {
        grafo.putIfAbsent(v, new ArrayList<>());
    }

    public void agregarArista(String v1, String v2) {
        grafo.get(v1).add(v2);
        grafo.get(v2).add(v1);
    }

    public String mostrar() {
        return grafo.toString();
    }
}
