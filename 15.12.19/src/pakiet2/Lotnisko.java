package pakiet2;
import pakiet1.Pojazd;
import pakiet2.Lotnisko;
public class Lotnisko {
    public void pokazNaEkranie(){
        Pojazd pojazd = new Pojazd();
        System.out.println(pojazd.name);
        System.out.println(pojazd.iloscKol);
        System.out.println(pojazd.elektryczny);
        System.out.println(pojazd.marka);
    }
}
