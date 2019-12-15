package Komputery;

public class Komputer {

    String name;
    String color;
    Boolean small;

    void turnOn(){
        System.out.println("Komputer sie uruchomil");
    }
    void turnOff(){
        System.out.println("Komputer się wyłączył");
    }
    void reset(){ System.out.println("Komputer się zresetował"); }


    public Komputer(String name, String color, Boolean small) {
        this.name = name;
        this.color = color;
        this.small = small;
    }
    void przedstawSie(){
        System.out.println("Przywitaj się");
    }

}
