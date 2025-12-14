package com.jasminesystems.metodosbusqueda;

import java.util.LinkedList;

public class HashTable {

    private LinkedList<Integer>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) table[i] = new LinkedList<>();
    }

    private int hash(int key) {
        return key % size;
    }

    public void insert(int key) {
        int index = hash(key);
        if (!table[index].contains(key)) table[index].add(key);
    }

    public boolean search(int key) {
        int index = hash(key);
        return table[index].contains(key);
    }

    public boolean delete(int key) {
        int index = hash(key);
        return table[index].remove((Integer) key);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append("[").append(i).append("] -> ");
            for (Integer key : table[i]) sb.append(key).append(" ");
            sb.append("\n");
        }
        return sb.toString();
    }
}


