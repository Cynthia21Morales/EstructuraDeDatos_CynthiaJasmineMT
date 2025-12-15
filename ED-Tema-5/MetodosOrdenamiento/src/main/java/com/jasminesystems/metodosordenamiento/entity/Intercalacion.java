package com.jasminesystems.metodosordenamiento.entity;

import java.util.Arrays;

public class Intercalacion {

    public int[] ordenar(int[] array) {
        int n = array.length;
        if (n <= 1) return array;

        int mid = n / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, n);

        left = ordenar(left);
        right = ordenar(right);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i=0, j=0, k=0;

        while(i<left.length && j<right.length) {
            if(left[i] <= right[j]) result[k++] = left[i++];
            else result[k++] = right[j++];
        }

        while(i<left.length) result[k++] = left[i++];
        while(j<right.length) result[k++] = right[j++];

        return result;
    }
}
