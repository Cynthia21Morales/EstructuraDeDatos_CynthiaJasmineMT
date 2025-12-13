package com.jasminesystems.estructurasgrafo.funciones;

import java.util.ArrayList;
import java.util.List;

public class NodoGrafoDFS {

    private String valor;
    private List<NodoGrafoDFS> vecinos;

    public NodoGrafoDFS(String valor) {
        this.valor = valor;
        this.vecinos = new ArrayList<>();
    }

    public String getValor() {
        return valor;
    }

    public List<NodoGrafoDFS> getVecinos() {
        return vecinos;
    }

    public void agregarVecino(NodoGrafoDFS nodo) {
        vecinos.add(nodo);
    }
}


