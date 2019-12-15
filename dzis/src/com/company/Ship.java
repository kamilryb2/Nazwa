package com.company;

public class Ship {
    Ship(){
        System.out.println("Jestem konstruktorem bez parametrów, klasy Ship");

    }


    String name;
    double size;
     boolean big;

    Ship(String lajba, double size1, boolean  big1) {
    name=lajba;
    size=size1;
    big=big1;
    }



}
