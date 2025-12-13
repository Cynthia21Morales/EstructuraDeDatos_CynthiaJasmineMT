package com.jasminesystems.estructuras2.funciones;

import java.util.ArrayList;
import java.util.List;

public class NodoGrafo {

    private String valor;
    private List<NodoGrafo> adyacentes;

    public NodoGrafo(String valor) {
        this.valor = valor;
        this.adyacentes = new ArrayList<>();
    }

    public String getValor() {
        return valor;
    }

    public List<NodoGrafo> getAdyacentes() {
        return adyacentes;
    }

    public void agregarAdyacente(NodoGrafo nodo) {
        adyacentes.add(nodo);
    }
}


