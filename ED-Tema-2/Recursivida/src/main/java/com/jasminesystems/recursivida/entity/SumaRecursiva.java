package com.jasminesystems.recursivida.entity;

public class SumaRecursiva {

    public static int sumar(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumar(n - 1);
    }
}
