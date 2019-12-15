package Komputery;

import Pojazdy.Auto;

public class Main {
    public static void main(String[] args) {

        Auto autko = new Auto();

        Komputer komp = new Komputer("Moj","czarny",true);
        System.out.println(komp.name);
        System.out.println(komp.color);
        System.out.println(komp.small);
        komp.reset();
        komp.turnOn();
        komp.turnOff();
        Computer comp = new Computer();
        Laptop lap = new Laptop("lapek","red",true);
        System.out.println(lap.color);
        System.out.println(lap.name);
        System.out.println(lap.small);
        PC pisi = new PC("komputerek","black", false);
        System.out.println(pisi.color);
        System.out.println(pisi.name);
        System.out.println(pisi.small);
        Smartfon telefon = new Smartfon("tel","white",true);
        Smartwatch zegarek = new Smartwatch("zegar","gold",true);


    }
}
