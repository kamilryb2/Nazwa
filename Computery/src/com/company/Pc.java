package com.company;

public class Pc extends Komputer {
   double wielkoscMonitora;

    public Pc(String procesor, int ram, String gpu, double wielkoscMonitora) {
        super(procesor, ram, gpu);
        this.wielkoscMonitora = wielkoscMonitora;
    }
}
