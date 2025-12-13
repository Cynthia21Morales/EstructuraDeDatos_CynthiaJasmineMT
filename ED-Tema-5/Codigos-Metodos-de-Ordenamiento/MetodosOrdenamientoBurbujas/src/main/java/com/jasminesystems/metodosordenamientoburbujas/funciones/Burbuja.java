package com.jasminesystems.metodosordenamientoburbujas.funciones;

public class Burbuja {

    public String ordenar(int[] arreglo) {
        StringBuilder pasos = new StringBuilder();

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
            pasos.append("Paso ")
                    .append(i + 1)
                    .append(": ")
                    .append(arregloToString(arreglo))
                    .append("\n");
        }
        return pasos.toString();
    }

    private String arregloToString(int[] arreglo) {
        StringBuilder sb = new StringBuilder();
        for (int n : arreglo) {
            sb.append(n).append(" ");
        }
        return sb.toString();
    }
}

