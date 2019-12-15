package com.company;

public class Car {
    int speed=100;
    int numberOfWheels=4;
    double engineCapacity;
    boolean isElectric=true;
    String kolor;
    String marka;
    String model;
    void skrecWPrawo() {
        System.out.println("Samochód skręcił w prawo");

    }
    void zatrzymajSie(){
        System.out.println("Samochód zatrzymał się");
    }

    void przyspiesz(){
        System.out.println("Samochód przyśpieszył");
    }
    void skrecWLewo (){
        System.out.println("Samochód skręcił w lewo");
    }
    void otwórzSzyberdach(){
        System.out.println("Samochód otworzył szyberdach");
    }
    void rozbijSie(){
        System.out.println("Samochód rozbił się");
    }
    void jedzNaprzod(){
        System.out.println("Samochód pojechał naprzód");
    }
    void zwiekszpredkosc(){
       speed=120;
    }

    public Car() {
    }

    int taMetodaZwracaWartoscSpeed(){
        return speed;
    }
    boolean czySamochodJestElektryczny(){
        return isElectric;

    }
    int zwracanienumerukol(){
        return numberOfWheels;
    }
    double zwracaniePojemnosci(){
        return engineCapacity;
    }

    public String getKolor() {
        return kolor;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }
}
