package com.company;

public class Laptop extends Komputer {
    double rozmiar;

    public Laptop(String procesor, int ram, String gpu, double rozmiar) {
        super(procesor, ram, gpu);
        this.rozmiar = rozmiar;
    }
}
