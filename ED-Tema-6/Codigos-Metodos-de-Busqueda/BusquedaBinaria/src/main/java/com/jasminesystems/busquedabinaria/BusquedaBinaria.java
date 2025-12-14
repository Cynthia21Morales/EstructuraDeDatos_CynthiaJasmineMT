package com.jasminesystems.busquedabinaria;

public class BusquedaBinaria {

    public static int busquedaBinaria(int[] arr, int clave) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == clave) {
                return medio; // Elemento encontrado
            }

            if (arr[medio] < clave) {
                inicio = medio + 1; // Buscar en la mitad derecha
            } else {
                fin = medio - 1; // Buscar en la mitad izquierda
            }
        }
        return -1; 
    }
    public static String arregloToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
}


