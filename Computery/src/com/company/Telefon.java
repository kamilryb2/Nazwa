package com.company;

public class Telefon extends Komputer {
    double wielkoscEkranu;

    public Telefon(String procesor, int ram, String gpu, double wielkoscEkranu) {
        super(procesor, ram, gpu);
        this.wielkoscEkranu = wielkoscEkranu;
    }
}
