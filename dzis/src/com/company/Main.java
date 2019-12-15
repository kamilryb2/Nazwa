package com.company;

public class Main    {
    public static void main(String[] args) {
        boolean UrodzilemSiewPierwszejPolowieRoku = false;
        char Litera = 'K';
        byte Komputer = 14;
        short ChrzestPolski = 966;
        int IleLudziByloW1930Roku = 2000000000;
        long IleJestObecnieLudzi = 76000000000L;
        double e = 2.718281828459;
        float pi = 3.14159265358979323846264338327950288419716939937510582097494459230781640628f;

        System.out.println(UrodzilemSiewPierwszejPolowieRoku);
        System.out.println(Litera);
        System.out.println(Komputer);
        System.out.println(ChrzestPolski);
        System.out.println(IleLudziByloW1930Roku);
        System.out.println(IleJestObecnieLudzi);
        System.out.println(e);
        System.out.println(pi);

        int ileBitow = 233;
        System.out.println(ileBitow);

        Car samochod = new Car();
        samochod.speed = 120;
        samochod.kolor="white";
        samochod.model="audi";
        samochod.numberOfWheels=4;
        samochod.engineCapacity=2;
        samochod.isElectric=true;

        System.out.println(samochod.speed);
        samochod.skrecWLewo();
        samochod.skrecWPrawo();
        samochod.otwórzSzyberdach();
        samochod.jedzNaprzod();
        samochod.przyspiesz();
        samochod.zwiekszpredkosc();
        samochod.rozbijSie();
        System.out.println(samochod.kolor);
        System.out.println(samochod.marka);
        System.out.println(samochod.getModel());
        System.out.println(samochod.getKolor());
        System.out.println(samochod.taMetodaZwracaWartoscSpeed());
        System.out.println(samochod.czySamochodJestElektryczny());
        System.out.println(samochod.getMarka());
        System.out.println(samochod.zwracanienumerukol());
        System.out.println(samochod.zwracaniePojemnosci());

        TrojmianKwadratowy trojka = new TrojmianKwadratowy();
        System.out.println(trojka.obliczDelte(4,6,8));
        Triangle trojkacik  = new Triangle();
        System.out.println(trojkacik.obwodTrojkata(4,6,8));


        Ship ship =new Ship();
        Student student = new Student();
        Square square = new Square();


        Ship szip = new Ship("janek",20,true);
        System.out.println(szip.name);
        Student uczen = new Student("kajtek", "nowak");
        System.out.println(uczen.lastName);
        System.out.println(uczen.name);
        Square bocz = new Square(4);
        System.out.println(bocz.bok);



        Dywan dywan1 = new Dywan(2);
        Dywan dywan2 = new Dywan("white");
        Dywan dywan3 = new Dywan("white", 2, 2);
        Dywan dywan4 = new Dywan("white",2);
        Dywan dywan5 = new Dywan(2,2);


        }
}