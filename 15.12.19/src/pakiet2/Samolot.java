package pakiet2;
import pakiet1.Pojazd;
import pakiet2.Samolot;

public class Samolot extends Pojazd{

    public void pokazNaEkranie(){
        Pojazd pojazd = new Pojazd();
        System.out.println(pojazd.name);
        System.out.println(super.elektryczny);
        System.out.println(this.e);
        System.out.println(pojazd.marka);
    }
}
