package com.jasminesystems.estructuraslineales1.entity;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {

    private Queue<String> cola = new LinkedList<>();

    public void encolar(String valor) {
        cola.add(valor);
    }

    public String desencolar() {
        return cola.isEmpty() ? "Cola vacía" : cola.poll();
    }

    public String mostrar() {
        return cola.toString();
    }
}
