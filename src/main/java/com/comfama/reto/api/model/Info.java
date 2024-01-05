package com.comfama.reto.api.model;

public class Info {
    private int count;
    private int pages;
    private String next;
    private String prev;

    // Constructor sin argumentos (necesario para la deserialización)
    public Info() {
    }

    // getters y setters
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }
}
