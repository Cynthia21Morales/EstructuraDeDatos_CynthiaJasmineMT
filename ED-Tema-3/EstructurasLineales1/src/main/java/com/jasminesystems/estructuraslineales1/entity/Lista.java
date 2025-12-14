package com.jasminesystems.estructuraslineales1.entity;

import java.util.ArrayList;

public class Lista {

    private ArrayList<String> lista = new ArrayList<>();

    public void agregar(String valor) {
        lista.add(valor);
    }

    public void eliminar() {
        if (!lista.isEmpty()) lista.remove(lista.size() - 1);
    }

    public String mostrar() {
        return lista.toString();
    }
}
