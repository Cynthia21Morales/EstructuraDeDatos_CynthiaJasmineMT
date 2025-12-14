package com.jasminesystems.estructuraslineales1.entity;

import java.util.Stack;

public class Pila {

    private Stack<String> pila = new Stack<>();

    public void push(String valor) {
        pila.push(valor);
    }

    public String pop() {
        return pila.isEmpty() ? "Pila vacía" : pila.pop();
    }

    public String mostrar() {
        return pila.toString();
    }
}
