package Komputery;

public class Laptop extends Komputer {
    public Laptop(String name, String color, Boolean small) {
        super(name, color, small);

    }


    @Override
    void przedstawSie() { super.przedstawSie(); }
}
