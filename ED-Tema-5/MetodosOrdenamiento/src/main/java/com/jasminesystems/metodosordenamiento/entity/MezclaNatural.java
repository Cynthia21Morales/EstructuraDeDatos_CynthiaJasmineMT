package com.jasminesystems.metodosordenamiento.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MezclaNatural {

    public int[] ordenar(int[] array) {
        List<Integer> lista = new ArrayList<>();
        for(int n: array) lista.add(n);

        while(lista.size() > 1) {
            List<Integer> listaNueva = new ArrayList<>();
            List<Integer> aux = new ArrayList<>();
            int prev = lista.get(0);
            aux.add(prev);
            for(int i=1;i<lista.size();i++){
                if(lista.get(i)>=prev) aux.add(lista.get(i));
                else{
                    listaNueva.addAll(aux);
                    aux.clear();
                    aux.add(lista.get(i));
                }
                prev = lista.get(i);
            }
            listaNueva.addAll(aux);
            lista = listaNueva;
            if(lista.size() == array.length) break;
        }

        int[] result = new int[array.length];
        for(int i=0;i<array.length;i++) result[i]=lista.get(i);
        return result;
    }
}
