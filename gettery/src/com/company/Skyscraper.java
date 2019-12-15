package com.company;

public class Skyscraper {
    int numberOfWindows;
    double wysokosc;
    int floors;
    boolean big;
    double poziomow;

    String nazwa;
    int liczbaPokoi;
    int liczbaludzi;

    public Skyscraper(int numberOfWindows, double wysokosc, int floors, boolean big, double poziomow) {
        this.numberOfWindows = numberOfWindows;
        this.wysokosc = wysokosc;
        this.floors = floors;
        this.big = big;
        this.poziomow = poziomow;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public int getFloors() {
        return floors;
    }

    public boolean isBig() {
        return big;
    }

    public double getPoziomow() {
        return poziomow;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getLiczbaPokoi() {
        return liczbaPokoi;
    }

    public void setLiczbaPokoi(int liczbaPokoi) {
        this.liczbaPokoi = liczbaPokoi;
    }

    public int getLiczbaludzi() {
        return liczbaludzi;
    }

    public void setLiczbaludzi(int liczbaludzi) {
        this.liczbaludzi = liczbaludzi;
    }
}
